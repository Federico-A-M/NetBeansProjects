/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RespuestasGuia;

/**
 *
 * @author Federico.A.M.
 */
public class EjemploException extends Exception {

    /**
     * Creates a new instance of <code>EjemploException</code> without detail
     * message.
     */
    public EjemploException() {
    }

    /**
     * Constructs an instance of <code>EjemploException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EjemploException(String msg) {
        super(msg);
    }
}
