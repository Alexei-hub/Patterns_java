package patterns.behavioral.observer;

public class Subscribers implements Observation {

    private String subscriberName;

    public Subscribers(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void getNewArticle(NewArticle newArticle) {
        System.out.println("Log message for " + subscriberName + ".New article added: " + newArticle.getArticleTitle());
    }
}
