S = str(input())
position = []

for char in range(97, 123):
    for i in range(len(S)):
        if char == ord(S[i]):
            position.append(str(i))
            break
    else:
        position.append("-1")

print(" ".join(position))