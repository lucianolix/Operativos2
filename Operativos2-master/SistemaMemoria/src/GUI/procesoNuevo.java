/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import static GUI.Interfaz.app; 
import static GUI.Interfaz.interfaz; 
import static GUI.Interfaz.ordenejecucion; 

/**
 *
 * @author Luciano Pinedo
 */
public class procesoNuevo extends javax.swing.JFrame {

    
    /**
     * Creates new form procesoNuevo
     */
    public procesoNuevo() {
        initComponents();
    }

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        JButton3 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Insertar proceso nuevo");

        jLabel2.setText("Número de páginas: ");

        jButton1.setText("Secuencial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JButton3.setText("Específica");
        JButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton3))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if (revisarInput()) {
       app.crearProcesoSecuencial(Integer.parseInt(jTextField1.getText()));  
       interfaz.añadirTablaProcesos(app.getAllProcesos().get(app.getAllProcesos().size()-1));
       
       this.setVisible(false);
       interfaz.actualizarTodo(); 
      }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton3ActionPerformed
        if  (revisarInput()) {
        ordenejecucion.definirCuadro(app.iniciarProcesoEspecifico(Integer.parseInt(jTextField1.getText())));
        this.setVisible(false); 
        ordenejecucion.setVisible(true); 
        }
        
    }//GEN-LAST:event_JButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public boolean revisarInput() throws NumberFormatException { 
    
    try {
        if (Integer.parseInt(jTextField1.getText()) > 0) {
        return true; 
        }
    }
    catch(NumberFormatException ex) {
        return false; 
    }
        
        return false; 
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

//Encontraste al negro de whatsapp
/*
                                                                                                    
                                                   `:/+o+++/.`                                      
                                                  .hdmmdhdmhyhy:-`                                  
                                                 `hmmdyysmdyhmdhhs                                  
                                                 /MNmdddhmdsydooyd/                                 
                                             `://dmmddmNmdddmmhyyy.                                 
                                             +MMMMMMNmmmmhhdmmmmmy                                  
                                             .yNMMMMMMMMMmdhdhhdy+                                  
                                               -dMMMMMMMMMMMNNdho+`                                 
                                                sMMMMMMNdmMMMMMMmh:                                 
                                               `hMMMNNMNhhmmNNh:-.                                  
                                             ./yNMMMMMNNmmhmmo`                                     
                                           `/shmMMMMMNmdmNmmy`                                      
                                         ./+ssydMMMMMMMNNmd+/``                                     
                                       `:+o+osyhNMMMMMMNNmo//.``                                    
                                   `.-:/++o:/ossdMMMMMNNNh-o:.`.``                                  
                                 `/sss/.-/+.-://sdMNdmdhN+:+-..`````.-.`                            
                              `:oooo+o:`-/o--::.-:yyyhhhm.o:-`.`.```.+o//`                          
                             :ydho+////.-:o/-/:--.:osyyms-s:-`.`....`.+///                          
                            /mmdyoo++-::.--o/+/-+:.ossym/++:-`.......`:++o.                         
                           -mNmhsssss..:-..:soo:+yosyyym:+:-........```:+o`                         
                           sNNmdyyhdd-`-::.:ddmmdhssssdm:/-:..........`.++:                         
                           dNNmmddNMm-``-++hNMMNhyso++oh+:.-..........`.++o`                        
                          `mNmmddmNMm-``./+yNMMNdhso++ooso//........````+os-                        
                          +NmddysyhyN/``.:ohmNMNdhyyyyyyysss+-.......-.`-+oo`                       
                         /mdddhsod-`s+``.:sydmNNMNmddmmmmhyso++/-.-....../+o/                       
                        :mddhhysyo  -s-``-osyyyhmmh+:/oymNNdsoooo/+s/-.`-+oos.                      
                       -mmddhyssy`   o+.`.:///+-+hsy:.``-ymNNdhyysyhmds-sssss/                      
                       ymmmdhysy-    :dyoo++//++-y.oy+-.`./ymNNmdhyssyhyddhyys`                     
                      -NmNmdhhh:     .mMMMMMNNMNoy-:yy+-.`..:hmNNNmdhysssssyyh.                     
                      yNmNmddd:       yMNNNmmmNNhy+.+hh+-....:+yNNNMNmmdhhhhhh-                     
                     .mmmmdhhs        +NmmmmmmNMNyy-.sdho:oy:.../mNNMMNmmmdddd/                     
                     :NNNddhh/        /NmmddddmNNmh+:+ydhshmh/.``-shNNNNNNmddd:                     
                     :MNNmmhyy+.      /NmmmdmmNMMMdysdmdhhhhmd+.````./ymNMNmmy`                     
                     `dMMNNdhyyy+`    -NmmddddmNNNmmdddhhhhhhmN+.```   `-omms.                      
                       /dMNNmdyyyy/`  -Nmdmddddddddddhhhhhhhhyhhyso.                                
                         :hNNNmddyyy/`-NNNmmddhhhhddhdhhhhhhhyyyyys`                                
                           -hNMNNmhhhyyNNmdmNmdhhdmmmmmddddyyyo//syo`                               
                             .odNMNmmddhdddhdmmmdyhmNNmmmmdhhy+//osy+                               
                                .odNMNNmmdhhhhmNNNmmNNNNNNNNNdhs+osyh.                              
                                  `.+mMMMNNdhsyhddmNNNNNNNNNNmdysssyh/                              
                                    .mMMMMMMNdhysoosyhhdddmNNmddyssyhy`                             
                                    oMMMMMMMMMNmdys+oydhhhssymmdyyssyd-                             
                                   `dMMMMMMMMMMMNNmhssmNmhyyhdmdhyysyh+                             
                                   :NNNNNMMMMMMMMMNNmhyNNdyhhhdmhyysyhs`                            
                                   +MNNNdmNMMMMMMMMNNMmmNmdsyhhddhhyyhy.                            
                                   hMNNNdddNMMMMMMMMMMMNNmyyyyhdmddhyhh-                            
                                   mMNNmdddmMMMMMMMMMosmNmdyhyhdmmmdhhh/                            
                                   mMNNNmddddmNMMMMMm. -dmdyyyhdmmmdhhho                            
                                   mMMNNmmddddmMMMMMs   +NhysyydmNmmdddo                            
                                   dNMNNmdddddNMMMMN-   :Nhyooyhmmmmddd+                            
                                   hMMNNmdddddNMMMNs    +mds+syymmmmdhd/                            
                                   oMMNNmdddddNMMMN.    ymhsoysymmmdddh-                            
                                   /NMMNmmdhhdMMMMs    `hmdsssyhmmmmddy`                            
                                   .mMMNNmdhhdNMMN.    `dmdyo+sdmmmdmmy`                            
                                    yMMMNNmdddNMMs     `hmds++ymNmmddmh`                            
                                    .mNMNNNmmmNMN-      yNmoooymNNmdhmo                             
                                     hNMNNNmmmNNy       yNdooshNMNNmdm+                             
                                     yMMNNNNmNNN:       yNhyshmNMMNNmms                             
                                     hMMNNNNNNmd        yNdhohmNMMMNdmh`                            
                                     hMMNmNNNmm+        smdsoydNMMMNNmm-                            
                                     dMMNNmmmmd.        :mdhhhmNMMMMNmm:                            
                                    `dMMNNNNmm/          odhyhdMMMMMNmm/                            
                                    -NMNNNNmmy            `.-`:NMMMMNNd+                            
                                    /MMmmmddd+                `dMMMNNdd+                            
                                    +NNmddhdh/                 oMMMNmmd-                            
                                    +NNdhhhhh-                 -MMMNmmh`                            
                                    :NNmhhhhy`                 -MMMNmdy                             
                                    -NNmdhhh+                  `mMMNmds                             
                                    `dNmdddd-                   sMNNmd-                             
                                     hNNmddd-                   yMNNmo                              
                                     oNNmhdd+                   yMNNmo   
*/