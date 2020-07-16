(n, m) = map(int, raw_input().split())
P = [1.0]*n

for _ in range(m):
    (i, j, p) = raw_input().split()
    i = int(i)-1
    j = int(j)-1
    p = float(p)
    P[j] *= 1 - p*P[i]

print '\n'.join('%.10f' % x for x in P)
