class AppClientes {

	public static void main(String[] args){
		LimpiarPantalla();
		System.out.println("Aplicacion Listado de Clientes - Ejemplo 2 Git");
		System.out.println("===============================================");

	}

	static void LimpiarPantalla() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			//new ProcessBuilder("cmd", "/c", "cls").inheritIO.start().waiFor(); PARA LIMPIAR OANTALLA EN LINUX
		} catch (Exception ex) {
		  System.out.println(ex.getMessage());
		
		}

	}

}