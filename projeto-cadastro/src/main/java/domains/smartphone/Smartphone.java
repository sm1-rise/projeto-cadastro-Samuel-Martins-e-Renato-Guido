package domains.smartphone;

import interfaces.SmartphoneInterface;
import domains.product.Product;

public class Smartphone extends Product implements SmartphoneInterface {

    /*

     *Classe que representa um Smartphone.
     *Possui construtor para definir um smartphone, classe filha da
      classe produto.

     */

    int tamanhoMemoriaRam;
    int tamanhoMemoria;
    double tamanhoTela;
    String tipoTela;

    public Smartphone() {
    }

    public Smartphone(String nomeProduto, int iDproduto, String marcaProduto, String corProduto, String descricaoProduto, double precoProduto, int tamanhoMemoriaRam, int tamanhoMemoria, double tamanhoTela, String tipoTela) {
        super(nomeProduto, iDproduto, marcaProduto, corProduto, descricaoProduto, precoProduto);
        this.tamanhoMemoriaRam = tamanhoMemoriaRam;
        this.tamanhoMemoria = tamanhoMemoria;
        this.tamanhoTela = tamanhoTela;
        this.tipoTela = tipoTela;
    }



    public int getTamanhoMemoriaRam() {
        return tamanhoMemoriaRam;
    }

    public void setTamanhoMemoriaRam(int tamanhoMemoriaRam) {
        this.tamanhoMemoriaRam = tamanhoMemoriaRam;
    }

    public int getTamanhoMemoria() {
        return tamanhoMemoria;
    }

    public void setTamanhoMemoria(int tamanhoMemoria) {
        this.tamanhoMemoria = tamanhoMemoria;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }


    /*
    * Método resposanvael por realizar chamadadas em smartphone
     */
    @Override
    public void fazerChamada() {
        System.out.println("Ligando...");
    }


    /*
     * Método resposanvael por realizar chamadadas em smartphone
     */
    @Override
    public void receberChamada() {
        System.out.println("Tocando");
    }


    /*
     * Método resposanvael por carregar a bateria do smartphone
     */
    @Override
    public void carregarBateria() {
        for (int i = 0; i <= 100; i++){
            System.out.println("Nivel da bateria: " + i + "%");
        }
    }


    /*
     * Método resposanvael por acessar internet em smartphone
     */
    @Override
    public void AcessarInternet() {
        System.out.println("Conectado no wifi");
    }



    /*
     * Método resposanvael por fazer fotografias em smartphone
     */
    @Override
    public void tirarFoto() {
        System.out.println("Camera em funcionamento");
    }


    @Override
    public String toString() {
            return  "\n=========PRODUTOS CADASTRADOS=========" +
                    "\nProduto: " + getNomeProduto() +
                    "\nCodigo: " + getIdProduto() +
                    "\nMarca: " + getMarcaProduto() +
                    "\nCor: " + getCorProduto() +
                    "\nTela: " + tamanhoTela + " Polegadas" +
                    "\nTipo de tela: " + tipoTela +
                    "\nArmazenamto: " + tamanhoMemoria + "GB" +
                    "\nMemoria RAM: " + tamanhoMemoriaRam + "GB" +
                    "\nValor: R$" + getPrecoProduto() +
                    "\nDescrição do produto: " + getDescricaoProduto()+
                    "\n==================================================\n";
    }
}
