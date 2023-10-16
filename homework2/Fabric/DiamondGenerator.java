package Fabric;

public class DiamondGenerator extends ItemFabric{
    @Override
    public IGameItem createItem() {
        System.out.println("Cоздали сундук(алмазы)");
        return new DiamondReward();
    }
}
