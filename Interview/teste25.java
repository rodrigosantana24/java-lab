import java.util.Scanner;

class Teste25{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a quantidade do produto: ");
        int estoque = scanner.nextInt();

        Produto prod = new Produto(nome, estoque);

        while (true){
            System.out.println("\n 1- Entrada");
            System.out.println("2- Saída");
            System.out.println("3- Consultar");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch(opcao){
                case 1 -> {
                    System.out.print("Quantidade a ser adicionada ao estoque: ");
                    prod.adicionarEstoque(scanner.nextInt());
                }
                
                case 2 -> {
                    System.out.print("Quantidade a ser retirada do estoque: ");
                    prod.retiradaEstoque(scanner.nextInt());

                }

                case 3 -> {
                    prod.toString();
                }

                case 4 -> { 
                    System.out.println("Encerrando programa...");
                    break; 
                }

                default -> System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}

class Produto{
    private String nome;
    private Integer estoque;

    public Produto(){
    }

    public Produto(String nome, Integer estoque){
        this.nome = nome;
        this.estoque = estoque;
    }

    public String getName(){
        return nome;
    }

    public void setName(String novoNome){
        this.nome = novoNome;
    }

    public Integer getEstoque(){
        return estoque;
    }

    public void adicionarEstoque(Integer quantidade){
        if(quantidade > 0){
            this.estoque += quantidade;
        }
        else {
            System.out.println("Quantidade inválida.");
        }
    }

    public void retiradaEstoque(Integer quantidade){
        if(quantidade > 0 && quantidade <= estoque){
            this.estoque -= quantidade;
        }
        else {
            System.out.println("Estoque insuficiente.");
        }
    }

    @Override
    public String toString(){
        return "Nome do produto: " + nome + ", Quantidade: " + estoque;
    }
}