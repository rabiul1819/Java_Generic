package bookLesson_3.page_100_101;

public class TableGenerator {
    public static void main(String[] args) {

        String table = """
                         MasterDevSkills(PVT) LTD
                    403, Church St, Toronto, ON, CA.
                           CUSTOMER INVOICE
                
                +-----------------------+-----------------------+
                | INFO                  | CUSTOMER              |
                +-----------------------+-----------------------+
                |DATE: 2020-10-20       |xyz Distributors       |
                |TIME: 10:35:AM         |+1 317-468-0173;       |
                |BILL NO:12             |ADDRESS: NO 25, Main St|
                |INVOICE NO: 458-80-108 |reet, ON, CA           |
                +-----------------------+-----------------------+
                |               SELLING DETAILS                 |
                +-----------------------+-----------------------+
                |ITEM            | PRICE($)|  QTY|         VALUE|
                +----------------+---------+-----+--------------+
                |Optical mouse   | 120.00  | 120 |  2400.00     |
                |Gaming keybord  | 550.0   | 30  |  16500.00    |
                +----------------+---------+-----+--------------+
                                            Gross   18,900.00
                                      Discount(5%)     945.00
                                            Payble  17,955.60
                """;
        System.out.println(table);
    }
}
