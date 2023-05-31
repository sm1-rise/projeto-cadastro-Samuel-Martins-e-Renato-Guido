package utils;

import conditions.Condition;
import domains.product.Product;
import handler.Data;
import domains.accessories.Capinha;
import domains.accessories.Carregador;
import domains.accessories.Fone;
import domains.smartphone.Apple;
import domains.smartphone.Motorola;
import domains.smartphone.Samsung;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;




public class Menu {

    static Scanner sc = new Scanner(System.in);
    static int indexAux = 1;
    static int quantidadeProdutosCadastro;
    static boolean whileDoMenu = true;
    static int escolha;

    /*
     *Método menu, para decisão do usuario.
     */

    public static int pedirQuantidadeProduto () {
        while (true) {
            try {
                System.out.println("\nDigite quantos produtos deseja cadastrar ?");
                quantidadeProdutosCadastro = sc.nextInt();

                if (quantidadeProdutosCadastro > 0.99 ){
                    return quantidadeProdutosCadastro;
                }

                if (quantidadeProdutosCadastro == 0) {
                    System.out.println("Ação cancelada.\n");
                    break;
                }

                else {
                    System.out.println("Digite um valor == 0 ou maior que 1 ");
                    System.out.println("\nDigite quantos produtos deseja cadastrar ?");
                    quantidadeProdutosCadastro = sc.nextInt();
                }

            }catch(InputMismatchException e){
                System.out.println("Por Favor, inisra somente numeros: ");
                sc.nextLine();
            }
        }
        return quantidadeProdutosCadastro;
    }

    public static void menu () {
        while (true) {
            try {
                System.out.println("Escolha uma das opcoes: ");
                System.out.println("1- Cadastrar Produto");
                System.out.println("2- Remover Produto");
                System.out.println("3- Consultar Produto");
                System.out.println("4- Sair");
                System.out.println("\nEscolha uma opçao: ");
                escolha = sc.nextInt();

                if (escolha == 1) {
                    pedirQuantidadeProduto();
                    decisaoUsuario();
                    menu();
                } else if (escolha == 2) {
                    Condition.simOuNao(Condition::removerProduto);
                    menu();
                } else if (escolha == 3) {
                    Condition.simOuNao(Condition::consultarProduto);
                    menu();
                } else if (escolha ==4) {
                    System.out.println("Saindo...");
                }

                else{
                    System.out.println("Escolha um valor em 1 e 4.");
                }

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Por favor, digite um valor válido inteiro. Tente novamente.");
            }
            break;
        }


    }

    /*
     * Método para gerar ID com 4 digitos.
     */
    public static int gerarID() {
        Random valor = new Random();
        int iDproduto = valor.nextInt();
        while (iDproduto < 1000 || iDproduto > 9999) {
            iDproduto = valor.nextInt();
        }
        return iDproduto;
    }

    /*
     *Método de escolha qual produto deseja cadastrar
     */
    public static void decisaoUsuario() {
        for (int i = 1; i <= quantidadeProdutosCadastro; i++) {

            int escolhaUsuario;
            System.out.println("\nPRODUTO Nº "+ indexAux);

            while (true) {
                try {
                    System.out.println("Escolha o item que deseja cadastrar: ");
                    System.out.println("1- Iphone");
                    System.out.println("2- Motorola Moto");
                    System.out.println("3- Samsung Galaxy");
                    System.out.println("4- Carregador");
                    System.out.println("5- Capa Protetora");
                    System.out.println("6- Fone\n");
                    escolhaUsuario = sc.nextInt();

                    while (escolhaUsuario < 1 || escolhaUsuario > 6){
                        System.out.println("Produto nao encontrado, digite um valor em 1 e 6.");
                        escolhaUsuario = sc.nextInt();
                    }
                    break;
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("Por favor, digite um valor válido inteiro. Tente novamente.");
                }
            }


            /*
            Switch case para decisão do usuario
             */
            switch (escolhaUsuario) {
                case 1:
                    Condition.informacoesCelular();
                    Apple apple = new Apple(
                            Condition.nomeProduto,
                            gerarID(),
                            Condition.marcaProduto,
                            Condition.corProduto,
                            Condition.descricaoProduto,
                            Condition.precoProduto,
                            Condition.tamanhoMemoriaRam,
                            Condition.tamanhoMemoria,
                            Condition.tamanhoTela,
                            Condition.tipoTela
                    );
                    Data.products.add(apple);
                    break;

                case 2:
                    Condition.informacoesCelular();
                    Motorola motorola = new Motorola(
                            Condition.nomeProduto,
                            gerarID(),
                            Condition.marcaProduto,
                            Condition.corProduto,
                            Condition.descricaoProduto,
                            Condition.precoProduto,
                            Condition.tamanhoMemoriaRam,
                            Condition.tamanhoMemoria,
                            Condition.tamanhoTela,
                            Condition.tipoTela
                    );
                    Data.products.add(motorola);
                    break;

                case 3:
                    Condition.informacoesCelular();
                    Samsung samsung = new Samsung(
                            Condition.nomeProduto,
                            gerarID(),
                            Condition.marcaProduto,
                            Condition.corProduto,
                            Condition.descricaoProduto,
                            Condition.precoProduto,
                            Condition.tamanhoMemoriaRam,
                            Condition.tamanhoMemoria,
                            Condition.tamanhoTela,
                            Condition.tipoTela
                    );
                    Data.products.add(samsung);
                    break;

                case 4:
                    Condition.informacoesAcessorio();
                    Carregador carregador = new Carregador(
                            Condition.nomeProduto,
                            gerarID(),
                            Condition.marcaProduto,
                            Condition.corProduto,
                            Condition.descricaoProduto,
                            Condition.precoProduto,
                            Condition.conector,
                            Condition.tipoMaterial,
                            Condition.protecao
                    );
                    Data.products.add(carregador);
                    break;

                case 5:
                    Condition.informacoesAcessorio();
                    Capinha capinha = new Capinha(
                            Condition.nomeProduto,
                            gerarID(),
                            Condition.marcaProduto,
                            Condition.corProduto,
                            Condition.descricaoProduto,
                            Condition.precoProduto,
                            Condition.conector,
                            Condition.tipoMaterial,
                            Condition.protecao
                    );
                    Data.products.add(capinha);
                    break;

                case 6:
                    Condition.informacoesAcessorio();
                    Fone fone = new Fone(
                            Condition.nomeProduto,
                            gerarID(),
                            Condition.marcaProduto,
                            Condition.corProduto,
                            Condition.descricaoProduto,
                            Condition.precoProduto,
                            Condition.conector,
                            Condition.tipoMaterial,
                            Condition.protecao
                    );
                    Data.products.add(fone);
                    break;
            }
            //variavel auxiliar para contagem da quantidade de produtos.
            indexAux++;
        }
        //Para imprimir produtos cadastrados após impressão.
        System.out.println(Data.products);
    }
}



