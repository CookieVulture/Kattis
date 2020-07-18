if __name__=="__main__":
    s = input()
    ls = []
    for i in range(len(s)):
        if s[i]=="<":
            ls.pop()
        else:
            ls.append(s[i])
    print("".join(ls))
