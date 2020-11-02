package com.store.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.store.mapper.TestMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MapperTest {

	@Setter(onMethod_ = @Autowired) 
	private TestMapper testMapper;
	
	@Test
	public void getTime() { //Mapper 인터페이스
		log.info(testMapper.getClass().getName());
		log.info(testMapper.getTime());
	}
	
	@Test
	public void getTime2() { //Mapper xml
		log.info("getTime2");
		log.info(testMapper.getTime2());
	}
}
