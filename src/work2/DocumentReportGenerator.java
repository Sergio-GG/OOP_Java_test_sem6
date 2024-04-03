package work2;

public class DocumentReportGenerator implements JsonReportGenerator, XmlReportGenerator{

    @Override
    public String generateXml() {
        String report = "Xml text";
        return report;
    }

    @Override
    public String generateJson() {
        String report = "Json text";
        return report;
    }
}
