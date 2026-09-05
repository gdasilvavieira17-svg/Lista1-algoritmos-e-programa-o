//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    float preco;
    System.out.print("qual o preço do produto? ");
    preco = input.nextFloat();
    System.out.println("o preço do seu produto com 10% de desconto é: " + preco * 0.9);
}
