
/**
 * Aruthor    :Horacio Rosales Velasco
 * Date       :17102021
 * Apliación que determina si ina persona es mayor de edad
 * a partir de la fecha de nacimiento.
 **/

import java.util.Scanner;
public class calcularEdad{//class
	public static void main(String[] args){//main method
		//declarciones
		int fecha_nacimiento;
        	int fecha_actual = 2021;
		int diferencia = 0;

		// entrada datos
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite su anio de nacimiento");
		fecha_nacimiento = entrada.nextInt();

		//procesamiento 
		diferencia = (fecha_actual - fecha_nacimiento);

		//presentación datos
		if(diferencia >= 18){//elseif
			System.out.println("Con "+ diferencia + " es mayor de edad");
		}else{
			System.out.println("Con "+ diferencia + " es menor de edad");
		}//end ifelse

		
	}//end main method
}//end class

