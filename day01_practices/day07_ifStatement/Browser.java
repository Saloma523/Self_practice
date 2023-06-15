package day07_ifStatement;

public class Browser {
    public static void main(String[] args) {
        String browser = "safari";
        String browser1 = "chrome";
        String browser2 = "firefox";
        String browser3 = "opera";
        String browser4 = "safari";
        String browser5 = "edge";

        if(browser == browser1 || browser == browser2 || browser == browser3 || browser ==  browser4 ||browser == browser5){
            if(browser == browser1){
                System.out.println("chrome browser is selected");
            }else if(browser == browser2){
                System.out.println("firefox browser is selected");
            }else if(browser == browser3){
                System.out.println("opera browser is selected");
            }else if(browser == browser4){
                System.out.println("safari browser is selected");
            }else{
                System.out.println("edge browser is selected");
            }

        }else{
            System.out.println("Invalid browser name");
        }
    }
    /*
    2. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
     */
}
