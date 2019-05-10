import math
 
N = input()
num = list(map(int, input().split()))
prime_num = list(range(2, 10001))
 
count = 0
for i in range(2, math.ceil(math.sqrt(1000))):
    for j in prime_num:
        if j / i == 1:
            pass
        elif j % i == 0:
            prime_num.remove(j)
for k in num:
    if k in prime_num:
        count += 1
print(count)
