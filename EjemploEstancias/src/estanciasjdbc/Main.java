package estanciasjdbc;

import estanciasjdbc.entidades.Familia;
import estanciasjdbc.servicios.FamiliaServicio;

public class Main {

    public static void main(String[] args) {

        try {
            FamiliaServicio fs = new FamiliaServicio();
            fs.crearFamilia("Santamarina", "fsr@gmail.com");
            Familia flia  = fs.buscarFamiliaPorCorreoElectronico("fsr@gmail.com");
            System.out.println(flia);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
