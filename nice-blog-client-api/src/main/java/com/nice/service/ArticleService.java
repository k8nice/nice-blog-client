package com.nice.service;

import com.github.pagehelper.PageInfo;
import com.nice.model.Article;

/**
 * @author nice
 */
public interface ArticleService {
    /**
     * 获取全部文章
     *
     * @return PageInfo<Article>
     */
    PageInfo<Article> queryArticleAll();
}
