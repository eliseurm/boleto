package br.eng.eliseu.gwt.boleto.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class Main extends Composite implements HasText {

	private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);
	interface MainUiBinder extends UiBinder<Widget, Main> {	}

	@UiField TabLayoutPanel panel;
	
	public Main() {
		initWidget(uiBinder.createAndBindUi(this));
		
		panel.getTabWidget(1).getParent().setVisible(true);
		
	}

	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setText(String text) {
		// TODO Auto-generated method stub
		
	}

}
