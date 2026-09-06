//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int energia;
    float conta = 0;
    IO.print("Qual foi o gasto de energia da casa em kWh esse mês? ");
    energia = input.nextInt();

    if (energia < 0){
        IO.println("valor invalido");
    }else if (energia <= 100){
        IO.println("o valor da sua contra será R$" + ((energia*0.5) + conta) );
    } else if (energia <= 200){
        IO.println("o valor da sua contra será R$" + ((energia*0.7) + conta) );
    } else {
        IO.println("o valor da sua contra será R$"+ ((energia*0.9) + conta));
    }
}
