package models;

import java.util.List;

public class Empresa {
  private final List<Funcionario> funcionarios;

  public Empresa(List<Funcionario> funcionarios) {
    this.funcionarios = funcionarios;
  }

  public double totalPagoNoMes(List<Funcionario> funcionarios, String mesAno) {
    double totalPago = 0;
    for (Funcionario funcionario : funcionarios) {
      if (funcionario instanceof Vendedor vendedor) {
        totalPago += vendedor.getSalarioBase() + vendedor.getTotalVendasNoMes(mesAno) * 0.3;
      } else {
        // Para outros funcionários, apenas o salário base é considerado
        totalPago += funcionario.getSalarioBase();
      }
    }
    return totalPago;
  }

  public double totalPagoSomenteSalarios(List<Funcionario> funcionarios) {
    double totalSalarios = 0;
    for (Funcionario funcionario : funcionarios) {
      totalSalarios += funcionario.getSalarioBase();
    }
    return totalSalarios;
  }

  public double totalPagoBeneficios(List<Funcionario> funcionarios, String mesAno) {
    double totalBeneficios = 0;
    for (Funcionario funcionario : funcionarios) {
      if (funcionario instanceof Vendedor vendedor) {
        totalBeneficios += vendedor.getTotalVendasNoMes(mesAno) * 0.3;
      } else {
        totalBeneficios += funcionario.getSalarioBase() * 0.2;
      }
    }
    return totalBeneficios;
  }

  public String funcionarioComMaiorValorNoMes(List<Funcionario> funcionarios, String mesAno) {
    String funcionarioNome = "";
    double maiorValor = 0;
    for (Funcionario funcionario : funcionarios) {
      double valorTotal = 0;
      if (funcionario instanceof Vendedor vendedor) {
        valorTotal = vendedor.getSalarioBase() + vendedor.getTotalVendasNoMes(mesAno) * 0.3;
      } else {
        valorTotal = funcionario.getSalarioBase();
      }
      if (valorTotal > maiorValor) {
        maiorValor = valorTotal;
        funcionarioNome = funcionario.getNome();
      }
    }
    return funcionarioNome;
  }

  public String funcionarioComMaiorBeneficioNoMes(List<Funcionario> funcionarios, String mesAno) {
    String funcionarioNome = "";
    double maiorBeneficio = 0;
    for (Funcionario funcionario : funcionarios) {
      double beneficio = 0;
      if (funcionario instanceof Vendedor vendedor) {
        beneficio = vendedor.getTotalVendasNoMes(mesAno) * 0.3;
      } else {
        beneficio = funcionario.getSalarioBase() * 0.2;
      }
      if (beneficio > maiorBeneficio) {
        maiorBeneficio = beneficio;
        funcionarioNome = funcionario.getNome();
      }
    }
    return funcionarioNome;
  }

  public String vendedorComMaiorVendasNoMes(List<Vendedor> vendedores, String mesAno) {
    String vendedorNome = "";
    double maiorVenda = 0;
    for (Vendedor vendedor : vendedores) {
      double vendaNoMes = vendedor.getTotalVendasNoMes(mesAno);
      if (vendaNoMes > maiorVenda) {
        maiorVenda = vendaNoMes;
        vendedorNome = vendedor.getNome();
      }
    }
    return vendedorNome;
  }
}