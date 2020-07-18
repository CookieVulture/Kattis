if __name__ == "__main__":
    n = int(input())
    ls = list(map(int, input().split()))
    ls.reverse()
    newls = []
    ans = 0
    while len(ls) > 0:
        ans += 1
        if len(newls) == 0:
            temp = ls.pop()
            newls.append(temp)
            continue
        if newls[-1] == ls[-1]:
            ls.pop()
            newls.pop()
            continue
        newls.append(ls[-1])
        ls.pop()
    if len(newls) == 0:
        print(ans)
    else:
        print("impossible")
