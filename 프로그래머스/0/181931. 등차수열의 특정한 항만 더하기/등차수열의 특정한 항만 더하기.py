def solution(a, d, included):
    answer = 0
    numList = [a]
    for i in range(1,len(included)):
        a += d
        numList.append(a)
    for i in range(len(included)):
        if included[i] == True:
            answer += numList[i]
    return answer