package cl.ccla.to;

public class ProductoTO  {

	private Integer id;
	private String nombre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ProductoTO [id=" + id + ", nombre=" + nombre + "]";
	}

	
}
