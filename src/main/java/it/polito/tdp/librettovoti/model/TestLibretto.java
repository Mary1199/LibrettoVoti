package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
     
	public static void main(String[] args) {
	Libretto libretto = new Libretto();
	
	Voto voto1 = new Voto("Analisi 1", 30, LocalDate.of(2019,2,15));
	Voto voto2 = new Voto("Fisica 1", 28, LocalDate.of(2019,7,15));
	Voto voto3 = new Voto("Informatica", 24, LocalDate.of(2019,9,15));
	
	libretto.add(voto1);
	libretto.add(voto2);
	libretto.add(voto3);
	
	libretto.add(new Voto("Chimica", 25, LocalDate.of(2019, 9, 17)));
	
	System.out.println(libretto);
	
	List<Voto> venticinque = libretto.listaVotiUguali(25);
	System.out.println(venticinque);
	
	Libretto librettoventicinque = libretto.votiUguali(25);
	System.out.println(librettoventicinque);
	}
}
