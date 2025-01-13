package by.it_academy.les17.classes;
import java.sql.Time;
import java.util.*;
/*
Найти и вывести:
a) список рейсов для заданного пункта назначения; +
b) список рейсов для заданного дня недели; +
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class AirCompany {

	private ArrayList<Airline> flights;

	public AirCompany (){
		flights = new ArrayList<>();
	}

	public void addAirplane(Airline airline){
		flights.add(airline);
	}

	public List<Airline> selectByDestination(String dPoint){
		List<Airline> result = new ArrayList<>();
		for (int i = 0; i < flights.size();i++){
			if (flights.get(i).getDestination().equals(dPoint)){
				result.add(flights.get(i));		
			}
		}
		return result;
	}
	public Airline selectByFlightNumber(int number){
		Airline result = new Airline();
			  for (Airline flight : flights) {
				  if (flight.getFlight() == number) {
					  return flight;
				  }
			  }
			return null;
	}

	public  List<Airline> selectByWeekdays(String wDay){
		List<Airline> result = new ArrayList<>();
		List<String> weekDays;
		Airline plain;
		for (int i = 0; i < flights.size();i++){
			plain = flights.get(i);
			weekDays = List.of(plain.getWeekDays());

			for (String day : weekDays) {
				if (day == wDay) {
					result.add(plain);
				}
			}
		}
		return result;
	}
	public List<Airline> selectByDaysAndTime (String wDay, Time time){
        List<Airline> result = this.selectByWeekdays(wDay);
		List<Airline> finalResult = new ArrayList<>();
		for(Airline plain:result){
			if (plain.getDepartureTime().after(time)) {
				finalResult.add(plain);
			}
		}
		return  finalResult;
	}
}
