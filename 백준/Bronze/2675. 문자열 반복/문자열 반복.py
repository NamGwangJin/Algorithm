T = int(input())

for i in range(T):
    R, S = map(str, input().split(" "))
    answer = ""
    for x in range(len(S)):
        for y in range(int(R)):
            answer += S[x]
    print(answer)