package com.projeto.TopicosEspeciais.projetoSpringBoot;

import com.projeto.TopicosEspeciais.projetoSpringBoot.entity.Cliente;
//import com.projeto.TopicosEspeciais.projetoSpringBoot.entity.Pedidos;
import com.projeto.TopicosEspeciais.projetoSpringBoot.entity.Produto;
import com.projeto.TopicosEspeciais.projetoSpringBoot.repository.ClienteRepository;
//import com.projeto.TopicosEspeciais.projetoSpringBoot.repository.PedidosRepository;
import com.projeto.TopicosEspeciais.projetoSpringBoot.repository.ProdutoRepository;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjetoSpringBootApplicationTests {

    @Autowired
    private ClienteRepository clienteRepo;

    @Autowired
    private ProdutoRepository produtoRepo;

    @Autowired
   // private PedidosRepository pedidosRepo;

	@Test
	void contextLoads() {
    }

    @Test
    void testInserirCliente(){
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Mineda");
        clienteRepo.save(cliente1);
        assertNotNull(cliente1.getId());
    }
    @Test
    void testInserirProduto(){

        Produto produto1 = new Produto();
        produto1.setNome("Gol");
        produtoRepo.save(produto1);
        assertNotNull(produto1.getId());
    }
    @Test
    void testInserirPedidos(){
        //Pedidos pedido1 = new Pedidos();
        
        //pedidosRepo.save(pedido1);
        //assertNotNull(pedido1.getId());

    }

}
