package service;

import entity.sysUser;
import org.springframework.stereotype.Service;
import repository.systemUserRespository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 四个石头 on 2016/9/14.
 */
@Service("systemService")
public class systemUserImpl implements systemUser{
    @Resource
    private systemUserRespository SystemserRespository;
    public sysUser add(sysUser entity) {
        return SystemserRespository.save(entity);
    }
    public void delete(Integer id) { SystemserRespository.delete(id);}
    public sysUser update(sysUser entity){ return  SystemserRespository.save(entity);}

    public List<sysUser> findByAccount(String account) {
       return SystemserRespository.findByAccount(account);
    }
    public List<sysUser> findById(Integer id) {
        return SystemserRespository.findById(id);
    }







}
