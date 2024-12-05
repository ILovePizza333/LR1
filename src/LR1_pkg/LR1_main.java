package LR1_pkg;

import java.io.File; // Для работы с файлами
import java.io.FileNotFoundException; // Исключение файл не найден
import java.io.PrintStream; // Для печати в файл
import java.util.Arrays; // Массивы для удобства сортировки
import java.util.Comparator; // Сравнение параметров объекта

public class LR1_main {

	public static void main(String[] args) {
		// Создаем массив объектов
		Person[] people = new Person[] {
				new Person("Бархатов Егор Александрович", 22, "НГТУ НЭТИ 27.03.04", "Новосибирск"),
				new Person("Васютин Ярослав Андреевич", 22, "НГТУ НЭТИ 27.03.04", "Новосибирск"),
				new Person("Волобуев Кирилл Андреевич", 22, "НГТУ НЭТИ 27.03.04", "Новосибирск"),
				new Person("Жиляев Максим Романович", 22, "НГТУ НЭТИ 27.03.04", "Алтайский край"),
				new Person("Житяйкина Анастасия Павловна", 22, "НГТУ НЭТИ 10.03.04", "Новокузнецк"),
				new Person("Каплун Захар Александрович", 25, "НГТУ НЭТИ 27.03.04", "Шарыпово"),
				new Person("Москалева Виолетта Михайловна", 22, "НГТУ НЭТИ 27.03.04", "Новосибирск"),
				new Person("Перелыгин Роман Иванович", 22, "НГТУ НЭТИ 10.03.04", "Новосибирск"),
				new Person("Пивнев Матвей Александрович", 22, "НГТУ НЭТИ 27.03.04", "Новосибирск"),
				new Person("Плотников Игорь Вадимович", 22, "НГТУ НЭТИ 10.03.04", "Новосибирск"),
				new Person("Скворцов Матвей Викторович", 21, "НГТУ НЭТИ 27.03.04", "Барабинск"),
				new Person("Сотников Вячеслав Сергеевич", 21, "НГТУ НЭТИ 10.03.04", "Новосибирск"),
				new Person("Тайлакова Анастасия Сергеевна", 22, "НГТУ НЭТИ 10.03.04", "Новосибирск"),
				new Person("Тертычный Вадим Андреевич", 22, "НГТУ НЭТИ 27.03.04", "Новосибирск"),
				new Person("Ценина Анна Валерьевна", 22, "НГТУ НЭТИ 10.03.04", "Омск"),
				new Person("Цирульникова Ксения Алексеевна", 22, "НГТУ НЭТИ 27.03.04", "Барнаул"),
				new Person("Цуркан Захар Александрович", 22, "НГТУ НЭТИ 27.03.04", "Новосибирск"),
				new Person("Юрьева Виктория Витальевна", 22, "НГТУ НЭТИ 27.03.04", "Новосибирск") };

		// Сортировка по родному городу
		Arrays.sort(people, Comparator.comparing(Person::getCity));
		System.out.println("\nСортировка по родному городу:");
		printPeople(people);

		// Сортировка по возрасту
		Arrays.sort(people, Comparator.comparingInt(Person::getAge));
		System.out.println("\nСортировка по возрасту:");
		printPeople(people);

		// Сортировка по зарплате
		Arrays.sort(people, Comparator.comparing(Person::getEducation));
		System.out.println("\nСортировка по предыдущему направлению обучения:");
		printPeople(people);

		// Сортировка по имени
		Arrays.sort(people, Comparator.comparing(Person::getName));
		System.out.println("\nСортировка по имени:");
		printPeople(people);

		// Запись массива в текстовый файл
		writeToFile(people, "ААМ-24.txt");
	}
	// Построчная печать всех элементов массива
	private static void printPeople(Person[] people) {
		for (Person person : people) { // Проход по всем элементам массива people
			person.print();
		}
	}
	// Построчная запись в файл всех элементов массива
	private static void writeToFile(Person[] people, String fileName) {
		try {
			PrintStream out = new PrintStream(new File(fileName));
			for (Person person : people)
				person.printToFile(out);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

}