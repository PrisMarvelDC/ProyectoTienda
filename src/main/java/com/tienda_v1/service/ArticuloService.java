package com.tienda_v1.service;

import com.tienda_v1.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    //Obtiene la lista de registros de la tabla articulo y 
    //lo coloca en una lista de objetos Articulos
    
    public List<Articulo> getArticulos(boolean activos);
    
    //Obtiene el resgistro de la tabla articulo.
    //que tiene el idArticulo pasado por el objeto articulo.
    public Articulo getArticulo(Articulo articulo);
  
    //Elimina el resgistro de la tabla articulo.
    //que tiene el idArticulo pasado por el objeto articulo.
    public void deleteArticulo(Articulo articulo);
    
    //Si el idArticulo pasado esta no exite 
    //o es nulo se crea un registro nuevo en la tabla articulo
   //Si el id articulo existe se actualiza la informacion
    public void saveArticulo(Articulo articulo);
    
}