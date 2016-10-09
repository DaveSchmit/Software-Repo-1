package SoftwareAssignment1.SoftwareAssignment1;
import org.joda.time.LocalDate;

import junit.framework.Assert;
import junit.framework.TestCase;

public class studentTest extends TestCase {
 
	public void test(){
		student s1= new student("James",24,new LocalDate("1994-07-12"));
		String name= "James24";
		Assert.assertTrue(s1.getID().equals(name));
	}
}
