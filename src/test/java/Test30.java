import com.mayikt.entity.LifeCycleEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author WangMaoBo
 * @since 2023/6/7
 */
public class Test30 {
    private static final String TAG = "Test30";

    public static void main(String[] args) {
        // 七步
        ClassPathXmlApplicationContext app =
                new ClassPathXmlApplicationContext("life_cycle_spring_30.xml");
        LifeCycleEntity lifeCycleEntity = (LifeCycleEntity) app.getBean("lifeCycleEntity", LifeCycleEntity.class);
        // lifeCycleEntity.setName("tom");
        System.out.println("[第四步]-获取使用的" + lifeCycleEntity);
        app.close();

    }
}
