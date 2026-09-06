//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    double renda, prest;

    IO.println("Qual sua renda mensal? ");
    renda = input.nextDouble();
    IO.println("Qual sua valor da prestação mensal você pretende pagar no financiamento? ");
    prest = input.nextDouble();
    double seguranca = renda * 0.3;

    if (prest > seguranca){
        IO.print("Financiamento negado por alta prestação");
    } else if (prest > 3000 && renda < 10000) {
        IO.print("Financiamento negado por baixa renda");
    } else {
        IO.print("Financiamento aprovado");
    }
}
