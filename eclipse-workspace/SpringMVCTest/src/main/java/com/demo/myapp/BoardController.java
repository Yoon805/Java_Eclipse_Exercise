package com.demo.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board/")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/*
	 * @Autowired BoardService service;
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "get-board-list.do", method = RequestMethod.GET)
	 * public ResultVO getBoardList() { logger.info("[GET] getBoardList");
	 * 
	 * ResultVO result = new ResultVO(false, null);
	 * 
	 * try { result.setresult(service.getBoardList()); } catch (Exception e) { //
	 * TODO: handle exception logger.error("[Board] getBoardList : " +
	 * e.getMessage(),e); } return "home"; }
	 */

}
