package entities;

import java.util.List;

public class Battery {
	private Integer battery=50;
	private List<Integer> eventos;

	public Battery(List<Integer> eventos) {
		this.eventos = eventos;
	}
	
	public Integer getBattery() {
		for(Integer ev : eventos) {	
			battery += ev;
			if (battery > 100) battery = 100;
			if (battery < 0) battery = 0;
		}
		return battery;
	}
	
	public void setBattery(Integer battery) {
		this.battery = battery;
	}

}
