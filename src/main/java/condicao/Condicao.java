package condicao;

import dados.Dados;
import apresentation.ConfigInitialization;
import domains.produto.Produto;
import utils.textoCadastro.TextoCadastro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Condicao {

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


    public static Scanner sc = new Scanner(System.in);

    /*
    *Método para remover produtos armazenados via ID em ArrayList <produtos> da classe Dados.
     */
    public static void removerProduto(){

        while (true) {
            try {
                boolean produtoEncontrado = false;
                int index = 0;
                int auxRemove = 0;

                System.out.println("\nDeseja remover um produto ?");
                System.out.println("1- Sim");
                System.out.println("2- Nao");
                int escolhaRemoverProduto = sc.nextInt();
                sc.nextLine();

                /*
                *Escolha do usuario, se deseja ou não remover produto
                 */

                if (escolhaRemoverProduto == 1) {
                    System.out.println("\nDigite o ID para remover um produto: ");
                    int idRemocao = sc.nextInt();

                    for (Produto e: Dados.produtos) {

                        if(e.getIdProduto() == idRemocao){
                            System.out.println("\nProduto encontrado!");
                            produtoEncontrado = true;
                            auxRemove = index;
                        }
                    index++;
                    }

                    if (produtoEncontrado == true){
                        System.out.println("\nRemovendo...");
                        Dados.produtos.remove(auxRemove);
                        ConfigInitialization.salvar();
                        System.out.println("Produto removido\n");
                    }
                }

                else{
                    System.out.println("Fim da Remocao!\n");

                }

                ConfigInitialization.salvar();
                break;
            } catch (InputMismatchException e){
                /*
                *Tratamento, caso usuario digite caracteres ou numeros fracionados.
                 */

                System.out.println("Por favor, insira somente numeros.");
                sc.nextLine();
            }
        }
    }

    /*
    *Método para consulta de produtos, via ID.
     */
    public static void consultarProduto(){

        while (true) {
            try {
                System.out.println("\nDeseja consultar um produto ?");
                System.out.println("1- Sim");
                System.out.println("2- Nao");
                int escolhaConsultarProduto = sc.nextInt();

                if (escolhaConsultarProduto == 1) {
                    int index = 0;
                    System.out.println("\nDigite o ID para realizar a consulta: ");
                    int idConsulta = sc.nextInt();

                    boolean produtoEncontrado = false;

                    for (Produto e: Dados.produtos) {
                        if(e.getIdProduto() == idConsulta) {
                            produtoEncontrado = true;
                            System.out.println("\nProduto encontrado!");
                            System.out.println(Dados.produtos.get(index));
                        }
                        index++;
                    }

                    if (produtoEncontrado == false){
                        System.out.println("Produto nao encontrado\n");
                    }
                }

                else {
                    System.out.println("Saindo da consulta...");
                }

                break;

            } catch (InputMismatchException e){
                /*
                 *Tratamento, caso usuario digite caracteres ou numeros fracionados.
                 */
                System.out.println("Por favor, insira somente numeros.");
                sc.nextLine();
            }
        }
    }

    /*
    *Métodos para escolha do usuario para adicionar produtos.
     */
    public static void escolhaAdicionarProduto(){
        int escolhaAdicionarProduto;
        while (true) {
            try {
                System.out.println("Deseja adicionar produto ?");
                System.out.println("1- Sim");
                System.out.println("2- Nao");
                escolhaAdicionarProduto = sc.nextInt();
                sc.nextLine();
                if (escolhaAdicionarProduto == 1) {
                    adicionarProduto();
                }
                else{
                    System.out.println("Fim do Cadastro");
                    break;
                }
                break;
            } catch (InputMismatchException e){
                /*
                 *Tratamento, caso usuario digite caracteres ou numeros fracionados.
                 */
                System.out.println("Por favor, insira somente numeros.");
                sc.nextLine();
            }
        }
    }


    /*
    *Método para adicionar produto*
     */
    public static void adicionarProduto(){
        TextoCadastro.adquirirQuantidadeProdutos();
        ConfigInitialization.decisaoUsuario();
        ConfigInitialization.salvar();
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
