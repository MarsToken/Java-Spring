import com.mayikt.entity.EmpEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app =
                new ClassPathXmlApplicationContext("mulit_obj_spring_23.xml");
        EmpEntity empEntity = (EmpEntity) app.getBean("empEntity");
        System.out.println(empEntity);
    }
}
