package work2;

// 4-й принцип разделения интерфейсов. Каждый интерфейс выполняет одну функцию.

public class AccountReportGenerator implements JsonReportGenerator {

    @Override
    public String generateJson() {
        String report = "Account text";
        return report;
    }
}
