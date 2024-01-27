def solution(code):
    answer = ''
    result = []
    for i in code:
        result.append(i)
    mode = 0
    for i in range(len(result)):
        if mode == 0:
            if result[i] == "1":
                mode = 1
            else:
                if i % 2 == 0:
                    answer += result[i]
        elif mode == 1:
            if result[i] == "1":
                mode = 0
            else:
                if i % 2 != 0:
                    answer += result[i]
    if answer == "":
        answer = "EMPTY"
    return answer