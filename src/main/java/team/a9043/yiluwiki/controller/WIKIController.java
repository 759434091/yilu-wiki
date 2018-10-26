package team.a9043.yiluwiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.a9043.yiluwiki.entity.YwPage;
import team.a9043.yiluwiki.service.ResourceNotFoundException;
import team.a9043.yiluwiki.service.WIKIService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class WIKIController {
    @Resource
    private WIKIService wikiService;

    @GetMapping("/pages/{ypId}")
    public YwPage getPage(@PathVariable Integer ypId) throws ResourceNotFoundException {
        return wikiService.getPage(ypId);
    }

    @GetMapping("/pages")
    public List<YwPage> getPages(@RequestParam(required = false) String ypName,
                                 @RequestParam(required = false) String ypType,
                                 @RequestParam(required = false) String ypAbstract) {
        return wikiService.getPages(ypName, ypType, ypAbstract);
    }

}
