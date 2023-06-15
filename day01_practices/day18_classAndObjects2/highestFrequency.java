package day18_classAndObjects2;

public class highestFrequency {
    public static void main(String[] args) {

        String  highestFrequency = "";
        String str = "aaabbccccddeeee";
        int frequency = 0;

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int tempFrequancy = j;


            for(int i = 0; i< str.length();i++){


                if(str.substring(str.charAt(0)).startsWith("" + ch) && str.substring(str.length()-1).endsWith("" + ch)){


                    highestFrequency+=ch;

                }




            }

            if(!highestFrequency.contains(""+ch)){
                highestFrequency+= "" + ch + frequency;
            }

        }
        System.out.println(frequency);

    }
     /*
 Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e


 */




}


