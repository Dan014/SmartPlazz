package controller;

/**
 * Aca estan las carascteristicas que tienen el menu de la izquierda que apaece en todo el programa
 * @author Daniel Felipe Garcia
 *
 */

public enum CommandAction {
	boton1("INGRESAR AUTO", "AQUI SE EJECUTA EL COMANDO A", "/images/carro.png"),
	boton2("IMPRIMIR DATOS", "AQUI SE EJECUTA EL COMANDO S", "/images/imprimir.png"),
	boton3("INFORME MENSUAL", "AQUI SE EJECUTA EL COMANDO F", "/images/calendario.png"),
	boton4("BUSQUEDA MODELO", "AQUI SE EJECUTA EL COMANDO G", "/images/lupa.png"),
	boton5("SALIR", "AQUI SE EJECUTA EL COMANDO A", "/images/salir.png");


	private String commandName;
	private String toolTip;
	private String rutaImage;


	public String getCommandName() {
		return commandName;
	}

	public String getToolTip() {
		return toolTip;
	}
	

	public String getRutaImage() {
		return rutaImage;
	}

	private CommandAction(String commandName, String toolTip, String rutaImage) {
		this.commandName = commandName;
		this.toolTip = toolTip;
		this.rutaImage = rutaImage;
	}



}
