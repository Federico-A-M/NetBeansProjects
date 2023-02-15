package estanciasjdbc.servicios;

import estanciasjdbc.entidades.Familia;
import estanciasjdbc.persistencia.FamiliaDao;
import java.util.Collection;
import java.util.List;

public class FamiliaServicio {

    private final FamiliaDao DAO;

    public FamiliaServicio() {
        this.DAO = new FamiliaDao();
    }

    public List<Familia> listarFamilia() throws Exception {

        try {

            List<Familia> familias = DAO.listarFamilia();
            //mostrar
            return familias;

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }

    }

    public void imprimirFamilias() throws Exception {

        try {

            //Listamos los familias
            List<Familia> familias = listarFamilia();

            //Imprimimos los familias
            if (familias.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (Familia f1 : familias) {

                    System.out.println(f1);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }
    }

    public void crearFamilia(String nombre, String email) throws Exception {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("Debe indicar el nombre de la familia");
        }
        if (nombre.length() < 8) {
            throw new Exception("El nombre no puede tener menos de 8 caracteres");
        }

        if (email == null || email.trim().isEmpty()) {
            throw new Exception("Debe indicar el correo electrónico");
        }
        if (email.contains("@") == false) {
            throw new Exception("El correo electrónico es incorrecto");
        }
        if (buscarFamiliaPorCorreoElectronico(email) != null) {
            throw new Exception("Ya existe una familia con el correo electrónico indicado " + email);
        }

        Familia familia = new Familia();
        familia.setNombre(nombre);
        familia.setEmail(email);
        DAO.guardarFamilia(familia);

    }

    public Familia buscarFamiliaPorCorreoElectronico(String correoElectronico) throws Exception {

        try {

            //Validamos
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electrónico");
            }

            Familia familia = DAO.buscarFamiliaPorCorreoElectronico(correoElectronico);

            return familia;
        } catch (Exception e) {
            throw e;
        }
    }

}
