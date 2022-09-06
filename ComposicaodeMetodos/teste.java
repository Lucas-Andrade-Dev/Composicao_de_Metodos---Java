package ComposicaodeMetodos;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v0 = 2;
		int v1 = v0++;
		int v2 = ++v1;
		v1 += v0;
		v2 += --v1;
		
		System.out.println(v0);
		System.out.println(v1);
		System.out.println(v2);
		
		
	}

}
