package repository;

import entity.sysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;


/**
 * Created by 四个石头 on 2016/9/14.
 */

public interface systemUserRespository extends JpaRepository<sysUser,Integer> ,JpaSpecificationExecutor<sysUser> {
    @Query(value = "SELECT u.id from sysUser u WHERE u.id =?1",nativeQuery = true)
    java.util.List<sysUser> findById(Integer id);

    @Query("SELECT u.account from sysUser u WHERE u.account =?1")
    java.util.List<sysUser>findByAccount(String account);
}
