import tkinter as tk
from BootAnimation import animate_boot
from Login import show_login_screen
from Desktop import Desktop

home = tk.Tk()
home.attributes("-fullscreen", True)
home.geometry("1024x768")
home.title("STAR OS")

def switch_to_login():
    show_login_screen(home, Desktop)

animate_boot(home, switch_to_login)

home.bind("<Escape>", lambda e: home.attributes("-fullscreen", False))

home.mainloop()