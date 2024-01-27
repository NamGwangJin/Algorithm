def solution(num_list):
    answer = 0
    a, b = 1, 0
    for i in num_list:
        a *= i
    for i in num_list:
        b += i
    b = b**2
    if a < b:
        answer = 1
    return answer