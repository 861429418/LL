package ee.gongz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("ee.gongz.mapper")
@SpringBootApplication
public class GongzApplication {

    public static void main(String[] args) {
        SpringApplication.run(GongzApplication.class, args);
    }

}
