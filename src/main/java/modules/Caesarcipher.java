package modules;

public class Caesarcipher {
    private String pText;
    private int key;

    public Caesarcipher(String pText, int Key) {
        this.pText = pText;
        this.key = key;
    }
    public String getPText(){
        return this.pText;
    }
    public int getKey(){
        return this.key;
    }
}
