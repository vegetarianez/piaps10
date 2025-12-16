import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("=== Университетская система ===\n");

        University vgu = new University("ВГУ");
        Employee.setEmployeeCounter(0);

        AdministrativeEmployee admin = new AdministrativeEmployee(1001, "Иванов И.И.", "admin@vgu.ru");
        ResearchAssociate researcher = new ResearchAssociate(2001, "Сидоров А.А.", "sidorov@vgu.ru", "Информатика");
        Lecturer lecturer = new Lecturer(3001, "Петров П.П.", "petrov@vgu.ru", "Программирование");

        Faculty fkn = new Faculty("ФКН", admin);
        Institute softwareDept = new Institute("ПО", "ул. Университетская 1");

        fkn.addInstitute(softwareDept);
        vgu.addFaculty(fkn);
        vgu.addEmployee(admin);
        vgu.addEmployee(researcher);
        vgu.addEmployee(lecturer);

        researcher.addInstitute(softwareDept);
        lecturer.addInstitute(softwareDept);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Project project = new Project("Нейросети", sdf.parse("01.01.2024"), sdf.parse("31.12.2024"));
        researcher.participateInProject(project, 120, sdf.parse("01.01.2024"), sdf.parse("30.06.2024"));

        Course javaCourse = new Course(101, "Java", 4.0f);
        lecturer.addCourse(javaCourse);

        System.out.println(vgu);
        System.out.println("\nФакультеты:");
        for (Faculty f : vgu.getFaculties()) {
            System.out.println(f.getName() + " (декан: " + f.getDean().getName() + ")");
        }

        System.out.println("\nСотрудники:");
        for (Employee e : vgu.getEmployees()) {
            System.out.println("- " + e.getName() + " (" + e.getPosition() + ")");
        }

        System.out.println("\nКафедра ПО:");
        for (ResearchAssociate ra : softwareDept.getResearchAssociates()) {
            System.out.println("- " + ra.getName() + ", исследования: " + ra.getFieldOfStudy());
            if (ra.isLecturer()) {
                System.out.println("  Преподает: " + ra.getCourses().get(0).getName());
            }
        }

        System.out.println("\nПроекты:");
        System.out.println("- " + project.getName() + ", участники: " + project.getParticipations().size());

        System.out.println("\nВсего сотрудников в системе: " + Employee.getEmployeeCounter());
    }
}