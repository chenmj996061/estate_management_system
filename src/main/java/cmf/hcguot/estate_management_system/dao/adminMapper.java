package cmf.hcguot.estate_management_system.dao;

import cmf.hcguot.estate_management_system.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface adminMapper {

    /**
     * 遍历所有的Admin信息
     * @return
     */
    List<Admin> findAllAdmin();

    /**
     * 按照传入的name，password进行Admin的查询
     * 返回对应的Admin信息
     * @param name
     * @param password
     * @return
     */
    Admin findAdminByNP(String name,String password);

    /**
     * 按照传入的id删除对应的Admin
     * 返回影响的行数
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 按照传入的Admin信息进行添加数据
     * 返回影响的行数
     * @param record
     * @return
     */
    int insert(Admin record);

    /**
     * 按照传入的Admin信息进行添加数据
     * 返回影响的行数
     * @param record
     * @return
     */
    int insertSelective(Admin record);

    /**
     * 按照传入的id查找对应的Admin
     * 返回Admin的信息
     * @param id
     * @return
     */
    Admin selectByPrimaryKey(Integer id);

    /**
     * 按照传入的Admin信息进行判断修改
     * 加入判断提高了运行的效率
     * 返回影响的行数
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * 按照传入的Admin信息进行判断修改
     * 返回影响的行数
     * @param record
     * @return
     */
    int updateByPrimaryKey(Admin record);
}