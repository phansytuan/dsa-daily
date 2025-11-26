package DesignPattern;


// 🧩 1. Component
interface Pizza {
    String getDescription();
    double cost();
}

// 🍕 2. Concrete Component
class PlainPizza implements Pizza {

    @Override
    public String getDescription() { return "Plain pizza"; }

    @Override
    public double cost() { return 8.0; } // Base price of the pizza
}



// 🎀 3. Decorator
abstract class PizzaDecorator implements Pizza {

    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {this.decoratedPizza = decoratedPizza;}

    @Override
    public String getDescription() { return decoratedPizza.getDescription(); }

    @Override
    public double cost() { return decoratedPizza.cost(); }
}


// 🧀 4. Concrete Decorator
class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() { return decoratedPizza.getDescription() + ", cheese"; }

    @Override
    public double cost() { return decoratedPizza.cost() + 1.5; } // Cost of cheese topping
}

// 🧀 4. Concrete Decorator
class PepperoniDecorator extends PizzaDecorator {

    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() { return decoratedPizza.getDescription() + ", pepperoni"; }

    @Override
    public double cost() { return decoratedPizza.cost() + 2.0; } // Cost of pepperoni topping
}

// 🧀 4. Concrete Decorator
class MushroomDecorator extends PizzaDecorator {

    public MushroomDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() { return decoratedPizza.getDescription() + ", mushrooms"; }

    @Override
    public double cost() { return decoratedPizza.cost() + 1.0; } // Cost of mushroom topping
}

// 🧀 4. Concrete Decorator
class OliveDecorator extends PizzaDecorator {

    public OliveDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() { return decoratedPizza.getDescription() + ", olives"; }

    @Override
    public double cost() { return decoratedPizza.cost() + 0.75; } // Cost of olive topping
}


// 💻 5. Client
public class DecoratorDP {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new PepperoniDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new OliveDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());
    }
}
