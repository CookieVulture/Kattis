#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef long double ld;
typedef unsigned int uint;
typedef unsigned long long ull;
const ld  pi   = 4.0*atanl(1.0);
const int iinf = 1e9 + 10;
const ll  inf  = 1e18 + 10;
const int mod  = 1000000007;
const ld  prec = .000001;
#define enld endl
#define endl '\n'
#define pb push_back
#define debug(x) cout<<#x<<" -> "<<x<<'\n'
#define all(x) (x).begin(), (x).end()
#define rall(x) (x).rbegin(), (x).rend()
#define uni(x) (x).erase(unique(all(x)), (x).end())
#define rep(i, n) for (ll i = 0; i < (ll)(n); ++i)
#define rep1(i, n) for (ll i = 1; i <= (ll)(n); ++i)
#define umap unordered_map
#define uset unordered_set
bool works(set<pair<int,int>>& s, int n) {
    set<int> in;
    int i = 1;
    while(n > 0) {
        if(n%2) {
            in.insert(i);
        }
        i++;
        n >>= 1;
    }
    for(auto i : s) {
        if(in.count(i.first) && in.count(i.second)) {
            return false;
        }
    }
    return true;
}
int main() {
    int n, m;
    cin >> n >> m;
    set<pair<int,int>> v;
    for(int i = 0; i < m; i++) {
        int t1, t2;
        cin >> t1 >> t2;
        if(t1 > t2) {
            swap(t1,t2);
        }
        v.insert({t1,t2});
    }
    int ans = 0;
    for(int i = 0; i < (1 << n); i++) {
        if(works(v, i)) {
            ans++;
        }
    }
    cout << ans << endl;
    return 0;
}