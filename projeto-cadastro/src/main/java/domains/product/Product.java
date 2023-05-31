package domains.product;

public class Product {

    /*

    *Classe que representa um produto.
    *Possui construtor para definir as caracteristicas de um produto.


     */

    String nomeProduto;
    int idProduto;
    String marcaProduto;
    String corProduto;
    String descricaoProduto;
    double precoProduto;

    public Product() {
    }

    public Product(String nomeProduto, int idProduto, String marcaProduto, String corProduto, String descricaoProduto, double precoProduto){
        this.nomeProduto = nomeProduto;
        this.idProduto = idProduto;
        this.marcaProduto = marcaProduto;
        this.corProduto = corProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public String getCorProduto() {
        return corProduto;
    }

    public void setCorProduto(String corProduto) {
        this.corProduto = corProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
}
