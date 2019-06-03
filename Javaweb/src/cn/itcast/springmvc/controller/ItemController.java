package cn.itcast.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.itcast.springmvc.pojo.HaHa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.springmvc.pojo.Items;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ItemController
{
	@RequestMapping(value = "itemlist.action")
	public ModelAndView itemList()
	{
		ModelAndView mav = new ModelAndView();
		// 创建页面需要显示的商品数据
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(1, "1华为 荣耀8", 2399f, new Date(), "质量好！1"));
		list.add(new Items(2, "2华为 荣耀8", 2399f, new Date(), "质量好！2"));
		list.add(new Items(3, "3华为 荣耀8", 2399f, new Date(), "质量好！3"));
		list.add(new Items(4, "4华为 荣耀8", 2399f, new Date(), "质量好！4"));
		list.add(new Items(5, "5华为 荣耀8", 2399f, new Date(), "质量好！5"));
		list.add(new Items(6, "6华为 荣耀8", 2399f, new Date(), "质量好！6"));
//		mav.setViewName("/WEB-INF/jsp/itemList.jsp");
		mav.setViewName("itemList");
		mav.addObject("itemList",list);
		return mav;
	}
	@RequestMapping("test.action")
    public String test() {
	    return "test";
    }
    @RequestMapping("user.action")
    @ResponseBody
//    public HaHa haha(HttpServletRequest request, String username, String password, String email, String qq) {
    public HaHa haha(HttpServletRequest request, HaHa haha) {
        /*String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String qq = request.getParameter("qq");*/
        System.out.println(haha.toString());
        return haha;
    }
}
