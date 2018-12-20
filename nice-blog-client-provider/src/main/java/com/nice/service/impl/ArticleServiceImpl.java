package com.nice.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nice.mapper.ArticleMapper;
import com.nice.model.Article;
import com.nice.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * ArticleService实现类
 *
 * @author nice
 */
@Component
@Service(
        version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 获取全部文章
     *
     * @return PageInfo<Article>
     */
    @Override
    public PageInfo<Article> queryArticleAll() {
        final PageInfo<Article> pageInfo = PageHelper.startPage(1, 5).setOrderBy("article_id desc").doSelectPageInfo(() -> this.articleMapper.queryArticleAll());
        return pageInfo;
    }
}
