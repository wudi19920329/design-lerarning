package pattern.structural.proxy.simple01;

/**
 * @author wudih
 * @date 2019/3/29 14:00
 * @since master
 */
public class SearchProxy implements Searcher {
    private AccessValidator accessValidator = new AccessValidator();
    private Logger logger = new Logger();
    private Searcher searcher = new RealSearcher();

    @Override
    public String search(String userId, String keywords) {
        if (accessValidator.validate(userId)) {
            String result = searcher.search(userId, keywords);
            logger.log(userId);
            return result;
        }
        return null;
    }
}
