package Dtos;

public class MesDto {
	
	
	int numeroMes =99;
	String nombreMes="aaaaa";
	
	//COPNSTRUCTORES
	public MesDto(int numeroMes, String nombreMes) {
		this.numeroMes = numeroMes;
		this.nombreMes = nombreMes;
	}
	public MesDto(){
		
	}
	
	//GETTERS & SETTERS
	public int getNumeroMes() {
		return numeroMes;
	}
	public void setNumeroMes(int numeroMes) {
		this.numeroMes = numeroMes;
	}
	public String getNombreMes() {
		return nombreMes;
	}
	public void setNombreMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}
	
}
