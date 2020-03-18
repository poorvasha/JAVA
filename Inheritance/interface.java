interface Blog{
    public void blog();
}
interface Quote{
    public void quote();
}

class Cyso implements Blog{
    public void blog(){
        System.out.println("Blog : Ramya");
    }
}

class Company extends Cyso implements Quote{
    public void quote(){
        System.out.println("Blog : Ramya");
    }

    public static void main (String args[]){
        Company obj =  new Company();
        obj.blog();
        obj.quote();
    }
}
