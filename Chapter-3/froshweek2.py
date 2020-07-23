if __name__ == "__main__":
    n, m = map(int, input().split())
    task = 0
    tasks = list(map(int, input().split()))
    intervals = list(map(int, input().split()))
    tasks.sort()
    intervals.sort()
    i = 0
    j = 0
    while i < len(tasks) and j < len(intervals):
        while tasks[i] > intervals[j] and j < len(intervals):
            j += 1
        task += 1
        j += 1
        i += 1
    print(task)