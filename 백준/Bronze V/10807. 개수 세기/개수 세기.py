N = int(input())
list = input().split()
v = int(input())

answer = 0

for i in range(len(list)):
    if int(list[i]) == v:
        answer += 1

print(answer)