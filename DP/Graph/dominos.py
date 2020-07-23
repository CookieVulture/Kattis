def func(n, m, l):
    ls = [[None]*n]
    for i in range(m):
        temp = list(map(int, input().split()))
        mainC = temp[0]
        ls[mainC] = temp[1:]
    fall = 0


    print(fall)


if __name__ == "__main__":
    testCase = int(input())
    while testCase > 0:
        n, m, l = map(int, input().split())
        func(n, m, l)
        testCase -= 1
