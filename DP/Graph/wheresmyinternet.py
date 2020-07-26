if __name__ == "__main__":
    N, M = map(int, input().split())
    isConnected = [False] * (N+1)
    isConnected[0] = True
    isConnected[1] = True
    ls = []
    for i in range(M):
        a, b = map(int, input().split())
        ls.append((a, b) if a < b else (b, a))
    ls.sort()
    for connection in ls:
        if isConnected[connection[0]]: isConnected[connection[1]] = True
    condition = False
    for i in range(len(isConnected)):
        if not isConnected[i]:
            print(i)
            condition = True
    if not condition:
        print("Connected")