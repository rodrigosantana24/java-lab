import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class teste26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<LogEntry> set = new HashSet<>();

        //String path = "c:\\temp\\in.txt";
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                System.out.println(line);

                String[] fields = line.split(" ");
                String userName = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(userName, moment));

                line = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nTotal users: " + set.size());
    }

}

class LogEntry{
    private String userName;
    private Date moment;

    public LogEntry(String userName, Date moment){
        this.userName = userName;
        this.moment = moment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(userName, logEntry.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }
}
