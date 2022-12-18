import java.io.OptionalDataException;

public class EmployeeBook {
    public void allEmployees() {
        if (employeesNew[0] != null) {
            for (int i = 0; i < employeesNew.length; i++) {
                System.out.println(employeesNew[i]);
            }
        } else {
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
        }
    }
    public double salaryMonthsSum() {
        double salaryMonthsSum = 0;
        for (int i = 0; i < employees.length; i++) {
            salaryMonthsSum = salaryMonthsSum + employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + salaryMonthsSum + " рублей.");
        return salaryMonthsSum;
    }

    public void minSalaryEmployee() {
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (minSalary == employees[i].getSalary()) {
                System.out.println("Сотрудник с минимальной зарплатой: " + employees[i].toString());
            }
        }
    }

    public void maxSalaryEmployee() {
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary == employees[i].getSalary()) {
                System.out.println("Сотрудник с максимальной зарплатой: " + employees[i].toString());
            }
        }
    }

    public void averageMonthsSalary() {
        System.out.println("Среднее значение зарплат: " + salaryMonthsSum() / (employees.length - 1) + " рублей.");
    }

    public void allNames() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println((employees[i].getLastName().toString() + " " + employees[i].getFirstName().toString() + " " + employees[i].getMiddleName().toString()));
        }
    }

    // Методы повышенной сложности
    public void salaryIndex(double index) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].getSalary() * index);
        }
    }

    public void departmentEmployeesMinSalary(byte departmentNumber) {
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary && employees[i].getDepartment() == departmentNumber) {
                minSalary = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (minSalary == employees[i].getSalary() && employees[i].getDepartment() == departmentNumber) {
                System.out.println("Сотрудник отдела №" + departmentNumber + " с минимальной зарплатой: " + "id:" + employees[i].getId() + " " + employees[i].getLastName() + " " + employees[i].getFirstName() + " " +
                        employees[i].getMiddleName() + " Зарплата " + employees[i].getSalary() + " рублей.");
            }
        }
    }

    public void departmentEmployeesMaxSalary(byte departmentNumber) {
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary && employees[i].getDepartment() == departmentNumber) {
                maxSalary = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary == employees[i].getSalary() && employees[i].getDepartment() == departmentNumber) {
                System.out.println("Сотрудник отдела №" + departmentNumber + " с максимальной зарплатой: " + "id:" + employees[i].getId() + " " + employees[i].getLastName() + " " + employees[i].getFirstName() + " " +
                        employees[i].getMiddleName() + " Зарплата " + employees[i].getSalary() + " рублей.");
            }
        }
    }

    public double departmentSalaryMonthsSum(byte departmentNumber) {
        double departmentSalaryMonthsSum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == departmentNumber) {
                departmentSalaryMonthsSum = departmentSalaryMonthsSum + employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц в отделе №" + departmentNumber + ": " + departmentSalaryMonthsSum + " рублей.");
        return departmentSalaryMonthsSum;
    }

    public void departmentAverageMonthsSalary(byte departmentNumber) {
        byte x = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == departmentNumber) {
                x++;
            }
        }
        System.out.println("Среднее значение зарплат в отделе №" + departmentNumber + ": " + departmentSalaryMonthsSum(departmentNumber) / x + " рублей.");
    }

    public void departmentEmployees(byte departmentNumber) {
        String result = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == departmentNumber) {
                result = "EmployeeFound";
                System.out.println("Сотрудник отдела №" + departmentNumber + ": " + "id:" + employees[i].getId() + " " + employees[i].getLastName() + " " + employees[i].getFirstName() + " " +
                        employees[i].getMiddleName() + " Зарплата " + employees[i].getSalary() + " рублей.");
            }
        }
        if (result == null) {
            System.out.println("Выбранного отдела не существует");
        }
    }

    public void departmentSalaryIndex(byte departmentNumber, double index) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == departmentNumber) {
                employees[i].setSalary(employees[i].getSalary() * index);
            }
        }
    }

    public void employeesSalaryLessThan(double number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < number) {
                System.out.println("id:" + employees[i].getId() + " " + employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + " Зарплата: " + employees[i].getSalary() + " рублей.");
            }
        }
    }

    public void employeesSalaryMoreThan(double number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= number) {
                System.out.println("id:" + employees[i].getId() + " " + employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + " Зарплата: " + employees[i].getSalary() + " рублей.");
            }
        }
    }

    private Employee[] employees = new Employee[] {
            new Employee("Иванов", "Иван", "Иванович", (byte) 5, 70_000),
            new Employee("Макаров", "Владимир", "Георгиевич", (byte) 2, 100_000),
            new Employee("Исаев", "Матвей", "Максимович", (byte) 3, 100_000),
            new Employee("Лаптев", "Даниил", "Павлович", (byte) 4, 130_000),
            new Employee("Казакова", "Евгения", "Тимуровна", (byte) 5, 70_000),
            new Employee("Лапшина", "Юлия", "Антоновна", (byte) 1, 70_000),
            new Employee("Казаков", "Виталий", "Игоревич", (byte) 3, 95_000),
            new Employee("Лазарева", "Дарья", "Николаевна", (byte) 1, 130_000),
            new Employee("Максимов", "Александр", "Артурович", (byte) 5, 90_000),
            new Employee("Зотова", "Екатерина", "Валентиновна", (byte) 4, 120_000)
    };
    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }
    private Employee[] employeesNew = new Employee[employees.length+1];
    Employee a;
    public void addEmployee(String lastName, String firstName, String middleName, byte department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(lastName, firstName, middleName, department, salary);
            }
        }
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            a = employees[i];
            employeesNew[i] = a;
        }
        employeesNew[employeesNew.length-1] = new Employee(lastName, firstName, middleName, department, salary);
    }
}

