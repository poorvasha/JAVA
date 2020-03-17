/* ----------------------------------------------- Variable ------------------------------------------- */

this for accessing variable 
class There{
     int i = 7;

    public static void main(String args[]){
        There obj = new There();
        obj.display();
    }
    void display(){
            System.out.println(this.i);
    }
}

/* ----------------------------------------------- Method ------------------------------------------- */

class ThisClass{

        void mother(){
            System.out.println("Mother : i love my Daughter");
        }
        void Daughter(){
            mother();
        }

}

class There{
    public static void main(String args[]){
        ThisClass obj = new ThisClass();
        obj.Daughter();
    }
}

