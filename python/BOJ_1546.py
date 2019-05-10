N = int( input() )
scores = input().split(' ')
scores.sort( key = int )
M = int( scores[ N - 1 ] )
result = 0
for i in range(N):
    scores[i] = int( scores[i] ) / M * 100
    result += scores[i]
print( result / N )