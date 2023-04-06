public class Main {

    public static void main(String[] args) {

        Unidades u1 = new Unidades(1, "Kilo");
        Produtos p1 = new Produtos(2, "Carne", 30.00, 2.0, u1);


        System.out.println(p1.toString());

    }

}
