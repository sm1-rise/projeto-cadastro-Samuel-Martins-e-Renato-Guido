package utils.textoCadastro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TextoCadastro {

    static Scanner sc = new Scanner (System.in);

    public static int quantidadeProdutosCadastro;


    static int quantidadeSmartphone;
    static int quantidadeApple;
    static int quantidadeMotorola;
    static int quantidadeSamsung;
    static int quantidadeAcessorio;
    static int quantidadeCarregador;
    static int quantidadeCase;
    static int quantidadeFone;


    /*
    *Métotodo para pegar a quantidade de produtos, esses dados
    * são utlilizados na Main.
     */
    public static int adquirirQuantidadeProdutos(){

        while (true){
            try {
            System.out.println();
            System.out.println("Digite quantos produtos deseja cadastrar?: ");
            quantidadeProdutosCadastro = sc.nextInt();

            while (quantidadeProdutosCadastro < 0) {
                System.out.println("Voce digitou um numero negativo.");
                System.out.println("Digito invalido, por favor digite novamente: ");
                System.out.println("Digite quantos produtos deseja cadastrar: ");
                quantidadeProdutosCadastro = sc.nextInt();
            }

            if (quantidadeProdutosCadastro == 0){
                System.out.println("Fim do Cadastro...");
                break;
            }
            break;

        }catch (InputMismatchException e) {
            System.out.println("Digite somente valores de inteiros;");
            sc.nextLine();
            }
        }
        return quantidadeProdutosCadastro;
    }


    /*
    *Texto inicial usado na classe Main;
     */
    public static void textoInicial(){
        System.out.println("==========================================");
        System.out.println("=====BEM VINDO AO SISTEMA DE CADASTRO=====");
        System.out.println("==========================================");
    }

}
