N = int(input())
numbers = list(input())

for i in range(N):
    numbers[i] = int(numbers[i])

print(sum(numbers))