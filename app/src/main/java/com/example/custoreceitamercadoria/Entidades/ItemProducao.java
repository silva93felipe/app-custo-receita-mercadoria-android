package com.example.custoreceitamercadoria.Entidades;

public class ItemProducao {

    private int Id;
    private double Quantidade;
    private int ProducaoId;
    private int InsumoId;
    private int TipoMedidaId;

    /* Não mapeado no banco de dados */
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

    public int getProducaoId() {
        return ProducaoId;
    }

    public void setProducaoId(int producaoId) {
        ProducaoId = producaoId;
    }

    public int getInsumoId() {
        return InsumoId;
    }

    public void setInsumoId(int insumoId) {
        InsumoId = insumoId;
    }

    public int getTipoMedidaId() {
        return TipoMedidaId;
    }

    public void setTipoMedidaId(int tipoMedidaId) {
        TipoMedidaId = tipoMedidaId;
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
