package Viewer;




import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service
public class Links {

    HashMap<String, String> links = new HashMap<String, String>();

    public HashMap<String,String> list(){


        links.put("APEX https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods/2890283-apex-shaders","div.p-comment-notes");   //Apex
                links.put("ARCANE https://johanfossum.wixsite.com/arcane-shaders/download", "h2.font_2"); //Arcane
                links.put("BSL http://bitslablab.wixsite.com/main/bsl-shaders", "p:containsOwn(update)");  //BSL
                links.put("CHOCAPIC13 https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods/1293898-chocapic13s-shaders", "div.p-comment-notes");  //Chocapic13
                links.put("CONTINUUM https://continuum.graphics/continuum-download", "main#page");//Continuum
                links.put("DRAGON https://jotunstudios.com/dragon/index.php", "h1");//Dragon
                links.put("KUDA https://forum.paradox.network/d/9-kuda-shaders", "blockquote.uncited");//KUDA
                links.put("OCEANO https://oceanodev.wixsite.com/oceano", "span");//Oceano
                links.put("SEUS https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods" +
                        "/1280299-sonic-ethers-unbelievable-shaders-compatible-with", "div.p-comment-notes");   //SEUS
                links.put("VIBRANT https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods" +
                        "/1291396-1-6-4-1-13-2-sildurs-shaders-pc-mac-intel-vibrant", "h2");   //Vibrant shaders
                links.put("SUSHI https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods" +
                        "/2683151-sushi-shader-chocapic13-shaders-edit", "div.p-comment-notes");   //Sushi
                links.put("TRILITONS https://johanfossum.wixsite.com/trilitons-shaders", "h6");   //Trilitons
                links.put("WISDOM https://qionouu.cn/wisdom.html", "h3.detail-h3.am-panel-hd");   //Wisdom
                links.put("QOL https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods" +
                        "/2778752-builders-quality-of-life-shaders", "div.p-comment-notes");   //QOL
                links.put("MOLLY https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods" +
                        "/2876807-molly-shader-pack-version-3-0-updated-5-10-18", "div.p-comment-notes");   //Molly
                links.put("CHROMAHILLS https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/" +
                        "resource-packs/1243257-128x64-chroma-hills-rpg-cartoon-1-13-v2-huge", "div.p-comment-notes");   //Chromahills
             //   links.put("VOID https://voidshader.weebly.com/","span#wsite-title"); //VOID                                           //This site blocked in my country
                links.put("EBIN https://shaders.fandom.com/wiki/Shader_Packs","tr:contains(Ebin)"); //Ebin
                links.put("HALCYON https://shaders.fandom.com/wiki/Shader_Packs","tr:contains(Halcyon)"); //Halcyon
                links.put("MAGNIFICENT https://shaders.fandom.com/wiki/Shader_Packs","tr:contains(Magnificent)"); //Magnificent
                links.put("ROBOBO1221 https://shaders.fandom.com/wiki/Shader_Packs","tr:contains(Robobo1221)"); //Robobo1221
                links.put("SPECTRUM https://shaders.fandom.com/wiki/Shader_Packs","tr:contains(Spectrum)"); //Spectrum

        return links;
    }
}
