import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        // Instânciação de um novo produto para ser testado conforme os métodos a seguir
        Produtos produtos = new Produtos(6, "Feijão", 20.00, 2.0, 1);


        // Consulta
        //System.out.println(Conexao.consulta().toString());

        // Inserir Produto

        //Conexao.inserirProduto(produtos);

        // Excluir Produto
        //Conexao.excluirProduto(6);

        // Alterar Produto
        System.out.println(Conexao.updateProduto(produtos, 6));

    }

}
