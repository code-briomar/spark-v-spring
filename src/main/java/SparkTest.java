import static spark.Spark.*;

public class SparkTest {
    public static void main(String[] args) {
        get("/hello",(req,res)->{
            return req.body();
        });
    }
}
