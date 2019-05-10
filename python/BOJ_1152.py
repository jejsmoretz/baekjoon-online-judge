list = input()
result = len( list.strip().split() )
if( list == '' ):
    result = 0
print( result )