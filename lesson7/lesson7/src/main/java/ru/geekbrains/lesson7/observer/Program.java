package ru.geekbrains.lesson7.observer;

public class Program {

    /**
     * TO DO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 120000);
        Company yandex = new Company(jobAgency, "Yandex", 95000);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 90000);

        Student pertov = new Student("Petrov");
        Master master = new Master("Ivanov");
        Master sidorov = new Master("Sidorov");
        Middle ivanov = new Middle ("Ivanov");

        jobAgency.registerObserver(pertov);
        jobAgency.registerObserver(master);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(ivanov);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }


    }

}
