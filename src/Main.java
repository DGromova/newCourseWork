public class Main {
    public static void main(String[] args) {
        courseWork();
    }
    public static void courseWork() {
//        Employee employees[] = new Employee[10];
//        // Данные о сотрудниках
//        employees[0] = new Employee("Иванов", "Иван", "Иванович", (byte) 5, 70_000);
//        employees[1] = new Employee("Макаров", "Владимир", "Георгиевич", (byte) 2, 100_000);
//        employees[2] = new Employee("Исаев", "Матвей", "Максимович", (byte) 3, 100_000);
//        employees[3] = new Employee("Лаптев", "Даниил", "Павлович", (byte) 4, 130_000);
//        employees[4] = new Employee("Казакова", "Евгения", "Тимуровна", (byte) 5, 70_000);
//        employees[5] = new Employee("Лапшина", "Юлия", "Антоновна", (byte) 1, 70_000);
//        employees[6] = new Employee("Казаков", "Виталий", "Игоревич", (byte) 3, 95_000);
//        employees[7] = new Employee("Лазарева", "Дарья", "Николаевна", (byte) 1, 130_000);
//        employees[8] = new Employee("Максимов", "Александр", "Артурович", (byte) 5, 90_000);
//        employees[9] = new Employee("Зотова", "Екатерина", "Валентиновна", (byte) 4, 120_000);
        // Получение списка сотрудников со всеми данными
        EmployeeBook e = new EmployeeBook();
        System.out.println("СПИСОК ВСЕХ СОТРУДНИКОВ");
        e.allEmployees(e.employees);
        System.out.println();
        // Сумма затрат на зарплаты в месяц
        e.salaryMonthsSum(e.employees);
        System.out.println();
        // Сотрудник с минимальной зарплатой
        e.minSalaryEmployee(e.employees);
        System.out.println();
        // Сотрудник с максимальной зарплатой
        e.maxSalaryEmployee(e.employees);
        System.out.println();
        // Среднее значение зарплат
        e.averageMonthsSalary(e.employees);
        System.out.println();
        // Ф.И.О. всех сотрудников
        System.out.println("Ф.И.О. всех сотрудников:");
        e.allNames(e.employees);
        System.out.println();
        // Задания повышенной сложности
        // Увеличение зарплат в index раз
        e.salaryIndex(e.employees, 1.2);
        System.out.println();
        // Сотрудники выбранного отдела с минимальной зарплатой
        e.departmentEmployeesMinSalary(e.employees, (byte) 5);
        System.out.println();
        // Сотрудники выбранного отдела с максимальной зарплатой
        e.departmentEmployeesMaxSalary(e.employees, (byte) 5);
        System.out.println();
        // Сумма затрат в месяц на зарплаты по отделу
        e.departmentSalaryMonthsSum(e.employees, (byte) 5);
        System.out.println();
        // Среднее значение зарплат в выбранном отделе
        e.departmentAverageMonthsSalary(e.employees, (byte) 5);
        System.out.println();
        // Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра
        e.departmentSalaryIndex(e.employees, (byte) 3, 1.3);
        System.out.println();
        // Список сотрудников выбранного отдела
        e.departmentEmployees(e.employees, (byte) 5);
        System.out.println();
        // Получение всех сотрудников с зарплатой меньше заданного числа
        System.out.println("Все сотрудники с зарплатой меньше заданного числа:");
        e.employeesSalaryLessThan(e.employees, 130_000);
        System.out.println();
        // Получение всех сотрудников с зарплатой больше или равной заданному числу
        System.out.println("Все сотрудники с зарплатой больше или равной заданному числу:");
        e.employeesSalaryMoreThan(e.employees, 130_000);
        System.out.println();
    }
}