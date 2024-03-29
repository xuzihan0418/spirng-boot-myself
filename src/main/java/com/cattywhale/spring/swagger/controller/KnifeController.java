/**
 * project name:<font size = "1"><b>Swagger测试接口控制层</b></font><br>
 * file name:<font size = "1"><b>KnifeController</b></font><br>
 * description:<font size = "1"><b>Swagger测试接口控制层</b></font><br>
 *
 * @version 1.0.0<br>
 * @update [1] [2024/3/29 10:08] [xuzihan] [新建] <br>
 */
package com.cattywhale.spring.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "首页")
public class KnifeController {
    @ApiImplicitParam(name = "name", value = "姓名", required = true)
    @ApiOperation(value = "测试问好")
    @GetMapping("/sayHi")
    public ResponseEntity<String> sayHi(@PathVariable("name") String name) {
        return ResponseEntity.ok("Hi :" + name);
    }
}
