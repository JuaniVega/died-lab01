package died.lab01.problema01;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto pto1= new Punto(1,1);
		Punto pto2= new Punto(2,2);
		Recta recta1= new Recta(pto1, pto2);
		float pendiente= recta1.Pendiente();
		Punto pto3= new Punto(3,3);
		Recta recta2= new Recta(pto2, pto3);
		boolean rta= recta2.equals(recta1);
		
		boolean rta2=recta1.Paralelas(recta2);
		
		System.out.println("La pendiente es: "+pendiente);
		
		System.out.println("La recta 1 y la recta 2 son/no son la misma recta: "+rta);
		
		System.out.println("La recta 1 y la recta 2 son/no son paralelas: "+rta2);

	}

}
