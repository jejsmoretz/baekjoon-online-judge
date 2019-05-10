n1 = 0
n2 = 0
input()
num = list(map(int, input().split()))
for i in num:
    n1 += (i // 30 + 1) * 10
    n2 += (i // 60 + 1) * 15
if n1 > n2: print('M', n2)
elif n1 < n2: print('Y', n1)
else: print('Y M', n1)