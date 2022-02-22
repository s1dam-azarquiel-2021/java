package ejercicio2;

import java.util.ArrayList;
import java.util.Date;

public class Crucero {
	private int cCrucero;
	private String nombreComercial;
	private String nombreBarco;
	private Date fPartida;
	private Date fRegreso;
	private ArrayList<Escala> escalas;

	public Crucero(
		int cCrucero, String nombreComercial, String nombreBarco, Date fPartida,
		Date fRegreso, ArrayList<Escala> escalas
	) {
		super();
		this.cCrucero = cCrucero;
		this.nombreComercial = nombreComercial;
		this.nombreBarco = nombreBarco;
		this.fPartida = fPartida;
		this.fRegreso = fRegreso;
		this.escalas = escalas;
	}

	public int getcCrucero() {
		return cCrucero;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public String getNombreBarco() {
		return nombreBarco;
	}

	public Date getfPartida() {
		return fPartida;
	}

	public Date getfRegreso() {
		return fRegreso;
	}

	public ArrayList<Escala> getEscalas() {
		return escalas;
	}

	public void setcCrucero(int cCrucero) {
		this.cCrucero = cCrucero;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}

	public void setfPartida(Date fPartida) {
		this.fPartida = fPartida;
	}

	public void setfRegreso(Date fRegreso) {
		this.fRegreso = fRegreso;
	}

	public void setEscalas(ArrayList<Escala> escalas) {
		this.escalas = escalas;
	}

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder(
			"Codigo crucero: " + cCrucero + "\nNombre Comercial: "
				+ nombreComercial + "\nNombre Barco: " + nombreBarco
				+ "\nFecha partida: " + fPartida + "\nFecha regreso: "
				+ fRegreso + "\n"
		);

		for (Escala escala : escalas) {
			resultado.append(escala.toString());
		}

		return resultado.toString();
	}
}
