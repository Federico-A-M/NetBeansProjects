

package Extr3;

import java.util.Objects;



public class Libreria implements Comparable<Libreria>{

      private String Titulo;
      private String Autor;
      private Integer Ejemplares;
      private Integer Prestamos;

    public Libreria() {
    }

    public Libreria(String Titulo, String Autor, Integer Ejemplares, Integer Prestamos) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Ejemplares = Ejemplares;
        this.Prestamos = Prestamos;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public Integer getEjemplares() {
        return Ejemplares;
    }

    public void setEjemplares(Integer Ejemplares) {
        this.Ejemplares = Ejemplares;
    }

    public Integer getPrestamos() {
        return Prestamos;
    }

    public void setPrestamos(Integer Prestamos) {
        this.Prestamos = Prestamos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.Titulo);
        hash = 17 * hash + Objects.hashCode(this.Autor);
        hash = 17 * hash + Objects.hashCode(this.Ejemplares);
        hash = 17 * hash + Objects.hashCode(this.Prestamos);
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
        final Libreria other = (Libreria) obj;
        if (!Objects.equals(this.Titulo, other.Titulo)) {
            return false;
        }
        if (!Objects.equals(this.Autor, other.Autor)) {
            return false;
        }
        if (!Objects.equals(this.Ejemplares, other.Ejemplares)) {
            return false;
        }
        if (!Objects.equals(this.Prestamos, other.Prestamos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libreria{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", Ejemplares=" + Ejemplares + ", Prestamos=" + Prestamos + '}';
    }

    @Override
    public int compareTo(Libreria t) {
        return this.Titulo.compareToIgnoreCase(t.getTitulo());
    }


    
    
}



















        // Crear Objeto por parametro --> retorna objeto creado con valores pedidos set
        //public <Object> <Argumento>(){

       

//}


        // Crear Objeto por Valor --> no retorna nada
        //public void <Argumento>(<Object> Parametro){

       

//}