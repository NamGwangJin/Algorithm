def solution(arr):
    return [x // 2 if x % 2 == 0 and x >= 50 else x * 2 if x % 2 != 0 and x < 50 else x for x in arr]