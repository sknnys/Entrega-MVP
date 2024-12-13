package com.entregamvp.view;

import java.util.Scanner;

public class ProdutoViewImpl implements ProdutoView {
    private Scanner scanner;

    public ProdutoViewImpl() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void mostrarSucesso(String mensagem) {
        System.out.println("[SUCESSO] " + mensagem);
    }

    @Override
    public void mostrarErro(String mensagem) {
        System.out.println("[ERRO] " + mensagem);
    }

    @Override
    public String obterNomeProduto() {
        System.out.print("Digite o nome do produto: ");
        return scanner.nextLine();
    }

    @Override
    public String obterDescricaoProduto() {
        System.out.print("Digite a descrição do produto: ");
        return scanner.nextLine();
    }

    @Override
    public double obterPrecoProduto() {
        System.out.print("Digite o preço do produto: ");
        return scanner.nextDouble();
    }
}
