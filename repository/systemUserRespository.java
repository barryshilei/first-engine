package repository;

import entity.sysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;



/**
 * Created by 四个石头 on 2016/9/14.
 */

public interface systemUserRespository extends JpaRepository<sysUser,Integer> ,JpaSpecificationExecutor<sysUser> {


}
