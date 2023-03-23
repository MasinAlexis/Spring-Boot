package com.proyectocliente.clientes.dao;

import com.proyectocliente.clientes.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long>{
}


