package com.xyinc.poi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xyinc.poi.model.Poi;
import com.xyinc.poi.service.PoiService;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PoiApplicationTests {

	@Autowired
	private PoiService service;

	@Test
	public void contextLoads() {

		Poi lanchonete = new Poi(27, 12, "Lanchonete");
		service.save(lanchonete);

		Poi posto = new Poi(31, 18, "Posto");
		service.save(posto);

		Poi joalheria = new Poi(15, 12, "Joalheria");
		service.save(joalheria);

		Poi floricultura = new Poi(19, 21, "Floricultura");
		service.save(floricultura);

		Poi pub = new Poi(12, 8, "Pub");
		service.save(pub);

		Poi supermercado = new Poi(23, 6, "Supermercado");
		service.save(supermercado);

		Poi churrascaria = new Poi(28, 2, "Churrascaria");
		service.save(churrascaria);

		assertThat(service.listByProximity(20, 20, 10)).isNotEmpty();

	}

}
