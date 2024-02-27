N, M = map(int, input().split())
basket = []

for i in range(N):
    basket.append(str(i + 1))

for i in range(M):
    i, j = map(int, input().split())
    basket[i-1 : j] = reversed(basket[i-1 : j])

print(" ".join(basket))