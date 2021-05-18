import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DataStorageManager {
    
    private String data;

    public Object dispatch(String[] message){
        if(message[0] == "init"){
            init(message);
        }
        if(message[0] == "words"){
            words();
        }else{
            return null;
        }

        return null;
    } 

    private void init(String[] message){
        Pattern pattern;

        //Concatenando string data com array recebido
        for(int i = 0; i < message.length; i++){
            data = data + message[i];
        }
        pattern = Pattern.compile("^[A-Za-z0-9]*\\d+[A-Za-z0-9]*$");
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
