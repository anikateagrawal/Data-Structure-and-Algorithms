/*
 * You are the head of a community of interior designers,
 * you are receiving leads in real time from homeowners across the globe who need some interior design work done
 * Given the array of designers and leads assign leads to designers, assign leads to designers where the following conditions are satisfied
 *
 * 1. lead gets assigned to a designer only if designer's location matchs the lead's location
 * 2. lead gets assigned to a designer only if atleast one of the id's in the designer obj "projectTypeIds" array matches the "projectTypeIds" array in leads object
 *
 * Optional implementation: Assume that the leads array is dynamic and leads will keep getting added, meaning the logic should also accomodate this scenario
 *
 * you can either submit pseudo code or javascript for the above problem statement
 *

var leads = [
        {
        id: "61a12a837abe9c19b50ee7ba",
        name: "Siobhan Roy",
        email: "shiv@yopmail.com",
        zipcode: "766655",
        phoneNumber: "+79999999999",
        tags: ["Location - In Person or Virtual"],
        location: "Bangalore",
        projectTypeIds: ["p1"],
        assignedDesigners: [],
        createdOn: new Date("2021-12-26T18:42:11.579Z"),
        },
        {
        id: "61a12a2f7abe9c19b50ee7b8",
        name: "Romulus Roy",
        email: "roman@yopmail.com",
        zipcode: "878990",
        phoneNumber: "+855788888999",
        tags: ["Location - In Person"],
        location: "Bangalore",
        projectTypeIds: ["p2"],
        assignedDesigners: [],
        createdOn: new Date("2022-11-26T18:40:47.441Z"),
        },
        {
        id: "61a11c257abe9c19b50ee7b2",
        name: "Kendell Roy",
        email: "kendell@yopmail.com",
        zipcode: "420001",
        phoneNumber: "+919897867763",
        tags: ["Floor Planning"],
        location: "Hyderabad",
        projectTypeIds: ["p3"],
        assignedDesigners: [],
        createdOn: new Date("2021-11-26T17:40:53.009Z"),
        },
        {
        id: "61a0dc7c4efd08af482841f1",
        name: "Felix Gallardo",
        email: "gallardo@felix.com",
        zipcode: "411011",
        phoneNumber: "+12015557484",
        tags: ["Location - In Person or Virtual"],
        location: "Hyderabad",
        projectTypeIds: ["p3"],
        assignedDesigners: [],
        createdOn: new Date("2021-12-01T13:09:16.090Z"),
        },
        {
        id: "61a0cdc64efd08af482841eb",
        name: "Kiki Camerana",
        email: "camerena@kiki.com",
        zipcode: "400028",
        phoneNumber: "+12015485555",
        tags: ["Floor Planning", "Location - In Person or Virtual"],
        location: "Mumbai",
        projectTypeIds: ["p4", "p1"],
        assignedDesigners: [],
        createdOn: new Date("2021-11-26T12:06:30.583Z"),
        },
        ]

        var designers = [
        {
        id: "61a0f7c7d385ba60c4d4e932",
        projectTypeIds: ["p3"],
        location: "Pune",
        email: "loganroy@yopmail.com",
        phoneNumber: "+917777777777",
        lastLeadAssigned: null,
        portfolio: "https://portfolio.logan.com",
        accountId: "420b8bf1-e7b0-41c1-a991-e17e52907f0f",
        },
        {
        id: "61a0e8a5d385ba60c4d4e931",
        projectTypeIds: ["p5", "p4", "p2", "p3", "p1"],
        location: "Hyderabad",
        email: "pachoharera@yopmail.com",
        phoneNumber: "+917777777774",
        lastLeadAssigned: null,
        portfolio: "https://portfolio.pacho.com",
        accountId: "1525892f-fd85-49b1-b6b9-b16fd8763cc5",
        },
        {
        id: "61a0cd4ad385ba60c4d4e930",
        projectTypeIds: ["p5", "p4", "p2", "p3", "p1"],
        location: "Delhi",
        email: "rebollo@yopmail.com",
        phoneNumber: "+917777777779",
        lastLeadAssigned: null,
        portfolio: "https://portfolio.rebollo.com",
        accountId: "9842e48e-ce5c-485e-b3bc-9b8a6a6ec6a5",
        },
        ]
 */
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
    public static boolean checkProjectTypeIds(ArrayList<String> leadproject,ArrayList<String> designerproject)
    {
        int i;
        for (i = 0; i < designerproject.size(); i++) {
            if (leadproject.contains(designerproject.get(i)))return true;
        }
        return false;
    }
    public static void assignLeadsToDesigners()
    {
        for (int i = 0; i < leads.size(); i++) {
            Lead l=leads.get(i);
            for (int j = 0; j < designers.size(); j++) {
                Designer d=designers.get(j);
                if(l.location.equals(d.location)&&checkProjectTypeIds(l.projectTypeIds,d.projectTypeIds))
                {
                    System.out.println("lead "+l.name+" assigned to designer "+d.email);
                    l.assignedDesigners.add(d);
                    d.lastLeadAssigned=l;
                }
            }
        }
    }
    public static void main(String[] args) {
        leads.add(new Lead("61a11c257abe9c19b50ee7ba","Siobhan Roy","shiv@yopmail.com","766655","+79999999999","Bangalore",new ArrayList<>(Arrays.asList("Location-In Person or Virtual")),new ArrayList<>(Arrays.asList("p1")),new ArrayList<>(),new Date("2021-12-26T18:42:11.579Z")));
        leads.add(new Lead("61a12a2f7abe9c19b50ee7b8","Romulus Roy","roman@yopmail.com","878990","855788888999","Bangalore",new ArrayList<>(Arrays.asList("Location-In Person ")),new ArrayList<>(Arrays.asList("p2")),new ArrayList<>(),new Date("2022-11-26T18:40:47.441Z")));
        leads.add(new Lead("61a11c257abe9c19b50ee7b2","Kendell Roy","kendell@yopmail.com","420001","+919897867763","Hyderabad",new ArrayList<>(Arrays.asList("Floor Planning")),new ArrayList<>(Arrays.asList("p3")),new ArrayList<>(),new Date("2021-11-26T17:40:53.009Z")));
        leads.add(new Lead("61a0dc7c4efd08af482841f1","Felix Gallardo","gallardo@felix.com","411011","+12015557484","Hyderabad",new ArrayList<>(Arrays.asList("Location-In Person or Virtual")),new ArrayList<>(Arrays.asList("p3")),new ArrayList<>(),new Date("2021-12-01T13:09:16.090Z")));
        leads.add(new Lead("61a0cdc64efd08af482841eb","Kiki Camerana","camerana@kiki.com","400028","+12015485555","Mumbai",new ArrayList<>(Arrays.asList("Floor Planning","Location-In Person or Virtual")),new ArrayList<>(Arrays.asList("p4","p1")),new ArrayList<>(),new Date("2021-11-26T12:06:30.583Z")));
        designers.add(new Designer("61a0f7cd385ba60c4d4e932","Pune","loganroy@yopmail.com","+9177777777777",null,"https://portfolio.logan.com","420b8bf1-e7b0-41c1-a991-e17e52907f0f",new ArrayList<>(Arrays.asList("p3"))));
        designers.add(new Designer("61a0e8a5d385ba60c4d4e931", "Hyderabad", "pachoharera@yopmail.com", "+917777777774", null, "https://portfolio.pacho.com", "1525892f-fd85-49b1-b6b9-b16fd8763cc5",new ArrayList<>(Arrays.asList("p5", "p4", "p2", "p3", "p1"))));
        designers.add(new Designer("61a0cd4ad385ba60c4d4e930", "Delhi", "rebollo@yopmail.com", "+917777777779", null, "https://portfolio.rebollo.com", "9842e48e-ce5c-485e-b3bc-9b8a6a6ec6a5",new ArrayList<>(Arrays.asList("p5", "p4", "p2", "p3", "p1"))));
        assignLeadsToDesigners();
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