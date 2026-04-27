import tkinter as tk
import time
from PIL import Image, ImageTk

def animate_boot(home, switch_to_login):
    home.config(cursor="none")
    boot = tk.Frame(home, bg="black")
    boot.place(relwidth=1, relheight=1)

    bg = Image.open("PYTHON/STAR OS/STAROS.bmp")
    bg = bg.resize((290, 244))
    bg_image = ImageTk.PhotoImage(bg)

    boot_label = tk.Label(boot, text="STAR OS", font=("Sans", 30), fg="white", bg="black")
    boot_label.pack(expand=True)

    BG = tk.Label(boot, image=bg_image, bg=("black"))
    BG.place(x=0, y=0, relwidth=1, relheight=0.7)

    progress = tk.Label(boot, text="", fg = "lime", bg="black", font=("consolas", 12))
    progress.pack(pady=150)

    dots = ""
    for i in range(10):
        dots += "o "
        progress.config(text=f"{dots}")
        boot.update()
        time.sleep(0.9)


    boot.place_forget()
    home.config(cursor="")
    switch_to_login()
