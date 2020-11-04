package com.projeto.TopicosEspeciais.projetoSpringBoot.repository;

import com.projeto.TopicosEspeciais.projetoSpringBoot.entity.Produto;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    
    
}