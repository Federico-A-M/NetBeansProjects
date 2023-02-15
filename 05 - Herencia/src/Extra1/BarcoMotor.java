

package Extra1;

import java.time.LocalDate;



/**
 *
 *  Potencia en CV para barcos a motor. •
 */
public class BarcoMotor extends Barco{

/* Cv: potencia y empuje ---1Kw equivalen a 1,36 Cv de potencia. 
    Si por ejemplo nos dicen que el  motor eléctrico del molinete es de 2 Kw sabremos que equivalen a 2,72 Cv*/
        
        protected Double Cv; 

        
        
        
        
    public BarcoMotor() {
    }

    public BarcoMotor(Double Cv) {
        this.Cv = Cv;
    }

    public BarcoMotor(Double Cv, Integer matricula, Double eslora, Integer fabricacion) {
        super(matricula, eslora, fabricacion);
        this.Cv = Cv;
    }

    public Double getCv() {
        return Cv;
    }

    public void setCv(Double Cv) {
        this.Cv = Cv;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "Cv=" + Cv + super.toString() + '}';
    }





}


