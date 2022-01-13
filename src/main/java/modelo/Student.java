package modelo;

public class Student {

	private String edad;

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Student [edad=" + edad + "]";
	}
}
