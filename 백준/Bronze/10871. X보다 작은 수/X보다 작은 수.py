N, X = map(int, input().split())
A = input().split()
answer = []

for i in range(N):
    if int(A[i]) < X:
        answer.append(A[i])

print(" ".join(map(str, answer)))