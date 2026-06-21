username = input('Enter Your Username = ')

while len(username) <= 3:
    print("Username can't be LOWER than 3 characters!!")
    username = input('Enter Your Username = ')
while len(username) >= 20:
    print("Username can't be MORE than 20 characters!!")
    username = input('Enter Your Username = ')

password = input('Enter your password = ')
m_password  = "*" * len(password)

while len(password) <= 5:
    print("Password can't be LOWER than 5 characters!!")
    password = input('Enter your password = ')
while len(password) >= 20:
    print("Password can't be MORE than 20 characters!!")
    password = input('Enter your password = ')
else:
    print(f"You are signed in (welcome {username})")
    print(f"Your Password is {m_password}")