enum Status{
    Running, Failed, Pending;
}
public class enumif {
    public static void main(String[] args) {
        Status s = Status.Running;
        if(s == Status.Running){                     // But for if else we have to use Status.XYZ, Not in Switch
            System.out.println("All good");
        }
        else if(s == Status.Failed){
            System.out.println("Try again");
        }
        else if(s == Status.Pending){
            System.out.println("Wait");
        }
        else{
            System.out.println("Done");
        }
        switch (s) {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}
