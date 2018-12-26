package projekt1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class HTMLReader {
    public void loadData(File folder, Judgements judgements, Judges judges, Regulations regList){
        for(final File fileEntry : folder.listFiles()){
            if(fileEntry.isDirectory()){
                loadData(fileEntry, judgements, judges, regList);
            }
            else{
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Document page = Jsoup.parse(fileEntry, "UTF-8", "");
                    Element title = page.select("title").first();
                    String signatureToExtract = title.text();
                    String signature = signatureToExtract.substring(0, signatureToExtract.indexOf("-")-1);
Element table = page.select("table").get(4);
                }catch(IOException e){
                    e.printStackTrace();
                }
                }
            }
        }
    }

