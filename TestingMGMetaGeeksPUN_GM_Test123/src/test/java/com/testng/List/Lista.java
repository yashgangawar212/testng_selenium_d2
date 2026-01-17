package com.testng.List;
import java.util.List;
import org.testng.annotations.Test;
@Test
public class Lista {
	
	
	public boolean ArrayListTest(List <String> l1) {
		boolean l3 = l1.contains("Pune");

		return l3;
	}

	public Object[] convertListToArray(List <Integer> ListTestData) {

		Object arr[] = ListTestData.toArray();

		return arr;
	}
}
