f = open("users.txt", "w")
f.write(input("Type Anything:\n "))
f.write("\npythoneeess")
f.close()

e = open("users.txt", "r")
data =e.read()
print("\n", data)
e.close()