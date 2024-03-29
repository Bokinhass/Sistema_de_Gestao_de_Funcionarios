package models;

public class Funcionario {
  private final String nome;
  private final String cargo;
  private final String dataContratacao;
  private final int salarioBase;

  public Funcionario(String nome, String cargo, String dataContratacao, int salarioBase) {
    this.nome = nome;
    this.cargo = cargo;
    this.dataContratacao = dataContratacao;
    this.salarioBase = salarioBase;
  }

  public String getNome() {
    return nome;
  }

  public String getCargo() {
    return cargo;
  }

  public String getDataContratacao() {
    return dataContratacao;
  }

  public int getSalarioBase() {
    return salarioBase;
  }
}
