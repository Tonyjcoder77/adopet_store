package br.com.tony.adopetstore.dto;

import java.util.List;

public record RelatorioEstoque (List<ProdutoDTO> produtosAusentes) {
}