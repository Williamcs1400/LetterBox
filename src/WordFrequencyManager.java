public class WordFrequencyManager {

    private Object storage_manager;
    private Object stop_word_manager;
    private Object word_freq_manager;

    public Object dispatch(String[] message){
        if(message[0] == "init"){
            init(message[1]);
        }
        else if(message[0] == "run"){
            run();
        }else{
            return null;
        }
        return null;
    }

    private void init(String pathToFile){
        storage_manager = DataStorageManager();
        stop_word_manager = StopWordManager();
        word_freq_manager = WordFrequencyManager();
        storage_manager.dispatch(['init', pathToFile])
        stop_word_manager.dispatch(['init'])
    }

    private void run(){
        while(Object w == storage_manager.dispatch(['words'])){
            if(!stop_word_manager.dispatch(['is_stop_word', w])){
                word_freq_manager.dispatch(['increment_count', w]);
            }
        }
        word_freqs = self._word_freq_manager.dispatch(['sorted'])
        Object c;
        for(int i = 0; i < 25; i++){
            if(w == word_freqs[i] || c == word_freqs[i]){
                System.out.println(w + "-" + c);
            }
        }
    }
}
