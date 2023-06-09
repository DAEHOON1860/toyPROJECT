package demo.mapper;

import demo.domain.Board;
import demo.domain.comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> getBoardList();

    void registerBoard(Board board);

    Board selectBoard(int seq);

    void updateViews(int seq);

    void deleteBoard();

    void deleteBoardBySeq(int seq);

    void updateBoard(@Param("subject") String subject, @Param("content") String content, @Param("seq") int seq);

    List<comment> selectComment(int seq);

    void registerComment(@Param("seq") int seq, @Param("id") String id, @Param("content") String content);
}
