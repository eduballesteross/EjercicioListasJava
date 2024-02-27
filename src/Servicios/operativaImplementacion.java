package Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.MesDto;

public class operativaImplementacion implements operativaInterfaz{

	Scanner sc = new Scanner (System.in);
	@Override
	public void pedirNumeroYNombreMes(List<MesDto> mes) {
		// TODO Auto-generated method stub
		
		 System.out.println("Introduzca los meses con sus respectivos nombres y numeros.");
		
		  for(int i = 0;i<12;i++) {
		   
		   System.out.println("Indique el nombre del mes.");
		   String nombreMes=sc.nextLine();
		   
		   System.out.println("Indique el numero del mes.");
		   int numeroMes = Integer.parseInt(sc.nextLine());
		   
		   MesDto nuevomes = new MesDto(numeroMes, nombreMes);;
		   mes.add(nuevomes);
		   
		   System.out.println("Mes introducido: "+ nuevomes.getNombreMes()+ " Número: " + nuevomes.getNumeroMes());
		   
		  } 
		  
		  for(MesDto mesDto: mes) {
			  System.out.println("Nombre del mes: " + mesDto.getNombreMes()+ " Número del mes: " + mesDto.getNumeroMes());
			  
		  }
	}
	@Override
	public String buscarNombreMes(int numeroMes, List<MesDto> meses) {
		// TODO Auto-generated method stub
		for(MesDto mes: meses) {
			if(mes.getNumeroMes()== numeroMes) {
				return mes.getNombreMes();
			}
		}
		 return null;
	}

}
