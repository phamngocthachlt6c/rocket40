package src.frontend;

import src.entities.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 extends Question {
    private List<News> newsList = new ArrayList();
    public void doQuestion1() {
        Scanner scanner = new Scanner(System.in);
        int option = 4;
        do {
            System.out.println("Please choose your option:");
            System.out.println("1: Insert News");
            System.out.println("2: View list News");
            System.out.println("3: Average rate");
            System.out.println("4: Exit");
            System.out.print(">");
            option = scanner.nextInt();
            scanner.nextLine();
            if(option <= 1 || option >= 4) {
                break;
            }
            switch (option) {
                case 1:
                    insertNews(scanner);
                    break;
                case 2:
                    for(News news : newsList) {
                        news.display();
                    }
                    break;
                case 3:
                    float sum = 0;
                    for(News news : newsList) {
                        sum += news.getAverageRate();
                    }
                    System.out.printf("Average rate: %.1f", (sum / newsList.size()));
                    break;
            }
        } while(true);
    }

    private void insertNews(Scanner scanner) {
//        Scanner scanner1 = new Scanner(System.in);
        News news = new News();
        System.out.print("Input title:\n>");
        String title = scanner.nextLine();
        news.setTitle(title);
        System.out.print("Input public date:\n>");
        String publicDate = scanner.nextLine();
        news.setPublicDate(publicDate);
        System.out.print("Input author:\n>");
        String author = scanner.nextLine();
        news.setAuthor(author);
        System.out.print("Input content:\n>");
        String content = scanner.nextLine();
        news.setContent(content);
        System.out.print("Input 3 rates (separated by spaces):\n>");
        float[] rates = new float[3];
        for(int index = 0; index < 3; index ++) {
            rates[index] = scanner.nextFloat();
        }
        news.setAverageRate(news.calculate(rates));
        newsList.add(news);
    }
}
