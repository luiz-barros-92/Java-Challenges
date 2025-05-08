import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class SeveralLocalDateTime {

	public static void main(String[] args) {
		
		//Notes from the Java course by Prof. Nelio Alves
		
		//capture DateTime
		LocalDate dt01 = LocalDate.now(); //print output: 2025-05-04
		LocalDateTime dt02 = LocalDateTime.now(); //print output: 2025-05-04T20:43:48.618180901
		Instant dt03 = Instant.now(); //print output: 2025-05-04T23:44:55.053506092Z		
		
		//generate DateTime using ISO 8601
		LocalDate dt04 = LocalDate.parse("2025-05-04"); //print output: 2025-05-04
		LocalDateTime dt05 = LocalDateTime.parse("2025-05-04T20:47:42"); //print output: 2025-05-04T20:47:42
		Instant dt06 = Instant.parse("2025-05-04T20:48:40Z"); //print output: 2025-05-04T20:48:40Z
		Instant dt07 = Instant.parse("2025-05-04T20:48:40-03:00"); //print output: 2025-05-04T23:48:40Z
		
		//custom format
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	   	DateTimeFormatter ft1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	   	DateTimeFormatter ft2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter ft3 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());//captures TimeZone default from user system 
	    
	   	LocalDate dt08 = LocalDate.parse("05/05/2025", ft1); //print output: 2025-05-05
	   	LocalDateTime dt09 = LocalDateTime.parse("05/05/2025 20:05", ft2); //print output: 2025-05-05T20:05
	    
	    	//isolated data
	    	LocalDate dt10 = LocalDate.of(2025, 5, 5); //print output: 2025-05-05
	    	LocalDateTime dt11 = LocalDateTime.of(2025, 5, 5, 20, 22); //print output: 2025-05-05T20:22
		
		//applying custom format
		System.out.println(dt04.format(ft1));//output: 04/05/2025
		System.out.println(ft1.format(dt04));//output: 04/05/2025
		System.out.println(dt04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));//output: 04/05/2025
		System.out.println(dt05.format(ft2));//output: 04/05/2025 20:47
		System.out.println(ft3.format(dt06));//output: 04/05/2025 17:48

	}
}
