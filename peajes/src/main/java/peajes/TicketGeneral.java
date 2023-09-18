package peajes;

public class TicketGeneral extends Ticket implements ITicket{
	
	/**
	 * @param kmEntrada
	 * @param precioKm
	 * @param kmSalida
	 */
	public TicketGeneral(int kmEntrada, double precioKm, int kmSalida)
	{
		super(kmEntrada, precioKm, kmSalida);
	}
	/**
	 *Constructor default
	 */
	public TicketGeneral()
	{
		super();
	}
	/**
	 *@return precioTicket
	 */
	public double calculoTicket() 
	{
		int distanciaRecorrida= this.kmSalida-this.kmEntrada;
		double precioTicket=distanciaRecorrida*this.precioKm;
		return precioTicket;
	}
	
	
	/**
	 *@param precioTicket
	 *@return New precio ticket
	 */
	public double reduccion(double precioTicket)
	{
		
		int distanciaRecorrida= this.kmSalida-this.kmEntrada;
		double reduccion=0;
		if (distanciaRecorrida>500)
		{
			reduccion=precioTicket*10/(100);
			
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
		if (!(obj instanceof TicketGeneral))
			return false;
		return true;
	}
	
	/**
	 *@return Represented the object
	 */
	@Override
	public String toString() {
		return "TicketGeneral ["+super.toString()+"+]";
	}

	
	
	
}
