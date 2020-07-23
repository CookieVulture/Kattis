if __name__ == "__main__":
    n = int(input())
    ls = []
    for i in range(n):
        temp = input().split()
        try:
            a = int(temp[0])
            a = int(a / 2)
            temp[0] = a
            ls.append(temp)
        except:
            temp.sort()
            a = int(temp[0])
            temp[0] = a
            ls.append(temp)
    ls.sort(key=lambda x: x[0])
    for i in ls:
        print(i[1])
