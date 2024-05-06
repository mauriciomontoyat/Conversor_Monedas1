
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversor {
	public static void main(String[]args) {
		double cantidades;
		double resultados;
		
		boolean repetir=true;
		
		do {
			cantidades=Double.parseDouble(JOptionPane.showInputDialog("Ingresar la cantidad de dinero que desea convertir"));
			String[] opciones = {"Peso Colombiano a Dolar", "Peso Colombiano a Euro" , "Peso Colombiano a Libra Esterlina" , "Peso Colombiano a Yen Japones" , 
					"Peso Colombiano a Won SurCoreano" , "Dolar a Peso Colombiano" , "Euro a Peso Colombiano" , "Libra Esterlina a Peso Colombiano" ,
					"Yen Japones a Peso Colombiano" , "Won SurCoreano a Peso Colombiano"};
			
			String selecciones = (String) JOptionPane.showInputDialog(null,"Seleccione una opción","Lista de opciones",JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
			
			if(selecciones!=null) {
				System.out.println("Selecciono: " + selecciones);
			}else {
				System.out.println("No selecciono ninguna de las opciones");
			}
			
			if(selecciones==opciones[0]) {
				DecimalFormat df = new DecimalFormat("#.###");
				
				resultados=cantidades/4.006;
				String numero=df.format(resultados);
				JOptionPane.showMessageDialog(null,"Tiene" +numero+ "$Dolares");
				
			}else if(selecciones==opciones[1]) {
				DecimalFormat df = new DecimalFormat("#.###");
				resultados=cantidades/4.18;
				String numero=df.format(resultados);
				JOptionPane.showMessageDialog(null,"Tiene" +numero+ "€Euros");
				
			}else if(selecciones==opciones[2]) {
				DecimalFormat df = new DecimalFormat("#.###");
				resultados=cantidades/4.88;
				String numero=df.format(resultados);
				JOptionPane.showMessageDialog(null,"Tiene" +numero+ "£Libras Esterlinas");
			
			}else if(selecciones==opciones[3]){
				DecimalFormat df = new DecimalFormat("#.###");
				resultados=cantidades/0.12;
				String numero=df.format(resultados);
				JOptionPane.showMessageDialog(null,"Tiene" +numero+ "¥Yenes Japoneses");
				
			}else if(selecciones==opciones[4]){
				DecimalFormat df = new DecimalFormat("#.###");
				resultados=cantidades/0.013;
				String numero=df.format(resultados);
				JOptionPane.showMessageDialog(null,"Tiene" +numero+ "₩Wones SurCoreanos");
			
			}else if(selecciones==opciones[5]){
				DecimalFormat df = new DecimalFormat("#.###");
				resultados=17.11/cantidades;
				String numero=df.format(resultados);
				JOptionPane.showMessageDialog(null,"Tiene" +numero+ "$Pesos Colombianos");
			
			}else if(selecciones==opciones[6]){
				DecimalFormat df = new DecimalFormat("#.###");
				resultados=18.60/cantidades;
				String numero=df.format(resultados);
				JOptionPane.showMessageDialog(null,"Tiene" +numero+ "$Pesos Colombianos");
			
			}else if(selecciones==opciones[7]){
				DecimalFormat df = new DecimalFormat("#.###");
				resultados=21.61/cantidades;
				String numero=df.format(resultados);
				JOptionPane.showMessageDialog(null,"Tiene" +numero+ "$Pesos Colombianos");
				
			}else if(selecciones==opciones[8]){
				DecimalFormat df = new DecimalFormat("#.###");
				resultados=0.12/cantidades;
				String numero=df.format(resultados);
				JOptionPane.showMessageDialog(null,"Tiene" +numero+ "$Pesos Colombianos");
			
			}else if(selecciones==opciones[9]){
				DecimalFormat df = new DecimalFormat("#.###");
				resultados=0.013/cantidades;
				String numero=df.format(resultados);
				JOptionPane.showMessageDialog(null,"Tiene" +numero+ "$Pesos Colombianos");
			}
			
			int opcion=JOptionPane.showConfirmDialog(null, "¿Continuar?","Cancelar",JOptionPane.YES_NO_OPTION);
			
			if(opcion==JOptionPane.YES_OPTION) {
				System.out.println("Selecciono 'SI'");
				repetir=true;
			}else if(opcion==JOptionPane.NO_OPTION) {
				System.out.println("Selecciono 'NO'");
				repetir=false;
			}else if (opcion==JOptionPane.CANCEL_OPTION) {
				System.out.println("NO SE SELECCIONO NINGUNA OPCIÓN");
				repetir=false;
			}else {
				System.out.println("Selecciono 'SALIR'");
				repetir=false;
			}
			
		}while (repetir);
	}
}

