import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService
public class MainService {

    @WebMethod
    public String intToString(int entier){
        return Integer.toString(entier);
    }

    @WebMethod
    public float division(int num, int deno){
        try{
            return num/deno;
        } catch (ArithmeticException e){
            throw new ArithmeticException();
        }
    }
}
