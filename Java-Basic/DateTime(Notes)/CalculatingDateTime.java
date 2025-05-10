package sandBox;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class CalculatingDateTime {

	public static void main(String[] args) {
		
		//Notes from the Java course by Prof. Nelio Alves

		//generate DateTime using ISO 8601
		LocalDate dt04 = LocalDate.parse("2025-05-04"); //print output: 2025-05-04
		LocalDateTime dt05 = LocalDateTime.parse("2025-05-04T20:47:42"); //print output: 2025-05-04T20:47:42
		Instant dt06 = Instant.parse("2025-05-04T20:48:40Z"); //print output: 2025-05-04T20:48:40Z
		
		//plus or minus days(or months, or years, weeks)
		LocalDate addDays = dt04.plusDays(7); //print output: 2025-05-11
		LocalDate minusDays = dt04.minusDays(7); //print output: 2025-04-27
		
		//Hours, Minutes, Seconds, Nanos
		LocalDateTime addDays1 = dt05.plusDays(7); //print output: 2025-05-11T20:47:42
		LocalDateTime minusDays1 = dt05.minusDays(7); //print output: 2025-04-27T20:47:42
		
		//working with Instant (ChronoUnit has A LOT of units)
		Instant inst1 = dt06.plus(7, ChronoUnit.DAYS); //print output: 2025-05-11T20:48:40Z
		Instant inst = dt06.minus(7, ChronoUnit.DAYS); //print output: 2025-04-27T20:48:40Z
		
		//calculating Duration
		Duration d1 = Duration.between(minusDays1, dt05); //LocalDateTime	
		System.out.println(d1.toDays()); //output: 7
		
		Duration d2 = Duration.between(minusDays.atStartOfDay(), dt04.atStartOfDay()); //need to add the hour of the day because it is LocalDate
		System.out.println(d2.toDays()); //output: 7
		
		Duration d3 = Duration.between(inst, dt06); //Instant
		System.out.println(d3.toDays()); //output: 7		
	}
}