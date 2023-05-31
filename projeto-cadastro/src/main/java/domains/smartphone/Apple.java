package domains.smartphone;

public class Apple extends Smartphone {

    /*

     *Classe que representa um Smartphone Apple .
     *Possui construtor para definir um smartphone Apple, classe filha da
      classe Smartphone.

     */

    public Apple(String nomeProduto, int iDproduto, String marcaProduto, String corProduto, String descricaoProduto, double precoProduto, int tamanhoMemoriaRam, int tamanhoMemoria, double tamanhoTela, String tipoTela) {
        super(nomeProduto, iDproduto, marcaProduto, corProduto, descricaoProduto, precoProduto, tamanhoMemoriaRam, tamanhoMemoria, tamanhoTela, tipoTela);
    }
}