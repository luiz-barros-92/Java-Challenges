package sandBox;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
			
	}
}