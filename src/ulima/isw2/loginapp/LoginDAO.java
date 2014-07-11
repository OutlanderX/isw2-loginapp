package ulima.isw2.loginapp;



public class LoginDAO {
	private DBAccesor dbAccesor;
	
	public boolean validarLogin(String username, String password){
		Cliente usuario = new Cliente();
		usuario = dbAccesor.obtenerCl(username, password);
		
		return usuario.isValid();
		
		
	}

	public DBAccesor getDbAccesor() {
		return dbAccesor;
	}
	public void setDbAccesor(DBAccesor dbAccesor) {
		this.dbAccesor = dbAccesor;
	}
}
