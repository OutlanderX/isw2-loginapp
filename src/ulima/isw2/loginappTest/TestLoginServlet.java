package ulima.isw2.loginappTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;

import org.mockito.Mockito.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import ulima.isw2.loginapp.Cliente;
import ulima.isw2.loginapp.DBAccesor;

public class TestLoginServlet {

	@Test
	public void testLoginFailed (){
		Cliente usuario = new Cliente();
		usuario.setUsername("prueba1");
		usuario.setPassword("123");
		usuario.setValid(true);
		
		DBAccesor dbAccesor = mock(DBAccesor.class);
		when(dbAccesor.obtenerCl("prueba1", "123")).thenReturn(usuario);
		
		assertTrue(usuario.isValid());
	}
}
