package by.it_academy.les17.classes;

import java.sql.Time;

public class Main {

	public static void main(String[] args) {
		String[] week1 = new String[]{"пнд", "сбт"};
		String[] week2 = new String[]{"вт","сбт"};
		String[] week3 = new String[]{"пнд","вт","чтв","птн","вскр"};
		String[] week4 = new String[]{"чтв","ср","птн"};
		String[] week5 = new String[]{"вт","сбт"};

		AirCompany aggregor = new AirCompany();

		aggregor.addAirplane(new Airline("Москва",1009, "Boing", Time.valueOf("08:45:00"), week1));
		aggregor.addAirplane(new Airline("Санкт-Петербург",1012, "Boing", Time.valueOf("10:00:00"), week2));
		aggregor.addAirplane(new Airline("Дубаи",1198, "AirBus", Time.valueOf("13:30:00"), week3));
		aggregor.addAirplane(new Airline("Goa",1111, "AirBus", Time.valueOf("15:45:00"), week4));
		aggregor.addAirplane(new Airline("Marsa Alam",9, "Boing", Time.valueOf("23:00:00"), week5));

		System.out.println("Airlines ended");

		System.out.println("По направлению 'Москва': "+ aggregor.selectByDestination("Москва"));
		System.out.println("По дням недели 'вторник': "+ aggregor.selectByWeekdays("вт"));
		System.out.println("По дням недели 'среда, после 15:00': "+aggregor.selectByDaysAndTime("ср", Time.valueOf("15:00:00")));
	}

}

