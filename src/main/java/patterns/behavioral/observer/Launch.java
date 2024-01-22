package patterns.behavioral.observer;

public class Launch {

    public static void main(String[] args) {
        // Создание новостного портала
        NewsPortal newsPortal = new NewsPortal();

        // Создание и добавление пользователей-наблюдателей
        Subscribers user1 = new Subscribers("User1");
        Subscribers user2 = new Subscribers("User2");

        newsPortal.addObserver(user1);
        newsPortal.addObserver(user2);
        newsPortal.deleteObserver(user2);

        // Добавление новостей на портал
        NewArticle article1 = new NewArticle("Заголовок статьи 1", "Содержание статьи 1");
        NewArticle article2 = new NewArticle("Заголовок статьи 2", "Содержание статьи 2");

        newsPortal.addNews(article1);
        newsPortal.addNews(article2);
    }
}
