package br.com.tony.adopetstore.dto;

import br.com.tony.adopetstore.model.Estoque;

public record EstoqueDTO(Long produtoId, Integer quantidade) {
    public EstoqueDTO(Estoque estoque){
        this(estoque.getProduto().getId(), estoque.getQuantidade());
    }
}
