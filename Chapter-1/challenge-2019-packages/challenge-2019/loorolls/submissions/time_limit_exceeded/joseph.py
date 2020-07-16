ell, n = map(int, raw_input().split())

roll_num = 1
used = 0
while used < ell:
    used += n
    if used > ell:
        roll_num += 1
        used = used - ell
        n = used

print roll_num
