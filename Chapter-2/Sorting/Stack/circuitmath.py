if __name__ == "__main__":
    n = int(input())
    booleans2 = input().split()
    booleans2.reverse()
    booleans = []
    for i in booleans2:
        if i=="T":
            booleans.append(True)
        elif i=="F":
            booleans.append(False)
    ls = input().split()
    lsLetters = [0]*123
    lsCurr = []
    lsSign = []
    for i in range(len(ls)):
        temp = ls[i]
        if temp.isalpha():
            if lsLetters[ord(temp)] == 0:
                lsLetters[ord(temp)] = booleans[-1]
            lsCurr.append(lsLetters[ord(temp)])
            booleans.pop()
        else:
            if temp == "-":
                temp = lsCurr.pop()
                lsCurr.append(not temp)
            elif temp == "+":
                condi1 = lsCurr.pop()
                condi2 = lsCurr.pop()
                if condi1 or condi2:
                    lsCurr.append(True)
                else:
                    lsCurr.append(False)
            elif temp == "*":
                condi1 = lsCurr.pop()
                condi2 = lsCurr.pop()
                if condi1 and condi2:
                    lsCurr.append(True)
                else:
                    lsCurr.append(False)
    print("F" if not lsCurr[0] else "T")
