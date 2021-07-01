package practice3;

import java.util.ArrayList;

public class ZooClub {
    private String name;
    private ArrayList<Member> memberList;

    public ZooClub() {
        this.memberList = new ArrayList<>();
    }

    public ZooClub(String name) {
        this.name = name;
        this.memberList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    public void addMember(Member member) {
        this.memberList.add(member);

    }

    public void removeMember(int memberNumber){
        if ((memberNumber - 1) < this.memberList.size() && memberNumber > 0) {
            this.memberList.remove(memberNumber-1);

        }
        else {
            System.out.println("Немає такого учасникв");
        }
    }


    public void printMembers() {
        if (memberList.size() == 0) {
            System.out.println("В клубі немає учасників");
            return;
        }
        System.out.println("Учасники клубу:");
        for (int i = 0; i < memberList.size(); i++) {
            System.out.println( (i+1) + ". "+ memberList.get(i).getName() + " " + memberList.get(i).getAge());
        }
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "name='" + name + '\'' +
                ", memberList=" + memberList +
                '}';
    }
}
