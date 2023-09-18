package peajes;



public class TicketEspecial extends Ticket implements ITicket{
	/**
	 *Number passenger
	 */
	private int nPasajeros;
	
	/**
	 * @param kmEntrada
	 * @param precioKm
	 * @param kmSalida
	 * @param nPasajeros
	 */
	public TicketEspecial(int kmEntrada, double precioKm, int kmSalida, int nPasajeros) {
		super(kmEntrada, precioKm, kmSalida);
		this.nPasajeros = nPasajeros;
	}
	/**
	 *Double price ticket
	 */
	public double calculoTicket() 
	{
		int distanciaRecorrida= this.kmSalida-this.kmEntrada;
		double precioTicket=nPasajeros*(distanciaRecorrida*this.precioKm);
		return precioTicket;
	}
	/**
	 *Double new price ticket
	 */
	public double reduccion(double precioTicket)
	{
		
		int distanciaRecorrida= this.kmSalida-this.kmEntrada;
		double reduccion=0;
		if (distanciaRecorrida>100)
		{
			reduccion=precioTicket*5/(100);
			
		}
		return precioTicket-reduccion;
	}
	
	/**
	 *@param obj
	 *@return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof TicketEspecial))
			return false;
		TicketEspecial other = (TicketEspecial) obj;
		return nPasajeros == other.nPasajeros;
	}
	/**
	 *@return Represented the object
	 */
	@Override
	public String toString() 
	{
		return "TicketEspecial ["+super.toString()+"+]";
	}
}
