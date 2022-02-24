package com.generation.lojadegames.repository;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojadegames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	List <Produto> findAllByNomeContainingIgnoreCase (String nome);
	
	List <Produto> findByPrecoGreaterThanOrderByPreco (BigDecimal preco);
	
	List <Produto> findByPrecoLessThanOrderByPrecoDesc (BigDecimal preco);

}