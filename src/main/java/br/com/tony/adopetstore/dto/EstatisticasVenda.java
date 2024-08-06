package br.com.tony.adopetstore.dto;

import br.com.tony.adopetstore.model.Categoria;

import java.math.BigDecimal;

public record EstatisticasVenda(Categoria categoria, Long quantidadesVenda, BigDecimal faturamento) {
}