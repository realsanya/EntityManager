package manager;

import entity.Student;

import javax.sql.DataSource;


public class Main {
    public static void main(String[] args) {
        DataSource dataSource = SimpleDataSource.getDataSource();
        EntityManager entityManager = new EntityManager(dataSource);
        entityManager.createTable(Student.class);
        entityManager.save(Student.builder()
                .id(13)
                .firstName("Aleksandra")
                .lastName("Morozova")
                .age(19).build());
        System.out.println(entityManager.findById("student", Student.class, 2));
    }
}
