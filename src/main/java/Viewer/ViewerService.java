package Viewer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;


@Service
public class ViewerService {

    private ArrayList<String> mesageNull=new ArrayList<String>();
    public ArrayList<String> getMesageNull() {
        return mesageNull;
    }


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
         }else{
             mesageNull.add(link);
         }
         return date;
     }

}
