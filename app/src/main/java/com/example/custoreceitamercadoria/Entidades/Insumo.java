package com.example.custoreceitamercadoria.Entidades;

public class Insumo {

    private int Id;
    private String Descricao;
    private int TipoMedidaCompraId;
    private int TipoMedidaQuantidadeRepresentadaId;
    private double QuantidadeRepresentanda;

    /* Não mapeado no banco de dados */
    private TipoMedida vTipoMedidaCompra;
    private TipoMedida vTipoMedidaQuantidadeRepresentada;

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

    public int getTipoMedidaCompraId() {
        return TipoMedidaCompraId;
    }

    public void setTipoMedidaCompraId(int tipoMedidaCompraId) {
        TipoMedidaCompraId = tipoMedidaCompraId;
    }

    public int getTipoMedidaQuantidadeRepresentadaId() {
        return TipoMedidaQuantidadeRepresentadaId;
    }

    public void setTipoMedidaQuantidadeRepresentadaId(int tipoMedidaQuantidadeRepresentadaId) {
        TipoMedidaQuantidadeRepresentadaId = tipoMedidaQuantidadeRepresentadaId;
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

    @Override
    public String toString() {
        return String.valueOf(Id);
    }
}
