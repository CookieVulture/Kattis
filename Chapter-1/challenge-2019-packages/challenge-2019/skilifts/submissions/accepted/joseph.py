big = 10**5 + 1
n = int(raw_input())

counts = [[0]*big for _ in xrange(2)]
for lift in xrange(n):
    x, y, a = map(int, raw_input().split())
    counts[a-1][y] += 1

last = 0
total = 0
for row in xrange(big-1):
    # Greedily take largest match
    up = (counts[0][row] - last) + counts[1][row]
    down = counts[0][row+1] + counts[1][row+1]
    use = min(up,down)
    last = max(use - counts[1][row+1], 0)
    total += use

print total
