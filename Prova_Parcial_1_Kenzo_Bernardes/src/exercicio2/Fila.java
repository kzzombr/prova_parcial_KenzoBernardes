package exercicio2;

public class Fila {

	No inicio, fim;
	
	// método para inserir um elemento no final da fila (enfileirar)
	public void enfileirar(Motorista motorista) {
		No aux = new No(motorista);
		if(inicio == null) {
			inicio = aux;
		} else {
			aux.esq = fim;
			fim.dir = aux;
		}
		fim = aux;
	}
	
	// método para desenfileirar um elemento da fila, ou seja, remover o primeiro elemento
	public void desenfileirar() {
		if(inicio == null) {
			System.out.println("Não há motoristas na fila!");
		} else {
			System.out.println("Nome motorista: "+ inicio.motorista.getNome()+" foi removido");
			inicio.dir.esq = null;
			inicio = inicio.dir;
		}
	}
	
	// método para exibir os dados (nome e placa) dos motoristas
	public void mostrarDados() {
		while(inicio != null) {
			System.out.println("Nome: " + inicio.motorista.getNome() + " | Placa: " + inicio.motorista.getPlaca());
			inicio = inicio.dir;
		}
	}
}
