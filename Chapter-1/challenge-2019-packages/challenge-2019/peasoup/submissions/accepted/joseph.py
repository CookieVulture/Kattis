n = int(raw_input())

favorite = "Anywhere is fine I guess"
for place in xrange(n):
    peasoup = False
    pancakes = False
    ki = int(raw_input())
    name = raw_input()
    for menu in xrange(ki):
        item = raw_input()
        peasoup = peasoup or item == "pea soup"
        pancakes = pancakes or item == "pancakes"
    if peasoup and pancakes:
        favorite = name
        break

print favorite

no = int(input())

answer = "Anywhere is fine I guess"
for place in range(no):
    peasoup = False
    pancake = False
    itemsTotal = int(input())
    name = input()
    for menu in range(itemsTotal):
        item = input()
        peasoup = peasoup or item == "pea soup"
        pancake = pancake or item == "pancakes"
    if peasoup and pancake:
        answer = name
        break

print(answer)