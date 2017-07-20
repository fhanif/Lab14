/**
 * Created by fhani on 7/20/2017.
 */
public class TestProgramApp {
    public static void main(String[] args) {

        ProgramConfiguration test = ProgramConfiguration.getSingleInstance();
        test.setConnectionLimit(2);

        ProgramConfiguration test2 = ProgramConfiguration.getSingleInstance();
        System.out.println(test.getConnectionLimit());
        System.out.println(test);
        System.out.println(test2);
        ProgramConfiguration test3 = new ProgramConfiguration();
        //does not work other than with getInstance();

    }
}
