N = int( input() )
newN = N
count = int(0)
while True:
    N2 = newN // 10 + newN % 10
    newN = int( str( newN % 10 ) + str( N2 % 10 ) )
    count += 1
    if( N == newN ):
        print( count )
        break
