if __name__=="__main__":
    N, P = map(int,input().split())
    ls = list(map(int, input().split()))
    ls = [x-P for x in ls]
    maxSum = 0
    curr = 0
    for i in ls:
        curr += i
        maxSum = max(maxSum, curr)
        if curr<0: curr = 0
    print(maxSum)