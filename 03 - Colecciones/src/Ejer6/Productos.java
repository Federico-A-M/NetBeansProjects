

package Ejer6;



public class Productos {

        private String producto;
        private Double precio;

    public Productos() {
    }

    public Productos(String producto, Double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "producto=" + producto + ", precio=" + precio + '}';
    }
        
        
        
    



}


