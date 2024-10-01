package com.api;

import javafx.scene.control.TableColumn;
import sun.awt.geom.AreaOp;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
//Function<String,Integer> val = x->x.length();
//Integer newdata = val.apply("mike");
//System.out.println(newdata);

//
//        Function<Integer,Integer> data = x->x*x;
//        Integer newdata = data.apply(10);
//        System.out.println(newdata);

//        List<Integer> data = Arrays.asList(10,20,30,40,50);
//        List<Integer> newdata = data.stream().map(x->x*x).collect(Collectors.toList());
//        System.out.println(newdata);


//        List<String> data = Arrays.asList("mike","stallin","boom","book");
//        List<String> newdata = data.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newdata);

//        List<String> data = Arrays.asList("Mike","Stallin","BOOM","BOOK");
//        List<String> newdata =  data.stream().map(x->x.toLowerCase()).collect(Collectors.toList());
//        System.out.println(newdata);

//        List<String> data = Arrays.asList("mike","stallin","boom","book");
//        List<Integer> newdata = data.stream().map(x->x.length()).collect(Collectors.toList());
//        System.out.println(newdata);
//
//        List<String> data = Arrays.asList("mike","stallin","boom","book");
//        List<String> newdata = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newdata);


//        List<String> data = Arrays.asList("mike","stallin","boom","book","mike","stallin","boom","book");
//        List<String> newdata = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newdata);

//        List<String> data = Arrays.asList("mike", "booook", "moa", "fi");
//        List<String> newdata = data.stream().filter(x -> x.length() > 3).collect(Collectors.toList());
//        System.out.println(newdata);

//        List<String> data = Arrays.asList("miasdfghjke","boms","a","asdfghjkab","aadsuigaa","bbbgsfigfiue");
//        List<String> newdata = data.stream().filter(x->x.length()>11).collect(Collectors.toList());
//      System.out.println(newdata);

//        List<Integer> data = Arrays.asList(100,200,150,98,255,123,12);
//        List<Integer> newdata = data.stream().filter(x->x>100).collect(Collectors.toList());
//        System.out.println(newdata);

//        List<Integer> data  = Arrays.asList(15,20,18,14,12,19,22);
//        List<Integer> newdata = data.stream().filter(x->x<15).collect(Collectors.toList());
//        System.out.println(newdata);

//        List<String> data = Arrays.asList("mi","da","sa","pa");
//        List<String> newdata = data.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newdata);
//
//        List<String> data = Arrays.asList("MI","BA","DS","RH");
//       List<String> newdata =  data.stream().map(x->x.toLowerCase()).collect(Collectors.toList());
//       System.out.println(newdata);
//
//       List<String> data =  Arrays.asList("mike","stallin","boom","book");
//       List<String> newdata = data.stream().sorted().collect(Collectors.toList());
//       System.out.println(newdata);

//        List<String> data = Arrays.asList("mike","stallin","boom","book");
//        List<String> newdata = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newdata);

//       List<String> data =  Arrays.asList("mike","stallin","mike","stallin","boom","book","boom","book");
//        List<String> newdata = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newdata);
//
//        List<String> data = Arrays.asList("mmam","wdsds","ssh","fghjk");
//        List<String> newdata = data.stream().filter(x->x.length()>4).collect(Collectors.toList());
//        System.out.println(newdata);

//        List<Employee> data = Arrays.asList(
//                new Employee(1, "mike", 529),
//                new Employee(2, "sak", 80000),
//                new Employee(3, "boob", 82740)
//        );
//        List<Employee> newdata = data.stream().filter(x->x.getSal()>8000).collect(Collectors.toList());
//        for(Employee emp : newdata){
//            System.out.println(emp.getId());
//            System.out.println(emp.getName());
//            System.out.println(emp.getSal());

//        List<Employee> data = Arrays.asList(
//                new Employee (1, "mike", 455),
//                new Employee (2, "stallin", 500),
//                new Employee (3, "mood", 600));
//
//        List<Employee> newdata = data.stream().filter(x->x.getSal()>460).collect(Collectors.toList());
//        for(Employee emp: newdata){
//
//            System.out.println(emp.getId());
//            System.out.println(emp.getName());
//            System.out.println(emp.getSal());
//        }
//        List<Employee>data = Arrays.asList(
//                new Employee(1, "mike", 12),
//                new Employee(2, "stallin", 15),
//                new Employee(3, "mack", 20)
//        );
//        List<Employee> newdata = data.stream().filter(x->x.getSal()>14).collect(Collectors.toList());
//        for(Employee emp : newdata){
//            System.out.println(emp.getId());
//            System.out.println(emp.getName());
//            System.out.println(emp.getSal());
//        }

//        List<Employee> data = Arrays.asList(
//                new Employee(1, "mike", 45612),
//                new Employee(2, "stallin", 5212),
//                new Employee(3, "mom", 4566)
//        );
//        List<Employee> newdata = data.stream().filter(x->x.getName().startsWith("m")).collect(Collectors.toList());
//        for(Employee emp: newdata){
//            System.out.println(emp.getId());
//            System.out.println(emp.getName());
//            System.out.println(emp.getSal());
//        }
//
//        List<Integer> data = Arrays.asList(10, 20, 48, 155);
//        data.stream().mapToInt(Integer::intValue)

//        List<Employee> data = Arrays.asList(
//                new Employee(1, "mike", 45612),
//                new Employee(2, "stallin", 5212),
//                new Employee(3, "mom", 4566)
//        );
//        int sum = data.stream().mapToInt(Employee::getSal).sum();
//        System.out.println(sum);


//        List<Integer> data = Arrays.asList(10, 20, 30, 45);
//        int sum = data.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);
//   List<Employee> data = Arrays.asList(
//           new Employee(1, "mike", 45612),
//               new Employee(2, "stallin", 5212),
//                new Employee(3, "mom", 4566)
//   );
//        int sum = data.stream().mapToInt(Employee::getSal).sum();
//          System.out.println(sum);

//        List<Employee> data = Arrays.asList(
//                new Employee(1, "mike", 1500),
//                new Employee(2, "stallin", 1800),
//                new Employee(3, "boom", 1200));
//
////        int sum = data.stream().mapToInt(Employee::getSal).sum();
////        System.out.println(sum);
///////////////////////////////////////////////////////////////////////////////////////////////
//        List<Integer> data = Arrays.asList(10, 20, 50, 80, 12);
//        int sum = data.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);

//        List<Employee> data = Arrays.asList(
//                new Employee(1,"mike",500),
//                new Employee(2, "stalin", 800),
//                new Employee(3, "mock", 600)
//        );
//        int sum  = data.stream().mapToInt(Employee::getSal).sum();
//        System.out.println(sum);

//      List<Integer> data=Arrays.asList(10,12,8,7,4,2,1);
//        Optional<Integer> min = data.stream().min(Integer::compareTo);
//        System.out.println(min);

//        List<Integer> data = Arrays.asList(1,2,4,5,8,8,4,5,4,1,2,5);
//        Map<Integer, Long> collect = data.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);

//        List<Integer> data = Arrays.asList(1,4,6,8,2,0);
//        Optional<Integer> newdata = data.stream().filter(x->x>6).findFirst();
//        System.out.println(newdata);

// List<Person> data = Arrays.asList(new Person(
//         "mike", 8),
//         new Person("stalin", 5),
//         new Person("mock", 6)
//         );
//        List<Person> collect = data.stream().sorted(Comparator.comparingInt(x -> x.age)).collect(Collectors.toList());
//        for(Person p : collect){
//            System.out.println(p.getName());
//            System.out.println(p.getAge());
//        }





    }
    }





