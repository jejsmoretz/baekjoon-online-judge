import fractions
N = int( input() )
radius = list( map( int, input().split(' ') ) )
 
for i in range( 1, N ):
    if( radius[0] % radius[i] == 0 ):
        print( '%d/1 ' %( radius[0] // radius[i] ) )
    else:
        print( '%s ' %( fractions.Fraction( radius[0], radius[i] ) ) )