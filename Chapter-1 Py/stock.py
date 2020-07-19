import math

ls = input().split()
p,a,b,c,d,n = int(ls[0]),int(ls[1]),int(ls[2]),int(ls[3]),int(ls[4]),int(ls[5])
tempMax = 0
tempMin = p * (math.sin(a + b) + math.cos(c + d) + 2)
for num in range(2,n+1):
    temp = p*(math.sin(a*num+b)+math.cos(c*num+d)+2)
    if tempMin<temp: tempMin=temp
    elif tempMin-temp > tempMax: tempMax = tempMin-temp
print(tempMax)


