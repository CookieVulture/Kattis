n = int(input())
ls = []
for i in range(n):
    ls.append(input())


def checkElig(s):
    temp = s.split(" ")
    if int(temp[1].split("/")[0])>2009:
        print(temp[0] +" eligible")
    elif int(temp[2].split("/")[0])>1990:
        print(temp[0] + " eligible")
    elif int(temp[3])>40:
        print(temp[0] + " ineligible")
    else:
        print(temp[0] + " coach petitions")


for s in ls:
    checkElig(s)