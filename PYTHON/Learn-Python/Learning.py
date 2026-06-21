#name = input("Name: ")
#age = int(input("Age: "))
#print("HELLO", name)
#print(f"you are {age} years old!")



#if age >= 18:
    #print("you are adult")
#else:
    #print("minors are not allowed")



#for i in range (5):
    #print(i)



#count = 0
#while count < 1000000:
    #print(count)
    #count +=100



#def greenizsh(naam):
    #print(f"hello {naam}")

#greenizsh (input("entar naam: "))



#import random
#fruits = random.randint(1,19999999)
#print(fruits)


print("\nSELECT NUMBERS ONLY!!!")

a = input("\n1)READ\n2)WRITE\n\n-> ")

def rw():
    if a == "1":
        with open("data.txt", "r") as b:
            print(b.read())
    elif a == "2":
        with open("data.txt", "w") as c:
            c.write(input("\nType what you want:\n\n"))
            print("\nYour Data Has Been Saved !")
    else:
        print("ONLY SELECT NUMBERS!!!")
        rw()

while True:
    rw()