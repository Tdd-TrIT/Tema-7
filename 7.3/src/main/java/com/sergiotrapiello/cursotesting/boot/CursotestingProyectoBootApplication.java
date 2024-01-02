package com.sergiotrapiello.cursotesting.boot;

import java.util.Set;

import com.sergiotrapiello.cursotesting.application.controller.Controller;
import com.sergiotrapiello.cursotesting.application.ui.ConsoleUI;
import com.sergiotrapiello.cursotesting.application.ui.RequestDispatcher;

public class CursotestingProyectoBootApplication {

	public static void main(String[] args) {
		// TODO: configure controllers
		Set<Controller> controllers = Set.of();

		RequestDispatcher dispatcher = new RequestDispatcher(controllers);
		new ConsoleUI(dispatcher).run();
	}

}
