package com.tema5;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        Coche coche1 = new Coche("Corsa");
        Coche coche2 = new Coche("Mustang");
        Coche coche3 = new Coche("Gallardo");

        cocheCRUD.save(coche1);
        cocheCRUD.save(coche2);
        cocheCRUD.save(coche3);

        List<Coche> coches = cocheCRUD.findAll();

        System.out.println(coches);
        
        cocheCRUD.delete(coche2);

        System.out.println(coches);
    }
    
}
