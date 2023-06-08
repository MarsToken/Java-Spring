import com.mayikt.service.MemberService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app =
                new ClassPathXmlApplicationContext("out_obj_spring_21.xml");
        MemberService memberService =
                (MemberService) app.getBean("memberService");
        memberService.addMember();
    }
}
