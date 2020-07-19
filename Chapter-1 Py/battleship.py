
def checkfunc(p1,p2):
    ls1 = []
    for i in range(len(p1)):
        for j in range(len(p1[0])):
            if p1[i][j] == "#":
                ls1.append(str(i)+str())


ts = int(input())
while ts > 0:
    w, h, n = map(int, input().split())
    p1 = []
    p2 = []
    for i in range(h):
        ls = input().split()
        p1.append(ls)
    for i in range(h):
        ls = input().split()
        p2.append(ls)
    checkfunc(p1,p2)
    ts -= 1