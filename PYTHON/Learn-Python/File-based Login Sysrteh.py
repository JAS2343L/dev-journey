users = {}

with open("USERS.txt", "r") as a:
    for loan in a:
        usr,pss = loan.strip().split(",")
        users[usr] = pss

userkanaam = input("Username: ")
uskapassword = input("Password: ")

if userkanaam in users and users[usr] == uskapassword:
    print(f"LOGIN Successful, Welcome {usr}")
else:
    print("WRONG USR OR PWD!!")
