package com.tema5;

import java.util.List;

public interface CocheCRUD {
    
    public boolean save(Coche coche);

    public List<Coche> findAll();

    public boolean delete(Coche coche);
}
