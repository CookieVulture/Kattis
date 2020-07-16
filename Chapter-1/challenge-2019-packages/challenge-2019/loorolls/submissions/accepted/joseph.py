ell, n = map(int, raw_input().split())

roll_num = 1
while ell % n > 0:
    n = n - (ell % n)
    roll_num += 1

print roll_num
