import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocumentOrganizer {
    private static final List<Document> documents = new ArrayList<>();
    private static int nextId = 1;

    private static void addDocument(Scanner sc) {
        System.out.print("Document name: "); String name=sc.nextLine();
        System.out.print("Subject: "); String subject=sc.nextLine();
        System.out.print("Semester: "); String semester=sc.nextLine();
        System.out.print("Type: "); String type=sc.nextLine();
        System.out.print("Keywords: "); String keywords=sc.nextLine();
        System.out.print("File path: "); String path=sc.nextLine();
        documents.add(new Document(nextId++,name,subject,semester,type,keywords,path));
        System.out.println("Document added.");
    }

    private static void search(Scanner sc) {
        System.out.print("Search keyword: "); String q=sc.nextLine().toLowerCase();
        boolean found=false;
        for(Document d:documents){
            String data=(d.getName()+" "+d.getSubject()+" "+d.getSemester()+" "+d.getType()+" "+d.getKeywords()).toLowerCase();
            if(data.contains(q)){System.out.println(d); found=true;}
        }
        if(!found) System.out.println("No matching documents.");
    }

    private static void listAll() {
        if(documents.isEmpty()){System.out.println("No documents stored."); return;}
        documents.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\nDigital Academic Document Organizer");
            System.out.println("1. Add document\n2. Search document\n3. List all documents\n4. Exit");
            System.out.print("Choice: ");
            switch(sc.nextLine()){
                case "1" -> addDocument(sc);
                case "2" -> search(sc);
                case "3" -> listAll();
                case "4" -> {sc.close(); return;}
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
