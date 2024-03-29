
package com.tienda_v1.service.impl;

import com.tienda_v1.dao.ClienteDao;
import com.tienda_v1.dao.CreditoDao;
import com.tienda_v1.domain.Cliente;
import com.tienda_v1.domain.Credito;
import com.tienda_v1.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceimpl implements ClienteService {

    //Esto crea una única copia de un objeto
    @Autowired
    private ClienteDao clienteDao;
    
     @Autowired
    private CreditoDao creditoDao;
    
    @Override
    public List<Cliente> getCliente() {
       return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
    return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    
    }

    @Override
    public void deleteCliente(Cliente cliente) {
    clienteDao.delete(cliente);
    }

    @Override
    public void saveCliente(Cliente cliente) {
       Credito credito= cliente.getCredito();
       credito=creditoDao.save(credito);
       cliente.setCredito(credito);
    clienteDao.save(cliente);
    }
    
}
