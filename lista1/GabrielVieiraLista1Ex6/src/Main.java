//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    double salarioatual, Aumento ;

    System.out.println("Qual o salario atual do funcionario? ");
    salarioatual = input.nextDouble();
    System.out.println("Qual a porcentagem de aumento do salario? ");
    Aumento = input.nextDouble();

    System.out.println("O valor do aumento do funcionario será: " + salarioatual * (Aumento/100) + "\n" +
            "O valor do salario depois do aumento será: " + (salarioatual * (Aumento/100) + salarioatual));

}
