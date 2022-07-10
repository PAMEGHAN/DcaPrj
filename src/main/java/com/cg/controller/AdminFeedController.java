
package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Feed;
import com.cg.serviceimpl.FeedService;

@RestController
public class AdminFeedController {

	@Autowired
	private FeedService feedService;

	@DeleteMapping("/deleteFeed/{id}")
	public List<Feed> deleteFeed(@PathVariable("id") int feedId) {
		return feedService.deleteFeed(feedId);
	}

}
