package by.it_academy.les17.classes;

import java.sql.Time;
import java.util.Arrays;

public class Airline {
	//	Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
private String destination;
private int flight;
private String plainType;
private Time departureTime;
private String[] weekDays;
	public Airline() {}
	public Airline(String destination, int flight, String plainType, Time departureTime, String[] weekDays) {
		this.destination = destination;
		this.flight = flight;
		this.plainType = plainType;
		this.departureTime = departureTime;
		this.weekDays = weekDays;
	}

	public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getFlight() {
	return flight;
}
public void setFlight(int flight) {
	this.flight = flight;
}
public String getPlainType() {
	return plainType;
}
public void setPlainType(String plainType) {
	this.plainType = plainType;
}
public Time getDepartureTime() {
	return departureTime;
}
public void setDepartureTime(Time departureTime) {
	this.departureTime = departureTime;
}
public String[] getWeekDays() {
	return weekDays;
}
public void setWeekDays(String[] weekDays) {
	this.weekDays = weekDays;
}

	@Override
	public String toString() {
		return "Airline{" +
				"destination='" + destination + '\'' +
				", flight=" + flight +
				", plainType='" + plainType + '\'' +
				", departureTime=" + departureTime +
				", weekDays=" + Arrays.toString(weekDays) +
				'}';
	}
}
