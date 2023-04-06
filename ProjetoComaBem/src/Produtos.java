public class Produtos   {
    private Integer prod_cod;
    private String prod_nome;
    private Double prod_valor;
    private Double prod_quantidade;
    private Unidades uni_cod;

    public Produtos() {
    }

    public Produtos(Integer prod_cod, String prod_nome, Double prod_valor, Double prod_quantidade, Unidades uni_cod) {
        setProd_cod(prod_cod);
        setProd_nome(prod_nome);
        setProd_valor(prod_valor);
        setProd_quantidade(prod_quantidade);
        setUni_cod(uni_cod);
    }

    public Integer getProd_cod() {
        return prod_cod;
    }

    public void setProd_cod(Integer prod_cod) {
        this.prod_cod = prod_cod;
    }

    public String getProd_nome() {
        return prod_nome;
    }

    public void setProd_nome(String prod_nome) {
        this.prod_nome = prod_nome;
    }

    public Double getProd_valor() {
        return prod_valor;
    }

    public void setProd_valor(Double prod_valor) {
        this.prod_valor = prod_valor;
    }

    public Double getProd_quantidade() {
        return prod_quantidade;
    }

    public void setProd_quantidade(Double prod_quantidade) {
        this.prod_quantidade = prod_quantidade;
    }

    public Unidades getUni_cod() {
        return uni_cod;
    }

    public void setUni_cod(Unidades uni_cod) {
        this.uni_cod = uni_cod;
    }

    @Override
    public String toString() {
        return "O produto cadastrado é: \n" +
                "Código do produto: " + prod_cod +
                "\nNome do produto: " + prod_nome +
                "\nValor: " + prod_valor +
                "\nQuantidade: " + prod_quantidade +
                "\nMedida: " + uni_cod.getUni_medida();
    }
}
