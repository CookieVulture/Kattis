import sys

total = 0
for line in sys.stdin:
    if line == '\n':
        total = 0
        print()
    else:
        number = line.count('*')
        length = len(line) - 1
        print(('.' * (length - number - total)) + ('*' * number) + ('.' * total))
        total += number
