

package Extra1;

import java.time.LocalDate;



/**
 *
 *  Número de mástiles para veleros. 
 */
public final class Velero extends Barco{

    private Integer mastiles;

    
    
    
    
    public Velero() {
    }

    public Velero(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(Integer mastiles, Integer matricula, Double eslora, Integer fabricacion) {
        super(matricula, eslora, fabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles + super.toString()+'}';
    }

      
    

        





}




