N = int(input())
numbers = input().split()
v = int(input())

answer = 0

for i in range(len(numbers)):
    if int(numbers[i]) == v:
        answer += 1

print(answer)
