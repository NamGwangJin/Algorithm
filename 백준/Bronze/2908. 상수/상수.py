A, B = map(int, input().split())

reverse_A = str(A)[::-1]
reverse_B = str(B)[::-1]

if int(reverse_A) > int(reverse_B):
    print(reverse_A)
else:
    print(reverse_B)