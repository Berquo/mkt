package main.br.com.mkt.model;

import java.time.LocalDateTime;
import java.util.List;

public class Compra {
    private LocalDateTime data;
    private Filial filial;
    private Cliente cliente;
    private List<Item> itens;
    private float total;

    public Compra(LocalDateTime data, Filial filial, Cliente cliente, List<Item> itens, float total) {
        this.data = data;
        this.filial = filial;
        this.cliente = cliente;
        this.itens = itens;
        this.total = total;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}





