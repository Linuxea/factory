package factorymethod;

public abstract class AbstractVideoFactory {

    /**
     * 抽象生产 video
     * @return {@link Video}
     */
    public abstract Video generate();

}
