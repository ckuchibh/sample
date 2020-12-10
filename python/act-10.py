
num1 = input("Enter number sequences seperated by comma :").split(',')
# Given tuple
num_tuple = tuple((num1))
print("Given list is ", num_tuple)

# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (int(num) % 5 == 0):
        print(num)