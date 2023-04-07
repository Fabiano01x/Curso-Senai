import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Conexao {

    private static String url = "jdbc:mysql://localhost:3306/coma_bem";
    private static String user = "developer";
    private static String password = "123456";

    public static Connection getConnection() throws SQLException {
        Connection c = DriverManager.getConnection(url, user, password);
        return c;
    }

    public static Connection closeConnetion() throws SQLException {
        Connection c = getConnection();
        c.close();
        return c;
    }

    public static void inserirProduto(Produtos produtos) throws SQLException {
        getConnection();
        PreparedStatement ps = getConnection().prepareStatement("insert into produtos (PRO_COD, PROD_NOME, PROD_VALOR, PROD_QUANTIDADE, UNIDADE_UNI_COD) values (?, ?, ?, ?, ?)");
        ps.setInt(1, produtos.getProd_cod());
        ps.setString(2, produtos.getProd_nome());
        ps.setDouble(3, produtos.getProd_valor());
        ps.setDouble(4, produtos.getProd_quantidade());
        ps.setInt(5, produtos.getUni_cd());
        ps.executeUpdate();
        ps.close();
        closeConnetion();
    }

    public static void excluirProduto(Integer PRO_COD) throws SQLException {
        getConnection();
        PreparedStatement ps = getConnection().prepareStatement("delete from produtos where (PRO_COD = ?) ");
        ps.setInt(1, PRO_COD);
        ps.executeUpdate();
        ps.close();
        closeConnetion();
    }

    public static List<Produtos> updateProduto(Produtos p, Integer pro_cod) throws SQLException {
        getConnection();
        PreparedStatement ps = getConnection().prepareStatement("update produtos set PROD_NOME = ?, PROD_VALOR = ?, PROD_QUANTIDADE = ?, UNIDADE_UNI_COD = ? where (PRO_COD = ?)");
        ps.setString(1, p.getProd_nome());
        ps.setDouble(2, p.getProd_valor());
        ps.setDouble(3, p.getProd_quantidade());
        ps.setDouble(4, p.getProd_quantidade());
        ps.setInt(5, pro_cod);
        ps.executeUpdate();
        ps.close();
        closeConnetion();

        return consulta();
    }

    public static List<Produtos> consulta() throws SQLException {
        getConnection();
        List<Produtos> list = new ArrayList<>();
        PreparedStatement ps = getConnection().prepareStatement("select * from produtos");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Produtos produtos = new Produtos(rs.getInt("PRO_COD"), rs.getString("PROD_NOME"), rs.getDouble("PROD_VALOR"), rs.getDouble("PROD_QUANTIDADE"), rs.getInt("UNIDADE_UNI_COD"));
            list.add(produtos);
        }
        return list;
    }
}
