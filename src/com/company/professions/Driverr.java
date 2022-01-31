package com.company.professions;
import com.company.person.Person;

public abstract class Driverr extends Person {
  public int experience;

  public  Driverr(int age, String fullname, int experience){
    super(age, fullname);
    this.experience = experience;
  }
  public abstract String toString();

}