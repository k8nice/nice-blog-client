package com.nice.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.google.gson.Gson;
import com.nice.service.ArticleService;
import org.springframework.web.bind.annotation.*;

/**
 * ArticleController类
 *
 * @author nice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/article", method = RequestMethod.GET)
public class ArticleController {

    @Reference(
            version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:20885"
    )
    public ArticleService articleService;

    /**
     * 获取全部文章
     *
     * @return String
     */
    @GetMapping("/query/all")
    public String queryArticleAll() {
        Gson gson = new Gson();
        return gson.toJson(articleService.queryArticleAll());
    }

    /**
     * 根据标题和日期获取文章
     *
     * @param articleTitle
     * @param articleDate
     * @return "success"
     */
    @GetMapping("/{articleTitle}/{articleDate}")
    public String queryArticleByDateAndTitle(@PathVariable("articleTitle") String articleTitle, @PathVariable("articleDate") String articleDate) {
        System.out.println(articleTitle + articleDate);
        return "success";
    }

}
