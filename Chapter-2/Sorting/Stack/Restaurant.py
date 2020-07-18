def func(n, commands):
    ls1 = 0
    ls2 = 0
    for i in range(n):
        temp = commands[i].split()
        action = temp[0]
        num = int(temp[1])
        if action == "DROP":
            if ls1 != 0:
                print("MOVE 1->2 " + str(ls1))
                ls2 += ls1
                ls1 = 0
            ls2 += num
            print("DROP 2 " + str(ls2))
        elif action == "TAKE":
            if ls1 >= num:
                print("TAKE 1 " + str(num))
                ls1 -= num
            else:
                print("MOVE 2->1 " + str(ls2))
                ls1 += ls2
                ls2 = 0
                print("TAKE 1 " + str(num))
                ls1 -= num


if __name__ == "__main__":
    f = 0
    while True:
        n = int(input())
        if n == 0:
            break
        if f != 0:
            print()
        commands = []
        for i in range(n):
            commands.append(input())
        func(n, commands)
        f += 1
