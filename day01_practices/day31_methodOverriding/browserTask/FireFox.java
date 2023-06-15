package day31_methodOverriding.browserTask;

public class FireFox extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing firefox browser");
    }



    public static void main(String[] args) {
        FireFox obj = new FireFox();

        obj.closeBrowser();
        obj.openBrowser();
    }
}
