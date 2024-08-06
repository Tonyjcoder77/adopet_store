package br.com.tony.adopetstore.dto;

import java.math.BigDecimal;
import java.util.List;

public record RelatorioFaturamento(BigDecimal faturamentoTotal, List<EstatisticasVenda> estatisticas) {
}