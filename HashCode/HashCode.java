public class HashCode {
    public static void main(String[] args){
        Client c1 = new Client("Maria", "maria@email.com");
        Client c2 = new Client("Maria", "maria@email.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
    }
}

class Client {
    private String name;
    private String email;

    public Client(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    // Implementação do Hash Code
    @Override
    public int hashCode() {
        final int prime = 31; // Número primo para calcular o hash code
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode()); // Calcula o hash code do nome
        result = prime * result + ((name == null) ? 0 : name.hashCode()); // Calcula o hash code do nome
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // Verifica se os objetos são iguais
            return true;
        if (obj == null) // Verifica se o objeto é nulo
            return false;
        if (getClass() != obj.getClass()) // Verifica se os objetos são da mesma classe
            return false;
        Client other = (Client) obj; // Faz o cast do objeto para Client
        if (email == null) { // Verifica se o nome é nulo
            if (other.email != null) // Se o nome for nulo, verifica se o outro nome também é nulo
                return false;
        } else if (!email.equals(other.email)) // Verifica se os nomes são iguais
            return false;
        if (name == null) { // Verifica se o nome é nulo
            if (other.name != null) // Se o nome for nulo, verifica se o outro nome também é nulo
                return false;
        } else if (!name.equals(other.name)) // Verifica se os nomes são iguais
            return false;
        return true; // Retorna true se os objetos forem iguais
    }
}
