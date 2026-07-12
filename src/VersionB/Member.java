package VersionB;

public class Member {

    private int memberID;
    private String name;

    public Member(int memberID, String name) {

        if (memberID <= 0) {
            System.out.println("Invalid Member ID");
        }

        if (name == null || name.isEmpty()) {
            System.out.println("Invalid Member Name");
        }

        this.memberID = memberID;
        this.name = name;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member ID: " + memberID +
                "\nName: " + name;
    }
}