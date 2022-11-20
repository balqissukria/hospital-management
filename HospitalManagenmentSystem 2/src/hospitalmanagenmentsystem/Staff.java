package hospitalmanagenmentsystem;

public class Staff {
   
   private String name;
   private int age;
   private String ic;
   private String gender;
   private String address;
   private String state;
   private String phone;
   private String blood;
   private String guardian;
   private String contact;
  

    public Staff(String name, int age, String ic, String gender, String address, String state, String phone, String blood, String guardian, String contact) {
        
        this.name = name;
        this.age = age;
        this.ic = ic;
        this.gender = gender;
        this.address = address;
        this.state = state;
        this.phone = phone;
        this.blood = blood;
        this.guardian = guardian;
        this.contact = contact;
    }

    
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge (int age){
        this.age = age;
    }

    public String getIc() {
        return ic;
    }
    
    public void setIc(String ic){
        this.ic = ic;
    }

    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender){
        this.gender=gender;
    
}

    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address){
        this.address=address;
        
    }
    
    public String getState() {
        return state;
    }
  public void setState(String state){
      this.state=state;
      
  }
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone=phone;
    }
    
    public String getBlood() {
        return blood;
    }
    
    public void setBlood(String blood){
        this.blood=blood;
    }
    
    public String getGuardian() {
        return guardian;
    }
    
    public void setGuardian(String guardian){
        this.guardian=guardian;
    }
    
    public String getContact() {
        return contact;
    }
    
   public void setContact(String contact){
        this.contact=contact;
    }
   

   
}
   

