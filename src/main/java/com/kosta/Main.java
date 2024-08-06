package com.kosta;

import com.config.ProjectConfig;
import com.config.ProjectConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

          Parrot p = context.getBean(Parrot.class);
          System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer i = context.getBean(Integer.class);
        System.out.println(i);


/*        Parrot p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());*/
        }
}