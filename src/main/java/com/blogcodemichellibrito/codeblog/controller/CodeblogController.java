package com.blogcodemichellibrito.codeblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.blogcodemichellibrito.codeblog.model.Post;
import com.blogcodemichellibrito.codeblog.service.CodeblogService;

@Controller
public class CodeblogController {

	@Autowired
	CodeblogService service; //esta referenciando a interface e não a implementação, caso no futuro haja mais de uma implementação evitará o codigo quebrar
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPost() {
		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = service.findAll();
		mv.addObject("posts", posts);
		return mv;
	}
	
	@RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
	public ModelAndView getPostDetails(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView("postDetails");
		Post post = service.findById(id);
		mv.addObject("post", post);
		return mv;
	}
}
