public class CrawlerTest {

    public static void main(String[] args) {
        Crawler webCrawler = new Crawler();
        webCrawler.search("https://www.nba.com/", "lebron");
    }
}
