package main.br.com.mkt.model;

import java.util.ArrayList;
import java.util.List;

public class Filial {
    private String cnpj;
    private String endereco;
    private List<Funcionario> funcionarios;
    private Rede rede;
    private List<Compra> compras = new ArrayList<>();

    public Filial(String cnpj, String endereco, List<Funcionario> funcionarios){
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.funcionarios = funcionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Rede getRede() {
        return rede;
    }

    public void setRede(Rede rede){
        this.rede = rede;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

}





