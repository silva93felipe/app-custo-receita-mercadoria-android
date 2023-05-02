package com.example.custoreceitamercadoria.Entidades;

public class Insumo {

    private int Id;
    private String Descricao;
    private double QuantidadeRepresentanda;

    /* Não mapeado no banco de dados */
    private TipoMedida vTipoMedidaCompra;
    private TipoMedida vTipoMedidaQuantidadeRepresentada;
    private double ValorCompra;

    public Insumo() {
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

    public double getQuantidadeRepresentanda() {
        return QuantidadeRepresentanda;
    }

    public void setQuantidadeRepresentanda(double quantidadeRepresentanda) {
        QuantidadeRepresentanda = quantidadeRepresentanda;
    }

    public TipoMedida getvTipoMedidaCompra() {
        return vTipoMedidaCompra;
    }

    public void setvTipoMedidaCompra(TipoMedida vTipoMedidaCompra) {
        this.vTipoMedidaCompra = vTipoMedidaCompra;
    }

    public TipoMedida getvTipoMedidaQuantidadeRepresentada() {
        return vTipoMedidaQuantidadeRepresentada;
    }

    public void setvTipoMedidaQuantidadeRepresentada(TipoMedida vTipoMedidaQuantidadeRepresentada) {
        this.vTipoMedidaQuantidadeRepresentada = vTipoMedidaQuantidadeRepresentada;
    }

    public double getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(double valorCompra) {
        ValorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return String.valueOf(Id);
    }
}
