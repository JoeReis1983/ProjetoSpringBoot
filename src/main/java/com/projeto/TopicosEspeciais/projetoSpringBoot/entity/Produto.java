package com.projeto.TopicosEspeciais.projetoSpringBoot.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long idProduto;

    @Column(name = "nome_produto")
    private String nomeProduto;

    public Long getIdProduto(){
        return this.idProduto;
    }
    public void setIdProduto(Long idProduto){
        this.idProduto=idProduto;
    }
    
    public String getNomeProduto(){
        return this.nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto= nomeProduto;
    }
}
    
