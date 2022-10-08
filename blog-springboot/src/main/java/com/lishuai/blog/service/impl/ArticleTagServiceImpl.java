package com.lishuai.blog.service.impl;

import com.lishuai.blog.entity.ArticleTag;
import com.lishuai.blog.dao.ArticleTagDao;
import com.lishuai.blog.service.ArticleTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章标签服务
 *
 * @author lishuai
 * @date 2021/08/10
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagDao, ArticleTag> implements ArticleTagService {

}
