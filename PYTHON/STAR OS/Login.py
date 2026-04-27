import tkinter as tk 
from tkinter import messagebox

USERNAME = "Kingg"
PASSWORD = "1619010"

def show_login_screen(home, switch_to_desktop):
    login_screen = tk.Frame(home, bg="#222")
    login_screen.place(relwidth=1, relheight=1)

    tk.Label(login_screen, text="Login to star", font=("Arial", 16)).pack(pady=50)
    tk.Label(login_screen, text="Username:").pack()
    username_entry = tk.Entry(login_screen)
    username_entry.pack()

    tk.Label(login_screen, text="Password:").pack()
    password_entry = tk.Entry(login_screen, show="*")
    password_entry.pack()

    def validate():
        if username_entry.get() == "k" and password_entry.get() == "1":
            login_screen.place_forget()
            switch_to_desktop(home)
        else:
            messagebox.showerror("Login Error", "Username Or Password are incorrect")    

    tk.Button(login_screen, text="LOGIN", command=validate).pack(pady=20)
    