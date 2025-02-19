package practica2p2;

public class Principal {

	public static void main(String[] args) {
	      Punto p1 = new Punto(1, 2);
	        Punto p2 = new Punto(4, 6);
	        Linea linea = new Linea(p1, p2);
	        System.out.println(linea);
	        linea.dibujaLinea();

	        Punto centro = new Punto(3, 3);
	        Circulo circulo = new Circulo(centro, 2);
	        System.out.println(circulo);
	        circulo.dibujaCirculo();
	    }
	}

