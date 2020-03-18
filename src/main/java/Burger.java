public class Burger {
    private String pão;
    private String carne;
    protected double preco = 20;
    private int contaItem;

    public Burger(){
    }

    public Burger(String pão, String carne) {
        this.pão = pão;
        this.carne = carne;


    }

    public int getContaItem() {
        return contaItem;
    }

    public void setContaItem(int contaItem) {
        this.contaItem = contaItem;
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

    public String getPreco() {
        return "Preço total do lanche: R$ " + preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adicionaItem(String item) {
        if (contaItem < 4) {
            this.preco += 2;
            this.contaItem += 1;
            System.out.println(item + " adicionado ao seu lanche por um acréscimo de R$ 2.0");

        } else
            System.out.println("Você não pode mais adicionar itens ao seu lanche");
    }


}