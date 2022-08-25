package principal;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
public class menuPrincipal extends javax.swing.JFrame 
{     
    /**
     * Implementacion de elementos de la libreria Swing
     */               
    public javax.swing.JLabel logo,titulo  ;
    public javax.swing.JButton op1,op2,op3,op4; 
    /**
     * Redirigimos a la parte prinicipal
     * Colocacion de parametros para la ventana
     * -centrar ventana
     * -Negamos el cambio de dimensiones de ventana
     */
    public menuPrincipal() 
    {     
        inicio();
        this.setSize(700,700);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);	
        this.setResizable(false);
        this.setVisible(true);
    }
    /**
     * Implementacion de elementos para la presentacion del menu
     * -titulo
     * -logo
     * -opcion 1 (Iniciar)
     * -opcion 2 (Instrucciones)
     * -opcion 3 (Creditos)
     * -opcion 4 (Salir)
     * Posicionamiento de cada uno de los elementos y su tamaño
     */
    public void inicio() 
    {  
        titulo = new javax.swing.JLabel();
        op1 = new javax.swing.JButton();
        op2 = new javax.swing.JButton();
        op3 = new javax.swing.JButton();
        op4 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        titulo.setBackground(java.awt.Color.green);
        titulo.setFont(new java.awt.Font("Berlin Sans FB", 1, 50));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Snake V2.0");
        titulo.setAlignmentY(0.0F);

        op1.setBackground(new java.awt.Color(28, 237, 123));
        op1.setFont(new java.awt.Font("DialogInput", 0, 12));
        op1.setText("INICIAR");
        op1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                op1MouseClicked(evt);
            }
        });

        op2.setBackground(new java.awt.Color(28, 237, 143));
        op2.setFont(new java.awt.Font("DialogInput", 0, 12));
        op2.setText("INSTRUCCIONES");
        op2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                op2MouseClicked(evt);
            }
        });

        op3.setBackground(new java.awt.Color(28, 237, 163));
        op3.setFont(new java.awt.Font("DialogInput", 0, 12));
        op3.setText("CREDITOS");
        op3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                op3MouseClicked(evt);
            }
        });

        op4.setBackground(new java.awt.Color(28, 237, 183));
        op4.setFont(new java.awt.Font("DialogInput", 0, 12));
        op4.setText("SALIR");
        op4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                op4MouseClicked(evt);
            }
        });

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setAlignmentY(0.0F);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/serpiente.gif"))); 
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup
        (
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo,javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup
        (
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(op2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(60, 60, 60))
        );
        pack();
    }                                                             
    /**
     *  Asignacion para cada boton, con su respectiva funcion
     * -opcion 1 (Iniciar) => "Iniciamos el juego"
     * -opcion 2 (Instrucciones) => "Instrucciones para el uso del juego"
     * -opcion 3 (Creditos) => "Infprmacion del juego"
     * -opcion 4 (Salir) => "Cierre del programa"
     * @param evt
     */
    public void op1MouseClicked(java.awt.event.MouseEvent evt) 
    {           
        InicioSnake game = new InicioSnake();                    
        //gameVentana game = new gameVentana();
        game.setVisible(true);
        this.dispose(); 
    }                                
    public void op2MouseClicked(java.awt.event.MouseEvent evt) 
    {                                 
        instrucciones instrucciones = new instrucciones();
        instrucciones.setVisible(true);
        this.dispose();
    }                                
    public void op3MouseClicked(java.awt.event.MouseEvent evt) 
    {                                 
        creditos creditos = new creditos();
        creditos.setVisible(true);
        this.dispose();
    }    
    public void op4MouseClicked(MouseEvent evt) 
    {  
        String boton[]={"CANCELAR","SALIR DEL JUEGO"};
        int ele=JOptionPane.showOptionDialog(null, "               ¿Desea cerrar la aplicacion?", 
        "Nos Vamos Tan Pronto...",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, 
        boton, boton[0]);
        
        if(ele == JOptionPane.NO_OPTION)
        {
            System.exit(0);
        }
        else if(ele==JOptionPane.YES_OPTION)
        {
            System.out.println("Se cancelo el cierre, aun quieres jugar xd");
        }
    }
}
