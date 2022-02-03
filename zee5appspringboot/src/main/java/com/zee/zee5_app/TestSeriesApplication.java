package com.zee.zee5_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zee.zee5_app.dto.Series;
import com.zee.zee5_app.exception.IdNotFoundException;
import com.zee.zee5_app.service.SeriesService;

@SpringBootApplication
public class TestSeriesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(TestSeriesApplication.class, args);
		
		SeriesService seriesService = applicationContext.getBean(SeriesService.class);
		System.out.println("Add Series");
		for (int i = 1; i <= 5; i++) {
			Series series = new Series("ser000"+i, "SeriesName"+i, 5+i, null, "Cast"+i, "Genre"+i, "2022-04-0"+i, "Language"+i, 18+i, null);
			System.out.println(seriesService.addSeries(series) + " " + i);
		}
		System.out.println();
		
		System.out.println("Get Series by Id");
		System.out.println(seriesService.getSeriesById("ser0004").get());
		System.out.println();
		
		System.out.println("Get All Series Details - List");
		seriesService.getAllSeriesDetails().get().forEach(e->System.out.println(e));
		System.out.println();
		
		System.out.println("Delete Series by Id");
		try {
			System.out.println(seriesService.deleteSeries("ser0003"));
		} catch (IdNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println();
		
		System.out.println("Get All Series Details - Array");
		for (Series series : seriesService.getAllSeries()) {
			System.out.println(series);
		}
		System.out.println();
		
		applicationContext.close();
	}

}