//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int n1, n2, n3;

    System.out.println("Digite os 3 numeros desejados: ");
    n1 = input.nextInt();
    n2 = input.nextInt();
    n3 = input.nextInt();

    IO.print("A soma dos numeros é: " + (n1+n2+n3) + "\nA media dos numeros é: " + ((n1+n2+n3)/3));

}
