import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//import org.joda.time.DateTime;

class CustomerDetails{
	int id;
	String name;
	int level;
	LocalTime timestamp;
	
	
	CustomerDetails(int Id, String Name, int Level, LocalTime timestamp){
		this.id=Id;
		this.name=Name;
		this.level=Level;
		this.timestamp=timestamp;
		
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public LocalTime gettimestamp() {
		return timestamp;
	}
	
}




public class BestCustomer {
	static int i=1;

	public static void main(String args[]) {
		
		ArrayList<CustomerDetails> customers = new ArrayList<>();
		/*
		 Timestamp timestamp =new Timestamp( new Date().getTime());
		 Calendar cal=Calendar.getInstance();
		 cal.setTimeInMillis(timestamp.getTime());
		 cal.add(Calendar.SECOND, -30);
		    timestamp = new Timestamp(cal.getTime().getTime());
		    System.out.println(timestamp);
		
		Instant Timestamp=Instant.now();
		
		LocalTime time=LocalTime.now();
		
		DateTime datetime=new DateTime();
		
		
		Date dNow = new Date(System.currentTimeMillis());
		
		System.out.println("This is date" +dNow);
	
		new Date(System.currentTimeMillis()+5*60*1000);
		long dNow1=(System.currentTimeMillis()+(5*60*1000));
		System.out.println("This is date 1" +dNow1);
		
	
		Date dNow2 = new Date( ); // Instantiate a Date object
		 int mm = dNow2.getMinutes();
		 dNow2.setMinutes(mm+5);
			System.out.println("This is date 1" +dNow2);
*/
	
		
		LocalTime timestamp= LocalTime.now();

		customers.add(new CustomerDetails(10, "Rajeev", 10,timestamp ));
		
		customers.add(new CustomerDetails(4, "Chris", 10, timestamp.minusMinutes(2)));
		
		
		customers.add(new CustomerDetails(7, "David", 13, timestamp.minusSeconds(200)));
		customers.add(new CustomerDetails(15, "Rahul", 14, timestamp.minusMinutes(10)));
		customers.add(new CustomerDetails(5, "Kishore", 17, timestamp.minusSeconds(120)));
		customers.add(new CustomerDetails(9, "Rohith", 19, timestamp.minusMinutes(14)));
		customers.add(new CustomerDetails(14, "Dhanush", 13, timestamp.minusMinutes(17)));
		customers.add(new CustomerDetails(1, "Dravid", 16, timestamp.minusMinutes(25)));
		customers.add(new CustomerDetails(8, "Thanish", 16, timestamp.minusMinutes(32)));
		customers.add(new CustomerDetails(12, "Anish", 13, timestamp.plusSeconds(90)));
	
		
		
		Collections.sort(customers,Comparator.comparingDouble(CustomerDetails::getLevel). thenComparing(CustomerDetails::gettimestamp));
		Collections.reverse(customers);
		System.out.println("\nList of best customers based on LEVEL and TIMESTAMP\n");
		for(CustomerDetails cd : customers) {
			System.out.print("Best Customer "+i+" : ");
			System.out.println(cd.id+"    "+cd.name+"   "+cd.level+"   "+cd.timestamp);
			i++;
			}
	
	}

}

