package ex4;


public class ZoneFermeReptile extends Zone {
	

	public double calculerKgsNourritureParJour(){
		return size() * 0.1;
	}
}
