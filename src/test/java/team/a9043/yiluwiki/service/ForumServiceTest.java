package team.a9043.yiluwiki.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.a9043.yiluwiki.entity.YwForumReply;
import team.a9043.yiluwiki.exception.InvalidParameterException;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ForumServiceTest {
    @Resource
    private ForumService forumService;

    @Test
    public void test() throws InvalidParameterException {
        List<YwForumReply> list = forumService.getReplies(10, 1, 10);
        log.info(list.toString());
    }
}
