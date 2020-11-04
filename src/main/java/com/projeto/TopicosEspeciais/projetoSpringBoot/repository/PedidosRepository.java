package com.projeto.TopicosEspeciais.projetoSpringBoot.repository;


import com.projeto.TopicosEspeciais.projetoSpringBoot.entity.Pedidos;

import org.springframework.data.jpa.repository.JpaRepository;



public interface PedidosRepository extends JpaRepository<Pedidos,Long> {
    
    
}