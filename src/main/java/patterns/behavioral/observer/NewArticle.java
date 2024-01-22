package patterns.behavioral.observer;

public class NewArticle {

    private String articleTitle;
    private String newArticle;

    public NewArticle(String articleTitle, String newArticle) {
        this.articleTitle = articleTitle;
        this.newArticle = newArticle;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getNewArticle() {
        return newArticle;
    }
}
