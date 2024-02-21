N, M = map(int, input().split())

ball = []
for i in range(N):
    ball.append("0")

for x in range(M):
    i, j, k = map(int, input().split())
    for y in range(i, j+1):
        ball[y - 1] = str(k)

print(" ".join(ball))