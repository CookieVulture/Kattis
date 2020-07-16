if __name__ == "__main__":
    nc = int(input())
    for tc in range(nc):
        n = int(input())
        p = []
        for i in range(n):
            inp = input().split()
            name = inp[0].split(':')[0]
            c = inp[1].split('-')
            c.reverse()
            c = [x.replace('lower', 'z') for x in c]
            c = [x.replace('upper', 'a') for x in c]
            a = ['middle' for x in range(11)]
            a[0:len(c)] = c
            a.append(name)
            p.append(a)
        p = sorted(p)
        for i in range(n):
            print(p[i][11])
        print('=' * 30)
