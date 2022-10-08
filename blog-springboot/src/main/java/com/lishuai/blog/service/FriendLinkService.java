package com.lishuai.blog.service;

import com.lishuai.blog.dto.FriendLinkBackDTO;
import com.lishuai.blog.dto.FriendLinkDTO;
import com.lishuai.blog.vo.ConditionVO;
import com.lishuai.blog.vo.PageResult;
import com.lishuai.blog.entity.FriendLink;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lishuai.blog.vo.FriendLinkVO;

import java.util.List;

/**
 * 友链服务
 *
 * @author lishuai
 * @date 2021/07/29
 */
public interface FriendLinkService extends IService<FriendLink> {

    /**
     * 查看友链列表
     *
     * @return 友链列表
     */
    List<FriendLinkDTO> listFriendLinks();

    /**
     * 查看后台友链列表
     *
     * @param condition 条件
     * @return 友链列表
     */
    PageResult<FriendLinkBackDTO> listFriendLinkDTO(ConditionVO condition);

    /**
     * 保存或更新友链
     *
     * @param friendLinkVO 友链
     */
    void saveOrUpdateFriendLink(FriendLinkVO friendLinkVO);

}
