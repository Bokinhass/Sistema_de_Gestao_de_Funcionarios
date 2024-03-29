package models;

import java.util.HashMap;
import java.util.Map;

public class Vendedor extends Funcionario {
  private final Map<String, Double> vendas;

  public Vendedor(String nome, String dataContratacao, int salarioBase) {
    super(nome, "Vendedor", dataContratacao, salarioBase);
    vendas = new HashMap<>();
  }

  public void adicionarVenda(String mesAno, double valor) {
    vendas.put(mesAno, valor);
  }

  public double getTotalVendasNoMes(String mesAno) {
    return vendas.getOrDefault(mesAno, 0.0);
  }
}
