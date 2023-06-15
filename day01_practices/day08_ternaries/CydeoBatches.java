package day08_ternaries;

public class CydeoBatches {
    public static void main(String[] args) {
        String batch = "EU";

        String result = "";
        if(batch == "US morning"){
            result = "Class times are 10-5 EST. M, T, Th, F.";
        }else if(batch == "US evening"){
            result = "Class times are 7-10 EST. M, T, W, Th, S, S";
        }else if(batch == "EU"){
            result = "Class times are  10-5 EST. M, T, W, Th, F.";
        }else{
            result = "Invalid Batch";
        }
        System.out.println(result);

        System.out.println("---------------------------------------");

        String batch2 = "EU";
        String result2 = (batch2 == "US morning")? "Class times are 10-5 EST. M, T, Th, F." :(batch2 == "US evening")? "Class times are 7-10 EST. M, T, W, Th, S, S" :(batch2 == "EU")? "Class times are  10-5 EST. M, T, W, Th, F." : "Invalid Batch";

        System.out.println(result2);

        System.out.println("---------------------------------");

        String batch3 = "UE";

        switch(batch3){
            case "US morning":
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                break;
            case "US evening":
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                break;
            case "UE":
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
                break;
            default:
                System.out.println("invalid batch");
        }
    }
    /*
     Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

     */
}
