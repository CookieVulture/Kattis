def dfs(i, j):
    if 0 <= i < m and 0 <= j < n and ls[i][j] == '-':
        ls[i][j] = '#'
        dfs(i, j + 1)
        dfs(i, j - 1)
        dfs(i - 1, j)
        dfs(i + 1, j)


if __name__ == "__main__":
    while True:
        try:
            m, n = map(int, input().split())

            ls = [list(input()) for i in range(m)]
            solution = 0
            for i in range(m):
                for j in range(n):
                    if ls[i][j] == '-':
                        solution += 1
                        dfs(i, j)
            print(solution)
        except:
            break
