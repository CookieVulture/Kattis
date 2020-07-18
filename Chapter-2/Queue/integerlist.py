def func(ls, work, size):
    condi = True
    for i in work:
        if i=="R":
            ls.reverse()
        elif i=="D":
            if len(ls)>0:
                ls.pop(0)
            else:
                condi = False
                break
    if condi:
        print(ls)
    else:
        print("error")

if __name__ == "__main__":
    n = int(input())
    while n > 0:
        n -= 1
        work = input()
        size = int(input())
        temp = input()
        if temp=="[]":
            print("error")
            continue
        ls = list(map(int,temp[1:-1].split(",")))
        func(ls, work,size)
