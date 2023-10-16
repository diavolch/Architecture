package ModelElements;

public class ModelStore {
    public PoligonalModel Models;
    public Scene Scenes;
    public Flash Flashes;
    public Camera Cameras;
    public IModelChangeObserver changeObservers;


    public void GetScena(int i) { }
    public void NotifyChange(IModelChanger) { }


}
