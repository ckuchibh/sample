numbers = input("Enter Sequence of Numbers sperated by comma :").split(",")
numlist = list((numbers))

if numlist[0]==numlist[-1] :
    print("First and Last Numbers of the list are same")
else :
    print("First and last Numbers of the list are different")