package com.ctc.myspringboot.controller.api;

import com.ctc.myspringboot.service.dict.DictDataService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ctc
 * @date 2019-01-15 17:15
 */

@Api(value = "字典数据", tags = "字典数据tags")
@RestController
@RequestMapping("/api/dict/data")
public class DictDataApiController {

    @Autowired
    private DictDataService dictDataService;


    //@GetMapping("/list")
    //public

}

