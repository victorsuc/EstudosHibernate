package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class AdicaoDeUsuario {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("bugtracker");
		EntityManager manager = factory.createEntityManager();
		
		Usuario usuario = new Usuario();
		usuario.setEmail("victor@gmail.com");
		usuario.setLogin("victorsuc");
		usuario.setNome("Victor Sucupira");
		usuario.setSenha("1234");
		
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
		manager.close();
		
		System.out.println("Usuário adicionado com sucesso!");
	}
}
