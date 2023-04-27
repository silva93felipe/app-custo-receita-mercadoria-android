package com.example.custoreceitamercadoria.Entidades;

public class TipoMedida {

    private int Id;
    private String Nome;
    private String Sigla;
    private int Fator;

    public TipoMedida() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String sigla) {
        Sigla = sigla;
    }

    public int getFator() {
        return Fator;
    }

    public void setFator(int fator) {
        Fator = fator;
    }

    @Override
    public String toString() {
        return this.Nome;
    }
}
