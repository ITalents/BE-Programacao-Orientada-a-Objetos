public class ExemploExcecaoPersonalizada {
    public static void main(String[] args) {
        try {
            cadastrarUsuario("Leo", -45);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro ao cadastrar Usuario: "+e.getMessage());
        }
    }

    public static void cadastrarUsuario(String nome, int idade) throws IdadeInvalidaException{
        if(idade < 0){
            throw new IdadeInvalidaException("A idade precisa ser entre 0 e 100....");
        }

        System.out.println("Usuario cadastrado: "+nome+", "+idade+" anos");
    }
}
