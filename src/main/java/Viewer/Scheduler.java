package Viewer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Map;


@Service
public class Scheduler implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
private Links links ;
    @Autowired
    private ViewerService viewerService;

    ArrayList<String>oldDate=new ArrayList<>();
    ArrayList<String>newDate=new ArrayList<>();

    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        for(Map.Entry e : links.list().entrySet()){
            oldDate.add(viewerService.getDate((String) e.getKey(),(String)e.getValue()));
       }
    }

    @Scheduled(cron = "*/10 * * * * *")   //cron = "0 00 00 */7 * *"
    public void updateHashCode() {
        newDate.clear();
        for(Map.Entry e : links.list().entrySet()){
        newDate.add(viewerService.getDate((String) e.getKey(), (String)e.getValue()));
        }
        for (int i = 0; i < newDate.size() ; i++) {
            System.out.println(oldDate.get(i)+"     "+newDate.get(i));
                       if(newDate.get(i).equals(oldDate.get(i)))
            System.out.println("Mesage");
        }
    }

}

