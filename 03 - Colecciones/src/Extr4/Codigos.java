

package Extr4;

import java.util.Objects;

/**
 *
 * @author Federico.A.M.
 */
public class Codigos {


        private Integer Codigo;
        private String Area;

    public Codigos() {
    }

    public Codigos(Integer Codigo, String Area) {
        this.Codigo = Codigo;
        this.Area = Area;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.Codigo);
        hash = 97 * hash + Objects.hashCode(this.Area);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Codigos other = (Codigos) obj;
        if (!Objects.equals(this.Area, other.Area)) {
            return false;
        }
        if (!Objects.equals(this.Codigo, other.Codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Codigos{" + "Codigo=" + Codigo + ", Area=" + Area + '}';
    }




}


        // En contructor vacio recordar:
        // Se inicializan las colecciones para que no esten en null, si no vacios.
        
       // libros = new ArrayList();
        
       // numeros = new HashSet();
        
       // alumnos = new HashMap();


