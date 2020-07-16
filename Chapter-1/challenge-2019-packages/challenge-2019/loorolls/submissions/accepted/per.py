def ans(l, n):
    k = 1
    while l % n:
        n -= l % n
        k += 1
    return k
(l, n) = map(int, raw_input().split())
print ans(l, n)

