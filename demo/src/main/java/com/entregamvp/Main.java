package com.entregamvp;

import com.entregamvp.presenter.ProdutoPresenter;
import com.entregamvp.view.ProdutoView;
import com.entregamvp.view.ProdutoViewImpl;


public class Main {
    public static void main(String[] args) {
        ProdutoView view = new ProdutoViewImpl();
        ProdutoPresenter presenter = new ProdutoPresenter(view);

        presenter.incluirProduto();
    }
}
