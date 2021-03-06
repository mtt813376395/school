package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.service.ICourseService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="课程相关接口")
@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private ICourseService courseService;
	@ApiOperation("查找所有课程信息")
	@GetMapping("findAllCourse")
	public MsgResponse findAllCourse(){
		try {
			List<Course> list=courseService.findAllCourse();
			
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@ApiOperation("通过ID查找课程信息")
	@GetMapping("findById")
	public MsgResponse findById(@RequestParam long id){
		try {
			Course list=courseService.findById(id);
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@ApiOperation("通过课程名查找课程信息")
	@GetMapping("query")
	public MsgResponse query(String keywords){
		try {
			List<Course> list=courseService.query(keywords);
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@ApiOperation("添加或修改课程信息")
	@PostMapping("saveOrupdate")
	public MsgResponse saveOrupdate(Course course){
		try {
			courseService.saveOrupdate(course);
			return MsgResponse.success("success", course);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@ApiOperation("通过ID删除课程信息")
	@GetMapping("deleteById")
	public MsgResponse deleteById(@RequestParam long id){
		try {
			courseService.deleteById(id);
			return MsgResponse.success("success", id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@ApiOperation("批量删除课程信息")
	@GetMapping("batchDelete")
	public MsgResponse batchDelete(@RequestParam List<Long> ids){
		try {
			courseService.batchDelete(ids);
			return MsgResponse.success("success", ids);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
			// TODO: handle exception
		}
	}

}
