//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int N1;

    IO.print("Digite o numero desejado: ");
    N1 = input.nextInt();

    if (N1 % 2 == 0){
        IO.println("seu número é par, e o seu quadrado é " + (N1 * N1));
    } else {
        IO.println("seu número é impar, e o seu cubo é " + (N1 * N1 * N1));
    }
}
