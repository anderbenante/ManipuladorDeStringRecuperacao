import static org.junit.Assert.*;

import org.junit.Test;


public class ManipuladorDeStringRecuperacaoTest {

	@Test
	public void deveOrdenarFraseRatoRoeu() {
		String fraseCrescente = ManipuladorDeString.ordenar("O rato roeu a roupa do rei de Roma");
		assertEquals("O a do de rei rato roeu Roma roupa", fraseCrescente);
	}
	
	@Test
	public void deveOrdenarFraseJabuti() {
		String fraseCrescente = ManipuladorDeString.ordenar("Um pequeno jabuti xereta viu dez cegonhas felizes");
		assertEquals("Um viu dez jabuti xereta pequeno felizes cegonhas",fraseCrescente);
	}
	
	@Test
	public void deveOrdenarFraseHareKrishna() {
		String fraseCrescente = ManipuladorDeString.ordenar("Cante Hare Krishna e seja Feliz");
		assertEquals("e Hare seja Cante Feliz Krishna",fraseCrescente);
	}
	
	@Test
	public void deveOrdenarFraseGrupo() {
		String fraseCrescente = ManipuladorDeString.ordenar("Anderson Jackson e Marcelo");
		assertEquals("e Jackson Marcelo Anderson",fraseCrescente);
	}
	
	@Test
	public void deveOrdenarFraseTempo() {
		String fraseCrescente = ManipuladorDeString.ordenar("Preciso de mais tempo para estudar");
		assertEquals("de mais para tempo Preciso estudar",fraseCrescente);
	}	
}
