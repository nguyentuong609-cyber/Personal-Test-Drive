import random

tree_size = int(input("Enter a number: "))
max_width = 2 * tree_size - 1

for i in range(1, tree_size + 1):
    caret = 2*i - 1
    space = (max_width - caret) // 2
    row =""
    for j in range(caret):
        if random.randint(1,5) == 1:
            row += "0"
        else:
            row += "^"
    print(space * " " + row)

for _ in range(2):
    trunk = 1
    space = (max_width - trunk) // 2
    print(space * " " +trunk * "#")