package abstractfactory;

public class AbstractVideoFactoryClient {

    public static void main(String[] args) {

        // 归属同个 java 产品族
        AbstractVideoFactory javaVideoFactory = new JavaVideoFactory();
        Video javaVideo = javaVideoFactory.getVideo();
        javaVideo.play();
        Article javaArticle = javaVideoFactory.getArticle();
        javaArticle.read();

        // 归属同个 python 产品族
        AbstractVideoFactory pythonVideoFactory = new PythonVideoFactory();
        Video pythonVideo = pythonVideoFactory.getVideo();
        pythonVideo.play();
        Article pythonArticle = pythonVideoFactory.getArticle();
        pythonArticle.read();


    }

}
