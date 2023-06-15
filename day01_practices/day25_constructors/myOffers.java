package day25_constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer("VA","cydeo","SDAT",120000,false,false,true,true);
        Offer offer2 = new Offer("VA","NOVA","Nurse",70000,true,false,true,true);
        Offer offer3 = new Offer("New Yourk","Apple","Developer",140000,false,true,false,true);
        Offer offer4 = new Offer("DC","Kiser","Lab technician",90000,true,true,true,false);
        Offer offer5 = new Offer("VA","Amazon","Siber Security",130000,true,true,true,true);

        Offer[] offers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>();

        for(Offer each:offers){
            if(each.isFullTime == true){
                fullTimeOffers.add(each);
            }
        }
        System.out.println(fullTimeOffers);

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(offers));

        localOffers.removeIf(p -> p.Location.equals("VA"));

        System.out.println(localOffers);

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(offers));

        offersWithBenefits.removeIf(p -> p.hasBenefits == false && p.hasPTO == false);

        ArrayList<Offer> devOffers= new ArrayList<>(Arrays.asList(offers));

        devOffers.removeIf(p -> !p.jobTitle.equals("Developer"));

        System.out.println(devOffers);

        ArrayList<Offer> with100k= new ArrayList<>(Arrays.asList(offers));

        with100k.removeIf(p -> p.salary < 100000);

        System.out.println(with100k);





    }
}
/*
 2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary



 */
