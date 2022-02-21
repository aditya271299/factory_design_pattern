package design_patterns;

public class OSFactory {
    public OS getInfo(String str){
        if (str.equals("open")){
            return new Android();
        }
        else if(str.equals("close")){
            return new IOS();
        }
        else
            return new Windows();
    }
}
