import chapter3.CompanyConstants;
import chapter3.HelloByKotlin;

public class JavaMain {
    public static void main(String[] args){
        HelloByKotlin helloByKotlin = new HelloByKotlin();
        helloByKotlin.printHello();
        System.out.println(CompanyConstants.getMaxEmployeeCount());
    }
}
