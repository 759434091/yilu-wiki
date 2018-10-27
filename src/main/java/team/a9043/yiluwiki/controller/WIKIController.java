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
                                 @RequestParam(required = false) String ypAbstract,
                                 @RequestParam Integer page,
                                 @RequestParam Integer pageSize) throws InvalidParameterException {
        if (page < 1)
            throw new InvalidParameterException("page must bigger than 0");
        if (pageSize < 1 || pageSize > 500)
            throw new InvalidParameterException("pageSize must between 1 and 500");
        return wikiService.getPages(ypName, ypType, ypAbstract, page, pageSize);
    }

}
