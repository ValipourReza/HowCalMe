package comm;

public class Person {
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        System.out.println(stackTraceElement.getClassName() + "-" + stackTraceElement.getMethodName());

        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
