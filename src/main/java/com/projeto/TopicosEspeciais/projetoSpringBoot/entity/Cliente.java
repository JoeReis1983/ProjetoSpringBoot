package com.projeto.TopicosEspeciais.projetoSpringBoot.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "nome_cliente")
    private String nomeCliente;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idCliente")
    private Set<Produto> produtosComprados;





    public Long getIdCliente(){
        return this.idCliente;
    }
    public void setIdCliente(Long idCliente){
        this.idCliente=idCliente;
    }

    
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente= nomeCliente;
    }

    public Set<Produto> getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(Set<Produto> produtosComprados) {
        this.produtosComprados = produtosComprados;
    }
}