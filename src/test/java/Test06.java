import com.mayikt.entity.StuEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app =
                new ClassPathXmlApplicationContext("util_common_26.xml");
        StuEntity stuEntity = (StuEntity) app.getBean("stuEntity");
        System.out.println(stuEntity);
    }
}
