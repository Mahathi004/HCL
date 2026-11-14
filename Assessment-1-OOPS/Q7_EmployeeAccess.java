import java.util.Scanner;

// Interface
interface AccessControl {
    String getRole();
    int getAccessLevel();
    boolean canAccess(int requiredLevel);
}

// Implementation 1: Developer (Level 1)
class Developer implements AccessControl {
    @Override
    public String getRole() {
        return "Developer";
    }

    @Override
    public int getAccessLevel() {
        return 1;
    }

    @Override
    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}

// Implementation 2: Manager (Level 2)
class Manager implements AccessControl {
    @Override
    public String getRole() {
        return "Manager";
    }

    @Override
    public int getAccessLevel() {
        return 2;
    }

    @Override
    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}

// Implementation 3: Administrator (Level 3)
class Administrator implements AccessControl {
    @Override
    public String getRole() {
        return "Administrator";
    }

    @Override
    public int getAccessLevel() {
        return 3;
    }

    @Override
    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}

public class Q7_EmployeeAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roleType = sc.nextInt();
        int requiredLevel = sc.nextInt();

        // Interface reference for runtime polymorphism
        AccessControl user = null;

        if (roleType == 1) {
            user = new Developer();
        } else if (roleType == 2) {
            user = new Manager();
        } else if (roleType == 3) {
            user = new Administrator();
        }

        if (user != null) {
            System.out.println("Role: " + user.getRole());
            System.out.println("Access Level: " + user.getAccessLevel());
            System.out.println("Can Access: " + user.canAccess(requiredLevel));
        }

        sc.close();
    }
}
