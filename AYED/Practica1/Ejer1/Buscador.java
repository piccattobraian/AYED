package Ejer1;


public class Buscador {
	
	private Integer a;
	private Integer b;
	private static int i;
	
	public Buscador() {}
	
	public Buscador (Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}

	
	public static void For(Integer a, Integer b) {
		for (i = a ; i < b + 1 ; i++) {
			if (i <= b) {
				System.out.println(i);
			}
		}
	}
		
	public static void While(Integer a, Integer b) {
		i = a;
		while (i <= b) {
			System.out.println(i);
			i++;
		}
		
	
	}
	public static void recur(Integer a, Integer b) {
		i = a;
		while (i <= b) {
			System.out.println(i);
			a++;
			recur(a,b);
		}	
	}
	
}
