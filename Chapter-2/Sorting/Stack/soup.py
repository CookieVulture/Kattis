if __name__ == "__main__":
    n = int(input())
    temp = input()
    ls = [i for i in temp]
    openB = ["(","{","["]
    closeB = [")","}","]"]
    newls = []

    condi = True
    for i in range(n):
        if ls[i]==" ": continue
        if ls[i] in openB:
            newls.append(ls[i])
        else:
            if i==0:
                condi = False
                print( ls[0] + " "  + str(i))
                break
            ind = closeB.index(ls[i])
            if newls[-1]!=openB[ind]:
                condi = False
                print(ls[i] + " " + str(i))
                break
            else:
                newls.pop()
    if condi: print("ok so far")
