

package Extra1;


/*
 *su matrícula, 
 * su eslora en metros == Longitud de una embarcación desde la proa a la popa.
 * y año de fabricación.
  */
public class Barco{
    
    protected Integer matricula;
    protected Double eslora;
    protected Integer fabricacion;

    
    
    
    public Barco() {
    }

    public Barco(Integer matricula, Double eslora, Integer fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Integer fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", fabricacion=" + fabricacion + '}';
    }
    

    



      

        





}




