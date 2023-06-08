import com.mayikt.entity.EmpEntity;
import com.mayikt.entity.LifeCycleEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author WangMaoBo
 * @since 2023/6/7
 */
public class Test33 {
    private static final String TAG = "Test30";

    public static void main(String[] args) {
        ClassPathXmlApplicationContext app =
                new ClassPathXmlApplicationContext("auto_wire_33.xml");
        EmpEntity entity = app.getBean("empEntity", EmpEntity.class);
        System.out.println("获取使用的" + entity);
        app.close();

    }
}
