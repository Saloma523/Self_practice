package day18_classAndObjects2;

public class Offer {
    String location, companyName, jobTitle;
    boolean hasBenefit,hasPTO,isWFH, isFullTime;

    public void setInfo(String location, String companyName, String jobTitle, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*
 Create a custom class named Offer
        Attributes:
                location
                companyName
                jobTitle
                salary
                hasBenefit
                hasPTO
                isWFH
                isFullTime

        Actions:
            setInfo(): sets all the instance variables
            toString(): returns the full info of the Offer Object

 */
