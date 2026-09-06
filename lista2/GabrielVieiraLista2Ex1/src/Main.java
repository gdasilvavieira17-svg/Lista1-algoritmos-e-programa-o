//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int idade;

    System.out.print("Qual a idade do nadador? ");
    idade = input.nextInt();

    if (idade < 0 || idade > 100){
        System.out.println("idade invalida");
    } else if (idade <= 12){
        System.out.println("o nadador faz parte da competição infantil");
    } else if (idade <= 17){
        System.out.println("O nadador faz parte da competição juvenil");
    } else {
        System.out.println("O nadador faz parte da competição adulta");
    }
}
