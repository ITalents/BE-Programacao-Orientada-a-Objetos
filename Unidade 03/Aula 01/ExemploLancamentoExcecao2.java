import java.util.List;
import java.util.NoSuchElementException;

public class ExemploLancamentoExcecao2 {
    public static void main(String[] args) {
        try {
            List<String> listaNomes = List.of("Leo","Joao","Pedro");

            String  primeiroNome = obterPrimeiroNome(listaNomes);
            System.out.println("Primeiro nome da lista: "+ primeiroNome);

            List<String> listaVazia = List.of();
            obterPrimeiroNome(listaVazia);
        } catch (NoSuchElementException e) {
            System.out.println("Erro ao obter o primeiro nome: "+ e.getMessage());
        }
    }

    public static String obterPrimeiroNome(List<String> lista){
        if (lista.isEmpty()) {
            throw new NoSuchElementException("A lista está vazia. Não é possivel obter o primeiro nome.");
        }
        return lista.get(0);
    }
}
