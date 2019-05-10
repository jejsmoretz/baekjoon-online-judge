isSelfNum = [True] * 10001

for i in range(1, 10000):
    if isSelfNum[i]:
        print(i)
    j = 1
    d = i
    while i >= j:
        d += int(i % (j * 10) / j)
        j *= 10
    if d <= 10000:
        isSelfNum[d] = False
