package src.entities;

import src.interfaces.INews;

public class News implements INews {
    private String id;
    private String title;
    private String publicDate;
    private String author;
    private String content;
    private float averageRate;

    public News() {}

    public News(String id, String title, String publicDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publicDate = publicDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(float averageRate) {
        this.averageRate = averageRate;
    }

    @Override
    public void display() {
        System.out.printf("%10s %10s %10s %10s %.1", title, publicDate, author, content, averageRate);
    }

    @Override
    public float calculate(float[] rates) {
        return (rates[0] + rates[1] + rates[2]) / 3;
    }
}
