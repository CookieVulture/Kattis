if __name__ == "__main__":
    n, k = map(int, input().split())
    ls = input().split()
    current = [0]
    i = 0
    while i < len(ls):
        if k == 1:
            print(0)
            break
        if ls[i] == "undo":
            temp = int(ls[i + 1])
            # print("temp before = ", current)
            # print("temp vari= ", temp)
            while temp > 0:
                current.pop()
                temp -= 1
            # print("temp after = ", current)
            i += 2
        else:
            temp = int(ls[i]) + current[-1]
            if temp < 0:
                while temp < 0:
                    temp += n
            if temp > n:
                temp %= n
            current.append(temp)
            i += 1
    print(current[-1])
