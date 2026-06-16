import java.util.ArrayList;

public class findTeams{

    static void findTeams(int[] arr,
                          int index,
                          int target,
                          ArrayList<Integer> currentTeam) {

        if (target == 0) {
            System.out.println(currentTeam);
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        // Include current employee
        currentTeam.add(arr[index]);

        findTeams(arr,
                index + 1,
                target - arr[index],
                currentTeam);

        // Backtrack
        currentTeam.remove(currentTeam.size() - 1);

        // Exclude current employee
        findTeams(arr,
                index + 1,
                target,
                currentTeam);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills,
                0,
                target,
                new ArrayList<>());
    }
}