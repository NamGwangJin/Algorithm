def solution(str_list):
    answer = []
    
    for i in range(len(str_list)):
        if str_list[i] == "l":
            for x in range(i):
                answer.append(str_list[x])
            else:
                return answer
        elif str_list[i] == "r":
            for x in range(i+1, len(str_list)):
                answer.append(str_list[x])
            else:
                return answer
    else:
        return answer