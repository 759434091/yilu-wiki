package team.a9043.yiluwiki.service;

import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.a9043.yiluwiki.entity.YwForumPost;
import team.a9043.yiluwiki.exception.InvalidParameterException;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ForumServiceTest {
    @Resource
    private ForumService forumService;

    @Test
    public void test() throws InvalidParameterException {
        PageInfo<YwForumPost> list = forumService.getPosts(1, 10);
        log.info(list.toString());
    }
}
