package com.lishuai.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lishuai.blog.dto.OperationLogDTO;
import com.lishuai.blog.vo.PageResult;
import com.lishuai.blog.entity.OperationLog;
import com.lishuai.blog.vo.ConditionVO;

/**
 * 操作日志服务
 *
 * @author lishuai
 * @date 2021/07/29
 */
public interface OperationLogService extends IService<OperationLog> {

    /**
     * 查询日志列表
     *
     * @param conditionVO 条件
     * @return 日志列表
     */
    PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO);

}
