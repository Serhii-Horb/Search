package de.telran.Ex4_02_09.Map;import java.util.*;public class MapExample {    public static void main(String[] args) {        List<Integer> list = new ArrayList<>();        list.add(5);        list.add(43);        list.add(-1);        System.out.println(list);        Map<Integer, String> map = new HashMap<>();        map.put(5, "123");        map.put(4, "weferaga");        map.put(3, "56_replace");        map.put(2, "3453456436");        map.put(1, "Anton");        System.out.println(map.get(4));        Map<String, List<Double>> map2 = new HashMap<>();        map2.put("Anton", List.of(1.2, 5.3));        map2.put("Nastya", List.of((double) 5, 3.2));        System.out.println(map2.get("Anton"));    }}class Person {    private final String firstName;    private final String lastName;    public Person(String firstName, String lastName) {        this.firstName = firstName;        this.lastName = lastName;    }    public String getFirstName() {        return firstName;    }    public String getLastName() {        return lastName;    }    @Override    public boolean equals(Object o) {        if (this == o) return true;        if (o == null || getClass() != o.getClass()) return false;        Person person = (Person) o;        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);    }    @Override    public int hashCode() {        return Objects.hash(firstName, lastName);    }}