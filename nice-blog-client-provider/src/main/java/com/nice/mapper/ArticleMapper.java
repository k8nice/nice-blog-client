package com.nice.mapper;

import com.nice.model.Article;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * @author nice
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
    /**
     * 获取全部文章
     *
     * @return List<Article>
     */
    List<Article> queryArticleAll();
}
