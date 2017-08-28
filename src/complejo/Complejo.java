package complejo;

public class Complejo {
	private double real;
	private double imaginario;
	
	public Complejo(double real, double imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}

	public Complejo() {
		
	}
	
	public Complejo sumar(Complejo that) {
		return new Complejo(this.real + that.real, this.imaginario + that.imaginario);
	}

	@Override
		public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(imaginario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(real);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(imaginario) != Double.doubleToLongBits(other.imaginario))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  this.real + " + " + this.imaginario + "i";
	}
	
	
	public double modulo() {
		return Math.sqrt(Math.pow(this.real, 2)+Math.pow(this.imaginario,2));
	}
	
	
	
	
}
