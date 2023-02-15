

package Ejer7;


import java.util.Scanner;

public class Service {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//          <dato> variable = sc.next<dato>(); 

        public Persona crearPersona(){
                    
        System.out.println("Ingrese el nombre");
        String nombre = sc.next();
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese el sexo");
        System.out.println("(H)Hombre // (M) Mujer // (O)Otro ");
        String sexo = sc.next();
        
            do {
                System.out.println("(H)Hombre // (M) Mujer // (O)Otro ");
                sexo = sc.next();
            } while (!((sexo.toUpperCase().equals("H"))||(sexo.toUpperCase().equals("M"))||(sexo.toUpperCase().equals("O"))));
            
        System.out.println("Ingrese el peso");
        int peso = sc.nextInt();
        System.out.println("Ingrese la altura");
        int altura = sc.nextInt();
        Persona human = new Persona(nombre, edad, sexo, peso, altura);
        return human;    
}
        /*calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.*/
        public int calcularIMC(Persona human){
        int resultadopeso = ((human.getPeso())/(human.getAltura())^2);
        
        if (resultadopeso<=19){
            
            System.out.println(human+" se encuentra en su peso ideal.");
            resultadopeso = -1;
            
        }else if ((resultadopeso>=20)&&(resultadopeso<=25)){
            
            System.out.println("El peso de "+human+" se encuentra por debajo de su peso ideal.");
            resultadopeso=0;
            
        }else{
            
            System.out.println(human+" esta sufriendo sobrepeso.");
            resultadopeso=1;
        }
        return resultadopeso;
        
        }
        
     
// el problema era que devolvia persona y no un boolean
        public boolean mayorEdad(Persona h){
        int num = h.getEdad();
        boolean tiempodevida = false;
        
            if (num > 18) {
                tiempodevida = true;
                //System.out.println(h+" es mayor de edad.");
            }else{
                //System.out.println(h+" es menor de edad.");
            }
            
        return tiempodevida;
        
        }


        
        public int ContadorPORDEBAJO(int p1, int p2, int p3, int  p4){
            
            int PI;
            PI = 0;
            
            if (p1 == -1) {
                
                PI++;
                
            }
            
            if (p2 == -1) {
                
                PI++;
                
            }
            
            if (p3 == -1) {
                
                PI++;
                
            }
            
            if (p4 == -1) {
                
                PI++;
                
            }
            
            return PI;
}
      
            public int ContadorPESOIDEAL(int p1, int p2, int p3, int  p4){
            
            int PI;
            PI = 0;
            
            if (p1 == 0) {
                
                PI++;
                
            }
            
            if (p2 == 0) {
                
                PI++;
                
            }
            
            if (p3 == 0) {
                
                PI++;
                
            }
            
            if (p4 == 0) {
                
                PI++;
                
            }
            
            return PI;
}       
            
            
            
            public int ContadorSOBREPESO(int p1, int p2, int p3, int  p4){
            
            int PI;
            PI = 0;
            
            if (p1 == 1) {
                
                PI++;
                
            }
            
            if (p2 == 1) {
                
                PI++;
                
            }
            
            if (p3 == 1) {
                
                PI++;
                
            }
            
            if (p4 == 1) {
                
                PI++;
                
            }
            
            return PI;
}       
            
            
            public int ContadorMAYOREDAD(boolean tv1, boolean tv2, boolean tv3, boolean tv4){
            
            int MY;
            MY = 0;
            
            
            if (tv1 == true) {
                
                MY++;
                
            }
            
            if (tv2 == true) {
                
                MY++;
                
            }
            
            if (tv3 == true) {
                
                MY++;
                
            }
            
            if (tv4 == true) {
                
                MY++;
                
            }
            
            return MY;
}       
            
            
            public int ContadorMENOREDAD(boolean tv1, boolean tv2, boolean tv3, boolean tv4){
            
            int MN;
            MN = 0;
            
            
            if (tv1 == false) {
                
                MN++;
                
            }
            
            if (tv2 == false) {
                
                MN++;
                
            }
            
            if (tv3 == false) {
                
                MN++;
                
            }
            
            if (tv4 == false) {
                
                MN++;
                
            }
            
            return MN;
}       
            
            
            
            
            
            
            
            
            
            
            
            
            
}

