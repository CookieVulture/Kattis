if __name__ == "__main__":
    n,m = map(int, input().split())
    dic = {}
    for i in range(n):
        temp = input().split()
        temp1 = int(temp[0])/(1/(i+1))
        name = temp[1]
        dic[name] = temp1
    newls = sorted(dic.items(), key=lambda x:x[1], reverse=True)

    i = 0
    for k in newls:
        if i<m:
            print(k[0])
            i+=1
        else:
            break