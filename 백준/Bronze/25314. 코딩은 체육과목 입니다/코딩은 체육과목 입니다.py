N = int(input())
answer = ""
for i in range(4, N+1, 4):
    answer += "long "
else:
    print(answer + "int")