
public class Task {
    private String name;
    private String description;

    public Task(String n, String d){
        description=d;
        name=n;
    }

public String getDescription(){
    return description;
}

public String getName(){
    return name;
}

public void setName(String n){
    name=n;
}

public void setDescription(String des){
    description=des;
}

public boolean validate(){
if(name ==null|| description==null||name.equals("")||description.equals(""))
    return false;
else
    return true;
}

public String toString(){
    return "Name: "+name+"\nDescription: " + description+"\n========\n";
}

}
