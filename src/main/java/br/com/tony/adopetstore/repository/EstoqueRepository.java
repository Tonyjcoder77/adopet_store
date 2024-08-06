package br.com.tony.adopetstore.repository;

import br.com.tony.adopetstore.model.Estoque;
import br.com.tony.adopetstore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    Estoque findByProdutoId(Long idProduto);

    @Query("SELECT e FROM Estoque e WHERE e.produto.ativo=true")
    List<Estoque> findAll();
    @Query("SELECT e.produto FROM Estoque e WHERE e.quantidade = 0")
    List<Produto> produtosComEstoqueZerado();
}
