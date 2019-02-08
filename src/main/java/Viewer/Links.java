package Viewer;



import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;


@Service
public class Links {


    HashMap<String,String> links=new HashMap<>();

    public HashMap<String,String> list(){
                links.put("https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods/2890283-apex-shaders","div.p-comment-notes");   //Apex
                links.put("https://johanfossum.wixsite.com/arcane-shaders/download", "h2.font_2"); //Arcane
                links.put("http://bitslablab.wixsite.com/main/bsl-shaders", "p:containsOwn(update)");  //BSL
                links.put("https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods/1293898-chocapic13s-shaders", "div.p-comment-notes");  //Chocapic13
                links.put("https://continuum.graphics/continuum-download", "main#page");//Continuum
                links.put("https://jotunstudios.com/dragon/index.php", "h1");//Dragon
                links.put("https://forum.paradox.network/d/9-kuda-shaders", "blockquote.uncited");//KUDA
                links.put("https://oceanodev.wixsite.com/oceano", "span");//Oceano
                links.put("https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods" +
                        "/1280299-sonic-ethers-unbelievable-shaders-compatible-with", "div.p-comment-notes");   //SEUS
                links.put("https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods" +
                        "/1291396-1-6-4-1-13-2-sildurs-shaders-pc-mac-intel-vibrant", "h2");   //Vibrant shaders
                links.put("https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods" +
                        "/2683151-sushi-shader-chocapic13-shaders-edit", "div.p-comment-notes");   //Sushi
                links.put("https://johanfossum.wixsite.com/trilitons-shaders", "h6");   //Trilitons
                links.put("https://qionouu.cn/wisdom.html", "h3.detail-h3.am-panel-hd");   //Wisdom
                links.put("https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods" +
                        "/2778752-builders-quality-of-life-shaders", "div.p-comment-notes");   //QOL
                links.put("https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods" +
                        "/2876807-molly-shader-pack-version-3-0-updated-5-10-18", "div.p-comment-notes");   //Molly
                links.put("https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/" +
                        "resource-packs/1243257-128x64-chroma-hills-rpg-cartoon-1-13-v2-huge", "div.p-comment-notes");   //Chromahills

        return links;
    }
}
