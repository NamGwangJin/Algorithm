N = int(input())
numbers = input().split()

print(str(min(map(int, numbers))) + " " + str(max(map(int, numbers))))
