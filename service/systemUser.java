package service;

import entity.sysUser;

import java.util.List;

/**
 * Created by 四个石头 on 2016/9/14.
 */
public interface systemUser {
    public sysUser add(sysUser entity);
    public void delete(Integer id);
    public sysUser update(sysUser entity);
    public List<sysUser> findByAccount(String account);
    public List<sysUser> findById(Integer id);
}
