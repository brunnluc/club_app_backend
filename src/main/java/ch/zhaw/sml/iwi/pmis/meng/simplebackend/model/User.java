package ch.zhaw.sml.iwi.pmis.meng.simplebackend.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String phoneNumber;
    private String address;
    private long plz;
    private String place;
    private String password;

    public Long getId(){
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String x){
        this.firstName = x;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String x){
        this.lastName = x;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    } 

    public void setPhoneNumber(String x){
        this.phoneNumber = x;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String x){
        this.address = x;
    }

    public long getPlz(){
        return this.plz;
    }

    public void setPlz(long x){
        this.plz = x;
    }

    public String getPlace(){
        return this.place;
    }

    public void setPlace(String x){
        this.place = x;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String x){
        this.password = x;
    }

    
}