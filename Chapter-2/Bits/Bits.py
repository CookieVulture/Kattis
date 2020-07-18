def toBinary(num):
    if num==0:
        return 0
    num = bin(num)
    num = num[2:]
    return num.count('1')

if __name__ == "__main__":
    n = int(input())
    for i in range(n):
        num = (input())
        print(toBinary(num))
