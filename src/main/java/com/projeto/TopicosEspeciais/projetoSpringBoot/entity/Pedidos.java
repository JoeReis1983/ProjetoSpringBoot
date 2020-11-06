package com.projeto.TopicosEspeciais.projetoSpringBoot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long idPedido;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente") 
    private Cliente idCliente;

    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_produto") 
    private Produto idProduto;

    public Long getIdPedido(){
        return this.idPedido;
    }
    public void setIdPedido(Long idPedido){
        this.idPedido=idPedido;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

 
    
}
    
