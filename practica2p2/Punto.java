package practica2p2;
import java.util.Scanner;
public class Punto {
	 int x, y;

	    public Punto(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    @Override
	    public String toString() {
	        return "(" + x + ", " + y + ")";
	    }
	}

	class Linea {
	    Punto p1, p2;

	    public Linea(Punto p1, Punto p2) {
	        this.p1 = p1;
	        this.p2 = p2;
	    }

	    @Override
	    public String toString() {
	        return "Línea: " + p1 + " -> " + p2;
	    }

	    public void dibujaLinea() {
	        System.out.println("Dibujando línea desde " + p1 + " hasta " + p2);
	    }
	}

	class Circulo {
	    Punto centro;
	    int radio;

	    public Circulo(Punto centro, int radio) {
	        this.centro = centro;
	        this.radio = radio;
	    }

	    @Override
	    public String toString() {
	        return "Círculo: centro=" + centro + ", radio=" + radio;
	    }

	    public void dibujaCirculo() {
	        System.out.println("Dibujando círculo con centro en " + centro + " y radio " + radio);
	    }
}

