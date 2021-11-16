class Student{
     //Constructor overloaded
     String name;
     int id;
    public Student(){
       name = "Prabhjot";
       id = 79;
    }
    public Student(String Name){
         name = Name;
       
    }
   
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
        System.out.println("Student Name : "+name);
        
        
    }
    
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
        System.out.println("Roll No. : "+id);
    }

}
public class practical8{
    public static void main(String [] args){
        //Student Prabhjot = new Student("Prabhjot",79);
        //Student Prabhnoor = new Student("Prabhnoor");
       Student Prabhjot = new Student();
       Prabhjot.setName("Prabhjot");
       System.out.println(Prabhjot.getName());
       Prabhjot.setid(79);
       System.out.println(Prabhjot.getid());
       

    }
}
    