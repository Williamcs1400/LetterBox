import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class StopWordsManager {

    private ArrayList<String> stopWords = new ArrayList<>();

    public Object dispatch(String[] message){
        if(message[0] == "init"){
            init();
        }
        if(message[0] == "words"){
            return inStopWorls(message[1]);
        }else{
            return null;
        }
    }

    private void init(){
        File file = new File("../stop_words.txt");
        String dados = null;
        int contInterno = 0;
        String branco = " ";
        try {
            dados = new String(Files.readAllBytes(file.toPath()));
            for(int i = 0; i < dados.length(); i++){
                if(dados.charAt(i) != branco.charAt(0)){
                    stopWords.add(contInterno, stopWords.get(contInterno) + dados.charAt(i));
                }
                else{
                    contInterno++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean inStopWorls(String word){

        if(!stopWords.isEmpty()){
            for(int i = 0; i < stopWords.size(); i++){
                if(stopWords.get(i).equals(word)){
                    return true;
                }
            }
        }
        
        return false;
    }

}