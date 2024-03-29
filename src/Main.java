import models.Empresa;
import models.Funcionario;
import models.Vendedor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    Funcionario jorgeCarvalho = new Funcionario("Jorge Carvalho", "Secretário", "01/2018", 7000);
    Funcionario mariaSouza = new Funcionario("Maria Souza", "Secretário", "12/2015", 7000);
    Funcionario julianaAlves = new Funcionario("Juliana Alves", "Gerente", "07/2017", 20000);
    Funcionario bentoAlbino = new Funcionario("Bento Albino", "Gerente", "03/2014", 20000);

    Vendedor anaSilva = new Vendedor("Ana Silva", "12/2021", 12000);
    anaSilva.adicionarVenda("12/2021", 5200);
    anaSilva.adicionarVenda("01/2022", 4000);
    anaSilva.adicionarVenda("02/2022", 4200);
    anaSilva.adicionarVenda("03/2022", 5850);
    anaSilva.adicionarVenda("04/2022", 7000);

    Vendedor joaoMendes = new Vendedor("João Mendes", "12/2021", 12000);
    joaoMendes.adicionarVenda("12/2021", 3400);
    joaoMendes.adicionarVenda("01/2022", 7700);
    joaoMendes.adicionarVenda("02/2022", 5000);
    joaoMendes.adicionarVenda("03/2022", 5900);
    joaoMendes.adicionarVenda("04/2022", 6500);

    List<Funcionario> funcionarios = new ArrayList<>();
    funcionarios.add(jorgeCarvalho);
    funcionarios.add(mariaSouza);
    funcionarios.add(anaSilva);
    funcionarios.add(joaoMendes);
    funcionarios.add(julianaAlves);
    funcionarios.add(bentoAlbino);

    Empresa empresa = new Empresa(funcionarios);

    String mesAno = "04/2022";
    System.out.println("Total pago no mês (salário e benefício): " + empresa.totalPagoNoMes(funcionarios, mesAno));
    System.out.println("Total pago somente em salários: " + empresa.totalPagoSomenteSalarios(funcionarios));
    System.out.println("Total pago em benefícios: " + empresa.totalPagoBeneficios(funcionarios, mesAno));
    System.out.println("Funcionário com o maior valor pago no mês: " + empresa.funcionarioComMaiorValorNoMes(funcionarios, mesAno));
    System.out.println("Funcionário com o maior benefício pago no mês: " + empresa.funcionarioComMaiorBeneficioNoMes(funcionarios, mesAno));
    System.out.println("Vendedor que mais vendeu no mês: " + empresa.vendedorComMaiorVendasNoMes(Arrays.asList(anaSilva, joaoMendes), mesAno));

    String mesAno1 = "07/2014";
    System.out.println();
    System.out.println("Total pago no mês (salário e benefício): " + empresa.totalPagoNoMes(funcionarios, mesAno1));
    System.out.println("Total pago somente em salários: " + empresa.totalPagoSomenteSalarios(funcionarios));
    System.out.println("Total pago em benefícios: " + empresa.totalPagoBeneficios(funcionarios, mesAno1));
    System.out.println("Funcionário com o maior valor pago no mês: " + empresa.funcionarioComMaiorValorNoMes(funcionarios, mesAno1));
    System.out.println("Funcionário com o maior benefício pago no mês: " + empresa.funcionarioComMaiorBeneficioNoMes(funcionarios, mesAno1));
    System.out.println("Vendedor que mais vendeu no mês: " + empresa.vendedorComMaiorVendasNoMes(Arrays.asList(anaSilva, joaoMendes), mesAno1));
  }
}