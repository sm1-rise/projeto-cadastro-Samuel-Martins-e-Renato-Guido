package conditions;

import handler.Data;
import domains.product.Product;
import utils.Menu;
import utils.TextoCadastro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Condition {

    public static String nomeProduto;
    public static String marcaProduto;
    public static Double precoProduto;
    public static String corProduto;
    public static String descricaoProduto;
    public static int tamanhoMemoriaRam;
    public static int tamanhoMemoria;
    public static double tamanhoTela;
    public static String tipoTela;
    public static String conector;
    public static String tipoMaterial;
    public static String protecao;
    public static int resposta;
    public static int index;

    public static Scanner sc = new Scanner(System.in);

    public static void simOuNao (Runnable method) {
        while (true) {
            try {
                System.out.println("\nDeseja realizar essa ação ?");
                System.out.println("1- Sim");
                System.out.println("2- Nao");
                int escolha = sc.nextInt();

                if (escolha == 1) {
                    method.run();
                    break;
                } else if (escolha == 2) {
                    System.out.println("Ação cancelada.\n");
                    break;
                } else {
                    System.out.println("Opcao invalida. Por favor escolha, entre 1 e 2 para continuar");
                }

            }catch(InputMismatchException e){
                System.out.println("Por Favor, inisra somente numeros: ");
                sc.nextLine();
            }
        }
    }


    /*
    *Método para remover produtos armazenados via ID em ArrayList <produtos> da classe Dados.
     */


    public static void removerProduto(){

        boolean resultado = consultarProduto();

        if (resultado == true){
            System.out.println("\nRemovendo...");
            Data.products.remove(index);
            Data.salvar();
            System.out.println("Produto removido\n");
        }

        else{
            System.out.println("Fim da Remocao!\n");

        }
        Data.salvar();
        }


    /*
    *Método para consulta de produtos, via ID.
     */


    public static boolean consultarProduto(){

        index = 0;
        System.out.println("\nDigite o ID para continuar: ");
        int idConsulta = sc.nextInt();

        boolean produtoEncontrado = false;

        for (Product e: Data.products) {
            if(e.getIdProduto() == idConsulta) {
                produtoEncontrado = true;
                System.out.println("\nProduto encontrado!");
                System.out.println(Data.products.get(index));
                return produtoEncontrado;
            }
            index++;
        }

        if (produtoEncontrado == false){
            System.out.println("Produto nao encontrado\n");
            return produtoEncontrado;
        }
        else {
            System.out.println("Saindo da consulta...");
        }
        return produtoEncontrado;
    }

    /*
    *Método para preenchimento do construtor Smartphone.
     */
    public static void informacoesCelular() {

        System.out.println("Digite nome do produto: ");
        nomeProduto = sc.nextLine();
        if (nomeProduto.isEmpty()) {
            nomeProduto = sc.nextLine();
        }

        System.out.println("Marca do produto: ");
        marcaProduto = sc.nextLine();

        System.out.println("Digite a cor: ");
        corProduto = sc.nextLine();

        System.out.println("Digite a descricao: ");
        descricaoProduto = sc.nextLine();
        if (descricaoProduto.isEmpty()) {
            sc.nextLine();
        }

        System.out.println("Digite o tipo de tela (LCD, AMOLED, IPS): ");
        tipoTela = sc.nextLine();

        while (true) {
            try {
                System.out.println("Digite preco: ");
                precoProduto = sc.nextDouble();
                break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira somente numeros.");
                    sc.nextLine();
                }
        }

        while (true) {
            try {
                System.out.println("Digite a quantidade da Memoria RAM:  ");
                tamanhoMemoriaRam = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um valor válido inteiro. Tente novamente.");
                sc.nextLine();
                }
            }

        while (true) {
            try {
                System.out.println("Digite a quantidade da memoria de armazenamento:  ");
                tamanhoMemoria = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um valor válido inteiro. Tente novamente.");
                sc.nextLine();
                }
            }

        while (true) {
            try {
                System.out.println("Digite o tamanho da tela: ");
                tamanhoTela = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira somente numeros.");
                sc.nextLine();
            }
        }
    }

    /*
     *Método para preenchimento do construtor Acessorio.
     */
    public static void informacoesAcessorio() {
        System.out.println("Digite nome do produto: ");
        nomeProduto = sc.nextLine();
        if (nomeProduto.isEmpty()) {
            nomeProduto = sc.nextLine();
        }
        System.out.println("Marca do produto: ");
        marcaProduto = sc.nextLine();
        System.out.println("Digite a cor: ");
        corProduto = sc.nextLine();
        System.out.println("Digite a descricao: ");
        descricaoProduto = sc.nextLine();
        System.out.println("Digite o material: ");
        tipoMaterial = sc.nextLine();
        if (tipoMaterial.isEmpty()) {
            tipoMaterial = sc.nextLine();
        }

        while (true) {
            try {
                System.out.println("Possui proteção?: ");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                resposta = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira somente numeros.");
                sc.nextLine();
            }
        }

        while (true){
            try {
                while (resposta > 2 || resposta < 0) {
                    System.out.println("Por favor, digite um valor válido inteiro, entre 1 e 2. Tente novamente.");
                    sc.nextLine();
                    resposta = sc.nextInt();
                }
                break;
            }catch(InputMismatchException e){
                System.out.println("Por favor, insira somente numeros.");
                sc.nextLine();
            }
        }

        if (resposta == 1){
            System.out.println("Digite a proteçao: ");
            protecao = sc.nextLine();
            if (protecao.isEmpty()){
                sc.nextLine();
            }
        }else {
            protecao = "Nao Possui";
        }

        while (true) {
            try {
                System.out.println("Possui Fio?: ");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                resposta = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira somente numeros.");
                sc.nextLine();
            }
        }

        while (true) {
            try {
                while (resposta > 2 || resposta < 0) {
                    System.out.println("Por favor, digite um valor válido inteiro, entre 1 e 2. Tente novamente.");
                    sc.nextLine();
                    resposta = sc.nextInt();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira somente numeros.");
                sc.nextLine();
            }
        }

        if (resposta == 1) {
            System.out.println("Tipo de conector: ");
            conector = sc.nextLine();
            if (conector.isEmpty()) {
                conector = sc.nextLine();
            }
        } else {
            conector = "Nao Possui";
        }

        while (true){
            try {
                System.out.println("Digite preco: ");
                precoProduto = sc.nextDouble();
                break;
            }catch (InputMismatchException exception) {
                System.out.println("Por favor, digite um valor válido usando vírgula (,) ao invés de ponto (.), tente novamente.");
                sc.nextLine();
            }
        }
    }

}
