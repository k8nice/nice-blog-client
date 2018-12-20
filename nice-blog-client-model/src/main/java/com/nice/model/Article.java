package com.nice.model;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Article实体类
 *
 * @author nice
 */
@Data
public class Article implements Serializable {

    private static final long serialVersionUID = -3900707362516261200L;
    private Long articleId;
    private String articleTitle;
    private String articleType;
    private Date articleDate;
    private String articleContent;
    private String articleAuthor;
    private String articleClickRate;
}
