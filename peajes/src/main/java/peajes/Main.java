package peajes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Ticket General");
		System.out.println("---------------");
		System.out.println("Digite el kilometro de entrada ");
		int kmEntrada = sn.nextInt();
		System.out.println("Digite el kilometro de salida ");
		int kmSalida = sn.nextInt();
		System.out.println("Digite el precio  por km ");
		double precioKm = sn.nextDouble();
		TicketGeneral tg = new TicketGeneral( kmEntrada, precioKm, kmSalida);
		double precioTicket = tg.calculoTicket();
		double nuevoPrecio=tg.reduccion(precioTicket);
		System.out.println("El precio de el ticket  es "+nuevoPrecio);
		System.out.println("Ticket Especial");
		System.out.println("---------------");
		System.out.println("Digite el kilometro de entrada ");
		int kmEntrada2 = sn.nextInt();
		System.out.println("Digite el kilometro de salida ");
		int kmSalida2 = sn.nextInt();
		System.out.println("Digite el precio  por km ");
		double precioKm2 = sn.nextDouble();
		System.out.println("Digite el numero de pasajeros");
		int nPasajeros= sn.nextInt();
		TicketEspecial te = new TicketEspecial( kmEntrada2,  precioKm2, kmSalida2,  nPasajeros);
		double precioTicket2 =te.calculoTicket();
		double nuevoPrecio2=te.reduccion(precioTicket2);
		System.out.println("El precio de el ticket  es "+nuevoPrecio2);
		
		

	}

}
