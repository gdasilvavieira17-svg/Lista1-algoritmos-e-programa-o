//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int idade;

    System.out.println("Digite a sua idade: ");
    idade = input.nextInt();

    System.out.println("Sua idade em meses é: " + idade * 12);
}
