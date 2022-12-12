package factorymethod;

public class PythonVideoFactory extends AbstractVideoFactory{


    @Override
    public Video generate() {
        return new PythonVideo();
    }
}
