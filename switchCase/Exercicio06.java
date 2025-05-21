package switchCase;

public class Exercicio06 {

	public static void main(String[] args) {
		String[] codigos = { "4H", "7A", "2C" };

		StringBuilder resultado = new StringBuilder();

		for (String codigo : codigos) {

			int quantidade = Integer.parseInt(codigo.substring(0, codigo.length() - 1));
			char letra = codigo.charAt(codigo.length() - 1);

			for (int i = 0; i < quantidade; i++) {
				resultado.append(letra);
			}
		}

		System.out.println("Código reconstruído: " + resultado.toString());

	}

}
