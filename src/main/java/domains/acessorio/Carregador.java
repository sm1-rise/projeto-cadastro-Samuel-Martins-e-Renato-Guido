package domains.acessorio;

public class Carregador extends Acessorio{


     /*

     *Classe que representa um Carregador.
     *Possui construtor para definir um Carregador, classe filha da
      classe Acessório.

     */

    public Carregador(String nomeProduto, int idProduto, String marcaProduto, String corProduto, String descricaoProduto, double precoProduto, String conector, String material, String protecao) {
        super(nomeProduto, idProduto, marcaProduto, corProduto, descricaoProduto, precoProduto, conector, material, protecao);
    }

    @Override
    public String toString() {
        return  "\n=========PRODUTO CADASTRADO=========" +
                "\nProduto: " + getNomeProduto() +
                "\nCodigo: " + getIdProduto() +
                "\nMarca: " + getMarcaProduto() +
                "\nMaterial: " + getMaterial() +
                "\nCor: " + getCorProduto() +
                "\nTipo de conexão: " + getConector() +
                "\nValor: R$" + getPrecoProduto() +
                "\nDescrição do produto: " + getDescricaoProduto()+
                "\n==================================================\n";
    }
}
