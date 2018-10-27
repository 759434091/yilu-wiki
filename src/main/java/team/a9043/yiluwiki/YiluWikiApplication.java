package team.a9043.yiluwiki;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("team.a9043.yiluwiki.mapper")
public class YiluWikiApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiluWikiApplication.class, args);
    }
}
