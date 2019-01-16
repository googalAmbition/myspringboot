package com.ctc.myspringboot.controller.api;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ctc.myspringboot.common.dto.ExecuteResult;
import com.ctc.myspringboot.condition.dict.DictTypeCondition;
import com.ctc.myspringboot.model.dict.DictType;
import com.ctc.myspringboot.service.dict.DictTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author ctc
 * @date 2019-01-15 17:15
 */
@Api(value = "字典类型", tags = "字典类型tags")
@Validated
@RestController
@RequestMapping("/api/dict/type")
public class DictTypeApiController {

    @Autowired
    private DictTypeService dictTypeService;

    @ApiOperation(value = "保存", notes = "保存Hibernate Valid验证")
    @PostMapping
    public ExecuteResult save(@Valid DictType type) {
        if (dictTypeService.save(type)) {

            return ExecuteResult.ok();
        }
        return ExecuteResult.fail("保存失败");
    }

    @ApiOperation(value = "修改")
    @ApiImplicitParam(name = "id", value = "字典类型id", required = true, dataType = "int", paramType = "query")
    @PutMapping
    public ExecuteResult update(@Valid DictType type, @NotNull(message = "字典类型id不能为空") Integer id) {
        if (dictTypeService.updateById(type)) {
            return ExecuteResult.ok();
        }
        return ExecuteResult.fail("字典类型更新失败");
    }

    @ApiOperation(value = "详情")
    @ApiImplicitParam(name = "id", value = "字典类型id", required = true, dataType = "int", paramType = "path")
    @GetMapping("/{id}")
    public ExecuteResult detail(@PathVariable Integer id) {
        DictType info = dictTypeService.getById(id);
        return ExecuteResult.ok(info);
    }

    @ApiOperation(value = "列表")
    @ApiImplicitParams({@ApiImplicitParam(name = "page", value = "第几页（默认1）", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "limit", value = "页面大小（默认10）", dataType = "int", paramType = "query")})
    @GetMapping
    public ExecuteResult<List<DictType>> list(DictTypeCondition condition, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer limit) {
        IPage p = dictTypeService.listByCondition(condition, page, limit);
        return ExecuteResult.ok(p.getRecords());
    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id", value = "字典类型id", dataType = "int", paramType = "query")
    @DeleteMapping
    public ExecuteResult delete(@NotNull(message = "id不能为空") Integer id) {
        if (dictTypeService.removeById(id)){
            return ExecuteResult.ok();
        }
        return ExecuteResult.fail("删除失败");
    }

}

