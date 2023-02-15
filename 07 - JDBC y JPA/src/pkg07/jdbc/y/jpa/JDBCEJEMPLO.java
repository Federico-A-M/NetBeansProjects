
package pkg07.jdbc.y.jpa;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
  * Apunte y Resumen Videos sobre JDBC
 */
public class JDBCEJEMPLO {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");   
         
        try {
            
        
		//Registramos el driver de MySQL-->
		Class.forName("com.mysql.jdbc.Driver");


		// Url de conexion a la base de dato MySQL--->
		String urlBaseDeDatos = "jdbc:mysql://localhost:3306/nombre_de_tabla"; 

		// Establece la conexion a la base de Datos  --->
		Connection conexion = (Connection) DriverManager.getConnection(urlBaseDeDatos, "root", "root");;

		// Sirve para generar sentencias o querys hacia MySQL  ---> 
		Statement sentencia = null;

		// Sirve para mostrar en java el resultado de la query. ----> 
		ResultSet resultado = null; 

		
                //////////////////////////////////////////////
		////////////// INSERT /////////////////
		//////////////////////////////////////////////
                
		try {

			//Creamos sentencia --->
			sentencia = (Statement) conexion.createStatement();

			//Creamos el SQL  ---> 
			String codigo="1";
			String nombre="ASUS";
			String sqlInsert = "INSERT INTO Fabricante (codigo, nombre) VALUES (" + codigo + ",'" + nombre + "')";


			//Ejecutamos el insert  ---> 
			sentencia.executeUpdate(sqlInsert);

			} catch (Exception e) {

				//En caso de que exista error vuelvo al punto inicial ---> 
				if (conexion != null)
				conexion.rollback();

				e.printStackTrace();
				System.out.println("Error de base de datos");


			} finally {

				//cerramos la conexión ---> 		
				if (sentencia != null)
				    sentencia.close();

				if (conexion != null)
				    conexion.close();

			}	

        
                /////////////////////////////////////////////////////
		//////////// CONSULTAS /////////////////
		/////////////////////////////////////////////////////

 		try {

                        // Creamos la consulta SQL --->
                        String sqlConsulta = "SELECT codigo, nombre"
                                                + "FROM fabricante";
                    
			//Creamos sentencia --->
			sentencia = (Statement) conexion.createStatement();

			//Ejecutamos consulta y obtenemos resultado 
			resultado = sentencia.executeQuery(sqlConsulta);
                        
                        //Recorremos el resultado de la consulta con un while especial de consultas
                        while (resultado.next()){
                            
                            System.out.println("Codigo" + resultado.getInt(1));
                            System.out.println("Nombre" + resultado.getString(2));
                            System.out.println("-----------------------------");
                            System.out.println("Codigo:" + resultado.getInt("codigo"));
                            System.out.println("Codigo:" + resultado.getString("nombre"));
                            
                        }


			} catch (Exception e) {

				e.printStackTrace();
				System.out.println("Error de base de datos");


			} finally {

				//cerramos la conexión ---> 		
                                if (resultado!=null)
                                    resultado.close();
                                    
				if (sentencia != null)
				    sentencia.close();

				if (conexion != null)
				    conexion.close();

			}	
                
                /////////////////////////////////////////////////////
		////////////// MODIFICAR /////////////////
		////////////////////////////////////////////////////

                try {

			//Creamos sentencia --->
			sentencia = (Statement) conexion.createStatement();

			//Creamos el SQL DE MODIFICACION  ---> 
			String nombremodificado= "lenovo";
			String sqlUpdate = "UPDATE fabricante"
                                           + "SET nombre '" + nombremodificado+ "'"
                                           + "WHERE codigo = 1"; 

			//Ejecutamos el UPDATE  ---> 
			sentencia.executeUpdate(sqlUpdate);

			} catch (Exception e) {

				//En caso de que exista error vuelvo al punto inicial ---> 
				if (conexion != null)
				conexion.rollback();

				e.printStackTrace();
				System.out.println("Error de base de datos");


			} finally {

				//cerramos la conexión ---> 		
				if (sentencia != null)
				    sentencia.close();

				if (conexion != null)
				    conexion.close();

			}
                
                /////////////////////////////////////////////////////
		////////////// ELIMINAR ////////////////////
		////////////////////////////////////////////////////

                try {

			//Creamos sentencia --->
			sentencia = (Statement) conexion.createStatement();

			//Creamos el SQL de borrado  ---> 
			String sqlDelete = "DELETE "
                                           + "FROM fabricante "
                                           + "WHERE codigo = 1"; 

			//Ejecutamos el DELETE  ---> 
			sentencia.executeUpdate(sqlDelete);

			} catch (Exception e) {

				//En caso de que exista error vuelvo al punto inicial ---> 
				if (conexion != null)
				conexion.rollback();

				e.printStackTrace();
				System.out.println("Error de base de datos");


			} finally {

				//cerramos la conexión ---> 		
				if (sentencia != null)
				    sentencia.close();

				if (conexion != null)
				    conexion.close();

			}
                
                
         } catch (Exception e){
             System.out.println("Error de sistemas");
         
         }




}
    
    
}





//copiar y pegar rapido: cntrl + c(copiamos) y (cltrl + sifht + flechita)
// Escribir rapido el metodo main: (psvm + tabulador)


/*CLASE STRING
frase.charAt(0) - da como resultado la letra en esa posicion
frase.equals("Hola mundo") - compara y da False o True
frase.compareTo(frase2) - dio 7 ¿¿???
frase.compareToIgnoreCase(frase3) - dio como resultado 0 ¿¿??
frase.concat("!") - suma un simbolo o caracter o numero a una frase
frase.contains("a") - Retorna un TRUE si contiene la letra
frase.endsWith("a") - Saber si termina en un caracter: retorna False o True
frase.startsWith - Saber si empieza en un caracter: retorna False o True
frase.indexOf("a") - haberigua en que posicion se encuentra "a" - devolvio 3
frase.length() - el largo, retorna un numero
frase.replace("o", "a") - reemplaza caracteres por otro o numeros
frase.substring(0, 1) - Retorna la letra en posicion indicada
frase.toUpperCase() - Retorna mayusculas
frase.toLowerCase() - Retorna minusculas

char car=sc.next().charAt(0);
-----------------

Se ha usado el metodo append() "Adjuntar" y la clase StringBuilder, se escribe del modo similar

public void invertirFrase(Cadena f){{
		
		StringBuilder inverso = new StringBuilder();

		for (int i = (f.getLargo() - 1); i >= 0; i--){

			inverso.append(f.getFrase().charAt(i));
		}
                System.out.println(" ");
		System.out.println("Frase al revez: "+inverso);   
	}




-----------------

.valueOF()
String numero = " ";
numero = numero.valueOf(1234);
numero = "1234" en caracteres

-----------------
EN ARRAYS
frase.split(" "," ")
String[] vector = frase.split(" ", 3); // Separamos la frase en dos en el espacio vacio

System.out.println("Frase uno: " + vector[0]);
System.out.println("Frase dos: " + vector[1]);

Frase uno: Hola
Frase dos: Mundo
-----------------

*/



/*CLASE MATH
int numeroAzar = (int) (Math.random() * 10) - Metodo aletorio

Math.abs(numReal) - El valor absoluto de cualquier tipo de numero
Math.abs(numEntero) - El valor absoluto de cualquier tipo de numero
Math.max(num1, num2) - da el mayor numero comparativo
Math.min(num1, num2) - da el menor numero comparativo
Math.pow(num2, 2)) - la potencia de un numero
Math.round(numReal2) - redondeo entero
Math.floor(numReal2) - redondeo con decimal 0
Math.sqrt(num2)) - raiz cuadrada


*/


// && AND
// || OR
// ? : Ternario

//  do{
// ------------------------------>>
            
//  System.out.println("Ingresar..");
//  <Variable> = Leer.nextdato();

// ------------------------------>>

// while ((condicion)&&(condicion) {
// System.out.println("etc");
// }

// --------------------------------->>>

 //Declaracion y creacion de un vector
        //Tipo[].nombreVector = new <tipo>[Tamaño]

        //declaracion y creacion de una matriz 
        //<Tipo de dato>[][] nombredelamatriz = new <tipo de dato>[Filas][Columnas]

//------------------------------------>>>

        //Iteracion objeto con constructor vacio
            //<Objeto> cosa1 = new <Objeto>();
        //Iteracion objeto con constructor predefinido
            //<Objeto> cosa2 = new <Objeto>("Atributo", "Atributos", "Atributoss", "Atributosss");
        
        
        //mostrarDatos(Cosa1);
        //mostrarDatos(Cosa2);
// ------------------------------>>

//METODO IMPRESOR
//    public static void mostrarDatos(Objeto Cosa1){

//        System.out.println("Se muestran los datos");
//        System.out.println("Atributo: " + cosa1.get<Atributo1>());
//}