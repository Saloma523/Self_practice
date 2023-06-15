package day15_forLoopBranshes;

public class frequancyOfWord2 {
    public static void main(String[] args) {
        String str = "java java java java";
        String word = "java";
        str.toLowerCase();
        word.toLowerCase();
        int count = 0;
        while (str.contains(word)){
            count++;
           str =  str.replaceFirst("java", "");
        }
        System.out.println(count);
    }
}
