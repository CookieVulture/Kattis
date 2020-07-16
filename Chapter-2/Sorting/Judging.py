if __name__ == "__main__":
    n = int(input())
    L = []
    R = []
    total = 0
    for i in range(n):
        L.append(input())
    for i in range(n):
        R.append(input())
    L.sort()
    R.sort()
    i = j = 0
    while i < len(L) and j < len(R):
        if L[i] == R[j]:
            i += 1
            j += 1
            total+=1
        elif L[i] < R[j]:
            i += 1
        else:
            j += 1

    print(total)