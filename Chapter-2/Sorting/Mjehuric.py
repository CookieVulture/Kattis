def bubble_sort(ls):
    n = len(ls)
    for i in range(n):
        swap = False
        for j in range(0, n - i - 1):
            if ls[j] > ls[j + 1]:
                ls[j], ls[j + 1] = ls[j + 1], ls[j]
                swap = True
        if not swap:
            break

if __name__ == "__main__":
    l = list(map(int, input().split()))
    bubble_sort(l)

