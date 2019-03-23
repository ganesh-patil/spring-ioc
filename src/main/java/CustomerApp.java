import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CustomerApp {


    public static void main(String[] args){

        Customer cst = new Customer();
        System.out.println(cst);


        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
        Customer custoObj = (Customer) factory.getBean("customer");
        System.out.println(custoObj.getName());

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Customer cst1 = (Customer) context.getBean("customer");
        System.out.println(cst1.getName());
    }

}
