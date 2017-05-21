package Adapter;

//this is adapter
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }
    
    public void printWeak() {
        showWithParen();
    }
    public void printStrong() {
        showWithAster();
    }
}
/* or can be writed like this
public class PrintBanner implements Print {
    private Banner banner=new Banner();
    
    public void printWeak() {
        banner.showWithParen();
    }
    public void printStrong() {
        banner.showWithAster();
    }
}
*/
