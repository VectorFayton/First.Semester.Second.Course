package INF_201_Assignment_4;
interface IHero {
    double getPower();
    double getDefence();
    double getHealth();
}
class HeroComponent implements IHero {
    double health = 100;
    double power = 10.0;
    double defence = 10.0;
    @Override
    public double getPower() {
        return power;
    }

    @Override
    public double getDefence() {
        return defence;
    }

    @Override
    public double getHealth() {
        return health;
    }
}
class HeroDecorator implements IHero {
    private HeroComponent component;
    @Override
    public double getPower() {
        return component.getPower();
    }
    @Override
    public double getDefence() {
        return component.getDefence();
    }
    @Override
    public double getHealth() {
        return component.getHealth();
    }
}
class DoubleDecorator extends HeroDecorator {
    public DoubleDecorator(IHero hero){
        
    }
}
public class Main {
}
