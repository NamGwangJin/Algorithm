def solution(l, r):
    answer = []
    for x in range(l,r+1):
        if len(str(x)) == 1:
            if "5" in str(x):
                answer.append(x)
                continue
        else:
            number = []
            for i in range(len(str(x))):
                number.append(str(x)[i])
            for i in number:
                if i == "5" or i == "0":
                    continue
                else:
                    break
            else:
                answer.append(int("".join(number)))
    if len(answer) == 0:
        answer.append(-1)
    return answer