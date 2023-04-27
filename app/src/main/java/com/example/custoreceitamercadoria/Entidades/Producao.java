package com.example.custoreceitamercadoria.Entidades;

public class Producao {

    private int Id;
    private String Descricao;
    private double PercentualLucro;
    private double ValorVenda;
    /* Não mapeado no banco de dados */
    private double ValorVendaSugerido;
    private double CustoTotal;

    public Producao() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public double getPercentualLucro() {
        return PercentualLucro;
    }

    public void setPercentualLucro(double percentualLucro) {
        PercentualLucro = percentualLucro;
    }

    public double getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(double valorVenda) {
        ValorVenda = valorVenda;
    }

    public double getValorVendaSugerido() {
        return ValorVendaSugerido;
    }

    public void setValorVendaSugerido(double valorVendaSugerido) {
        ValorVendaSugerido = valorVendaSugerido;
    }

    public double getCustoTotal() {
        return CustoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        CustoTotal = custoTotal;
    }

    @Override
    public String toString(){
        return this.Descricao;
    }
}
