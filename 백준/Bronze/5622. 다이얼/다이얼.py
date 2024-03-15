alr = ["ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"]

my_string = str(input())

time = 0

for alphabet in my_string:
    for x in range(len(alr)):
        if alphabet in alr[x]:
            time += x + 3
            break

print(time)