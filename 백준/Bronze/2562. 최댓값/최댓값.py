numbers = []
position = 0

for i in range(9):
    x = int(input())
    numbers.append(x)
    if i != 0:
        if numbers[i] > numbers[position]:
            position = i

print(max(numbers))
print(position + 1)