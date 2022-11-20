package main.br.com.mkt;

import main.br.com.mkt.model.Cliente;
import main.br.com.mkt.model.Compra;
import main.br.com.mkt.model.Rede;


public class Main {
    public static void main (String args[]) {

        Rede acucar =  new Rede("Pão de açucar", "000", null);

        String a = acucar.getRazaoSocial();
        System.out.println(a);

        acucar.setRazaoSocial("supermarket");
        a = acucar.getRazaoSocial();
        System.out.println(a);

        Compra primeira = new Compra(null, null, null, null,  0);
        Cliente x  = primeira.getCliente();
    }
}