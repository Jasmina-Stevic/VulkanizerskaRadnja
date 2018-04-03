/**
 * 
 */
package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

/**
 * @author JasminaStevic
 *
 */
public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja r;
	AutoGuma a;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	@Before
	public void setUp() throws Exception {
		r = new VulkanizerskaRadnja();
		a = new AutoGuma();
	}

	
	@After
	public void tearDown() throws Exception {
		r = null;
		a= null;
	}

	
	@Test
	public void testDodajGumu() {
		a.setMarkaModel("Michelin Alpin 5");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(60);
		r.dodajGumu(a);
		assertTrue(a.getMarkaModel(), r.pronadjiGumu("Michelin Alpin 5").contains(a));
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajISTUGumu() {
		a.setMarkaModel("Michelin Alpin 5");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(60);
		r.dodajGumu(a);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Michelin Alpin 5");
		a2.setPrecnik(20);
		a2.setSirina(200);
		a2.setVisina(60);
		r.dodajGumu(a2);
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuNull() {
		a = null;
		r.dodajGumu(a);
	}
	
	@Test
	public void testPronadjiGumuIspravno() {
		a.setMarkaModel("Michelin Alpin 5");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(60);
		r.dodajGumu(a);
		for (int i = 0; i < r.pronadjiGumu("Michelin Alpin 5").size(); i++) {
					assertEquals(a.getMarkaModel(), r.pronadjiGumu("Michelin Alpin 5").get(i).getMarkaModel());

		}
	}
	@Test
	public void testPronadjiGumuNema() {
		a.setMarkaModel("Michelin Alpin 5");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(60);
		r.dodajGumu(a);
		//assertEquals(0, r.pronadjiGumu("Alpa").size());  
		assertFalse(a.getMarkaModel(), r.pronadjiGumu("Alpa").contains(a));

	}
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, r.pronadjiGumu(null));
	}

	@Test
	public void testPronadjiGumuPronalaziNekoliko() {
		a.setMarkaModel("Michelin Alpin 5");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(60);
		r.dodajGumu(a);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Michelin Alpin 5");
		a2.setPrecnik(21);
		a2.setSirina(200);
		a2.setVisina(58);
		r.dodajGumu(a2);
		
		AutoGuma a3 = new AutoGuma();
		a3.setMarkaModel("Michelin Samsung 42");
		a3.setPrecnik(15);
		a3.setSirina(225);
		a3.setVisina(45);
		r.dodajGumu(a3);
		
		AutoGuma a4 = new AutoGuma();
		a4.setMarkaModel("Michelin Alpin 5");
		a4.setPrecnik(18);
		a4.setSirina(210);
		a4.setVisina(50);
		r.dodajGumu(a4);
		
		AutoGuma a5 = new AutoGuma();
		a5.setMarkaModel("Michelin Samsung 42");
		a5.setPrecnik(14);
		a5.setSirina(215);
		a5.setVisina(48);
		r.dodajGumu(a5);
		
		AutoGuma a6 = new AutoGuma();
		a6.setMarkaModel("Michelin Alpin 5");
		a6.setPrecnik(17);
		a6.setSirina(211);
		a6.setVisina(49);
		r.dodajGumu(a6);
		assertEquals(4, r.pronadjiGumu("Michelin Alpin 5").size()); //Ako se u listi ne nalazi onoliko guma koliko ih zapravo ima, test ne prolazi
		for (int i = 0; i < r.pronadjiGumu("Michelin Alpin 5").size(); i++) { //Ako barem jedna guma nije u redu, test ne prolazi
			assertEquals(a.getMarkaModel(), r.pronadjiGumu("Michelin Alpin 5").get(i).getMarkaModel());

}
	}
	
	
}
