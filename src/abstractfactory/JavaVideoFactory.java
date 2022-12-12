package abstractfactory;

public class JavaVideoFactory extends AbstractVideoFactory{

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
