import java.util.ArrayList;
import java.util.List;

public class DataStorageManager {
    
    private String data;

    public String dispatch(String[] message){
        if(message[0] == "init"){
            init(message);
        }
        if(message[0] == "words"){
            words();
        }else{
            
        }

        return null;
    } 

    private void init(String[] message){
        String pattern;

        //Concatenando string data com array recebido
        for(int i = 0; i < message.length; i++){
            data = data + message[i];
        }
        pattern = "[\\w_]+";
        data = pattern + data.toLowerCase();
        
    }

    private List<Character> words(){
        List<Character> listTemp = new ArrayList<>();
        String dataTemp = "" + data;

        //Transfora string em uma lista 
        for(int i = 0; i < dataTemp.length(); i++){
            listTemp.add(i, dataTemp.charAt(i));
        }

        return listTemp;
        
    }

}
