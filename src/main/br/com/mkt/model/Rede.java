package main.br.com.mkt.model;

import java.util.ArrayList;
import java.util.List;

public class Rede {
    private String razaoSocial;
    private String cnpj;
    private List<Filial> filiais = new ArrayList<>();

    public Rede(String a, String b, List<Filial> c) {
        this.razaoSocial = a;
        this.cnpj = b;
        this.filiais = c;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Filial> getFiliais() {
        return filiais;
    }

    public void setFiliais(List<Filial> filiais) {
        this.filiais = filiais;
    }
}