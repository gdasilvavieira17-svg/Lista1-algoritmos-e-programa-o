//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int n1, n2, n3;

    IO.println("Digite os numeros desejados:");
    n1 = input.nextInt();
    n2 = input.nextInt();
    n3 = input.nextInt();

    if (n1 > n2 && n1 > n3){
        IO.print("O número " + n1 + " é o maior");
    }else if (n2 > n1 && n2 > n3){
        IO.print("O número " + n2 + " é o maior");
    } else {
        IO.print("O número " + n3 + " é o maior");
    }
}
