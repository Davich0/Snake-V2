package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class GameVentana extends JPanel implements ActionListener
{
	// Declaracion de variables.
	public int ANCHO_PANTALLA = 600,ALTURA_PANTALLA = 600;
	public int T_CUADRO = 15;
	public int T_ESPACIO = (ANCHO_PANTALLA*ALTURA_PANTALLA)/(T_CUADRO*T_CUADRO);
	public int DELAY = 100;
	public int x[] = new int[T_ESPACIO];
	public int y[] = new int[T_ESPACIO];
	public int nCuerpo = 5;
	public int comidasFin;
	public int comidaX;
	public int comidaY;
	public char direccion = 'R';
	public boolean correr = false;
	public Timer tiempo;
	public Random random;

	//El constructor de la clase GameVentana2.
	public GameVentana()
	{
		random = new Random();
		this.setPreferredSize(new Dimension(ANCHO_PANTALLA,ALTURA_PANTALLA)); //dimensiones de la ventana usando las variables
		this.setBackground(Color.GRAY); //color del escenario
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		Inicio();
	}
	/**
		La función Inicio() crea una nueva manzana, establece el booleano correr en verdadero, 
	 	crea un nuevo temporizador,y comienza el temporizador
	 */
	public void Inicio() 
	{
		newComida();
		correr = true;
		tiempo = new Timer(DELAY,this);
		tiempo.start();
	}
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		dibujo(g);
	}
	public void dibujo(Graphics g) 
	{
		if(correr) 
		{
			//coloca margen de cuadros en el escenario
            /*
            for(int i=0;i<ALTURA_PANTALLA/T_CUADRO;i++) 
			{
				g.drawLine(i*T_CUADRO, 0, i*T_CUADRO, ALTURA_PANTALLA);
				g.drawLine(0, i*T_CUADRO, ANCHO_PANTALLA, i*T_CUADRO);
			}
             */
			g.setColor(Color.red);
			g.fillOval(comidaX, comidaY, T_CUADRO, T_CUADRO);
		
			for(int i = 0; i< nCuerpo;i++) 
			{
				if(i == 0) 
				{
					g.setColor(Color.ORANGE);
					g.fillOval(x[i], y[i], T_CUADRO, T_CUADRO);
				}
				else 
				{
					g.setColor(new Color(45,180,10));
					//g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));  //multicolor el cuerpo de la serpiente
					g.fillOval(x[i], y[i], T_CUADRO, T_CUADRO);
				}			
			}
			g.setColor(Color.ORANGE);
			g.setFont( new Font("DialogInput",Font.BOLD, 30));
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Score: "+comidasFin, (ANCHO_PANTALLA - metrics.stringWidth("Score: "+comidasFin))/2,ALTURA_PANTALLA/8);
		}
		else 
		{
			gameOver(g);
		}
		
	}
	public void newComida()
	{
		comidaX = random.nextInt((int)(ANCHO_PANTALLA/T_CUADRO))*T_CUADRO;
		comidaY = random.nextInt((int)(ALTURA_PANTALLA/T_CUADRO))*T_CUADRO;
	}
	public void movimiento()
	{
		for(int i = nCuerpo;i>0;i--) 
		{
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		switch(direccion) 
		{
		case 'U':
			y[0] = y[0] - T_CUADRO;
			break;
		case 'D':
			y[0] = y[0] + T_CUADRO;
			break;
		case 'L':
			x[0] = x[0] - T_CUADRO;
			break;
		case 'R':
			x[0] = x[0] + T_CUADRO;
			break;
		}
	}
	public void comer() 
	{
		if((x[0] == comidaX) && (y[0] == comidaY)) 
		{
			nCuerpo++;
			comidasFin++;
			newComida();
		}
	}
	public void interacciones() 
	{
		// verifica si la cabeza choca con el cuerpo
		for(int i = nCuerpo;i>0;i--) 
		{
			if((x[0] == x[i])&& (y[0] == y[i])) 
			{
				correr = false;
			}
		}
		// comprobar si la cabeza toca el borde izquierdo
		if(x[0] < 0) 
		{
			correr = false;
		}
		// comprobar si la cabeza toca el borde derecho
		if(x[0] >= ANCHO_PANTALLA) 
		{
			correr = false;
		}
		// comprobar si la cabeza toca el borde superior
		if(y[0] < 0) {
			correr = false;
		}
		// comprobar si la cabeza toca el borde inferior
		if(y[0] >= ALTURA_PANTALLA) 
		{
			correr = false;
		}
		if(!correr) 
		{
			tiempo.stop();
		}
	}
	public void gameOver(Graphics g) 
	{
		//Puntaje de la Serpiente
		g.setColor(Color.white);
		g.setFont( new Font("DialogInput",Font.BOLD, 30));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("Score: "+comidasFin, (ANCHO_PANTALLA - metrics1.stringWidth("Score: "+comidasFin))/2, ALTURA_PANTALLA/8);

		//Custumizar texto de Game Over
		g.setColor(new Color(220,12,0));
		g.setFont( new Font("DialogInput",Font.BOLD, 50));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Game Over", (ANCHO_PANTALLA - metrics2.stringWidth("Game Over"))/2, ALTURA_PANTALLA/3);

		//Custumizar texto de Regresar al menu
		g.setColor(Color.white);
		g.setFont( new Font("DialogInput",Font.BOLD, 25));
		FontMetrics metrics3 = getFontMetrics(g.getFont());
		g.drawString("Presione Enter para Regresar al menu", (ANCHO_PANTALLA - metrics3.stringWidth("Presione Enter para Regresar al menu"))/2, ALTURA_PANTALLA/2);
		

    }
	public void actionPerformed(ActionEvent e) 
	{
		if(correr) 
		{
			movimiento();
			comer();
			interacciones();
		}
		repaint();
	}
	public class MyKeyAdapter extends KeyAdapter
	{
		public void keyPressed(KeyEvent e) 
		{
			switch(e.getKeyCode())
			{
			case KeyEvent.VK_LEFT:
				if(direccion != 'R') 
				{
					direccion = 'L';
				}
			break;
			case KeyEvent.VK_RIGHT:
				if(direccion != 'L') 
				{
					direccion = 'R';
				}
			break;
			case KeyEvent.VK_UP:
				if(direccion != 'D') 
				{
					direccion = 'U';
				}
			break;
			case KeyEvent.VK_DOWN:
				if(direccion != 'U') 
				{
					direccion = 'D';
				}
			break;
			case KeyEvent.VK_SPACE:
				tiempo.stop();
				String botones[]={"REANUDAR","SALIR"};
				int eleccion=JOptionPane.showOptionDialog(null, "HAZ PAUSADO EL JUEGO\nDeseas seguir Jugando?", "EN PAUSA",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
				botones, botones[0]);
				if(eleccion == JOptionPane.YES_OPTION)
				{
					tiempo.start();
				}
				else if(eleccion==JOptionPane.NO_OPTION)
				{
					menuPrincipal menuPrincipal = new menuPrincipal();
					menuPrincipal.setVisible(true);
				}
			break;
			case KeyEvent.VK_ENTER:
				tiempo.stop();
				String boton[]={"SALIR"};
				int op=JOptionPane.showOptionDialog(null, "EL JUEGO HA TERMINADO", 
				"GAME OVER",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
				boton, boton[0]);
				if(op == JOptionPane.YES_OPTION)
				{
					menuPrincipal menuPrincipal = new menuPrincipal();
					menuPrincipal.setVisible(true);
				}
			break;
			}
		}
	}
}