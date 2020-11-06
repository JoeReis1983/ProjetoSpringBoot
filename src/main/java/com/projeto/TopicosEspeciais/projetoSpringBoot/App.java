package com.projeto.TopicosEspeciais.projetoSpringBoot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projeto.TopicosEspeciais.projetoSpringBoot.entity.Cliente;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("dbserver");
        EntityManager gerente =  fabrica.createEntityManager();

        Cliente cliente1 = new Cliente();
        cliente1.setNomeCliente("E. Mineda");

        try{
        gerente.getTransaction().begin();
        gerente.persist(cliente1);
        gerente.getTransaction().commit();
        }
        catch(Exception e){
            e.printStackTrace();
            gerente.getTransaction().rollback();
        }
        System.out.println(cliente1.getIdCliente());
        gerente.close();


    }
    
}