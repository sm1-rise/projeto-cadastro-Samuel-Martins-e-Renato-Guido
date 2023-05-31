package domains.smartphone;

public class Motorola extends Smartphone{

    /*

     *Classe que representa um Smartphone Motorola .
     *Possui construtor para definir um smartphone Motorola, classe filha da
      classe Smartphone.

     */

    public Motorola(String nomeProduto, int iDproduto, String marcaProduto, String corProduto, String descricaoProduto, double precoProduto, int tamanhoMemoriaRam, int tamanhoMemoria, double tamanhoTela, String tipoTela) {
        super(nomeProduto, iDproduto, marcaProduto, corProduto, descricaoProduto, precoProduto, tamanhoMemoriaRam, tamanhoMemoria, tamanhoTela, tipoTela);
    }
}
