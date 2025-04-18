package test;

import dao.RecebimentoDAO;
import dao.ContaDAO;
import model.Recebimento;
import model.Conta;

import java.util.Date;
import java.util.List;

public class TesteRecebimento {
    public static void main(String[] args) {
        RecebimentoDAO recebimentoDAO = new RecebimentoDAO();

        // Inserção de 5 registros
        recebimentoDAO.insert(new Recebimento(1, "Venda de milho", 1200.00, new Date(), "Venda da colheita", "Agricultura", 1));
        recebimentoDAO.insert(new Recebimento(2, "Feira orgânica", 850.00, new Date(), "Lucro feira domingo", "Feira", 1));
        recebimentoDAO.insert(new Recebimento(3, "Cooperativa", 980.00, new Date(), "Pagamento mensal", "Cooperativa", 1));
        recebimentoDAO.insert(new Recebimento(4, "Venda ovos", 300.00, new Date(), "Venda para vizinhos", "Produção animal", 1));
        recebimentoDAO.insert(new Recebimento(5, "Crédito rural", 1500.00, new Date(), "Empréstimo agrícola", "Financiamento", 1));

        // Consulta e exibição
        List<Recebimento> lista = recebimentoDAO.getAll();
        for (Recebimento r : lista) {
            System.out.println("ID: " + r.getId() + " | Nome: " + r.getNome() + " | Valor: " + r.getValor());
        }

        //Adicionando mais entidades
        ContaDAO contaDAO = new ContaDAO();

        // Consulta e exibição dos recebimentos
        List<Recebimento> listaReceb = recebimentoDAO.getAll();
        for (Recebimento r : listaReceb) {
            System.out.println("RECEBIMENTO -> ID: " + r.getId() + " | Nome: " + r.getNome() + " | Valor: " + r.getValor());
        }

        // Inserção de 2 contas
        contaDAO.insert(new Conta(1, "12345-6", "0001", "7", "Corrente", 5000.00, 1));
        contaDAO.insert(new Conta(2, "65432-1", "0002", "9", "Poupança", 3200.00, 1));

        // Consulta e exibição das contas
        List<Conta> listaContas = contaDAO.getAllContas();
        for (Conta c : listaContas) {
            System.out.println("CONTA -> ID: " + c.getIdConta() + " | Nº Conta: " + c.getNumeroConta() + " | Saldo: " + c.getSaldo());
        }


    }
}
