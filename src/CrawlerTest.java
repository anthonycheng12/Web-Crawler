import java.util.Scanner;

public class CrawlerTest {

    public static void main(String[] args) {
        Crawler webCrawler = new Crawler();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the url you want to search: ");
        String url = scanner.nextLine();
        System.out.println("Enter the keyword you want to search");
        String keyword = scanner.nextLine();
        webCrawler.search(url, keyword);
    }
}
