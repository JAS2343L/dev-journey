#FUNCTIONS

#BASIC FUNCTION with parameters
#def greet(name):
    #print(f"hello {name}")

#greet("WNIDOSSsss")



#function with return value
#def add(a, b):
    #return a + b

#result = add(10, 5)
#print(f"sum is : {result}")



#default parameters 
#def naam(name = "Guest"):
    #print(f"hello {name}")

#naam()
#naam("WNIDOSSss")



#function + List
#def print_list(items):
    #for item in items:
        #print("-",items)

#my_list = ["Python", "Scratch", "STAROS"]
#print_list(my_list)



def avg(a, b, c):
    return (a + b + c) / 3

x = int(input("Enter number 1: "))
y = int(input("Enter number 2: "))
z = int(input("Enter number 3: "))

print("Average is:", avg(x,y,z))
