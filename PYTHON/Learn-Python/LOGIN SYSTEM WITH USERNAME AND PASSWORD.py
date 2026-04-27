#LOGIN SYSTEM WITH USERNAME AND PASSWORD

#input()
#if-else
#functions
#dictionary
#loop

users = {
    "Administrator": "9876",
    "guest": "0000",
    "k": "k"
}

def login():
    username = input("ENTER USERNAME = ")
    password = input("ENTER PASSWORD = ")

    if username in users and users[username] == password:
        print(f"LOGIN SUCCESSFUL! WELCOME, {username}.\n")
        return True
    else:
        print("INVALID USERNAME & PASSWORD!!.\n")
        return False
    
attemps = 3
while attemps > 0:
    if login():
        break
    attemps -= 1
    print(f"WARNING!!, YOU HAVE {attemps} ATTEMPS LEFT.\n")

if attemps == 0:
    print("WARNING !!!, NO ATTEMPS LEFT!!.\n")
