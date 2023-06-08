import com.mayikt.entity.UserEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author WangMaoBo
 * @since 2023/6/7
 */
public class Test27 {
    private static final String TAG = "Test27";

    public static void main(String[] args) {
        /*
         * scope="prototype"
         */
        ClassPathXmlApplicationContext app =
                new ClassPathXmlApplicationContext("single_instance_spring_28.xml");
        UserEntity stuEntity1 = (UserEntity) app.getBean("userEntity");
        UserEntity stuEntity2 = (UserEntity) app.getBean("userEntity");
        System.out.println(stuEntity1 == stuEntity2);
    }
}
