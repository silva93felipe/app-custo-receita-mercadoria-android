package com.example.custoreceitamercadoria.Entidades;

public class Insumo {

    private int Id;
    private int ProducaoId;
    private double Quantidade;
    private int TipoMedidaCompraId;
    private int TipoMedidaQuantidadeRepresentadaId;
    private double QuantidadeRepresentanda;

    /* Não mapeado no banco de dados */
    private Producao vProducao;
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

    public int getProducaoId() {
        return ProducaoId;
    }

    public void setProducaoId(int producaoId) {
        ProducaoId = producaoId;
    }

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double quantidade) {
        Quantidade = quantidade;
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

    public Producao getvProducao() {
        return vProducao;
    }

    public void setvProducao(Producao vProducao) {
        this.vProducao = vProducao;
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
