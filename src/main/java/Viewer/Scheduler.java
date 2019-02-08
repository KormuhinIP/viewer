package Viewer;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class Scheduler implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
private Links links ;
    @Autowired
    private ViewerService viewerService;

    HashMap<String, String> oldData = new HashMap<String, String>();
    HashMap<String, String> newData = new HashMap<String, String>();

    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        for (Map.Entry e : links.list().entrySet()){                                  //add data to the map. Data obtained from links. (At startup)
            String[] link=e.getKey().toString().split(" ");
            oldData.put(e.getKey().toString(),viewerService.getDate(link[1],e.getValue().toString()));
        }
    }


  @Scheduled(cron = "*/30 * * * * *")   //cron = "0 00 00 */7 * *"
    public void updateSite() {
        newData.clear();
        String mesage="";
      String mesageNull="";
        for(Map.Entry e : links.list().entrySet()){                                     //add data to the map. Data obtained from links. (after 7 days)
            String[] link=e.getKey().toString().split(" ");
            newData.put(e.getKey().toString(),viewerService.getDate(link[1], e.getValue().toString()));
        }
        for (String link: oldData.keySet()){                                           //looking for changes (compare two HashMaps)
                    if (!oldData.get(link).equals(newData.get(link)))
                       mesage=mesage+"\n"+ link;
        }
        if (viewerService.getMesageNull().size()>0){                           //check if there were any refusals to receive data from the link
            for (String m: viewerService.getMesageNull()) {
                mesageNull=mesageNull+"\n"+m;
            }
            mesageNull="The following links failed to retrieve the value: "+mesageNull;
        }
        if (!mesage.equals("")){                                              //check if there were changes on the links
            new EmailUtil().sendMessageAlarm("Hi! Could you look these links. I think, these links have changed."+mesage+"\n"+mesageNull);}
        else new EmailUtil().sendMessageAlarm("Hi! The links are not changed"+"\n"+mesageNull);
       oldData=newData;
       }

}

