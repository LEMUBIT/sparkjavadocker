package lemubit.academy;
import static spark.Spark.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        port(80);
        record howdy(String name, int age){}
        get("/hello", (req, res) -> new howdy("Cool!",100));
        get("/awesome",(req,res)->"Awesomely");
    }
}
