package Viewer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class ViewerService {

     public String getDate(String link, String query)  {
         String date="";

         Document document= null;
         try {
             document = Jsoup.connect(link).get();
         } catch (IOException e) {
             e.printStackTrace();
         }
        Element element=document.select(query).first();
         if (element!=null){
             date=element.text();
         }else
             System.out.println("Элемент не найден. Смотри сайт.....");

         return date;
     }

}
