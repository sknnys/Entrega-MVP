package com.entregamvp.presenter;

import com.entregamvp.model.Produto;
import com.entregamvp.view.ProdutoView;

public class ProdutoPresenter {
    private ProdutoView view;

    public ProdutoPresenter(ProdutoView view) {
        this.view = view;
    }

    public void incluirProduto() {
        String nome = view.obterNomeProduto();
        String descricao = view.obterDescricaoProduto();
        double preco = view.obterPrecoProduto();

        if (nome.isEmpty() || descricao.isEmpty() || preco <= 0) {
            view.mostrarErro("Todos os campos são obrigatórios e o preço deve ser positivo.");
            return;
        }

        Produto produto = new Produto(nome, descricao, preco);

        view.mostrarSucesso("Produto '" + produto.getNome() + "' incluído com sucesso!");
    }
}
