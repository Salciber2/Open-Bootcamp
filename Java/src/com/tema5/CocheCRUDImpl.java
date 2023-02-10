package com.tema5;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    List<Coche> coches;

    public CocheCRUDImpl(){
        this.coches = new ArrayList<Coche>();
    }

    public boolean save(Coche coche){
        coches.add(coche);
        System.out.println("Método save: Se guardó el coche " + coche.modelo + "\n");
        return true;
    }

    public List<Coche> findAll(){
        System.out.println("Método findAll: Se obtuvo la lista de coches\n");
        return coches;
    }

    public boolean delete(Coche coche){
        coches.remove(coche);
        System.out.println("Método delete: Se eliminó el coche " + coche.modelo + "\n");
        return true;
    }

}