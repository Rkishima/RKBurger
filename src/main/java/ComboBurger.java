public class ComboBurger extends Burger {
    public ComboBurger(String pão, String carne) {
        super(pão, carne);

        super.preco = 28;

    }

    @Override
    public void adicionaItem(String item){
        System.out.println("Você não pode adicionar itens ao Combo Burger");
    }
}
