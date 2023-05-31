package domains.smartphone;





public class Samsung extends Smartphone {

     /*

     *Classe que representa um Smartphone Samsung .
     *Possui construtor para definir um smartphone Samsung, classe filha da
      classe produto.

     */

    public Samsung(String nomeProduto, int iDproduto, String marcaProduto, String corProduto, String descricaoProduto, double precoProduto, int tamanhoMemoriaRam, int tamanhoMemoria, double tamanhoTela, String tipoTela) {
        super(nomeProduto, iDproduto, marcaProduto, corProduto, descricaoProduto, precoProduto, tamanhoMemoriaRam, tamanhoMemoria, tamanhoTela, tipoTela);
    }
}
