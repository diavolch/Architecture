package Fabric;

public class StoneGenerator extends ItemFabric{
    @Override
    public IGameItem createItem() {
        System.out.println("Создали сундук(камни)");
        return new StoneReward();
    }
}
