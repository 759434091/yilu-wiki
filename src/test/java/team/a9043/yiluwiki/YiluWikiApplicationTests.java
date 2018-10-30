package team.a9043.yiluwiki;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.a9043.yiluwiki.util.Base64Utils;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
@Slf4j
public class YiluWikiApplicationTests {

    @Test
    public void contextLoads() {
        log.info("data:image/png;base64," + Base64Utils.ImageToBase64ByLocal("/media/a9043/Data/yilu_wiki/first_ssm/1.png"));
    }

}
