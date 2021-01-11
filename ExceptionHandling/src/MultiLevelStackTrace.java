public class MultiLevelStackTrace {

    public static void main(String[] args) {

        MultiLevelStackTrace multiLevelStackTrace = new MultiLevelStackTrace();
        multiLevelStackTrace.turnOnComputer();

    }

    void turnOnComputer(){
        System.out.println("Turning on the library computer..");
        enterBookDetails();
    }

    void enterBookDetails(){
        System.out.println("Enter book details..");
        confirmBookDetails();
    }

    void confirmBookDetails(){
        System.out.println("Confirm book details..");
        bookLocation();
    }

    void bookLocation(){
        int[] bookShelfNumbers = new int[1000];

        try{
            System.out.println("Searching for bookshelf location..");
            bookShelfNumbers[10000] = 150;
            System.out.println("Search is completed..");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Exception found.. inside catch block!");
            System.out.println(e);
        }


    }

}
