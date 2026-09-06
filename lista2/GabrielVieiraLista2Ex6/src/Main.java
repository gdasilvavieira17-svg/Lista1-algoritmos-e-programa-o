//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    float codigo, quant, valor;


    IO.println("Digite o codigo do produto: ");
    codigo = input.nextFloat();
    IO.println("Digite a quantidade de produtos: ");
    quant = input.nextFloat();


    if (codigo < 1 || codigo > 40) {
        IO.print("Codigo invalido!!");
    } else {

        if (codigo <= 10) {
            valor = 10;
        } else if (codigo <= 20) {
            valor = 15;
        } else if (codigo <= 30) {
            valor = 20;
        } else {
            valor = 30;
        }
        double total = quant * valor;
        IO.print("O preço unitario do produto é " + valor);
        IO.print("\nO valor total da nota é " + total);

        if (total <= 250){
            IO.print("\nSeu desconto será de 5% \no valor do desconto será de R$" + total * 0.05 + " e o valor final " +
                    "será de " + total * 0.95);
        } else if (total <= 500) {
            IO.print("\nSeu desconto será de 10% \no valor do desconto será de R$" + total * 0.1 + " e o valor final " +
                    "será de " + total * 0.9);
        } else {
            IO.print("\nSeu desconto será de 15% \no valor do desconto será de R$" + total * 0.15 + " e o valor final " +
                    "será de " + total * 0.85);
        }
    }


}
