package com.projeto.TopicosEspeciais.projetoSpringBoot.repository;

import com.projeto.TopicosEspeciais.projetoSpringBoot.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    
    
}