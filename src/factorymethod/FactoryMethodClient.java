package factorymethod;

public class FactoryMethodClient {


    public static void main(String[] args) {

        AbstractVideoFactory javaVideFactory = new JavaVideoFactory();
        // java
        Video javaVideo = play(javaVideFactory);
        javaVideo.play();

        // python
        AbstractVideoFactory pythonVideoFactory = new PythonVideoFactory();
        Video pythonVideo = play(pythonVideoFactory);
        pythonVideo.play();


    }

    public static Video play(AbstractVideoFactory abstractVideoFactory){
        return abstractVideoFactory.generate();
    }

}
