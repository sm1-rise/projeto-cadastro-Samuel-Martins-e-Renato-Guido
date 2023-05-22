package domains.acessorio;


import domains.produto.Produto;

public class Acessorio extends Produto {

    /*

     *Classe que representa um Acessório.
     *Possui construtor para definir um Acessório, classe filha da
      classe produto.

     */

    String material;
    String conector;
    String protecao;

    public Acessorio() {
    }

    public Acessorio(String nomeProduto, int idProduto, String marcaProduto, String corProduto, String descricaoProduto, double precoProduto, String conector, String material, String protecao) {
        super(nomeProduto, idProduto, marcaProduto, corProduto, descricaoProduto, precoProduto);
        this.material = material;
        this.conector = conector;
        this.protecao = protecao;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getConector() {
        return conector;
    }

    public void setConector(String conector) {
        this.conector = conector;
    }

    public String getProtecao() {
        return protecao;
    }

    public void setProtecao(String protecao) {
        this.protecao = protecao;
    }
}
