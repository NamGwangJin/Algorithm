N, M = map(int, input().split())

ball = []
for i in range(N):
    ball.append(str(i + 1))

for i in range(M):
    i, j = map(int, input().split())
    temp = ball[i-1]
    ball[i-1] = ball[j-1]
    ball[j-1] = temp

print(" ".join(ball))