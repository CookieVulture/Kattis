// Minimal greedy solution, based on greedy_sl.cpp but with extra features removed.
#include <bits/stdc++.h>
using namespace std;

#define rep(i, a, b) for(int i = a; i < (b); ++i)
#define trav(a, x) for(auto& a : x)
#define all(x) x.begin(), x.end()
#define sz(x) (int)(x).size()
typedef long long ll;
typedef pair<int, int> pii;
typedef vector<int> vi;

int main() {
	cin.sync_with_stdio(0); cin.tie(0);
	cin.exceptions(cin.failbit);
	int N, M;
	cin >> N >> M;
	vi zero(N, true);
	vector<tuple<int, int, char>> rels;
	vector<vi> oppEd(N);
	vector<pair<int, char>> adj;
	rep(i,0,M) {
		int a, b;
		char c;
		cin >> a >> b >> c;
		--a, --b;
		rels.emplace_back(a, b, c);
		if (c == 'x') continue;
		zero[a] = false;
		zero[b] = false;
		if (c == '=') {
			oppEd[a].push_back(b);
			oppEd[b].push_back(a);
		} else {
			adj.emplace_back(a, c);
			adj.emplace_back(b, c);
		}
	}

	vi color(N), one(N), repr(N);
	vector<pii> q;
	rep(i,0,N) if (!zero[i] && !color[i]) {
		q = {pii(i, 1)};
		int qi = 0;
		bool fail = false;
		while (qi < sz(q)) {
			int x, col;
			tie(x, col) = q[qi++];
			if (col == -color[x]) fail = true;
			if (color[x]) continue;
			color[x] = col;
			repr[x] = i;
			trav(y, oppEd[x]) q.emplace_back(y, -col);
		}
		if (fail) one[i] = true;
	}

	vi adjCol(N, 0);
	trav(pa, adj) {
		int a;
		char c;
		tie(a, c) = pa;
		int col = color[a] * (c == '-' ? -1 : 1);
		a = repr[a];
		if (!adjCol[a]) adjCol[a] = col;
		else if (adjCol[a] != col) one[a] = true;
	}

	rep(i,0,N) {
		if (zero[i]) cout << 'x';
		else if (one[repr[i]]) cout << '=';
		else {
			int c = (adjCol[repr[i]] ?: 1) * color[i];
			cout << (c == 1 ? '+' : '-');
		}
	}
	cout << endl;
}
