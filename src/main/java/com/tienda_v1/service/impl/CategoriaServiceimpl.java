
package com.tienda_v1.service.impl;

import com.tienda_v1.dao.CategoriaDao;
import com.tienda_v1.domain.Categoria;
import com.tienda_v1.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceimpl implements CategoriaService {

    //Esto crea una única copia de un objeto
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategorias(boolean activos) {
       var lista=(List<Categoria>) categoriaDao.findAll();
        
    if(activos){
        lista.removeIf(e -> !e.isActive());
    }
    return lista;
    
    }

    @Override
    public Categoria getCategoria(Categoria categoria) {
    return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    
    }

    @Override
    public void deleteCategoria(Categoria categoria) {
    categoriaDao.delete(categoria);
    }

    @Override
    public void saveCategoria(Categoria categoria) {
    
    categoriaDao.save(categoria);
    }

    
    
}
