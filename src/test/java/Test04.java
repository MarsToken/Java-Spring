import com.mayikt.entity.EmpEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app =
                new ClassPathXmlApplicationContext("inner_obj_spring_22.xml");
        EmpEntity empEntity = (EmpEntity) app.getBean("empEntity");
        System.out.println(empEntity);
    }
}
