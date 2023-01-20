import tkinter as tk

def mostrarOpcion():
    label1.config(text=opcion.get())

def reiniciarOpciones():
    opcion.set(None)
    label1.config(text='-')

window = tk.Tk()
window.title('Python Radiobutton')
window.geometry('320x240')

opcion = tk.StringVar()
opcion.set(None)

r1 = tk.Radiobutton(window, text='Opción1', value='Opción 1', variable=opcion, command=mostrarOpcion)
r1.pack()

r2 = tk.Radiobutton(window, text='Opción2', value='Opción 2', variable=opcion, command=mostrarOpcion)
r2.pack()

r3 = tk.Radiobutton(window, text='Opción3', value='Opción 3', variable=opcion, command=mostrarOpcion)
r3.pack()

button1 = tk.Button(window, text='Reiniciar', command=reiniciarOpciones)
button1.config(cursor='hand2')
button1.pack()

label1 = tk.Label(window, text='-')
label1.pack()

window.mainloop()