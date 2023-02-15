

package Extra1;

import java.time.LocalDate;
/*
  ¿Potencia en CV heredado +  número de camarotes para yates de lujo.
 */
public final class Yate extends BarcoMotor {

    private Integer camarotes;

    
    
    
    
    public Yate() {
    }

    public Yate(Integer camarotes) {
        this.camarotes = camarotes;
    }

    public Yate(Integer camarotes, Double Cv) {
        super(Cv);
        this.camarotes = camarotes;
    }

    public Yate(Integer camarotes, Double Cv, Integer matricula, Double eslora, Integer fabricacion) {
        super(Cv, matricula, eslora, fabricacion);
        this.camarotes = camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "camarotes=" + camarotes + super.toString() + '}';
    }
    
    




}






