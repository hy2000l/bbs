package com.bbs.dao;

import java.util.List;

import com.bbs.entity.Board;

public class BoardDaoImpl extends BaseDao implements BoardDao {

	@Override
	public List<Board> findAll() {
		// TODO Auto-generated method stub
		String sql="select * from tbl_board  left join(select tbl_topic.* from tbl_topic join"
				+"(select board_id, max(publish_time) max_time from tbl_topic  "
				+"group by board_id) t on tbl_topic.board_id=t.board_id "
				+" where tbl_topic.publish_time=t.max_time)t "
				+" on tbl_board.board_id=t.board_id";
		
		return null;
	}

	@Override
	public int updateClick(int boardId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTopicCount(int boardId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
