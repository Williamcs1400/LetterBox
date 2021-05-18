import java.util.ArrayList;
import java.util.List;

public class WordFrequencyController {

    WordsFreq wf;
    List<WordsFreq> words = new ArrayList<>();
    String word;

    public Object dispatch(String[] message){
        if(message[0] == "increment_count"){
            init();
        }
        if(message[0] == "sorted"){
            return inStopWorls(message[1]);
        }else{
            return null;
        }
    }

    private void init(){
        wf = new WordsFreq();
        if (words.equals(word)){
            wf.setWord(word);
            wf.setCont(1);
        }
        else{
            wf.setCont(0);
        }

    }

    private sorted(){
        return sorted(self._word_freqs.items(), key=operator.itemgetter(1), reverse=True);
    }
    
}
