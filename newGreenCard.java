public class newGreenCard{

    String address;
    String name;
    String id;

    public void createNewGreenCard(String address, String name, String id){

        this.address = address;
        this.name = name;
        this.id = id;



    }

    public String validate(String address, String name, String id){
        int count = 0;

        if(address == this.address){

            count++;

        }
        if(name == this.name){

            count++;

        }
        if(id == this.id){

            count++;

        }

        if(count == 3){

            return "Valid";

        }
        else{

            return "Invalid";


        }
    }

    public newGreenCard getNGC(){

        return this;


    }






}