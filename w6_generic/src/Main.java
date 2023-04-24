public class Main {
    public static void main(String[] args) {
        
        Integer[] int_array = {1,2,3,4};
        String[] str_array = {"Yazılım", "Mühendisliği"};
        Character[] char_array = {'a', 'b', 'c'};
        
        Int_Goster.goster(int_array);
        Str_Goster.goster(str_array);
        Char_Goster.goster(char_array);
        
        System.out.println("------------------");
        
        Yazdir<Integer> int_yazdir = new Yazdir<Integer>();
        int_yazdir.yazdir(int_array);
        Yazdir<String> str_yazdir = new Yazdir<String>();
        str_yazdir.yazdir(str_array);
        Yazdir<Character> char_yazdir = new Yazdir<Character>();
        char_yazdir.yazdir(char_array);
    }
}

