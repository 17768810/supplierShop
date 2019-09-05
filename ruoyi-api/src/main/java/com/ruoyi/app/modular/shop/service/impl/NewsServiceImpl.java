package com.ruoyi.app.modular.shop.service.impl;


//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.app.common.persistence.dao.StoreAdsMapper;
import com.ruoyi.app.common.persistence.dao.WechatNewsArticleMapper;
import com.ruoyi.app.common.persistence.model.StoreAds;
import com.ruoyi.app.common.persistence.model.WechatNewsArticle;
import com.ruoyi.app.modular.shop.service.IAdService;
import com.ruoyi.app.modular.shop.service.INewsService;
import org.springframework.stereotype.Service;


@Service
public class NewsServiceImpl extends ServiceImpl<WechatNewsArticleMapper, WechatNewsArticle>  implements INewsService {

}
