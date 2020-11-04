package com.projeto.TopicosEspeciais.projetoSpringBoot.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedidos {

    @Id
    @Column(name = "id_pedido")
    private Long id;

    @Id
    @Column(name = "id_produto")
    private Long idProduto;

    @Id
    @Column(name = "id_cliente")
    private Long idCliente;


    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id=id;
    }
    
    public Long getIdProduto(){
        return this.idProduto;
    }
    public void setIdProduto(Long idProduto){
        this.idProduto= idProduto;
    }

    public Long getIdCliente(){
        return this.idCliente;
    }
    public void setIdCliente(Long idCliente){
        this.idCliente= idCliente;
    }
}
    
