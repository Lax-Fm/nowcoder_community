package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    // 获取某页的所有帖子(发帖用户的id*，初始行的行数，每页显示的帖子数)
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // 获取帖子数目（发帖用户的id*）     写动态SQL（用if标签合成SQL）的方法若只有一个参数，必须用@Param注解该参数取别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
