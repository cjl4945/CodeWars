import java.util.HashMap;

public class DuplicateCount {
    public static int duplicateCount(String text) {
        String []str = text.split("");
        HashMap<String, Integer> temp = new HashMap<>();
        int count = 0;
        for (String letter : str){
            if (temp.containsKey(letter.toLowerCase())){
                temp.put(letter.toLowerCase(), temp.get(letter.toLowerCase()) + 1);
            }
            else{
                temp.put(letter.toLowerCase(),1);
            }
        }
        for (Integer values : temp.values()){
            if (values > 1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));
    }
}
