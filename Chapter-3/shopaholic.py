# -*- coding: utf-8 -*-
"""
Created on Mon Jul 20 16:54:38 2020

@author: dpat5941
"""

n = int(input())
arr = input().split()
arr = [int(x) for x in arr]
arr.sort(reverse=True)
total = 0
for i in range(0, len(arr)):
    if i % 3 == 2:
        total += int(arr[i])
print(total)