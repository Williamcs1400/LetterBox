public class WordsFreq {

    private String word;
    private int cont;

    public WordsFreq(){

    }
    
    public void setWord(String word){
        this.word = word;
    }
    
    public String getWord(){
        return this.word;
    }
    
    public void setCont(Int i){
        if(i == 0){
            cont = 1;
        }else{
            cont++;
        }
        
    }
    
    public int getCont(){
        return cont;
    }
}
