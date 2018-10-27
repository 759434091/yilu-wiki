package team.a9043.yiluwiki.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import team.a9043.yiluwiki.controller.valid_group.InsertYwPage;
import team.a9043.yiluwiki.controller.valid_group.ModifyYwPage;
import team.a9043.yiluwiki.entity.YwPage;
import team.a9043.yiluwiki.exception.InvalidParameterException;
import team.a9043.yiluwiki.service.ResourceNotFoundException;
import team.a9043.yiluwiki.service.WIKIService;
import team.a9043.yiluwiki.service_pojo.OperationResponse;
import team.a9043.yiluwiki.service_pojo.VoidOperationResponse;

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

    @PostMapping("/pages")
    public OperationResponse<YwPage> insertPage(@RequestBody @Validated(InsertYwPage.class) YwPage ywPage,
                                                BindingResult bindingResult) throws InvalidParameterException {
        if (bindingResult.hasErrors())
            throw new InvalidParameterException(bindingResult.toString());
        return wikiService.insertPage(ywPage);
    }

    @PutMapping("/pages/{ypId}")
    public OperationResponse<YwPage> modifyPage(@PathVariable Integer ypId,
                                                @RequestBody @Validated(ModifyYwPage.class) YwPage ywPage,
                                                BindingResult bindingResult) throws InvalidParameterException {
        if (bindingResult.hasErrors())
            throw new InvalidParameterException(bindingResult.toString());
        return wikiService.modifyPage(ypId, ywPage);
    }

    @DeleteMapping("/pages/{ypId}")
    public VoidOperationResponse deletePage(@PathVariable Integer ypId) {
        return wikiService.deletePage(ypId);
    }
}
