/**
 * 
 */
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Jasmina Stevic
 *
 */
public class AutoGumaTest extends AutoGuma {
	private AutoGuma a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Michelin Alpin 5");
		assertEquals("Michelin Alpin 5", a.getMarkaModel());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		a.setMarkaModel("");
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelManjiOdDozvoljenogString() {
		a.setMarkaModel("M");
	}
	
	@Test
	public void testSetPrecnikIspravan() {
		a.setPrecnik(15);
		
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManji() {
		a.setPrecnik(12);
		
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeci() {
		a.setPrecnik(23);
		
	}


	@Test
	public void testSetSirinaIspravan() {
		a.setSirina(200);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaManji() {
		a.setSirina(134);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVeci() {
		a.setSirina(356);
	}
	
	@Test
	public void testSetVisinaIspravan() {
		a.setVisina(60);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaManji() {
		a.setVisina(15);
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVeci() {
		a.setVisina(100);
	}
	@Test
	public void testToString() {
		a.setMarkaModel("Michelin Alpin 5");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(60);
		
		assertEquals("AutoGuma [markaModel=" + "Michelin Alpin 5" + ", precnik=" + 20 + ", sirina=" + 200 + ", visina="
				+ 60 + "]", a.toString());
	}

	@Test
	public void testEqualsObject() {
		AutoGuma a2 = new AutoGuma();
		
		a.setMarkaModel("Michelin Alpin 5");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(60);
		
		a2.setMarkaModel("Michelin Alpin 5");
		a2.setPrecnik(20);
		a2.setSirina(200);
		a2.setVisina(60);
		
		assertTrue(a.equals(a2));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		AutoGuma a2 = new AutoGuma();
		
		a.setMarkaModel("Michelin Alpin 5");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(60);
		
		a2.setMarkaModel("Mich");
		a2.setPrecnik(20);
		a2.setSirina(200);
		a2.setVisina(60);
		
		assertFalse(a.equals(a2));
	}

}
