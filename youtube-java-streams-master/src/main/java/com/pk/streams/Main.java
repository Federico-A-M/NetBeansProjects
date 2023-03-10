package com.pk.streams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        maxAndMin(); // lugar para llamar las funciones o metodos.
    }
    
    public static void printNames(){ //el  modo clasico de usar for Each
        List<String> names = getEmployee();
        for (String name : names) {
            System.out.println(name);
        }
    }
    
    public static void printNamesStream(){ //imprimir los nombres 
        List<String> names = getEmployee();
        names.stream().forEach(System.out::println);
    }
    
    public static void orderNames(){ // ordenar los nombres de mayor a menor o al revez
        List<String> names = getEmployee();
        names.stream().sorted( (x,y) -> x.compareTo(y) ).forEach(System.out::println);
    }
    
    public static void filter(){ //mostrar de una coleccion los nombres que comiencen J 
        List<String> names = getEmployee();
        names.stream().filter(x -> !x.startsWith("J")).forEach(System.out::println);
    }
    
    public static void count(){ //ocultar de una coleccion los nombres que comiencen J 
        List<String> names = getEmployee();
        long count = names.stream().filter(x -> !x.startsWith("J")).count();
        System.out.println(count);
    }
    
    public static void distinct(){ // 
        List<String> names = getEmployee();
        names.stream().distinct().forEach(System.out::println);
    }
    
    public static void limit(){ //limita cuantos objetos de una coleccion mostrara
        List<String> names = getEmployee();
        names.stream().limit(2).forEach(System.out::println);
    }
    
    public static void maxAndMin(){ // maximo y minimo de una coleccion
        List<Integer> numbers = getNumbers();
        System.out.println(numbers.stream().max((x,y) -> x.compareTo(y)).get());
        System.out.println(numbers.stream().min((x,y) -> x.compareTo(y)).get());
    }
    
    public static List<Integer> getNumbers(){ //llenar una coleccion de numeros
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(1);
        list.add(20);
        return list;
    }
    
    public static List<String> getEmployee(){//llenar una coleccion de palabras
        List<String> list = new ArrayList<>();
        list.add("Oscar");
        list.add("Javier");
        list.add("Luis");
        list.add("Manuel");
        list.add("Ram??n");
        list.add("Oscar");
        return list;
    }
}
