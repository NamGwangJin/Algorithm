def solution(n):
    answer = []
    answer.append(n)
    ndx = 1
    while n>1:
        if n%2==0:
            answer.append(n//2)
        else:
            answer.append(3*n+1)
        n = answer[ndx]
        ndx += 1
    return answer

print(solution(10))