package apresentation;

import utils.Menu;
import utils.TextoCadastro;
import handler.Data;

public class ConfigInitialization {

    public static void main(String args[]) {

        TextoCadastro.textoInicial();
        Menu.menu();
        System.out.println(Data.products);
        Data.salvar();
    }
}




