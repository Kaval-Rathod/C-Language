public class Problame {
    public static void main(String[] args) {
       

        // p:1 convert upercase to lower case
        String a = "HeGGgLfsdg";
        System.out.println(a.toLowerCase());
        
        // p:2 convert " " to "_"
        String text = "Hello Ji I Am Kaval";
        text = text.replace(" ", "_");
        System.out.println(text);
        
        //  P:3 replace name in string
        String lett = "Hello <|name>, I am kaval"; 
        lett = lett.replace("<|name>", "Bhut");
        System.out.println(lett);

        // p:4 detact double or treple string 
        String th = "This is hase mane   spaches  hehehe    .";
        System.out.println(th.indexOf("   "));
        System.out.println(th.indexOf("  "));
        System.out.println(th.indexOf(""));

        // p:5 use escap and line to latter
        String he = "Hello, \n \tThis is very good \nhello ji";
        System.out.println(he);
    }
}
