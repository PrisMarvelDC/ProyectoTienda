
package com.tienda_v1.service;

import com.tienda_v1.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    //Obtiene la lista de registros de la tabla categoria y 
    //lo coloca en una lista de objetos Categorias
    
    public List<Categoria> getCategorias(boolean activos);
    
    //Obtiene el resgistro de la tabla categoria.
    //que tiene el idCategoria pasado por el objeto categoria.
    public Categoria getCategoria(Categoria categoria);
  
    //Elimina el resgistro de la tabla categoria.
    //que tiene el idCategoria pasado por el objeto categoria.
    public void deleteCategoria(Categoria categoria);
    
    //Si el idCategoria pasado esta no exite 
    //o es nulo se crea un registro nuevo en la tabla categoria
   //Si el id categoria existe se actualiza la informacion
    public void saveCategoria(Categoria categoria);
    
}
