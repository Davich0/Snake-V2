package principal;
import javax.swing.JFrame;
public class InicioSnake extends JFrame
{
	public InicioSnake()
    {	
		this.add(new GameVentana());
		this.setTitle("Snake V2.0");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setUndecorated(false);//ventana sin botones
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
