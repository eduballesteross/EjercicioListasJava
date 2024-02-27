package Servicios;

import java.util.List;

import Dtos.MesDto;

public interface operativaInterfaz {

	public void pedirNumeroYNombreMes(List<MesDto>mes);
	public String buscarNombreMes(int numeroMes, List<MesDto>meses);
	

}