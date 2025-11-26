import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

    private List<Pessoa> pessoas = new ArrayList<>();
    private int contadorId = 1;

    public void adicionarPessoa(String nome) {
        pessoas.add(new Pessoa(contadorId++, nome));
    }

    public Pessoa buscarPorId(int id) {
        for (Pessoa p : pessoas) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Pessoa> buscarPorNome(String parte) {
        List<Pessoa> resultado = new ArrayList<>();
        for (Pessoa p : pessoas) {
            if (p.getNome().toLowerCase().contains(parte.toLowerCase())) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public List<Pessoa> obterTodos() {
        return pessoas;
    }

    public void listarTodos() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        }

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
