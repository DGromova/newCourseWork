public class EmployeeBook {

    public void allEmployees(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public double salaryMonthsSum(Employee[] array) {
        double salaryMonthsSum = 0;
        for (int i = 0; i < array.length; i++) {
            salaryMonthsSum = salaryMonthsSum + array[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + salaryMonthsSum + " рублей.");

        return salaryMonthsSum;
    }
    public void minSalaryEmployee(Employee[] array) {
        double minSalary = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() < minSalary) {
                minSalary = array[i].getSalary();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (minSalary == array[i].getSalary()) {
                System.out.println("Сотрудник с минимальной зарплатой: " + array[i].toString());
            }
        }
    }
    public void maxSalaryEmployee(Employee[] array) {
        double maxSalary = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() > maxSalary) {
                maxSalary = array[i].getSalary();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (maxSalary == array[i].getSalary()) {
                System.out.println("Сотрудник с максимальной зарплатой: " + array[i].toString());
            }
        }
    }
    public void averageMonthsSalary(Employee[] array) {
        System.out.println("Среднее значение зарплат: " + salaryMonthsSum(array) / (array.length - 1) + " рублей.");
    }
    public void allNames(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((array[i].getLastName().toString() + " " + array[i].getFirstName().toString() + " " + array[i].getMiddleName().toString()));
        }
    }
    // Методы повышенной сложности
    public void salaryIndex(Employee[] array, double index) {
        for (int i = 0; i < array.length; i++) {
            array[i].setSalary(array[i].getSalary() * index);
        }
    }
    public void departmentEmployeesMinSalary(Employee[] array, byte departmentNumber) {
        double minSalary = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() < minSalary && array[i].getDepartment() == departmentNumber) {
                minSalary = array[i].getSalary();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (minSalary == array[i].getSalary() && array[i].getDepartment() == departmentNumber) {
                System.out.println("Сотрудник отдела №" + departmentNumber + " с минимальной зарплатой: " + "id:" + array[i].getId() + " " + array[i].getLastName() + " " + array[i].getFirstName() + " " +
                        array[i].getMiddleName() + " Зарплата " + array[i].getSalary() + " рублей.");
            }
        }
    }
    public void departmentEmployeesMaxSalary(Employee[] array, byte departmentNumber) {
        double maxSalary = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() > maxSalary && array[i].getDepartment() == departmentNumber) {
                maxSalary = array[i].getSalary();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (maxSalary == array[i].getSalary() && array[i].getDepartment() == departmentNumber) {
                System.out.println("Сотрудник отдела №" + departmentNumber + " с максимальной зарплатой: " + "id:" + array[i].getId() + " " + array[i].getLastName() + " " + array[i].getFirstName() + " " +
                        array[i].getMiddleName() + " Зарплата " + array[i].getSalary() + " рублей.");
            }
        }
    }
    public double departmentSalaryMonthsSum(Employee[] array, byte departmentNumber) {
        double departmentSalaryMonthsSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == departmentNumber) {
                departmentSalaryMonthsSum = departmentSalaryMonthsSum + array[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц в отделе №" + departmentNumber + ": " + departmentSalaryMonthsSum + " рублей.");
        return departmentSalaryMonthsSum;
    }
    public void departmentAverageMonthsSalary(Employee[] array, byte departmentNumber) {
        byte x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == departmentNumber) {
                x++;
            }
        }
        System.out.println("Среднее значение зарплат в отделе №" + departmentNumber + ": " + departmentSalaryMonthsSum(array, departmentNumber) / x + " рублей.");
    }
    public void departmentEmployees(Employee[] array, byte departmentNumber) {
        String result = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == departmentNumber) {
                result = "EmployeeFound";
                System.out.println("Сотрудник отдела №" + departmentNumber + ": " + "id:" + array[i].getId() + " " + array[i].getLastName() + " " + array[i].getFirstName() + " " +
                        array[i].getMiddleName() + " Зарплата " + array[i].getSalary() + " рублей.");
            }
        }
        if (result == null) {
            System.out.println("Выбранного отдела не существует");
        }
    }
    public void departmentSalaryIndex(Employee[] array, byte departmentNumber, double index) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == departmentNumber) {
                array[i].setSalary(array[i].getSalary() * index);
            }
        }
    }
    public void employeesSalaryLessThan(Employee[] array, double number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() < number) {
                System.out.println("id:" + array[i].getId() + " " + array[i].getLastName() + " " + array[i].getFirstName() + " " + array[i].getMiddleName() + " Зарплата: " + array[i].getSalary() + " рублей.");
            }
        }
    }
    public void employeesSalaryMoreThan(Employee[] array, double number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() >= number) {
                System.out.println("id:" + array[i].getId() + " " + array[i].getLastName() + " " + array[i].getFirstName() + " " + array[i].getMiddleName() + " Зарплата: " + array[i].getSalary() + " рублей.");
            }
        }
    }
    Employee[] employees = new Employee[] {
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
}
