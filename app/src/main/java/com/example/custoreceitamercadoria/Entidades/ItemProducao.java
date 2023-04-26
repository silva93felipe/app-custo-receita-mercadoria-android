package com.example.custoreceitamercadoria.Entidades;

public class ItemProducao {

    private int Id;
    private double Quantidade;
    private int ProdutoId;
    private int ProdutoItemId;

    public ItemProducao() {
    }

    public ItemProducao(int id, double quantidade, int produtoId, int produtoItemId) {
        Id = id;
        Quantidade = quantidade;
        ProdutoId = produtoId;
        ProdutoItemId = produtoItemId;
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

    public int getProdutoId() {
        return ProdutoId;
    }

    public void setProdutoId(int produtoId) {
        ProdutoId = produtoId;
    }

    public int getProdutoItemId() {
        return ProdutoItemId;
    }

    public void setProdutoItemId(int produtoItemId) {
        ProdutoItemId = produtoItemId;
    }

    @Override
    public String toString() {
        return String.valueOf(this.Id);
    }
}
