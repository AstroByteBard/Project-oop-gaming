
class Staff implements info_Voter {

    private String Name_Staff; 
    private int Password_Staff;

    public Staff(String Name ,int password){
        Name_Staff = Name;
        Password_Staff = password;
    }

    public void getname(){
        System.out.println(Name_Staff);
    }
    public int Age(){
        return Password_Staff;
    }
}
