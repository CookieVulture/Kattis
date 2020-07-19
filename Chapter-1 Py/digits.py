ls = []
while True:
    inp = input()
    if inp=="END":break
    ls.append(inp)
    continue
newls = []
for i in range(len(ls)):
    if ls[i]=="1":
        newls.append(1)
    elif len(ls[i])<2:
        newls.append(2)
    elif len(ls[i]) < 10:
        newls.append(3)
    else:
        newls.append(4)
for element in newls:
    print(element)