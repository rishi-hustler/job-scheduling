import java.util.Arrays;
import java.util.Scanner;

class Job {
    int id;
    int deadline;
    int profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {

    static void jobSequencing(Job[] jobs, int n) {

        // Sort jobs by profit in descending order
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find maximum deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);

        int totalProfit = 0;

        // Assign jobs to slots
        for (Job job : jobs) {
            for (int j = job.deadline; j > 0; j--) {
                if (slot[j] == -1) {
                    slot[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.print("Job sequence: ");
        for (int i = 1; i <= maxDeadline; i++) {
            if (slot[i] != -1) {
                System.out.print("J" + slot[i] + " ");
            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of jobs: ");
        int n = sc.nextInt();

        Job[] jobs = new Job[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter deadline and profit for job " + (i + 1) + ": ");
            int d = sc.nextInt();
            int p = sc.nextInt();
            jobs[i] = new Job(i + 1, d, p);
        }

        jobSequencing(jobs, n);
        sc.close();
    }
}
