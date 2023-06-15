package day13_returnMethods;

import day08_ternaries.word;

public class frequencyOfWords {
    public static void main(String[] args) {


        System.out.println(frequencyOfWord("Java java jAvA", "java"));


        }

        public static int frequencyOfWord(String sentence, String word){

            sentence = sentence.toLowerCase(); // makes everything lowercase
            word = word.toLowerCase(); // making the word lowercase will allow us to ignore case sensitivity
            sentence = sentence.replace(" ", ""); // removes all the spaces from the String

            int startLength = sentence.length(); // we keep track of the original length to compare use it later to compare and with the frequency
            sentence = sentence.replace(word, ""); // this will replace every occurrence of the given word in the sentence

            return (startLength - sentence.length()) / word.length(); // we find the difference in the length before and after removing the word. Then divide by how long the word is to determine how many times that word was removed from the sentence, which was the frequency of the word
        }


        /*public static int frequencyOfWord2(String sentence, String word){
            sentence = sentence.toLowerCase();
            word =  word.toLowerCase();
            String temp = sentence.replace( word,  "a".repeat(word.length()-1) );

            int frequency = sentence.length() - temp.length();

            return frequency;

        }

         */

    }


    /*
 Create a method named frequencyOfWords that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 3
 */
