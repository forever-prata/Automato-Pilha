package Code;

import java.util.ArrayList;

public class Automato {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		String entrada = "baababxbabaab";
		String letras[] = entrada.split("");
		boolean achouX = false;
		
		array.add("z0");
		
		for (int i = 0; i < letras.length; i++) {
			if (!achouX) {
				if (letras[i].equals("a")) {
					array.add(letras[i]);
				}else if (letras[i].equals("b")) {
					array.add(letras[i]);
				}else if (letras[i].equals("x")) {
					achouX = true;
				}
			}else {
				if (array.size()>0) {
					if (letras[i].equals("a") && array.get(array.size()-1).equals("a")) {
						array.remove(array.size()-1);
					}else if (letras[i].equals("b") && array.get(array.size()-1).equals("b")) {
						array.remove(array.size()-1);
					}
				}
			}
			
		}
		
		 
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

		
		if (array.get(array.size()-1).equals("z0")) {
			System.out.println("Palavra Aceita");
		}else {
			System.out.println("Palavra Não Aceita");
		}

	}
}
