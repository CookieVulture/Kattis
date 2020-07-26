//
// Created by dpat5941 on 24/07/2020.
//
#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

int parent(vector<int>& v, int n) {
    if(v[n] == -1) {
        return n;
    }
    v[n] = parent(v, v[n]);
    return v[n];
}

void join(vector<int>& v, int a, int b) {
    int p1 = parent(v, a);
    int p2 = parent(v, b);
    if(p1 == p2) {
        return;
    }
    if(v[p1] < 0 && v[p2] < 0) {
        v[p1] = p2;
        return;
    }
    if(v[p1] >= 0 && v[p2] < 0) {
        v[p1] = p2;
    }
    if(v[p1] < 0 && v[p2] >= 0) {
        v[p2] = p1;
    }
}

int main() {
    int houses, conns;
    cin >> houses >> conns;
    vector<int> v;
    v.resize(houses+1, -1);
    for(int i = 0; i < conns; i++) {
        int h1, h2;
        cin >> h1 >> h2;

        join(v, h1, h2);
    }
    bool printed = false;
    int rep = parent(v, 1);
    for(int i = 2; i <= houses; i++) {
        if(parent(v, i) != rep) {
            printed = true;
            cout << i << endl;
        }
    }
    if(!printed) {
        cout << "Connected" << endl;
    }
}