package board.Service;

import java.util.List;
import java.util.Map;

import board.Model.BoardVO;

public interface BoardServiceInf {

	/**
	 * 
	* Method : getBoardPageList
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : PC10
	* 변경이력 :
	* @param page
	* @param pageSize
	* @return
	* Method 설명 : 게시글 페이지 리스트 조회
	 */
	public Map<String, Object> getBoardPageList(int page, int pageSize);
	
	/**
	 * 
	* Method : getBoardTotalCnt
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : PC10
	* 변경이력 :
	* @return
	* Method 설명 : 전체 글건수 조회
	 */
	public int getBoardTotalCnt();
	
	/**
	 * 
	* Method : getboard
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : PC10
	* 변경이력 :
	* @param mem_id
	* @return
	* Method 설명 : 글 상세정보 조회
	 */
	public BoardVO getboard(int board_seq);
	
}
