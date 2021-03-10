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
        do {
        System.out.println("Employee List of PT. Mentol\n");
        System.out.println("(1) Insert New Data");
        System.out.println("(2) View Employee List");
        System.out.println("(3) Update Employee Data)");
        System.out.println("(4) Delete Employee Data)");
        System.out.println("To exit the program press ctrl + c then Y");
        System.out.print("Choose the option: ");
        
        int AdminT = 0, ManagerT = 0, SuperT = 0, EmployeeT = 0;
        int menu;
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
                } while (genderT.equals("Laki-Laki") && genderT.equals("Perempuan"));
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
                        if (occNow.contentEquals("Manager")) {
                            Integer paid = employeeList.get(i).getSalary();
                            Integer extra;
                            extra = paid / 10;
                            paid += extra;
                            employeeList.get(i).setSalary(paid);
                        }
                    }
				}
                else if (ManagerT % 3 == 1) {
                    for (int i = EmployeeT - 1; i >= 0; i--) {
                        String occNow = employeeList.get(i).getOccupation();
                        if (occNow.contentEquals("Manager")) {
                            Integer paid = employeeList.get(i).getSalary();
                            Integer extra;
                            extra = paid / 10;
                            paid += extra;
                            employeeList.get(i).setSalary(paid);
                        }
                    }
				}
                if (SuperT == 4) {
                    for (int i = EmployeeT - 1; i >= 0; i--) {
                        String occNow = employeeList.get(i).getOccupation();
                        if (occNow.contentEquals("Supervisor")) {
                            Integer paid = employeeList.get(i).getSalary();
                            Integer extra;
                            extra = paid * 75 / 1000;
                            paid += extra;
                            employeeList.get(i).setSalary(paid);
                        }
                    }
				}
                else if (SuperT % 3 == 1) {
                    for (int i = EmployeeT - 1; i >= 0; i--) {
                        String occNow = employeeList.get(i).getOccupation();
                        if (occNow.contentEquals("Supervisor")) {
                            Integer paid = employeeList.get(i).getSalary();
                            Integer extra;
                            extra = paid * 75 / 1000;
                            paid += extra;
                            employeeList.get(i).setSalary(paid);
                        }
                    }
				}
                if (AdminT == 4) {
                    for (int i = EmployeeT - 1; i >= 0; i--) {
                        String occNow = employeeList.get(i).getOccupation();
                        if (occNow.contentEquals("Admin")) {
                            Integer paid = employeeList.get(i).getSalary();
                            Integer extra;
                            extra = paid * 5 / 100;
                            paid += extra;
                            employeeList.get(i).setSalary(paid);
                        }
                    }
				}
                else if (AdminT % 3 == 1) {
                    for (int i = EmployeeT - 1; i >= 0; i--) {
                        String occNow = employeeList.get(i).getOccupation();
                        if (occNow.contentEquals("Admin")) {
                            Integer paid = employeeList.get(i).getSalary();
                            Integer extra;
                            extra = paid * 5 / 100;
                            paid += extra;
                            employeeList.get(i).setSalary(paid);
                        }
                    }
                }
            
				EmployeeT++;

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
                for(int i = 0; i < employeeList.size(); i++)
                {
                    System.out.println("|" + employeeList.get(i).getCode() + "|            " + employeeList.get(i).getName() + "|          " + employeeList.get(i).getGender() + "|            " + employeeList.get(i).getOccupation() + "|         " + employeeList.get(i).getSalary() + "|");
                }
                System.out.println("|---------|------------------|-------------------|-----------------|---------------|");
                
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
                System.out.print("Choose the employee you want to update (input the number based on the order): ");
                


                do {
                    System.out.println("Name must be longer than 3 characters!\n");
                    System.out.print("Input name: ");
                    nameU = scan.nextLine();
                } while (nameU.length() < 3);
                do {
                    System.out.println("The inputted gender must be either Laki-Laki or Perempuan\n");
                    System.out.print("Input gender: ");
                    genderU = scan.nextLine();
                } while (genderU.equals("Laki-Laki") && genderU.equals("Perempuan"));
                salaryU = 10;
                do {
                    System.out.println("The inputted occupation must be Manager, Supervisor or Admin\n");
                    System.out.print("Input occupation: ");
                    occupationU = scan.nextLine();
                    System.out.print("Input Salary: ");
                    salaryU = scan.nextInt(); scan.nextLine();
                } while (!occupationU.contentEquals("Manager") && !occupationU.contentEquals("Supervisor") && !occupationU.contentEquals("Admin"));
                
                employeeList.add(new Employee(codeU, nameU, genderU, occupationU, salaryU));
                
                
                // int id;
                // for (int i = 0; i < employeeList.size(); i++) {
                //     System.out.println(employeeList.get(i).getCode() + employeeList.get(i).getName());
                // }
                
                // id = scan.nextInt(); scan.nextLine();
                
                // String codeU;
                // String nameU;
                // String genderU;
                // String occupationU;
                // Integer salaryU;
                
                // Character z, y;
                // Integer x, w, v, u;

                // z = (random.nextInt(26) + 'A');
                // y = (random.nextInt(26) + 'A');
                // x = (random.nextInt(10));
                // w = (random.nextInt(10));
                // v = (random.nextInt(10));
                // u = (random.nextInt(10));

                // codeT = a.toString() + b.toString() + c.toString() + '-' + c.toString() + d.toString() + e.toString() + f.toString();
                // do {
                //     nameT = scan.nextLine();
                // } while (nameT.length() < 3);
                // do {
                //     genderT = scan.nextLine();
                // } while (genderT != "Laki-laki" || genderT != "Perempuan");
                // occupationT = scan.nextLine();

                // salaryT = 10;

                // employeeList.get(id - 1).setCode(codeU);
                // employeeList.get(id - 1).setName(nameU);
                // employeeList.get(id - 1).setGender(genderU);
                // employeeList.get(id - 1).setOccupation(occupationU);
                // employeeList.get(id - 1).setSalary(salaryU);
                
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
                for(int i = 0; i < employeeList.size(); i++)
                {
                    System.out.println("|" + employeeList.get(i).getCode() + "|            " + employeeList.get(i).getName() + "|          " + employeeList.get(i).getGender() + "|            " + employeeList.get(i).getOccupation() + "|         " + employeeList.get(i).getSalary() + "|");
                }
                System.out.println("|---------|------------------|-------------------|-----------------|---------------|");
                
                System.out.print("Choose the employee you want to update (input the number based on the order): ");
                id2 = scan.nextInt(); scan.nextLine();

                employeeList.remove(id2 - 1);

                break;
            default:
                System.out.println("Choose the right option!");
                break;
            }
        } while (true);
    }
    public static void main(String[] args) {
        new Main();
    }


}
