import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    ArrayList<Employee> employeeList = new ArrayList<Employee>();
    Object temp = new ArrayList<Employee>();

    public Main() {
        int AdminT = 0, 
        ManagerT = 0, 
        SuperT = 0, 
        EmployeeT = 0;
        int menu;
        do {
        System.out.println("Employee List of PT. Mentol\n");
        System.out.println("(1) Insert New Data");
        System.out.println("(2) View Employee List");
        System.out.println("(3) Update Employee Data");
        System.out.println("(4) Delete Employee Data");
        System.out.println("To exit the program press ctrl + c then Y");
        System.out.print("Choose the option: ");
        
        menu = scan.nextInt(); scan.nextLine();

        switch (menu) {
            case 1:
                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                String codeT;
                String nameT;
                String genderT;
                String occupationT;
                Integer salaryT;
                
                Character a, b;
                Integer c, d, e, f;

                a = (char)(random.nextInt(26) + 'A');
                b = (char)(random.nextInt(26) + 'A');
                c = (random.nextInt(10));
                d = (random.nextInt(10));
                e = (random.nextInt(10));
                f = (random.nextInt(10));

                codeT = a.toString() + b.toString() + '-' + c.toString() + d.toString() + e.toString() + f.toString();
                do {
                    System.out.println("Name must be longer than 3 characters!\n");
                    System.out.print("Input name: ");
                    nameT = scan.nextLine();
                } while (nameT.length() < 3);
                do {
                    System.out.println("The inputted gender must be either Laki-Laki or Perempuan\n");
                    System.out.print("Input gender: ");
                    genderT = scan.nextLine();
                } while (!genderT.contentEquals("Laki-Laki") && !genderT.contentEquals("Perempuan"));
                salaryT = 10;
                do {
                    System.out.println("The inputted occupation must be Manager, Supervisor or Admin\n");
                    System.out.print("Input occupation: ");
                    occupationT = scan.nextLine();
                    if (occupationT.equals("Manager")) {
                        salaryT = 8000000;
                        ManagerT++;
                    }
                    else if (occupationT.equals("Supervisor")) {
                        salaryT = 6000000;
                        SuperT++;
                    }
                    else if (occupationT.equals("Admin")) {
                        salaryT = 4000000;
                        AdminT++;
                    }
                } while (!occupationT.equals("Manager") && !occupationT.equals("Supervisor") && !occupationT.equals("Admin"));
                
                employeeList.add(new Employee(codeT, nameT, genderT, occupationT, salaryT));
                if (ManagerT == 4) {
                    for (int i = EmployeeT - 1; i >= 0; i--) {
                        String occNow = employeeList.get(i).getOccupation();
                        if (occNow.equals("Manager")) {
                            Integer paid, extra;
                            paid = employeeList.get(i).getSalary();
                            extra = paid / 10;
                            paid += extra;
                            employeeList.get(i).setSalary(paid);
                        }
                    }
				}
                else if (ManagerT % 3 == 1) {
                    for (int i = EmployeeT - 1; i >= 0; i--) {
                        String occNow = employeeList.get(i).getOccupation();
                        if (occNow.equals("Manager")) {
                            Integer paid, extra;
                            paid = employeeList.get(i).getSalary();
                            extra = paid / 10;
                            paid += extra;
                            employeeList.get(i).setSalary(paid);
                        }
                    }
				}
                else if (SuperT == 4) {
                    for (int i = EmployeeT - 1; i >= 0; i--) {
                        String occNow = employeeList.get(i).getOccupation();
                        if (occNow.equals("Supervisor")) {
                            Integer paid1, extra1;
                            paid1 = employeeList.get(i).getSalary();
                            extra1 = paid1 * 75 / 1000;
                            paid1 += extra1;
                            employeeList.get(i).setSalary(paid1);
                        }
                    }
				}
                else if (SuperT % 3 == 1) {
                    for (int i = EmployeeT - 1; i >= 0; i--) {
                        String occNow = employeeList.get(i).getOccupation();
                        if (occNow.equals("Supervisor")) {
                            Integer paid1, extra1;
                            paid1 = employeeList.get(i).getSalary();
                            extra1 = paid1 * 75 / 1000;
                            paid1 += extra1;
                            employeeList.get(i).setSalary(paid1);
                        }
                    }
				}
                else if (AdminT == 4) {
                    for (int i = EmployeeT - 1; i >= 0; i--) {
                        String occNow = employeeList.get(i).getOccupation();
                        if (occNow.equals("Admin")) {
                            Integer paid2, extra2;
                            paid2 = employeeList.get(i).getSalary();
                            extra2 = paid2 * 5 / 100;
                            paid2 += extra2;
                            employeeList.get(i).setSalary(paid2);
                        }
                    }
				}
                else if (AdminT % 3 == 1) {
                    for (int i = EmployeeT - 1; i >= 0; i--) {
                        String occNow = employeeList.get(i).getOccupation();
                        if (occNow.equals("Admin")) {
                            Integer paid2, extra2;
                            paid2 = employeeList.get(i).getSalary();
                            extra2 = paid2 * 5 / 100;
                            paid2 += extra2;
                            employeeList.get(i).setSalary(paid2);
                        }
                    }
                }
            
				EmployeeT++;
                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                System.out.println(codeT + " has been added successfully!\n");
                System.out.println("Press any key to continue...");
                String add;
                add = scan.nextLine();
                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                break;
            
            case 2:
                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                for (int i = 0; i < employeeList.size() - 1; i++) {
                    if (employeeList.get(i).getName().compareTo(employeeList.get(i + 1).getName()) > 0) {
                        temp = employeeList.get(i);
                        employeeList.set(i, employeeList.get(i + 1));
                        employeeList.set(i + 1, (Employee) temp);
                    }
                }

                System.out.println("|---------|------------------|-------------------|-----------------|---------------|");
                System.out.println("|     Kode|              Nama|             Gender|          Jabatan|           Gaji|");
                System.out.println("|---------|------------------|-------------------|-----------------|---------------|");
                for (int i = 0; i < employeeList.size(); i++) {
                    System.out.println("|  " + employeeList.get(i).getCode() + "|              " + employeeList.get(i).getName() + "|            " + employeeList.get(i).getGender() + "|            " + employeeList.get(i).getOccupation() + "|       " + employeeList.get(i).getSalary() + "|");
                }
                System.out.println("|---------|------------------|-------------------|-----------------|---------------|");
                System.out.println("Press any key to stop viewing");
                String enter;
                enter = scan.nextLine();
                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                String codeU;
                String nameU;
                String genderU;
                String occupationU;
                Integer salaryU;
                
                Character a1, b1;
                Integer c1, d1, e1, f1;

                a1 = (char)(random.nextInt(26) + 'A');
                b1 = (char)(random.nextInt(26) + 'A');
                c1 = (random.nextInt(10));
                d1 = (random.nextInt(10));
                e1 = (random.nextInt(10));
                f1 = (random.nextInt(10));

                codeU = a1.toString() + b1.toString() + '-' + c1.toString() + d1.toString() + e1.toString() + f1.toString();
                int id1;
                for (int i = 0; i < employeeList.size() - 1; i++) {
                    if (employeeList.get(i).getName().compareTo(employeeList.get(i + 1).getName()) > 0) {
                        temp = employeeList.get(i);
                        employeeList.set(i, employeeList.get(i + 1));
                        employeeList.set(i + 1, (Employee) temp);
                    }
                }
                
                System.out.println("|---------|------------------|-------------------|-----------------|---------------|");
                System.out.println("|     Kode|              Nama|             Gender|          Jabatan|           Gaji|");
                System.out.println("|---------|------------------|-------------------|-----------------|---------------|");
                for (int i = 0; i < employeeList.size(); i++) {
                    System.out.println("|  "   + employeeList.get(i).getCode() + "|            " + employeeList.get(i).getName() + "|            " + employeeList.get(i).getGender() + "|            " + employeeList.get(i).getOccupation() + "|     " + employeeList.get(i).getSalary() + "|");
                }
                System.out.println("|---------|------------------|-------------------|-----------------|---------------|");
                
                System.out.print("Choose the employee you want to update (input the number based on the order): ");
                id1 = scan.nextInt(); scan.nextLine();

                employeeList.remove(id1 - 1);
                System.out.print("Input code: ");
                codeU = scan.nextLine();
                do {
                    System.out.println("Name must be longer than 3 characters!\n");
                    System.out.print("Input name: ");
                    nameU = scan.nextLine();
                } while (nameU.length() < 3);
                do {
                    System.out.println("The inputted gender must be either Laki-Laki or Perempuan\n");
                    System.out.print("Input gender: ");
                    genderU = scan.nextLine();
                } while (!genderU.equals("Laki-Laki") && !genderU.equals("Perempuan"));
                do {
                    System.out.println("The inputted occupation must be Manager, Supervisor or Admin\n");
                    System.out.print("Input occupation: ");
                    occupationU = scan.nextLine();
                    System.out.print("Input Salary: ");
                    salaryU = scan.nextInt(); scan.nextLine();
                } while (!occupationU.contentEquals("Manager") && !occupationU.contentEquals("Supervisor") && !occupationU.contentEquals("Admin"));
                
                employeeList.add(new Employee(codeU, nameU, genderU, occupationU, salaryU));
                
                employeeList.get(id1 - 1).setCode(codeU);
                employeeList.get(id1 - 1).setName(nameU);
                employeeList.get(id1 - 1).setGender(genderU);
                employeeList.get(id1 - 1).setOccupation(occupationU);
                employeeList.get(id1 - 1).setSalary(salaryU);
                
                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                System.out.println("Data has been updated successfully!\n");
                System.out.println("Press any key to continue...");
                String upd;
                upd = scan.nextLine();
                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                break;

            case 4:
                int id2;
                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                for (int i = 0; i < employeeList.size() - 1; i++) {
                    if (employeeList.get(i).getName().compareTo(employeeList.get(i + 1).getName()) > 0) {
                        temp = employeeList.get(i);
                        employeeList.set(i, employeeList.get(i + 1));
                        employeeList.set(i + 1, (Employee) temp);
                    }
                }
                System.out.println("|---------|------------------|-------------------|-----------------|---------------|");
                System.out.println("|     Kode|              Nama|             Gender|          Jabatan|           Gaji|");
                System.out.println("|---------|------------------|-------------------|-----------------|---------------|");
                for (int i = 0; i < employeeList.size(); i++) {
                    System.out.println("|  " +   employeeList.get(i).getCode() + "|            " + employeeList.get(i).getName() + "|            " + employeeList.get(i).getGender() + "|            " + employeeList.get(i).getOccupation() + "|           " + employeeList.get(i).getSalary() + "|");
                }
                System.out.println("|---------|------------------|-------------------|-----------------|---------------|");
                
                System.out.print("Choose the employee you want to remove (input the number based on the order): ");
                id2 = scan.nextInt(); scan.nextLine();
                employeeList.remove(id2 - 1);

                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                System.out.println("has been removed successfully!\n");
                System.out.println("Press any key to continue...");
                String del;
                del = scan.nextLine();
                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                break;
            default:
                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                System.out.println("Choose the right option!\n");
                System.out.println("Press any key to continue...");
                String fail;
                fail = scan.nextLine();
                
                for (int i = 0; i < 50; ++i) {
                    System.out.println();
                }
                break;
            }
        } while (true);
    }
    
    public static void main(String[] args) {
        new Main();
    }
}