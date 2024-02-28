N = int(input())

score = list(map(int, input().split()))

M = max(score)

score = [ i / M * 100 for i in score ]

print(sum(score) / N)