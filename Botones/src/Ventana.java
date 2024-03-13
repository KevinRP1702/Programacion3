import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.AttributeSetUtilities;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame{
public Ventana() {

			//Atributos de la ventana
			this.setVisible(true);
			this.setSize(1000,750);
			this.setLocation(200,200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(true);
			this.setTitle("Mi Ventana");
			this.setMinimumSize(new Dimension(250,250));
			this.setMaximumSize(new Dimension(1000,750));
			this.setLocationRelativeTo(null);

			this.setLayout(null);

			this.IniciarComponentes();
		}

	//Metodo para los componentes
	public void IniciarComponentes() {

	
		this.login();
		this.registro();
		//this.admin();
		this.repaint();	
	}
	
	public void registro() {
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLayout(null);
		registro.setBackground(Color.gray);
		registro.setLocation(500,0);
		this.add(registro);
		
		//Etiqueta titulo
		JLabel tituloRegistro = new JLabel("Registro", 0);
		tituloRegistro.setSize(300, 80);
		tituloRegistro.setLocation(100,20);
		tituloRegistro.setOpaque(true);
		tituloRegistro.setFont(new Font ("Agency FB", Font.BOLD, 40));
		tituloRegistro.setBackground(Color.CYAN);
		tituloRegistro.setForeground(Color.black);
		registro.add(tituloRegistro);
		
		//Etiqueta User
		JLabel nombreUser = new JLabel(" Nombre de usuario:", 0);
		nombreUser.setBounds(50,120,400,40);
		nombreUser.setFont(new Font ("Agency FB", Font.BOLD, 25));
		registro.add(nombreUser);
		
		//TextField user
		JTextField registroUser = new JTextField();
		registroUser.setHorizontalAlignment(0);
		registroUser.setFont(new Font ("Agency FB", Font.BOLD, 20));
		registroUser.setBounds(50,160,400,40);
		registroUser.setOpaque(true);
		registroUser.setBackground(Color.white);
		registro.add(registroUser);
		
		//Etiqueta registro
		JLabel bioRegistro = new JLabel("Bio",0);
		bioRegistro.setBounds(50,180,400,80);
		bioRegistro.setFont(new Font ("Agency FB", Font.BOLD, 25));
		registro.add(bioRegistro);
		
		//Textarea de la bio
		JTextArea textoBio = new JTextArea();
		textoBio.setBounds(50,240,400,80);
		textoBio.setFont(new Font ("Agency FB", Font.BOLD, 20));
		registro.add(textoBio);
		
		//Etiqueta preferencias
		JLabel preferencias = new JLabel("Preferencias",0);
		preferencias.setBounds(50,300,400,80);
		preferencias.setFont(new Font ("Agency FB", Font.BOLD, 25));
		registro.add(preferencias);
		
		//CheckBox preferencias
		JCheckBox check1 = new JCheckBox("Dulce");
		check1.setBounds(50,360,80,40);
		check1.setFont(new Font ("Agency FB", Font.BOLD, 25));
		check1.setBorderPainted(true);
		check1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		check1.setOpaque(false);
		registro.add(check1);
		
		//CheckBox preferencias
		JCheckBox check2 = new JCheckBox("Salado");
		check2.setBounds(140,360,80,40);
		check2.setFont(new Font ("Agency FB", Font.BOLD, 25));
		check2.setBorderPainted(true);
		check2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		check2.setOpaque(false);
		registro.add(check2);
		
		//CheckBox preferencias
		JCheckBox check3 = new JCheckBox("Saludable");
		check3.setBounds(230,360,110,40);
		check3.setFont(new Font ("Agency FB", Font.BOLD, 25));
		check3.setBorderPainted(true);
		check3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		check3.setOpaque(false);
		registro.add(check3);
		
		//Etiqueta terminos
		JLabel terminos = new JLabel("Terminos",0);
		terminos.setBounds(50,410,400,40);
		terminos.setFont(new Font ("Agency FB", Font.BOLD, 25));
		terminos.setOpaque(true);
		terminos.setBackground(Color.white);
		registro.add(terminos);
		
		//RadioButton aceptar
		JRadioButton aceptar = new JRadioButton("Acepto los terminos");
		aceptar.setBounds(50,450,180,40);
		aceptar.setOpaque(false);
		aceptar.setFont(new Font ("Agency FB", Font.BOLD, 22));
		registro.add(aceptar);
		
		//RadioButton no acepto
		JRadioButton noAceptar = new JRadioButton("No acepto los terminos");
		noAceptar.setBounds(250,450,190,40);
		noAceptar.setOpaque(false);
		noAceptar.setFont(new Font ("Agency FB", Font.BOLD, 22));
		registro.add(noAceptar);
		
		//Grupo de botones terminos
		ButtonGroup terminosGroup = new ButtonGroup();
		terminosGroup.add(aceptar);
		terminosGroup.add(noAceptar);
		
		//Grupo de botones preferencias
		ButtonGroup preferenciasGroup = new ButtonGroup();
		preferenciasGroup.add(check1);
		preferenciasGroup.add(check2);
		preferenciasGroup.add(check3);
		
		//String para el combobox
		String colonias[] = {"Centro" , "Camino real", "Pedregal", "Conchalito"};
		
		//Combobox Colonias
		JComboBox comboColonias = new JComboBox(colonias);
		comboColonias.setBounds(50,500,400, 40);
		comboColonias.setFont(new Font ("Agency FB", Font.BOLD, 22));
		registro.add(comboColonias);
		
		//Boton crear cuenta
		JButton btnCrear = new JButton("Crear Cuenta");
		btnCrear.setBounds(150,560,170,50);
		btnCrear.setFont(new Font ("Agency FB", Font.BOLD, 30));
		registro.add(btnCrear);
		
		btnCrear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String usuario = registroUser.getText();
				String bio = textoBio.getText();
						
				if(usuario.isEmpty()) {
					System.out.println("No ha ingresado su usuario");
					registroUser.setBorder(new LineBorder(Color.red,2,true));
				}else { 
					registroUser.setBorder(new LineBorder(Color.green,2,true));
				}
				if(bio.isEmpty()) {
					System.out.println("No ha ingresado su biografia");
					textoBio.setBorder(new LineBorder(Color.red,2,true));
				}else {
					textoBio.setBorder(new LineBorder(Color.green,2,true));
				}
				
				if(aceptar.isSelected()) {
					aceptar.setBorderPainted(true);
					aceptar.setBorder(new LineBorder(Color.green,2,true));
				}else {
					aceptar.setBorderPainted(false);
				}
				if(noAceptar.isSelected()) {
					noAceptar.setBorderPainted(true);
					noAceptar.setBorder(new LineBorder(Color.green,2,true));
				}else {
					noAceptar.setBorderPainted(false);
				}
			}
		});
		//Size
		//Location
		//Background - opaque
		//String constructor
	}
	
	public void login() {
		
		//Primer panel
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.CYAN);
		login.setLayout(null);
		this.add(login);
		
		//Etiqueta con imagen
		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("trofeo.png")));
		logo.setBounds(100, 430, 256, 256);
		login.add(logo);
		
		//Etiqueta titulo
		JLabel tituloLogin = new JLabel("Inicio de sesion", 0);
		tituloLogin.setSize(300, 80);
		tituloLogin.setLocation(100,20);
		tituloLogin.setOpaque(true);
		tituloLogin.setFont(new Font ("Agency FB", Font.BOLD, 40));
		tituloLogin.setBackground(Color.CYAN);
		tituloLogin.setForeground(Color.black);
		login.add(tituloLogin);

		//Etiqueta User
		JLabel nombreUser = new JLabel(" Nombre de usuario:");
		nombreUser.setBounds(90,120,180,40);
		nombreUser.setFont(new Font ("Agency FB", Font.BOLD, 25));
		login.add(nombreUser);

		//TextField user
		JTextField ingresarUser = new JTextField();
		ingresarUser.setBounds(90,170,300,35);
		ingresarUser.setOpaque(true);
		ingresarUser.setBackground(Color.white);
		login.add(ingresarUser);


		//Etiqueta contraseña
		JLabel password = new JLabel(" Contraseña:");
		password.setBounds(90,220,180,40);
		password.setFont(new Font ("Agency FB", Font.BOLD, 25));
		login.add(password);

		//Passwordfield para la contraseña
		JPasswordField ingresarContra = new JPasswordField();
		ingresarContra.setBounds(90,260,300,35);
		ingresarContra.setFont(new Font ("Agency FB", Font.BOLD, 25));
		login.add(ingresarContra);

		//CheckBox para recordarme
		JCheckBox recordarme = new JCheckBox("Recordarme");
		recordarme.setBounds(90,320,110,30);
		recordarme.setFont(new Font ("Agency FB", Font.BOLD, 20));
		recordarme.setOpaque(false);
		login.add(recordarme);

		//Etiqueta contraseña
		JLabel olvidarContra = new JLabel("¿Olvidó su contraseña?");
		olvidarContra.setBounds(250,314,180,40);
		olvidarContra.setFont(new Font ("Agency FB", Font.BOLD, 20));
		login.add(olvidarContra);

		//Boton acceder
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.setBounds(150,370,170,50);
		btnAcceder.setFont(new Font ("Agency FB", Font.BOLD, 30));
		login.add(btnAcceder);
		
		btnAcceder.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String usuario = ingresarUser.getText();
				String contra = new String(ingresarContra.getPassword());
						
				if(ingresarUser.getText().isEmpty()) {
					System.out.println("No ha ingresado su usuario");
					ingresarUser.setBorder(new LineBorder(Color.red,2,true));
				}else {
					ingresarUser.setBorder(new LineBorder(Color.green,2,true));
				}
				
				if (ingresarContra.getText().isEmpty()) {
					System.out.println("No ha ingresado su contraseña");
					ingresarContra.setBorder(new LineBorder(Color.red,2,true));
				}else {
					ingresarContra.setBorder(new LineBorder(Color.green,2,true));
				}
						
				if(usuario.equals("SuperUser") && contra.equals("123")) {
						System.out.println("Bienvenido");
					}else {
						System.out.println("Usuario no encontrado");
					}
				}
		});
	}
	
	//Metodo para el panel despues del registro
	public void admin() {
		
		//Añadir un panel
		JPanel pnlAdmin = new JPanel();
		pnlAdmin.setSize(this.getWidth(), this.getHeight());
		pnlAdmin.setBackground(Color.decode("#41C698"));
		pnlAdmin.setLayout(null);
		this.add(pnlAdmin);
		
		//añadir un menu
		JMenuBar barra = new JMenuBar();
		
		JMenu menuFile = new JMenu("Archivo");
		
		JMenuItem abrirItem = new JMenuItem("Abrir archivo...");
		this.setJMenuBar(barra);
		barra.add(menuFile);
		menuFile.add(abrirItem);
		
		//Etiqueta usuarios
		JLabel lblUsuarios = new JLabel("Usuarios", 0);
		lblUsuarios.setBounds(350,20,300,80);
		lblUsuarios.setFont(new Font ("Agency FB", Font.BOLD, 30));
		lblUsuarios.setOpaque(true);
		lblUsuarios.setBackground(Color.black);
		lblUsuarios.setForeground(Color.white);
		pnlAdmin.add(lblUsuarios);
	
		//Label dentro del widget
		JLabel tituloWidget = new JLabel("Total de usuarios", 0);
		tituloWidget.setBounds(40, 120, 300, 40);
		tituloWidget.setFont(new Font ("Agency FB", Font.BOLD, 25));
		tituloWidget.setForeground(Color.white);
		pnlAdmin.add(tituloWidget);
		
		
		//Label dentro del widget
		JLabel contenidoWidget = new JLabel("100", 0);
		contenidoWidget.setBounds(40, 160, 300, 40);
		contenidoWidget.setFont(new Font ("Agency FB", Font.BOLD, 25));
		contenidoWidget.setForeground(Color.white);
		pnlAdmin.add(contenidoWidget);
		
		//Label widget
		JLabel widget = new JLabel("");
		widget.setBounds(40,120,300,100);
		widget.setOpaque(true);
		widget.setBackground(Color.black);
		pnlAdmin.add(widget);
		
		JButton descarga = new JButton("Exportar");
		descarga.setBounds(750, 210, 100, 40);
		pnlAdmin.add(descarga);
		
		JButton añadir = new JButton("Añadir");
		añadir.setBounds(860, 210, 100, 40);
		pnlAdmin.add(añadir);
		
		/*Label tabla
		JLabel tabla = new JLabel("");
		tabla.setBounds(40, 260, 920, 300);
		tabla.setFont(new Font ("Agency FB", Font.BOLD, 25));
		tabla.setOpaque(true);
		tabla.setBackground(Color.black);
		pnlAdmin.add(tabla);
		*/
		
		String titulosTabla [] = {"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"};
		String datosTabla[][] = {
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"}
		};
		
		
		JTable tablaUsuarios = new JTable(datosTabla, titulosTabla);
		JScrollPane scrollTabla = new JScrollPane(tablaUsuarios);
		scrollTabla.setBounds(40, 260, 920, 300);
		pnlAdmin.add(scrollTabla);
	}
}