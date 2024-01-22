package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPortal {

    public List<NewArticle> newArticleList = new ArrayList<>();
    public List<Observation> subscribersList = new ArrayList<>();


    public void addNews(NewArticle newArticle) {
        newArticleList.add(newArticle);
        notifyAllObservers(newArticle);
    }

    public void addObserver(Observation user) {
        subscribersList.add(user);
    }

    public void deleteObserver(Observation user) {
        subscribersList.remove(user);
    }

    public void notifyAllObservers(NewArticle newArticle) {
        for (Observation subscribers : subscribersList) {
            subscribers.getNewArticle(newArticle);
        }
    }
}
