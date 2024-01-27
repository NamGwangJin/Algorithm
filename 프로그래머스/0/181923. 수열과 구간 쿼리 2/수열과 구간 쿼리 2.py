def solution(arr, queries):
    answer = []
    temp = []
    temp2 = []
    for i in queries:
        for x in range(i[0], i[1]+1):
            temp.append(arr[x])
        for x in temp:
            if x > i[2]:
                temp2.append(x)
        if len(temp2) == 0:
            answer.append(-1)
            temp.clear()
        else:
            answer.append(min(temp2))
            temp2.clear()
            temp.clear()
    return answer