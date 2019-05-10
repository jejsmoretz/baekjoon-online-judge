N = int( input() )
result = -1
 
for i in range( N // 5, -1, -1 ):
    if( ( i * 5 ) + ( ( ( N - ( i * 5 ) ) // 3 ) * 3 ) == N ):
        result = i + ( ( N - ( i * 5 ) ) // 3 )
        break
print( result )
