s = input()
 
while True:
    if len(s) > 10:
        print( s[:10] )
        s = s[10:]
    else:
        print( s[:] )
        break