if __name__ == "__main__":
    n = int(input())
    ls = list(map(int, input().split()))
    i = n - 1
    ls.reverse()
    if n == 1:
        print(1)
    else:
        while i > 0:
            if (ls[i] + ls[i - 1]) % 2 == 0:
                del ls[i]
                del ls[i - 1]
                i -= 2
            else:
                i -= 1
        print(len(ls))
