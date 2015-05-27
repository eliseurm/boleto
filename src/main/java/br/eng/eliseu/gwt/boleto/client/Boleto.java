package br.eng.eliseu.gwt.boleto.client;

import br.eng.eliseu.gwt.boleto.client.ui.Main;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Boleto implements EntryPoint {

	public void onModuleLoad() {
		Main main = new Main();
		RootPanel.get().add(main);

  }
}
