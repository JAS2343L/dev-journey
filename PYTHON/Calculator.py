


operator = input("Enter an operator(+  -  *  /) = ")
num1 = int(input("Enter an Number= "))
num2 = int(input("Enter another Number= "))
   
if operator == "+":
    result = num1 + num2
    print (f"Answer is {result}")
elif operator == "-":
    result = num1 - num2
    print (round(f"Answer is {result}"))
elif operator == "*":
    result = num1 * num2
    print (round(f"Answer is {result}"))
elif operator == "/":
    result = num1 / num2
    print (round("Answer is {result}"))
else:
    print(f"{operator} IS NOT A VALID NUMBER!!!!")