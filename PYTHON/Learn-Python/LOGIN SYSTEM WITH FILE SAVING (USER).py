#LOGIN SYSTEM WITH FILE SAVING (USER)


def load_user():
    users = {}
    try:
        with open("Learn Python/users.txt", "r") as file:
            for line in file:
                if ":" in line:
                    name, pwd = line.strip().split(":")
                    users[name] = pwd

    except FileNotFoundError:
        print("users.txt not found. Creating new one./..")
        open("users.txt", "w").close()
    return users

def login(users):
    username = input("ENTER USERNAME: ")
    password = input("ENTER PASSWORD: ")

    if username in users and users[username] == password:
        print(f"Welcome {username}.\n")
        return True
    else:
        print("INCORRECT USERNAME OR PASSWORD!!.\n")
        return False
    
def register():
    username = input("choose username: ")
    password = input("choose password: ")

    with open("users.txt", "a") as file:
        file.write(f"{username}:{password}\n")
    print("USER REGISTERED./..\n")

while True:
    print("\n==== Welcome ====")
    print("1. Login")
    print("2. Register")
    print("3. Exit")
    choice = input("CHOOSE:  ")

    users = load_user()


    if choice == "1":
        if login(users):
            break
    elif choice == "2":
        register()
    elif choice == "3":
        print("Goodbye!")
        break
    else:
        print("Invalid choice.\n")    