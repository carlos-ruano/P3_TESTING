package lucatesting.proyecto3.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductosServicios {
	
	@Given("la pagina home de la web TC18")
	public void la_pagina_home_de_la_web_tc18() {
		System.out.println("hola");
	}
	@When("haces scroll TC18")
	public void haces_scroll_tc18() {
		System.out.println("me llamo");
	}
	@Then("encuentras un h2 con un titulo que incluye la palabra productos TC18")
	public void encuentras_un_h2_con_un_titulo_que_incluye_la_palabra_productos_tc18() {
	    System.out.println("carlos");
	}


}
