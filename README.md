# Job Sequencing with Deadlines (Java)

## 📌 Overview

**Job Sequencing with Deadlines** is a classic **Greedy Algorithm problem** where the objective is to schedule jobs to **maximize total profit**, subject to the constraint that:

* Each job takes **one unit of time**
* Each job has a **deadline**
* Only **one job** can be done at a time

---

## 🚀 Algorithm Used

**Greedy Algorithm**

### Strategy:

1. Sort all jobs in **descending order of profit**
2. Schedule each job in the **latest available time slot before its deadline**
3. Skip the job if no slot is available

This ensures maximum profit.

---

## 🧮 Time and Space Complexity

* **Time Complexity:** `O(N log N)`
* **Space Complexity:** `O(N)`

---

## 🛠️ Requirements

* Java 8 or later
* Any Java IDE or terminal

---

## 📂 Project Structure

```
JobSequencing.java
README.md
```

---

## ▶️ How to Run

1. Compile the program:

   ```bash
   javac JobSequencing.java
   ```
2. Run the program:

   ```bash
   java JobSequencing
   ```

---

## ⌨️ Sample Input

```
Enter number of jobs: 5
Enter deadline and profit for job 1: 2 100
Enter deadline and profit for job 2: 1 19
Enter deadline and profit for job 3: 2 27
Enter deadline and profit for job 4: 1 25
Enter deadline and profit for job 5: 3 15
```

---

## ✅ Sample Output

```
Job sequence: J1 J3 J5
Total Profit: 142
```

---

## 🧠 Key Concepts

* Greedy Strategy
* Sorting
* Scheduling Problems
* Optimization

---

## 🔧 Customization Ideas

* Print time slots explicitly
* Use **Disjoint Set (DSU)** for optimized slot finding
* Modify code to store job names instead of IDs
* Convert to a menu-driven program

---

## 📚 Applications

* CPU job scheduling
* Task scheduling systems
* Profit maximization problems

---

## 📝 License

Free to use for academic, learning, and interview preparation.

