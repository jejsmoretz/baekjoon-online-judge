for i in range( int( input() ) ):
    result = 0
    scores = list( map( int, input().split(' ') ) )
    average = sum( scores[1:] ) / scores[0]
    count = 0
    for j in scores[1:]:
        if j > average:
            count += 1
    print( '%.3f' % ( count / scores[0] * 100 ) + '%' )