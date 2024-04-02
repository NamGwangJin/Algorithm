def solution(arr, queries):
    
    for i in range(len(queries)):
        for x in range(queries[i][0], queries[i][1] + 1):
            arr[x] += 1

    return arr