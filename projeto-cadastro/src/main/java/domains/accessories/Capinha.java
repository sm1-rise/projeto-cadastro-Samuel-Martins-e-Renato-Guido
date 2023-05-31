package domains.accessories;

public class Capinha extends Acessorio {

     /*

     *Classe que representa Capa Protetora.
     *Possui construtor para definir uma Capa Protetora, classe filha da
      classe Acessório.

     */

    public Capinha(String nomeProduto, int idProduto, String marcaProduto, String corProduto, String descricaoProduto, double precoProduto, String conector, String material, String protecao) {
        super(nomeProduto, idProduto, marcaProduto, corProduto, descricaoProduto, precoProduto, conector, material, protecao);
    }

    @Override
    public String toString() {
        return  "\n=========PRODUTO CADASTRADO=========" +
                "\nProduto: " + getNomeProduto() +
                "\nCodigo: " + getIdProduto() +
                "\nMarca: " + getMarcaProduto() +
                "\nCor: " + getCorProduto() +
                "\nTipo de Material: " + getMaterial() +
                "\nProteção: " + getProtecao() +
                "\nValor: R$" + getPrecoProduto() +
                "\nDescrição do produto: " + getDescricaoProduto()+
                "\n==================================================\n";
    }
}



