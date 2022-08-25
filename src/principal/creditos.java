package principal;

public class creditos extends javax.swing.JFrame 
{
    /**
     * Implementacion de elementos de la libreria Swing
     */
    public javax.swing.JButton salirCreditos;
    public javax.swing.JLabel tituloCreditos;
    public javax.swing.JLabel creadores;
    public javax.swing.JLabel creadores1;
    public javax.swing.JLabel creadores2;
    public javax.swing.JLabel creadores3; 
    public javax.swing.JLabel creadores4; 

    /**
     * Redirigimos a la parte prinicipal
     * Colocacion de parametros para la ventana
     * -centrar ventana
     * -Negamos el cambio de dimensiones de ventana
     */
    public creditos() 
    {
        acerca(); 
        this.setSize(700,700);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);	
        this.setResizable(false);
        this.setVisible(true);
    }
                  
    public void acerca() 
    {
        /**
         * Creacion de cada elemento, utilizando las variables 
         * Implementacion de las librerias
         * Asignacion del contenido de cada elemento
         * Configuracion de Texto, Fuente y tamaño
         * Ubicacion de cada cuadro, asi como la posicion de texto de estos
         */
        tituloCreditos = new javax.swing.JLabel();
        salirCreditos = new javax.swing.JButton();
        creadores = new javax.swing.JLabel();
        creadores1 = new javax.swing.JLabel();
        creadores2 = new javax.swing.JLabel();
        creadores3 = new javax.swing.JLabel();
        creadores4 = new javax.swing.JLabel();

        tituloCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCreditos.setFont(new java.awt.Font("DialogInput", 3, 24)); 
        tituloCreditos.setText("ACERCA DEL JUEGO");
        tituloCreditos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        salirCreditos.setText("Regresar al Menu Principal");
        salirCreditos.setBackground(new java.awt.Color(28, 237, 123));
        salirCreditos.setFont(new java.awt.Font("DialogInput", 3, 15));
        salirCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirCreditosMouseClicked(evt);
            }
        });
        /**
         * Asignacion del contenido en cada Cuadro de texto
         * Ubicacion de cada cuadro, asi como la posicion de texto de estos
         */
        creadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creadores.setText("CREADORES");
        creadores.setFont(new java.awt.Font("DialogInput", 1, 20));
        creadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        creadores1.setText("Andino Padilla Jose Luis");
        creadores1.setFont(new java.awt.Font("DialogInput", 0, 17));
        creadores1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        creadores2.setText("Calahorrano Cualchi David Alejandro");
        creadores2.setFont(new java.awt.Font("DialogInput", 0, 17));
        creadores2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        creadores3.setText("Fernandez Obaco Andres Patricio");
        creadores3.setFont(new java.awt.Font("DialogInput", 0, 17));
        creadores3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        creadores4.setText("Vizcarra Llulluma Ivan Roberto ");
        creadores4.setFont(new java.awt.Font("DialogInput", 0, 17));
        creadores4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        /**
         * MANIPULACION DEL EJE HORIZONTAL DE CADA ELEMENTO
         * tamaño del Espacio entre cada elemento
         * asignacion de cada componente con susu repectivos parametros
         */
        layout.setHorizontalGroup
        (
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(170, 170, 170)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tituloCreditos,javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(salirCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(creadores,  javax.swing.GroupLayout.Alignment.LEADING,javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(creadores1, javax.swing.GroupLayout.Alignment.LEADING,javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(creadores2, javax.swing.GroupLayout.Alignment.LEADING,javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(creadores3, javax.swing.GroupLayout.Alignment.LEADING,javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(creadores4, javax.swing.GroupLayout.Alignment.LEADING,javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(170, 170, 170))
        );
        /**
         * MANIPULACION DEL EJE VERTICAL DE CADA ELEMENTO
         * tamaño del cuadro de texto con sus respectivas dimensiones
         * tamaño del boton "Salir" con sus respectivas dimensiones y parametros
         */
        layout.setVerticalGroup
        (
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(50, 50, 50)
            .addComponent(tituloCreditos)
            .addGap(18, 18, 18)
            .addComponent(creadores)
            .addGap(18, 18, 18)
            .addComponent(creadores1)
            .addGap(18, 18, 18)
            .addComponent(creadores2)
            .addGap(18, 18, 18)
            .addComponent(creadores3)
            .addGap(18, 18, 18)
            .addComponent(creadores4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
            .addComponent(salirCreditos)
            .addGap(50, 50, 50))
        );
        pack();
    }                       
    /**
     * asignacion de ordenes al boton "salir"
     * @param evt
     */
    public void salirCreditosMouseClicked(java.awt.event.MouseEvent evt) 
    {                                        
        menuPrincipal menuPrincipal = new menuPrincipal();
        menuPrincipal.setVisible(true);
        this.dispose();
    }                                          
                 
}
