package ulima.isw2.loginapp;

public class Cliente {
	 private String username; 
	 private String password; 
	 private String nombre; 
	 private String apellido; 
	 public boolean valido;
	 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isValid() {
		return valido;
	}
	public void setValid(boolean valido) {
		this.valido = valido;
	}
}
