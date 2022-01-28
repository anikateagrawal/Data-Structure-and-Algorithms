import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Challenge {
    static Scanner sc;
    static ArrayList<Lead> leads;
    static ArrayList<Designer> designers;
    static {
        leads=new ArrayList<>();
        sc = new Scanner(System.in);
        designers=new ArrayList<>();
    }
    public static void addLead()
    {
        System.out.println("Enter id");
        String id=sc.nextLine();
        System.out.println("enter name");
        String name= sc.nextLine();
        System.out.println("Enter email");
        String email= sc.nextLine();
        System.out.println("Enter zipcode");
        String zipcode= sc.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber= sc.nextLine();
        ArrayList<String> tags=new ArrayList<>();
        while(true) {
            System.out.println("Want to add tag press y else n");
            char c=sc.nextLine().charAt(0);
            if(c=='n')break;
            else
            {
                System.out.println("Enter tag");
                tags.add(sc.nextLine());
            }
        }
        System.out.println("Enter location");
        String location= sc.nextLine();
        ArrayList<String> projectTypeIds=new ArrayList<>();
        while(true) {
            System.out.println("Want to add project type ids press y else n");
            char c=sc.nextLine().charAt(0);
            if(c=='n')break;
            else
            {
                System.out.println("Enter project type id");
                projectTypeIds.add(sc.nextLine());
            }
        }
        ArrayList<Designer> assignedDesigners=new ArrayList<>();
        System.out.println("Enter date");
        Date createdon=new Date(sc.nextLine());
        leads.add(new Lead(id, name,email, zipcode, phoneNumber, location,  tags, projectTypeIds, assignedDesigners ,createdon));
    }
    public static void main(String[] args) {
        leads.add(new Lead("61a11c257abe9c19b50ee7ba","Siobhan Roy","shiv@yopmail.com","766655","+79999999999","Bangalore",new ArrayList<>(Arrays.asList("Location-In Person or Virtual")),new ArrayList<>(Arrays.asList("p1")),new ArrayList<>(),new Date("2021-12-26T18:42:11.579Z")));
        leads.add(new Lead("61a12a2f7abe9c19b50ee7b8","Romulus Roy","roman@yopmail.com","878990","855788888999","Bangalore",new ArrayList<>(Arrays.asList("Location-In Person ")),new ArrayList<>(Arrays.asList("p2")),new ArrayList<>(),new Date("2022-11-26T18:40:47.441Z")));
        leads.add(new Lead("61a11c257abe9c19b50ee7b2","Kendell Roy","kendell@yopmail.com","420001","+919897867763","Hyderabad",new ArrayList<>(Arrays.asList("Floor Planning")),new ArrayList<>(Arrays.asList("p3")),new ArrayList<>(),new Date("2021-11-26T17:40:53.009Z")));
        leads.add(new Lead("61a0dc7c4efd08af482841f1","Felix Gallardo","gallardo@felix.com","411011","+12015557484","Hyderabad",new ArrayList<>(Arrays.asList("Location-In Person or Virtual")),new ArrayList<>(Arrays.asList("p3")),new ArrayList<>(),new Date("2021-12-01T13:09:16.090Z")));
        leads.add(new Lead("61a0cdc64efd08af482841eb","Kiki Camerana","camerana@kiki.com","400028","+12015485555","Mumbai",new ArrayList<>(Arrays.asList("Floor Planning","Location-In Person or Virtual")),new ArrayList<>(Arrays.asList("p4","p1")),new ArrayList<>(),new Date("2021-11-26T12:06:30.583Z")));
        designers.add(new Designer("61a0f7cd385ba60c4d4e932","Pune","loganroy@yopmail.com","+9177777777777",null,"https://portfolio.logan.com","420b8bf1-e7b0-41c1-a991-e17e52907f0f",new ArrayList<>(Arrays.asList("p3"))));
        designers.add(new Designer("61a0f7cd385ba60c4d4e932","Pune","loganroy@yopmail.com","+9177777777777",null,"https://portfolio.logan.com","420b8bf1-e7b0-41c1-a991-e17e52907f0f",new ArrayList<>(Arrays.asList("p3"))));
        designers.add(new Designer("61a0f7cd385ba60c4d4e932","Pune","loganroy@yopmail.com","+9177777777777",null,"https://portfolio.logan.com","420b8bf1-e7b0-41c1-a991-e17e52907f0f",new ArrayList<>(Arrays.asList("p3"))));
    }
}
class Designer
{
    String id,location,email,phoneNumber,portfolio,accountId;
    Lead lastLeadAssigned;
    ArrayList<String> projectTypeIds;

    public Designer(String id, String location, String email, String phoneNumber, Lead lastLeadAssigned, String portfolio, String accountId, ArrayList<String> projectTypeIds) {
        this.id = id;
        this.location = location;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lastLeadAssigned = lastLeadAssigned;
        this.portfolio = portfolio;
        this.accountId = accountId;
        this.projectTypeIds = projectTypeIds;
    }

    @Override
    public String toString() {
        return "Designers{" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lastLeadAssigned='" + lastLeadAssigned + '\'' +
                ", portfolio='" + portfolio + '\'' +
                ", accountId='" + accountId + '\'' +
                ", projectTypeIds=" + projectTypeIds +
                '}';
    }
}
class Lead
{
    String id,name,email,zipcode,phoneNumber,location;
    ArrayList<String> tags,projectTypeIds;ArrayList<Designer> assignedDesigners;
    Date createdOn;

    public Lead(String id, String name, String email, String zipcode, String phoneNumber, String location, ArrayList<String> tags, ArrayList<String> projectTypeIds, ArrayList<Designer> assignedDesigners, Date date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.tags = tags;
        this.projectTypeIds = projectTypeIds;
        this.assignedDesigners = assignedDesigners;
        this.createdOn = date;
    }

    @Override
    public String toString() {
        return "Lead{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", location='" + location + '\'' +
                ", tags=" + tags +
                ", projectTypeIds=" + projectTypeIds +
                ", assignedDesigners=" + assignedDesigners +
                ", createdOn=" + createdOn +
                '}';
    }
}
class Date
{
    String date;

    public Date(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date{" +
                 date + '\'' +
                '}';
    }
}