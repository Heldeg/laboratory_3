package pizzafm;


public class PaisaPizzasStore  extends PizzaStore{

    @Override
    Pizza createPizza(String item) {
        if(item.equals("Hawaiana")){
            return new PaisaPizzasStyleHawaiana();
        }else if (item.equals("Mexicana")){
            return new PaisaPizzasStyleMexicana();
        }else{
            return null;
        }
    }
}
