remain = set()

for i in range(10):
    N = int(input())
    remain.add(N % 42)

print(len(remain))