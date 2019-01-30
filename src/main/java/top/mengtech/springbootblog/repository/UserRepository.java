package top.mengtech.springbootblog.repository;

import top.mengtech.springbootblog.domain.User;

import java.util.List;

public interface UserRepository {

    /**
     * 创建或修改用户
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 删除用户
     * @param user
     */
    void deleteUser(User user);

    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取用户列表
     * @return
     */
    List<User> listUsers();
}
