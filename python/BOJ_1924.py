x, y = map( int, input().split(' ') )
total = 0;
month = [ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ]
day = [ 'SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT' ]
 
for i in range( 0, x ):
    total += month[i]
    if( i + 1 == x ):
        print( day[ ( total + y ) % 7 ] )