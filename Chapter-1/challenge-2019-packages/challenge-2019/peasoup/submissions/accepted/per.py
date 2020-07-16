for _ in range(int(raw_input())):
    k = int(raw_input())
    data = [raw_input() for _ in range(k+1)]
    if 'pea soup' in data[1:] and 'pancakes' in data[1:]:
        print data[0]
        break
else:
    print 'anywhere is fine i guess'
