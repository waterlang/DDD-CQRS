package com.lyqf.replay;


import org.axonframework.eventhandling.replay.ReplayingCluster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CustomerReplay   {

	@Autowired
	@Qualifier(value ="customerReplayingCluster")
	private ReplayingCluster customerReplayingCluster;

	@RequestMapping("/test/replay")
	public void test(){
		System.out.println("------");
		customerReplayingCluster.startReplay();
	}
	
	

}
