package frete;

public class Configuracao {

    private Configuracao() {};
    private static Configuracao instance = new Configuracao();
    public static Configuracao getInstance() {
        return instance;
    }

    private String nomeLoja;
    private float taxaCombustivel;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public float getTaxaCombustivel() {
        return taxaCombustivel;
    }

    public void setTaxaCombustivel(float taxaCombustivel) {
        this.taxaCombustivel = taxaCombustivel;
    }
}
