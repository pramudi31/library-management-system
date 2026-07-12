package VersionA;

public class Member {
    int memberID;
    String name;

    public Member(int memberID, String name){
        this.memberID = memberID;
        this.name = name;
    }

    public void display(){
        System.out.println("Member ID: "+memberID);
        System.out.println("Name: "+name);

    }
}
