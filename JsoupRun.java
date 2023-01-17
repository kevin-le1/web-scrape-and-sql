import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;


public class JsoupRun {
    public static void main(String[]args)  {
        try {
            Document doc = Jsoup.connect("https://www.imdb.com/chart/top").timeout(6000).get();
            Elements elements = doc.select("tbody.lister-list");
            // System.out.println(elements.select("tr".size());
            int x = 1;
            for (Element element : elements.select("tr")) {
                System.out.println(x +")");
                String img = element.select("td.posterColumn img").attr("src");
                System.out.println(img);
                String title = element.select("td.posterColumn img").attr("alt");
                System.out.println(title);
                String year = element.select("td.titleColumn span.secondaryInfo").text().replaceAll("[^\\d]", "");
                System.out.println(year);
                String rating = element.select("td.ratingColumn.imdbRating").text().trim();
                System.out.println(rating);
                System.out.println();
                x++;
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
