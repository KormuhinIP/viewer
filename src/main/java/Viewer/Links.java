package Viewer;



import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service
public class Links {

    HashMap<String,String> links=new HashMap<>();

    public HashMap<String,String> list(){
                links.put("https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods/2890283-apex-shaders", "div.p-comment-notes");   //Apex
                links.put("https://johanfossum.wixsite.com/arcane-shaders/download", "h2.font_2"); //Arcane
                links.put("http://bitslablab.wixsite.com/main/bsl-shaders", "p:containsOwn(update)");  //BSL
                links.put("https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods/1293898-chocapic13s-shaders", "div.p-comment-notes");  //Chocapic13
                links.put("https://continuum.graphics/continuum-download", "main#page");//Continuum
                links.put("https://jotunstudios.com/dragon/index.php", "h1");//Dragon
                links.put("https://jotunstudios.com/dragon/index.php", "h1");//Dragon
        return links;
    }
}
