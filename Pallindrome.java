

public class Pallindrome {
    public static String reverseString(String str){
		return new StringBuilder(str).reverse().toString(); /*
        Класс StringBuffer представляет расширяемые и доступные
        для изменений последовательности символов, позволяя вставлять
        символы и подстроки в существующую строку и в любом месте.
        Данный класс гораздо экономичнее в плане потребления
        памяти и настоятельно рекомендуется к использованию.*/
    };
    public static boolean isPalindrome(String str){
        return str.equals(reverseString(str));/*
        Метод equals сравнивает строки, в то время как
        reverseString возвращает реверсированную строку */
    }

    public static void Printout(String str){
        System.out.print(str);
        System.out.println( isPalindrome(str)
                ? " - строка является паллиндромом ":" - строка не является паллиндромом");
        
    };

    public static void main(String [] args){
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            Printout(s);
        }
    };
}
