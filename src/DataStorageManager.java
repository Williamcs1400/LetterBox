import java.util.ArrayList;
import java.util.List;

public class DataStorageManager {
    
    private String data;

    public String dispatch(String[] message){
        if(message[0] == "init"){
            init();
        }
        if(message[0] == "words"){
            words();
        }else{
            
        }

        return null;
    } 

    private void init( ){

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
