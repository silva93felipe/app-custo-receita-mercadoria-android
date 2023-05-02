package com.example.custoreceitamercadoria.Entidades;

public class ItemProducao {

    private int Id;
    private double Quantidade;
    private double Custo;
    private Producao vProducao;
    private Insumo vInsumo;
    private TipoMedida vTipoMedida;

    public ItemProducao() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double quantidade) {
        Quantidade = quantidade;
    }

    public double getCusto() {
        return Custo;
    }

    public void setCusto(double custo) {
        Custo = custo;
    }

    public Producao getvProducao() {
        return vProducao;
    }

    public void setvProducao(Producao vProducao) {
        this.vProducao = vProducao;
    }

    public Insumo getvInsumo() {
        return vInsumo;
    }

    public void setvInsumo(Insumo vInsumo) {
        this.vInsumo = vInsumo;
    }

    public TipoMedida getvTipoMedida() {
        return vTipoMedida;
    }

    public void setvTipoMedida(TipoMedida vTipoMedida) {
        this.vTipoMedida = vTipoMedida;
    }

    @Override
    public String toString() {
        return String.valueOf(this.Id);
    }
}
