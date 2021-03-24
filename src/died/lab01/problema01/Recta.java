package died.lab01.problema01;

public class Recta {
	Punto p1;
	Punto p2;
	float m;

	
	public Recta(Punto p1, Punto p2) {
		this.p1=p1;
		this.p2=p2;
	}
	
	public Recta () {
		this.p1 =this.p2;		
	}
	
	public float Pendiente() {
		this.m=(this.p2.ptoY - this.p1.ptoY)/(this.p2.ptoX - this.p1.ptoX);
		return m;
	}
	
	public boolean Paralelas(Recta r2) {
		if(this.Pendiente()==r2.Pendiente()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean equals(Recta otraRecta) {
		Punto p1Prueba= otraRecta.p1;
		Punto p2Prueba=this.p2;
		Recta rectaPrueba= new Recta(p1Prueba, p2Prueba);
		float pend;
		boolean esIgual;
		
		pend=rectaPrueba.Pendiente();
		
		if(pend==this.Pendiente()) {
			return true;
		}else {
			return false;
		}
	}
	

	
}
