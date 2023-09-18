package peajes;



public class Ticket {
	/**
	 * 
	 */
	int kmEntrada;
	double precioKm;
	int kmSalida;
	
	/**
	 * @param kmEntrada
	 * @param precioKm
	 * @param kmSalida
	 */
	public Ticket(int kmEntrada, double precioKm, int kmSalida) {
		super();
		this.kmEntrada = kmEntrada;
		this.precioKm = precioKm;
		this.kmSalida = kmSalida;
	}

	/**
	 *Constructor default
	 */
	public Ticket() {
		super();
	}

	/**
	 * @return the kmEntrada
	 */
	public int getKmEntrada() {
		return kmEntrada;
	}

	/**
	 * @param kmEntrada the kmEntrada to set
	 */
	public void setKmEntrada(int kmEntrada) {
		this.kmEntrada = kmEntrada;
	}

	/**
	 * @return the precioKm
	 */
	public double getPrecioKm() {
		return precioKm;
	}

	/**
	 * @param precioKm the precioKm to set
	 */
	public void setPrecioKm(double precioKm) {
		this.precioKm = precioKm;
	}

	/**
	 * @return the kmSalida
	 */
	public int getKmSalida() {
		return kmSalida;
	}

	/**
	 * @param kmSalida the kmSalida to set
	 */
	public void setKmSalida(int kmSalida) {
		this.kmSalida = kmSalida;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Ticket))
			return false;
		Ticket other = (Ticket) obj;
		return kmEntrada == other.kmEntrada && kmSalida == other.kmSalida
				&& Double.doubleToLongBits(precioKm) == Double.doubleToLongBits(other.precioKm);
	}

	@Override
	public String toString() {
		return "Ticket [kmEntrada=" + kmEntrada + ", precioKm=" + precioKm + ", kmSalida=" + kmSalida + "]";
	}
	

	
	
}
