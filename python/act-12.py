# Define function to calculate sum
def calculateSum(num):
  if num:
    # Recursive function call
    return num + calculateSum(num-1)
  else:
    return 0
number = input("Enter the number for sum :")
# Call calculateSum() function
res = calculateSum(int(number))

# Print result
print(res)