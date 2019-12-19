import org.junit.Test;

public class PrimaTestCase {
	
	 
	/*@Test
	public void testCheckCalcularPrima() {
		PRIMAv3.calcularPrima("18", "25");
		PRIMAv3.validar("18");
		PRIMAv3.convertir("18");
		PRIMAv3.calcularPrima("24", "29");
		PRIMAv3.calcularPrima("26", "27");
		PRIMAv3.calcularPrima("33", "26");
		PRIMAv3.calcularPrima("37", "28");
		PRIMAv3.calcularPrima("40", "21");
		PRIMAv3.calcularPrima("50", "30");
		PRIMAv3.calcularPrima("64", "22");
		PRIMAv3.calcularPrima("65", "29");
		PRIMAv3.calcularPrima("90", "24");
		PRIMAv3.calcularPrima("19", "abc");
		PRIMAv3.validar("abc");
		PRIMAv3.calcularPrima("23,4", "15");
		PRIMAv3.validar("23,4");
	}*/
	
	@Test
	public void testCheckCalcularPrimaRecorrido() {
		PRIMAv3.calcularPrima("18", "29");
		PRIMAv3.validar("18");
		PRIMAv3.convertir("18");
		PRIMAv3.calcularPrima("18", "28");
		PRIMAv3.calcularPrima("25", "27");
		PRIMAv3.calcularPrima("25", "26");
		PRIMAv3.calcularPrima("35", "25");
		PRIMAv3.calcularPrima("35", "24");
		PRIMAv3.calcularPrima("45", "23");
		PRIMAv3.calcularPrima("45", "22");
		PRIMAv3.calcularPrima("65", "25");
		PRIMAv3.calcularPrima("65", "24");
		PRIMAv3.calcularPrima("17", "0");
		PRIMAv3.validar("abc");
		PRIMAv3.calcularPrima("23,4", "15");
		PRIMAv3.validar("23,4");
	}

}
