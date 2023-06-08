import com.mayikt.entity.UserEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author WangMaoBo
 * @since 2023/6/7
 */
public class Test26 {
    private static final String TAG = "Test26";

    public static void main(String[] args) {
        ClassPathXmlApplicationContext app =
                new ClassPathXmlApplicationContext("factory_bean_spring_27.xml");
        UserEntity stuEntity = (UserEntity) app.getBean("userFactoryBean");
        System.out.println(stuEntity);
    }
}
