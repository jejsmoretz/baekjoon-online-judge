def GCD( A, B ):
    if( B == 0 ):
        return A
    else:
        return GCD( B, A % B )
 
for i in range( int( input() ) ):
    A, B = map( int, input().split(' ') )
    print( A * B // GCD( A, B ) )