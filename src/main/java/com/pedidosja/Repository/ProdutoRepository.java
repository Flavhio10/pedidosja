package com.pedidosja.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedidosja.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
