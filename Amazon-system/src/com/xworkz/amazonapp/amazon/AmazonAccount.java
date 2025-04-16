package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.AccountType;
import com.xworkz.amazonapp.City;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AmazonAccount {
     private String name;
    private String email;
    private String password;
    private City city;
    private AccountType accountType;

  /*  public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setCity(City city) {
        this.city = city;
    }
    public City getCity() {
        return city;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    public AccountType getAccountType() {
        return accountType;
    }*/
}
