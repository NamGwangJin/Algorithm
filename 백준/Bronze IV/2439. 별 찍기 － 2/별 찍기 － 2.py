N = int(input())
for i in range(1, N+1):
    star = ""
    for x in range(i):
        star += "*"
    empty = ""
    for x in range(N - len(star)):
        empty += " "
    print(empty + star)