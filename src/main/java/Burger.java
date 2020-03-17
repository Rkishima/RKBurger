public class Burger {
    private String pão;
    private String carne;
    private String alface;
    private String tomate;
    private String queijo;
    private String bacon;
    private String pepino;
    private String cebolaRoxa;
    private String maioneseDaCasa;
    private String pepperoni;
    private double preco = 20;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getPão() {
        return pão;
    }

    public void setPão(String pão) {
        this.pão = pão;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;

    }

    public String getAlface() {
        return alface;
    }

    public void setAlface(String alface) {
        this.alface = alface;
        this.preco += 2;
    }

    public String getTomate() {
        return tomate;
    }

    public void setTomate(String tomate) {
        this.tomate = tomate;
        this.preco += 2;

    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
        this.preco += 2;

    }

    public String getBacon() {
        return bacon;
    }

    public void setBacon(String bacon) {
        this.bacon = bacon;
        this.preco += 2;

    }

    public String getPepino() {
        return pepino;
    }

    public void setPepino(String pepino) {
        this.pepino = pepino;
        this.preco += 2;

    }

    public String getCebolaRoxa() {
        return cebolaRoxa;
    }

    public void setCebolaRoxa(String cebolaRoxa) {
        this.cebolaRoxa = cebolaRoxa;
        this.preco += 2;

    }

    public String getMaioneseDaCasa() {
        return maioneseDaCasa;
    }

    public void setMaioneseDaCasa(String maioneseDaCasa) {
        this.maioneseDaCasa = maioneseDaCasa;
        this.preco += 2;

    }

    public String getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(String pepperoni) {
        this.pepperoni = pepperoni;
        this.preco += 2;

    }
}
