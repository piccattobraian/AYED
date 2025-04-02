package Ejer3;



public class Test {



	public static void main (String[] args) {
		Profesor[] profesores = new Profesor[3];
		Estudiante[] estudiantes = new Estudiante[2];
		
		estudiantes[0] = new Estudiante("Pablo","Correas","3d","example@gmail.com","2342");
		estudiantes[1] = new Estudiante("Pedro","Conmtre","5d","example@gmail.com","6546");
		
		profesores[0] = new Profesor ("jorge","iriir","ooo@gmail.com","334d","UNLP");
		profesores[1] = new Profesor ("pascal","pinza","ooo@gmail.com","23423","UNLP");
		profesores[2] = new Profesor ("perno","plaza","ooo@gmail.com","4324","UNLP");
		
		for (Estudiante e: estudiantes) {
			System.out.println(e.tusDatos());
			System.out.println();
		}
		
		for (Profesor p: profesores) {
			System.out.println(p.tusDatos());
			System.out.println();
		}
		
	}
}






