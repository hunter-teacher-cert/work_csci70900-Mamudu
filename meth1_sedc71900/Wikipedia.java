import java.io.*;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * A simple example, used on the jsoup website.
 */
public class Wikipedia {
    public static void main(String[] args) throws IOException {
      //creates Document object which stores website address
        //.connect part of Jsoup to establish connection
        //.get method to use with Document class
        Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
        log(doc.title()); // prints out title of website

        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
            log("%s\n\t%s", headline.attr("title"), headline.absUrl("href"));
        }
    }
      // prints out stuff
    private static void log(String msg, String... vals) {
        System.out.println(String.format(msg, vals));
    }
}