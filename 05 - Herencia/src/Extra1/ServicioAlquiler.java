package Extra1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlquiler {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
ArrayList<Alquiler> alquiler = new ArrayList();

    public void Alquiler() { // despues cambiar a que devuelva objeto tipo alquiler

        System.out.println("Bienvedidxs a puerto JoseGaviota.NET !. ");
        Alquiler user = new Alquiler();

        System.out.println(" ");
        System.out.println("a continuacion indique su nombre de cliente: ");
        String aux = sc.next();
        user.setNombre(aux);

        System.out.println(" ");
        System.out.println("Documento de Identidad Nacional: ");
        Integer num = sc.nextInt();
        user.setDNI(num);

        System.out.println(" ");
        System.out.println("Inicio de alquiler: ");
        System.out.println("Dia: ");
        Integer dia = sc.nextInt();
        System.out.println("Mes: ");
        Integer mes = sc.nextInt();
        System.out.println("Año: ");
        Integer anio = sc.nextInt();
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        user.setAlquiler(fecha);

        System.out.println(" ");
        System.out.println("Fecha de desceso: ");
        System.out.println("Dia: ");
        dia = sc.nextInt();
        System.out.println("Mes: ");
        mes = sc.nextInt();
        System.out.println("Año: ");
        anio = sc.nextInt();
        LocalDate desceso = LocalDate.of(anio, mes, dia);
        user.setDevolucion(desceso);

        System.out.println("");
        System.out.println("Indique el tipo de embarcacion que posea: ");
        int select;

        System.out.println(" "
                + "\n (1) para Veleros"
                + "\n (2) para Barcos a Motor"
                + "\n (3) para Yates de lujo");

        select = sc.nextInt();

        switch (select) {
            case 1:
                Velero vel = crearVelero();
                user.setBarco(vel);

                Integer amarres = calcularModuloAmarre(user);
                user.setN_amarre(amarres);
                alquiler.add(user);

                Integer plus = vel.getMastiles();
                calcularPresupuesto(user, plus);
                break;
//----------------------------------------------------------------------------------------
            case 2:
                BarcoMotor motor = crearBarcoMotor();
                user.setBarco(motor);

                Integer amarres2 = calcularModuloAmarre(user);
                user.setN_amarre(amarres2);
                alquiler.add(user);

                Integer plus2 = (int) (Math.round(motor.getCv()));
                calcularPresupuesto(user, plus2);
                break;
//----------------------------------------------------------------------------------------
            case 3:
                Yate yate = crearYate();
                user.setBarco(yate);

                Integer amarres3 = calcularModuloAmarre(user);
                user.setN_amarre(amarres3);
                alquiler.add(user);

                Integer plus3 = (int) (Math.round(yate.getCamarotes() + yate.getCv()));
                calcularPresupuesto(user, plus3);
                break;
        }

//        Integer amarres = calcularModuloAmarre(user);
//        user.setN_amarre(amarres);
//
//        alquiler.add(user);
//
//        calcularPresupuesto(user);
    }

    private Velero crearVelero() {

        //Integer mastiles, Integer matricula, Double eslora, LocalDate fabricacion
        System.out.println("Indique la cantidad de mastiles de su velero: ");
        Integer mastiles = sc.nextInt();

        System.out.println(" ");
        System.out.println("Numero de matricula: ");
        Integer matricula = sc.nextInt();

        System.out.println("");
        System.out.println("Denote su eslora: ");
        Double eslora = sc.nextDouble();

        System.out.println(" ");
        System.out.println("Fecha de fabricación: ");
        int fab = sc.nextInt();
        Integer fabricacion = fab;

        return new Velero(mastiles, matricula, eslora, fabricacion);

    }

    private BarcoMotor crearBarcoMotor() {
        //Double Cv, Integer matricula, Double eslora, LocalDate fabricacion

        System.out.println("Indique Cv de la embarcacion ");
        Double cv = sc.nextDouble();

        System.out.println(" ");
        System.out.println("Numero de matricula: ");
        Integer matricula = sc.nextInt();

        System.out.println("");
        System.out.println("Denote su eslora: ");
        Double eslora = sc.nextDouble();

        System.out.println(" ");
        System.out.println("Fecha de fabricación: ");
        int fab = sc.nextInt();
        Integer fabricacion = fab;

        return new BarcoMotor(cv, matricula, eslora, fabricacion);

    }

    private Yate crearYate() {

        System.out.println("");
        System.out.println("Cantidad de camarotes del yate");
        Integer camarotes = sc.nextInt();

        System.out.println("");
        System.out.println("Indique Cv de la embarcacion ");
        Double cv = sc.nextDouble();

        System.out.println(" ");
        System.out.println("Numero de matricula: ");
        Integer matricula = sc.nextInt();

        System.out.println("");
        System.out.println("Denote su eslora: ");
        Double eslora = sc.nextDouble();

        System.out.println(" ");
        System.out.println("Fecha de fabricación: ");
        int fab = sc.nextInt();
        Integer fabricacion = fab;

        return new Yate(camarotes, cv, matricula, eslora, fabricacion);

    }

    private Integer calcularModuloAmarre(Alquiler user) {
        Integer modulo = 0;

        if (user.getBarco().getEslora() <= 10) {
            modulo = 1;
        }

        if ((user.getBarco().getEslora() > 10) && (user.getBarco().getEslora() <= 20)) {
            modulo = 2;
        }

        if ((user.getBarco().getEslora() > 20) && (user.getBarco().getEslora() <= 30)) {
            modulo = 3;
        }

        if ((user.getBarco().getEslora() > 30) && (user.getBarco().getEslora() <= 40)) {
            modulo = 4;
        }

        if ((user.getBarco().getEslora() > 40) && (user.getBarco().getEslora() <= 50)) {
            modulo = 5;
        }

        if ((user.getBarco().getEslora() > 50) && (user.getBarco().getEslora() <= 60)) {
            modulo = 6;
        }

        if ((user.getBarco().getEslora() > 60) && (user.getBarco().getEslora() <= 70)) {
            modulo = 7;
        }

        if ((user.getBarco().getEslora() > 70) && (user.getBarco().getEslora() <= 80)) {
            modulo = 8;
        }

        if ((user.getBarco().getEslora() > 80) && (user.getBarco().getEslora() <= 90)) {
            modulo = 8;
        }

        if ((user.getBarco().getEslora() > 90) && (user.getBarco().getEslora() <= 100)) {
            modulo = 8;
        }

        if (user.getBarco().getEslora() > 100) {
            modulo = 0;
        }

        return modulo;
    }

    private void calcularPresupuesto(Alquiler user, Integer f) {

        /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado
                            con la fecha de alquiler y devolución), por un valor módulo de cada barco
                                   (obtenido simplemente multiplicando por 10 los metros de eslora).

                        En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
                        modulo normal y sumándole el atributo particular de cada barco::
        
                                              En los veleros se suma el número de mástiles
                                            en los barcos a motor se le suma la potencia en CV 
                               y en los yates se suma la potencia en CV y el número de camarotes*/
        
        Integer CostoFinal;
        CostoFinal = (user.getDevolucion().getDayOfYear() - user.getAlquiler().getDayOfYear());
        
        //Otra  Forma de calcular el tiempo mejor
        //long daysBetween = DAYS.between(dateBefore, dateAfter);
        //int dias = (int) ((fechaDevolucion.getTime()-fechaAlquiler.getTime()) / miliSegPorDia);
        //int miliSegPorDia = 86400000; ----->> esto no lo entendi aun
        // ---> importar  >>Java.time.temporal.ChronoUnit

        
        int valorModulo = (int) (Math.round(user.getBarco().getEslora())) * 10; // pero que mierda de casteo jooooeeeer tio
        valorModulo += f;
        valorModulo += user.getN_amarre();
        
        CostoFinal += CostoFinal * valorModulo;
        
        System.out.println(" ");
        System.out.println(user);
        System.out.println(" ");
        System.out.println(user.getBarco());
        System.out.println(" ");
        System.out.println("El costo final del alquiler sera de : " + CostoFinal+ " $.");
        
    }

}
