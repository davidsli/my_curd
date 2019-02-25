package com.github.qinyou.system;

import com.github.qinyou.system.model.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated MappingKit
 * system 模块数据表  MappingKit
 *
 * @author zhangchuang
 * @since 2019-02-21 10:34:18
 */
public class SystemModelMapping {

    public static void mapping(ActiveRecordPlugin arp) {
        // 系统用户表
        arp.addMapping("sys_user", "id", SysUser.class);
        // 用户设置项
        arp.addMapping("sys_user_setting", "id", SysUserSetting.class);
        // 角色
        arp.addMapping("sys_role", "id", SysRole.class);
        // 系统菜单
        arp.addMapping("sys_menu", "id", SysMenu.class);
        // 用户角色中间表
        arp.addMapping("sys_user_role", "sysUserId,sysRoleId", SysUserRole.class);
        // 角色菜单中间表
        arp.addMapping("sys_role_menu", "sysRoleId,sysMenuId", SysRoleMenu.class);
        // 组织机构表
        arp.addMapping("sys_org", "id", SysOrg.class);
        // 字典表
        arp.addMapping("sys_dict", "id", SysDict.class);
        // 字典分组表
        arp.addMapping("sys_dict_group", "id", SysDictGroup.class);
        // 用户上传的文件
        arp.addMapping("sys_file", "id", SysFile.class);
        // 通知消息
        arp.addMapping("sys_notice", "id", SysNotice.class);
        // 通知消息从表
        arp.addMapping("sys_notice_detail", "id", SysNoticeDetail.class);
        // 通知分类
        arp.addMapping("sys_notice_type", "id", SysNoticeType.class);
        // 系统通知类型角色中间表
        arp.addMapping("sys_notice_type_sys_role", "sysNoticeTypeId,sysRoleId", SysNoticeTypeSysRole.class);
        // 业务日志，程序主动记录的重要操作日志
        arp.addMapping("sys_service_log", "id", SysServiceLog.class);
        // 系统访问日志
        arp.addMapping("sys_visit_log", "id", SysVisitLog.class);
        // 定时任务日志
        arp.addMapping("sys_task_log", "id", SysTaskLog.class);
    }
}

