package br.com.tony.adopetstore.email;

import br.com.tony.adopetstore.dto.PedidoDTO;
import br.com.tony.adopetstore.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailPedidoRealizado {
    @Autowired
    private EnviadorEmail enviador;

    public void enviar(PedidoDTO dto, Usuario usuario){
        enviador.enviarEmail(
                "Pedido efetuado com sucesso na Adopet Store",
                usuario.getEmail(),
                "Olá! " + "!\n\nSeu pedido foi registrado. Itens: \n" + dto.itens());
    }
}
