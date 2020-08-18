import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Transaction t1;
	private Transaction t2;
	
	private ArrayList<Transaction> transactionList;
	@Before
	public void setUp() throws Exception {
		
		LocalDateTime current = LocalDateTime.now();
	
		t1 = new Transaction(current,"buy","SGD",100,"USD",730.4,0.7304);
//		t2 = new Transaction(current,"sell","USD",100,"SGD", 877200.0,877.2000);
		transactionList= new ArrayList<Transaction>();
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void retrieveAllTransactionTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Transaction arraylist to retrieve item", transactionList);
		
		//test if the list of camcorders retrieved from the SourceCentre is empty - boundary
		String allTransaction= C206_CaseStudy.retrieveAllTransaction(transactionList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allTransaction);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addTransaction(transactionList, t1);
//		C206_CaseStudy.addTransaction(transactionList, t2);
		assertEquals("Test that Camcorder arraylist size is 2", 1, transactionList.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre	
		allTransaction= C206_CaseStudy.retrieveAllTransaction(transactionList);
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = "18/8/2020";
		testOutput = String.format("%-20s %-20s %-20s %-20.6f %-20s %-20.6f %-20.6f\n",date,"buy","SGD",100.0,"USD",730.4,0.7304);
//		testOutput += String.format("%-20s %-20s %-20s %-20f %-20s %-20f %-20f\n",date,"sell","USD",100.0,"SGD", 877200.0,877.2000);
	
		assertEquals("Test that ViewAllTransactionlist", testOutput, allTransaction);
		
	}
	

}
