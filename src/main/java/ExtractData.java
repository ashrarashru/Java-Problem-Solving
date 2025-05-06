public class ExtractData {

    public static void main(String[] args) {

        String htmlCode = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Transactions</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div>\n" +
                "        <div class=\"button\">\n" +
                "            <p>Transaction Id: TXN1234</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>\n";

        int startIndex = htmlCode.indexOf("Transaction Id: ");
        int endIndex = htmlCode.indexOf("</p>",startIndex);

        String result = htmlCode.substring(startIndex,endIndex).trim();
        System.out.println(result);
    }
}
