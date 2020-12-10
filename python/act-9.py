numList1 = [1, 2, 3, 4, 5]
numList2 = [6, 7, 8, 9, 10]
numList3 = []

for numbers in numList1 :
    if numbers % 2 != 0 :
        numList3.append(numbers)

for number in numList2 :
    if number % 2 == 0 :
        numList3.append(number)

print("NumList1", numList1)
print("NumList2", numList2)
print("Append New NumList3", numList3)