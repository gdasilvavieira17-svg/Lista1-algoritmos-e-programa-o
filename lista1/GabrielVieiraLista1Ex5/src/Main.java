//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    double peso, altura;

    System.out.print("Digite o seu peso: ");
    peso = input.nextDouble();
    System.out.print("digite sua altura(em metros): ");
    altura = input.nextDouble();

    System.out.printf("O seu IMC é:  " + (peso / (altura * altura)));
}
