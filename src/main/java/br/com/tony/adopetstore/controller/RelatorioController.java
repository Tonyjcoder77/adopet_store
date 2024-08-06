package br.com.tony.adopetstore.controller;

import br.com.tony.adopetstore.dto.RelatorioFaturamento;
import br.com.tony.adopetstore.dto.RelatorioEstoque;
import br.com.tony.adopetstore.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/relatorios")
public class RelatorioController {
    @Autowired
    private RelatorioService service;

    @GetMapping("estoque")
    public ResponseEntity<RelatorioEstoque> obterInfoEstoque(){
        var relatorio = service.infoEstoque();
        return ResponseEntity.ok(relatorio);
    }

    @GetMapping("faturamento")
    public ResponseEntity<RelatorioFaturamento> obterInfoFaturamento(){
        var relatorio = service.faturamentoObtido();
        return ResponseEntity.ok(relatorio);
    }
}