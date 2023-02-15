package Ejer2Ruleta;

/**
 * atributos: posición actual (posición del tambor que se dispara, puede que
 * esté el agua o no) y posición agua (la posición del tambor donde se encuentra
 * el agua). Estas dos posiciones, se generarán aleatoriamente.
 */
public class Revolver {

    private Integer posicion; //= (int) (Math.random()*6+1);
    private Integer bala; //= (int) (Math.random()*6+1);

    public Revolver() {
        
        this.posicion = (int) (Math.random()*6+1);
        this.bala = (int) (Math.random()*6+1);
        
    }

    public Revolver(Integer posicion, Integer bala) {
        this.posicion = posicion;
        this.bala = bala;
        
    }
       
    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getBala() {
        return bala;
    }

    public void setBala(Integer bala) {
        this.bala = bala;
    }

/*Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua.
                    Los valores deben ser aleatorios.)*/
    
//    public void llenarRevolver(Revolver posicion){
//        
//        this.posicion= (int) (Math.random()*6);
//        
//        
//}
    
/*• mojar(): devuelve true si la posición del agua coincide con la posición actual*/
    
    public Boolean mojar(Revolver h){
        
        Boolean disparo = false;
        
        if (h.getPosicion()==h.getBala()){
            disparo = true;
        }
        
        return disparo;
    }
    
/*• siguienteChorro(): cambia a la siguiente posición del tambor*/
    
    public Integer siguienteChorro(Revolver p, boolean tf){
        
        if (!tf) {
   
        p.setPosicion(p.getPosicion()+1);
            if (p.getPosicion()==7) {
            p.setPosicion(1);
            }
   
        }
        
        return p.getPosicion();
     
    }

    
/*• toString(): muestra información del revolver (posición actual y donde está el agua*/  

    @Override
    public String toString() {
        return "Revolver{" + "posicion=" + posicion + ", bala=" + bala + '}';
    }
    
    
    
}
