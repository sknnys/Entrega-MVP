package com.entregamvp.view;

public interface ProdutoView {
    void mostrarSucesso(String mensagem);
    void mostrarErro(String mensagem);
    String obterNomeProduto();
    String obterDescricaoProduto();
    double obterPrecoProduto();
}
