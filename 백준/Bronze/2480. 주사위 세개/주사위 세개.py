one, two, three = map(int, input().split(" "))

if one == two == three:
    print( 10000 + one * 1000 )
elif one == two and two != three:
    print( 1000 + one * 100 )
elif one == three and two != three:
    print( 1000 + one * 100 )
elif two == three and one != two:
    print ( 1000 + two * 100 )
elif one != two and two != three and one != three:
    dice = [one, two, three]
    print( max(dice) * 100 )