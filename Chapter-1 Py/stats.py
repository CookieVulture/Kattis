final = []
case = 0
while case<10:
    ls = input().split()
    ls = ls[1:]
    final.append(ls)
    case+=1

for lis in range(len(final)):
    t = final[lis]
    a = int(min(t))
    b = int(max(t))
    print("Case "+ str(lis+1) +": " + str(a) + " " + str(b) + " " + str(b-a))
