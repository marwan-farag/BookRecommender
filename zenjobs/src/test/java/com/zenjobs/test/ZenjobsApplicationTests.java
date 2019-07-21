package com.zenjobs.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zenjobs.test.rest.RecommendationController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZenjobsApplicationTests {

	@Autowired
    private RecommendationController controller;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

}
