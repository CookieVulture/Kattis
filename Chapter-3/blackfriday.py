if __name__ == "__main__":
    n = int(input())
    ls = list(map(int, input().split()))
    condi = True
    temp = -1
    for i in range(len(ls)):
        unique = ls[i]
        temp = i
        if not condi: break
        for j in range(i + 1, len(ls)):
            if ls[j] == unique:
                condi = True
                break
            else:
                condi = False
    print(temp + 1 if not condi else "none")
