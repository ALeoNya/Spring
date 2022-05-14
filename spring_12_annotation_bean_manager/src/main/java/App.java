import com.config.SpringConfig;
import com.dao.BookDao;
import com.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
//        System.out.println(bookDao1);
//
//        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");
//        System.out.println(bookDao2);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
        ctx.close();
    }
}
