public class Main {
    public static void main(String[] args) {
        //task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+' '+ firstName+ ' ' +middleName;
        System.out.println("ФИО сотрудника —"+ fullName);

        //task2
        String SUP = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+ SUP);

        //task3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);
    }
}