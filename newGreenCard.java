public class NewGreenCard{

    private String address;
    private String name;
    private String id;

    public NewGreenCard(String address, String name, String id){

        this.address = address;
        this.name = name;
        this.id = id;

    }

    public boolean validate(String address, String name, String id){
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

            return true;

        }
        else{

            return false;


        }
    }

    public NewGreenCard getNGC(){

        return this;


    }
    






}