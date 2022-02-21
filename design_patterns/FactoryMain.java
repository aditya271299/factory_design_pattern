package design_patterns;
interface OS{
    public void spec();

}
public class FactoryMain {
    public static void main(String[] args) {
        //OS obj = new Android();
        //OS obj = new IOS();
        //OS obj = new Windows();
        OSFactory osf = new OSFactory();
        OS obj = osf.getInfo("edu");
        obj.spec();
        }

    }
