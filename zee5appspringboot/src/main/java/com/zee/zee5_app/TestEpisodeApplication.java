package com.zee.zee5_app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zee.zee5_app.dto.Episode;
import com.zee.zee5_app.dto.Series;
import com.zee.zee5_app.exception.IdNotFoundException;
import com.zee.zee5_app.service.EpisodeService;

@SpringBootApplication
public class TestEpisodeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(TestEpisodeApplication.class, args);
		
		EpisodeService episodeService = applicationContext.getBean(EpisodeService.class);
		System.out.println("Add Episode");
		for (int i = 1; i <= 5; i++) {
			Episode episode = new Episode("epi000"+i, "EpisodeName"+i, 20+i, "Link"+i, null, null);
			Series series = new Series();
			series.setId("ser000"+i);
			episode.setSeries(series);
			System.out.println(episodeService.addEpisode(episode) + " " + i);
		}
		System.out.println();
		
		System.out.println("Get Episode by Id");
		System.out.println(episodeService.getEpisodeById("epi0004").get());
		System.out.println();
		
		System.out.println("Get All Episode Details - List");
		episodeService.getAllEpisodeDetails().get().forEach(e->System.out.println(e));
		System.out.println();
		
		System.out.println("Delete Episode by Id");
		try {
			System.out.println(episodeService.deleteEpisode("epi0003"));
		} catch (IdNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println();
		
		System.out.println("Get All Episode Details - Array");
		for (Episode episode : episodeService.getAllEpisode()) {
			System.out.println(episode);
		}
		System.out.println();
		
		applicationContext.close();
	}

}