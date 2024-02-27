package Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.MesDto;
import Servicios.operativaImplementacion;
import Servicios.operativaInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<MesDto> mes = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		operativaInterfaz operativaI = new operativaImplementacion();

		operativaI.pedirNumeroYNombreMes(mes);

		boolean cerrarBucle = false;

		while (!cerrarBucle) {
			int numeroMes;

			do {
				System.out.print("Introduce un número del 1 al 12 para obtener el nombre del mes: ");
				numeroMes = sc.nextInt();

				if (numeroMes < 1 || numeroMes > 12) {
					System.out.println("Número de mes inválido. Debe ser un número del 1 al 12.");
				}
			} while (numeroMes < 1 || numeroMes > 12);
			
			sc.nextLine();

			String nombreMes = operativaI.buscarNombreMes(numeroMes, mes);

			System.out.println("El nombre del mes correspondiente al número " + numeroMes + " es: " + nombreMes);
			
			String respuesta;
			
			System.out.print("¿Desea consultar otro mes? (Sí/No): ");
			respuesta=sc.next();;
			
			if(!respuesta.equalsIgnoreCase("Si")) {
				cerrarBucle=true;
			}
			 sc.close();
		}
	}

}
