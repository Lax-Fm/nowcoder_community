package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    //获取所有评论
    List<Comment> selectCommentsByEntity(int entityType, int entityId, int offset, int limit);

    //查询评论数
    int selectCountByEntity(int entityType, int entityId);

    //添加帖子
    int insertComment(Comment comment);

    //通过帖子id，获取评论
    Comment selectCommentById(int id);

    //获取用户的所有评论
    List<Comment> selectCommentsByUser(int userId, int offset, int limit);

    //统计用户的评论数
    int selectCountByUser(int userId);
}
