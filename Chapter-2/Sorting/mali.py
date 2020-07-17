def countSort(a, b):
    a0 = 0
    b0 = 100
    ans = 0
    condi = False
    while True:
        while a[a0] == 0:
            a0 += 1
            if a0 > 100:
                condi = True
                break
        while b[b0] == 0:
            b0 -= 1
            if b0 < 0:
                condi = True
                break
        if condi: break
        ans = max(ans, a0 + b0)
        temp = min(a[a0], b[b0])
        a[a0] -= temp
        b[b0] -= temp
    return ans


if __name__ == "__main__":
    n = int(input())
    a = [0] * 101
    b = [0] * 101
    for i in range(n):
        a1, b1 = map(int, input().split())
        a[a1] += 1
        b[b1] += 1
        print(a)
        print(b)
        print(countSort(a, b))
