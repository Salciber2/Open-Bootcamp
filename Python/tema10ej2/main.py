import tkinter as tk

def main():

    def showLanguages():
        texto = ''
        firstLanguage = True

        for i in range(0, len(optionChecks)):
            if optionChecks[i].get() == 1:
                if not firstLanguage:
                    texto += ', '
                texto += f'{languages[i]}'
                firstLanguage = False

        labelLanguage.config(text=texto)


    window = tk.Tk()
    window.title('Elementos seleccionables')
    window.geometry('480x360')
    window.resizable(0, 0)

    window.grid_columnconfigure(0, weight=1)
    window.grid_columnconfigure(1, weight=1)
    window.grid_columnconfigure(2, weight=1)
    window.grid_rowconfigure(0, weight=1)
    window.grid_rowconfigure(1, weight=1)

    labelTitle = tk.Label(window, text='Lenguajes')
    labelTitle.grid(column=0, row=0, columnspan=3)
    labelTitle.config(font=('Arial', 24))

    textDescription = 'Seleccionamos los lenguajes que queremos cargar y se hará una lista de ellos debajo del botón en orden alfabético.'
    labelDescription = tk.Label(window, text=textDescription, wraplength=460)
    labelDescription.grid(column=0, row=1, columnspan=3)

    languages = ['Python', 'HTML', 'JavaScript', 'CSS', 'Java', 'C', 'C++', 'C#', 'Ruby', 'PHP']
    languages.sort()
    check = []
    optionChecks = []
    c = 2 #Contador para empezar a escribir en otra fila

    for i in range(0, len(languages)):
        optionChecks.append(tk.IntVar(value=0))
        optionChecks[i].set(None)

        check.append(
            tk.Checkbutton(
                window,
                text=languages[i],
                variable=optionChecks[i],
                onvalue=optionChecks[i].set(1),
                offvalue=optionChecks[i].set(0),
            )
            .grid(column=(i % 3), row=c)
        )

        if i % 3 == 2:
            c += 1

    c += 1
    buttonCheck = tk.Button(window, text='Cargar lenguajes', command=showLanguages)
    buttonCheck.grid(column=0, row=c, columnspan=3)

    c += 1
    labelLanguage = tk.Label(window)
    labelLanguage.grid(column=0, row=c, columnspan=3, pady=10)

    window.mainloop()

if __name__ == '__main__':
    main()