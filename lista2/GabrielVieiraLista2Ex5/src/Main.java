//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    float temp;
    int escolha;

    IO.print("Qual a sua temperatura em °C: ");
    temp = input.nextInt();
    IO.println("Para qual medida de temperatura você quer passar \nDigite 1 para Fahrenheit" +
            "\nDigite 2 para Kelvin");
    escolha = input.nextInt();

    if (escolha != 1 && escolha != 2 ){
        IO.print("Opção invalida");
    } else if (escolha == 1){
        IO.print("sua temperatura em Fahrenheit é " + (temp * 1.8 + 32));
    } else {
        IO.print("sua temperatura em Kelvin é " + (temp + 273.15));
    }
}
