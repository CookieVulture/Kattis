if __name__ == "__main__":
    N, M, P = map(int, input().split())
    lsN = list(map(int, input().split()))
    lsM = list(map(int, input().split()))
    newLs = [i * j for i in lsN for j in lsM]
    newLs.sort()
    condi = False
    for i in range(len(newLs) - 1):
        if ((100*(newLs[i + 1] - newLs[i])) / newLs[i]) > P and newLs[i] != newLs[i + 1]:
            condi = True
            break
    if condi:
        print("Time to change gears!")
    else:
        print("Ride on!")
