public class BigBurger extends Burger{
    private int contaItemExtra;



    public BigBurger(String pão, String carne) {
        super(pão, carne);
    }

    @Override
    public void adicionaItem(String item){
        if (contaItemExtra < 6){
            contaItemExtra += 1;
            super.preco += 2;
            System.out.println(item + " adicionado ao seu lanche por um acréscimo de R$ 2.0");
        } else
            System.out.println("Você não pode mais adicionar itens ao seu lanche");
    }




}
