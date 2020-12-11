fruit_shop ={
    "apple" : 10,
    "banana" : 15,
    "orange" : 12,
    "mango" : 11
}

check_aval = input("Enter the fruit to check availability :").lower()
if check_aval in fruit_shop :
    print(check_aval, "fruit available")
else:
    print(check_aval, "fruit not available")