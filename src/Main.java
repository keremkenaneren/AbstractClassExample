public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager =new CustomerManager();
        //customerManager.dataBaseManager = new OracleDataBase();
        //customerManager.dataBaseManager = new SqlDataBase();
        customerManager.dataBaseManager = new MySqlDataBase();
        //  Yukarısı konfigürasyon yani değişebilir


        customerManager.getCustomer();



    }
}