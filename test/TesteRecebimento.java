
package test;

import dao.RecebimentoDAO;
import model.Recebimento;

import java.util.Date;
import java.util.List;

public class TesteRecebimento {
    public static void main(String[] args) {
        RecebimentoDAO dao = new RecebimentoDAO();

        // Inserção de 5 registros
        dao.insert(new Recebimento(1, "Venda de milho", 1200.00, new Date(), "Venda da colheita", "Agricultura", 1));
        dao.insert(new Recebimento(2, "Feira orgânica", 850.00, new Date(), "Lucro feira domingo", "Feira", 1));
        dao.insert(new Recebimento(3, "Cooperativa", 980.00, new Date(), "Pagamento mensal", "Cooperativa", 1));
        dao.insert(new Recebimento(4, "Venda ovos", 300.00, new Date(), "Venda para vizinhos", "Produção animal", 1));
        dao.insert(new Recebimento(5, "Crédito rural", 1500.00, new Date(), "Empréstimo agrícola", "Financiamento", 1));

        // Consulta e exibição
        List<Recebimento> lista = dao.getAll();
        for (Recebimento r : lista) {
            System.out.println("ID: " + r.getId() + " | Nome: " + r.getNome() + " | Valor: " + r.getValor());
        }
    }
}
