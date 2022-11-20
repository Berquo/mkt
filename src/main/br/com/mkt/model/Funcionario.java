package main.br.com.mkt.model;

import java.time.LocalDateTime;

public class Funcionario {
    private String nome;
    private String cpf;
    private LocalDateTime dataNascimento;
    private Filial filial;
    private String sexo;

    public Funcionario(String nome, String cpf, LocalDateTime dataNascimento, Filial filial, String sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.filial = filial;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public Filial getFilial(){
        return filial;
    }

    public void setFilial(Filial filial){
        this.filial = filial;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
}


