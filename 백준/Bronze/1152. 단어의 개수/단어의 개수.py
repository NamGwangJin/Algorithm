my_string = list(map(str, input().split(" ")))
count = 0

for i in range(len(my_string)):
    if my_string[i] != '':
        count += 1

print(count)