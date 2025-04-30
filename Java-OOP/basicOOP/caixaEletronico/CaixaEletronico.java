package caixaEletronico;

import java.util.HashMap;
import java.util.Map;

public class CaixaEletronico {
    private Map<String, Cliente> clientes;

    public CaixaEletronico() {
        this.clientes = new HashMap<>();
        
        clientes.put("123", new Cliente("Adriana", "123", "senha123", 1000.0));
        clientes.put("456", new Cliente("Anselmo", "456", "senha456", 500.0));
    }

    public Cliente getCliente(String conta) {
        return clientes.get(conta);
    }
}

