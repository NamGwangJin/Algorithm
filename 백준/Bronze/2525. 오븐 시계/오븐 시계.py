H, M = map(int, input().split())
Cooking_Time = int(input())

Time = H*60 + M + Cooking_Time

if Time >= 1440 :
  Time = Time - 1440

print(f"{Time//60} {Time%60}")