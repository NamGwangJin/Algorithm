from collections import Counter

alphabet_string = input()
count = []

for i in range(len(alphabet_string)):
    count.append(ord(alphabet_string[i].upper()))

max_count = max(Counter(count).values())

most_alphabet = [k for k, v in Counter(count).items() if v == max_count]

if len(most_alphabet) >= 2:
    print("?")
else:
    print(chr(most_alphabet[0]))