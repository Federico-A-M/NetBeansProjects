

package Ejer1;

/**
 *
 * @author Federico.A.M.
 */
public class Libro {

        //Atributos - caracteristicas ejemplos
        private Integer ISBN;
        private String Título;
        private String Autor;
        private Integer Paginas;
    
//metodo constructor vacio

       public Libro(){  
       }

       
//metodo constructor con parametros

        public Libro(Integer ISBN, String Título, String Autor, Integer Paginas) {
        this.ISBN=ISBN;
        this.Título=Título;
        this.Autor=Autor;
        this.Paginas=Paginas;
    }
        
//Metodos getters y setters de encapsulamiento = click izquierdo + code -> getters y setters.      

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public Integer getPaginas() {
        return Paginas;
    }

    public void setPaginas(Integer Paginas) {
        this.Paginas = Paginas;
    }
        
}


