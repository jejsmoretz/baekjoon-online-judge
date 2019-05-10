for i in range(3):
    Y = input().split()
    count = Y.count('0')
    if count == 1:
        print('A')
    elif count == 2:
        print('B')
    elif count == 3:
        print('C')
    elif count == 4:
        print('D')
    else:
        print('E')