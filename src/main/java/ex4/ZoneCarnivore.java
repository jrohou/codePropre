package ex4;


public class ZoneCarnivore extends Zone {


	public double calculerKgsNourritureParJour(){
		return size() * 10;
	}
}
