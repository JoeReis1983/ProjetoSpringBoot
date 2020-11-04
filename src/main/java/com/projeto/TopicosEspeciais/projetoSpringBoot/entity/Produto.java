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
    private Long id;

    @Column(name = "nome_produto")
    private String nome;

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id=id;
    }

    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
}
    
