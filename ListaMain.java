import java.util.List;

public class ListaMain {
    public static void main(String[] args) {

        BancoDeDados banco = new BancoDeDados();
        Menu menu = new Menu(banco);

        menu.iniciar();

        System.out.println("\n--- LISTA FINAL ---");
        List<Pessoa> pessoas = banco.obterTodos();

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
    }
}
