def solution(arr, queries):
    answer = arr
    for i in range(len(queries)):
        answer[queries[i][0]], answer[queries[i][1]] = answer[queries[i][1]], answer[queries[i][0]]
    return answer