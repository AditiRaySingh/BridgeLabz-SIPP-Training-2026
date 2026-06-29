class LibraryMember {
    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    int calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Name: " + memberName);
        System.out.println("ID: " + memberId);
    }
}

class StudentMember extends LibraryMember {
    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    int calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {
    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    int calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {
    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    int calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryMember[] members = {
                new StudentMember("Aditi", "S101"),
                new FacultyMember("Rahul", "F202"),
                new GuestMember("Priya", "G303")
        };

        for (LibraryMember m : members) {
            m.printDetails();
            System.out.println("Fine: " + m.calculateFine(4));
        }

        String searchId = "F202";

        for (LibraryMember m : members) {
            if (m.memberId.equals(searchId)) {
                System.out.println("Member Found:");
                m.printDetails();
            }
        }
    }
}