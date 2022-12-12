package factorymethod;

public class JavaVideoFactory extends AbstractVideoFactory{


    @Override
    public Video generate() {
        return new JavaVideo();
    }
}
