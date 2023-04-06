public class Unidades {

    private Integer uni_cod;
    private String uni_medida;

    public Unidades() {
    }

    public Unidades(Integer uni_cod, String uni_medida) {
        setUni_cod(uni_cod);
        setUni_medida(uni_medida);
    }

    public Integer getUni_cod() {
        return uni_cod;
    }

    public void setUni_cod(Integer uni_cod) {
        this.uni_cod = uni_cod;
    }

    public String getUni_medida() {
        return uni_medida;
    }

    public void setUni_medida(String uni_medida) {
        this.uni_medida = uni_medida;
    }

}

