package team.a9043.yiluwiki;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.a9043.yiluwiki.entity.YwForumPost;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class YiluWikiApplicationTests {

    @Test
    public void contextLoads() {
        YwForumPost ywForumPost = new YwForumPost();
        ywForumPost.setYfpTitle("#$%^&*ASkfjghfakjshboi3qu4yroi");
        ywForumPost.setYfpContent("sadhjgfokuvhsdliauvfyhliehynrsplokguhnlkfdyhlkgvhuymlksdyvlgnoiueryloivtlvretulkidsfhlkgvhldsfk");
        JSONObject jsonObject = new JSONObject(ywForumPost);
        log.info(jsonObject.toString());
    }

}
