for _ in range(int(raw_input())):
    k = int(raw_input())
    data = [raw_input() for _ in range(k+1)]
    if data[1:].count('pea soup') + data[1:].count('pancakes') >= 2:
        print data[0]
        break
else:
    print 'anywhere is fine i guess'
