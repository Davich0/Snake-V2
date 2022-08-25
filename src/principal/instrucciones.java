package principal;

public class instrucciones extends javax.swing.JFrame 
{
    /**
     * Implementacion de elementos de la libreria Swing
     */
    public javax.swing.JButton salirInstrucciones;
    public javax.swing.JLabel tituloInstrucciones; 
    public javax.swing.JLabel control;
    public javax.swing.JLabel regla;

    /**
     * Redirigimos a la parte prinicipal
     * Colocacion de parametros para la ventana
     * -centrar ventana
     * -Negamos el cambio de dimensiones de ventana
     */
    public instrucciones() 
    {
        datos();
        this.setSize(700,700);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);	
        this.setResizable(false);
        this.setVisible(true);
    }

    public void datos() 
    {   
        /**
         * Implementacion de las librerias
         * Asignacion del contenido de cada elemento
         * Configuracion de Texto, Fuente y tamaño
         * Ubicacion de cada cuadro, asi como la posicion de texto de estos
         */
        tituloInstrucciones = new javax.swing.JLabel();
        salirInstrucciones = new javax.swing.JButton();
        regla = new javax.swing.JLabel();
        control = new javax.swing.JLabel();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloInstrucciones.setFont(new java.awt.Font("DialogInput", 3, 24));
        tituloInstrucciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER); 
        tituloInstrucciones.setText("CONTROL DE JUEGO");
        tituloInstrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        salirInstrucciones.setText("Regresar al Menu Principal");
        salirInstrucciones.setBackground(new java.awt.Color(28, 237, 123));
        salirInstrucciones.setFont(new java.awt.Font("DialogInput", 3, 15));
        salirInstrucciones.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                salirInstruccionesMouseClicked(evt);
            }
        });
        regla.setText("Use las flechas para mover a la serpiente");
        regla.setFont(new java.awt.Font("DialogInput", 0, 16));

        control.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        control.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/control.gif"))); 
        control.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER); 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup
        (  
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(127, 127, 127)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(tituloInstrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(salirInstrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(regla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(control, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup
        (
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(50, 50, 50)
            .addComponent(tituloInstrucciones)
            .addGap(18, 18, 18)
            .addComponent(regla)
            .addGap(18, 18, 18)
            .addComponent(control)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
            .addComponent(salirInstrucciones)
            .addGap(50, 50, 50))
        );

        pack();
    }

    /**
     * Instrucciones para el funcionamiento del boton "Salir"
     * @param evt
     */
    public void salirInstruccionesMouseClicked(java.awt.event.MouseEvent evt) 
    {                                           
        menuPrincipal ventana = new menuPrincipal();
        ventana.setVisible(true);
        this.dispose();
    }    
    
    

}
