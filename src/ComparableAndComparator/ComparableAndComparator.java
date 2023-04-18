package ComparableAndComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ComparableAndComparator {
    //ComparableAndComparator.Book Class Implementation
    //========================================================================================================
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        //Adding values to the List
        books.add(new Book("A", "F", 1999));
        books.add(new Book("B", "H", 1996));
        books.add(new Book("C", "G", 2011));
        books.add(new Book("D", "J", 2001));
        books.add(new Book("E", "I", 1986));

        Collections.sort(books); //Sorting on the basis of Year Published in Increasing Order with the Comparable defined in the ComparableAndComparator.Book class

        System.out.println("The ComparableAndComparator.Book data in a sorted fashion on the basis of Year Published");

        for(Book b:books) // Printing out the result
            System.out.println(b.getTitle()+" "+b.getAuthor()+" "+b.getYearPublished());
        System.out.println();


        //ComparableAndComparator.Employee Class Implementation
        //========================================================================================================

        List<Employee> employees = new ArrayList<>();
        //Adding values to the List
        employees.add(new Employee("A", 23, 25000));
        employees.add(new Employee("B", 42, 26000));
        employees.add(new Employee("C", 25, 62000));
        employees.add(new Employee("D", 25, 65000));
        employees.add(new Employee("E", 25, 35000));

        employees.sort(new SortByAgeThenSalary());

        System.out.println("The ComparableAndComparator.Employee data in a sorted fashion on the basis of Age and if age is same then Salary");

        for(Employee e:employees) // Printing out the result
            System.out.println(e.getName()+" "+e.getAge()+" "+e.getSalary());

    }
}

class SortByAgeThenSalary implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.age-o2.age==0)
        {
            return o1.salary-o2.salary;
        }
        return o1.age-o2.age;
    }
}