class ABC{
    static ABC obj;
    private  ABC(){}
    public static ABC getInstance(){
        if(obj==null)
            obj=new ABC();
        return obj;
    }
    public void display(){
        System.out.println("I am Display");
    }
}
public class Singleton {
    public static void main(String args[]){
        ABC o=ABC.getInstance();
        o.display();
        ABC o1=ABC.getInstance();
        System.out.println(o);
        System.out.println(o1);
    }
}
