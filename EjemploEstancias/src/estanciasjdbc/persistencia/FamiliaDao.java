package estanciasjdbc.persistencia;

import estanciasjdbc.entidades.Familia;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FamiliaDao extends DAO {

    public List<Familia> listarFamilia() throws Exception {
        try {
            //Armo el sql
            String sql = "select id_familia, nombre, edad_minima, edad_maxima,"
                    + " num_hijos, email from familias where num_hijos > 2";
            //Consulto la base de datos
            consultarBase(sql);
            //Recorro el resultados de la consulta
            Familia familia = null;
            List<Familia> familias = new ArrayList();
            while (resultado.next()) {
                familia = new Familia();
                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familias.add(familia);
            }
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        } finally {
            desconectarBase();
        }
    }

    public void guardarFamilia(Familia familia) throws Exception {
        try {
            if (familia == null) {
                throw new Exception("Debe indicar el familia");
            }
            String sql = "INSERT INTO familias (nombre, email)"
                    + "VALUES ( '" + familia.getNombre() + "' , '" + familia.getEmail() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Familia buscarFamiliaPorCorreoElectronico(String email) throws Exception {
        try {

            String sql = "SELECT * FROM familias "
                    + " WHERE email = '" + email + "'";

            consultarBase(sql);

            Familia familia = null;
            while (resultado.next()) {

                familia = new Familia();
                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEmail(resultado.getString(6));

            }
            desconectarBase();
            return familia;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

}
