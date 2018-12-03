package lab.amikom;

public class MainBangunRuang {

	double p, l, t;
	
	//constructor
	public MainBangunRuang(double p, double l, double t) {
		super();
		this.p = p;
		this.l = l;
		this.t = t;
	}
	
	//method volumebalok
	double volumeBalok(){
		return p * l * t ;  
	}
	
	//method volumekerucut 
	double volumeKerucut(){
		return volumeBalok()/3;
		
	}
}
