if __name__ == "__main__":
    r,n = input().split()
    arr = [0]*int(r)

    for i in range(int(n)):
        arr[int(input())-1] = 1
    condi = False
    for i in range(len(arr)):
        if arr[i]==0:
            print(i+1)
            condi = True
            break
    if not condi:
        print("too late")