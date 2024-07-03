names = []

print("Enter 4 names: ")

for i in range(4):
    names.append(input(""))

names.sort()

print("Sorted names: ")

for i in names:
    print(i)