package com.company;

public class Client {

  //together both attributes declare the objects state
  private String name; //attribute incl. encapsulation
  private String address; //attribute incl. encapsulation

  //contruction method
  public Client(String name, String address){
    this.name = name;
    this.address = address;
  }
  //adfærd

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
