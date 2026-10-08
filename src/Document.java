public class Document {
    private int id;
    private String name, subject, semester, type, keywords, filePath;

    public Document(int id, String name, String subject, String semester,
                    String type, String keywords, String filePath) {
        this.id=id; this.name=name; this.subject=subject; this.semester=semester;
        this.type=type; this.keywords=keywords; this.filePath=filePath;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public String getSubject(){return subject;}
    public String getSemester(){return semester;}
    public String getType(){return type;}
    public String getKeywords(){return keywords;}
    public String getFilePath(){return filePath;}
    public String toString(){return id+" | "+name+" | "+subject+" | "+semester+" | "+type;}
}
