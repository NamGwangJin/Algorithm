pieces = list(map(int, input().split()))

correct_pieces = [1, 1, 2, 2, 2, 8]

diff = [correct - actual for correct, actual in zip(correct_pieces, pieces)]

print(" ".join(map(str, diff)))