import tkinter as tk
import time

def Desktop(home):
    desktop = tk.Frame(home, bg = "#008A5C")
    desktop.place(relwidth = 1, relheight = 1)

    taskbar = tk.Frame(desktop, bg = "black", height = 40, width = 1024)
    taskbar.place(x = 0, y = 728)

    start = tk.Frame(desktop, bg = "#444", width = 200, height = 140)
    start.place_forget()
    
    def start_menu():
        if start.winfo_ismapped():
            start.place_forget()
        else:
            start.place(x = 0, y = 728 - 140)

    start_button = tk.Button(taskbar, text="START", command = start_menu)
    start_button.place(x = 5,y = 5)

    #for y in range (768, 724, -2):
        #taskbar.place(y=y)
        #home.update()
        #time.sleep(0.005)