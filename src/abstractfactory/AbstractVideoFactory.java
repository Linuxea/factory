package abstractfactory;


/**
 * 抽象视频工厂
 * 包括整个产品家族
 * 增加新的产品族非常方便
 * 增加新的产品等级比较麻烦(违背开闭原则)
 */
public abstract class AbstractVideoFactory {

    /**
     * 获取视频
     * @return  {@link Video}
     */
    public abstract Video getVideo();


    /**
     * 获取文章
     * @return {@link Article}
     */
    public abstract Article getArticle();

}
