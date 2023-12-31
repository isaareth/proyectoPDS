package principal;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.conexionMysql;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    conexionMysql con = new conexionMysql();
    Connection cn;
    
    public static login1 fr;
    
    public static homeJustf frs; 

    /**
     * Creates new form Login
     */
    public Login() {
        this.cn = con.conectar();
        initComponents();
        setLocationRelativeTo(null);
        con.conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        login = new javax.swing.JPanel();
        l = new javax.swing.JLabel();
        Panelregitro = new javax.swing.JPanel();
        txtnombre = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        botoninicio = new javax.swing.JButton();
        botonregistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Understanding Emotional Intelligence 5 Main Characteristics, Signs & How To Improve.jpg"))); // NOI18N
        login.add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -10, -1, 450));

        Panelregitro.setBackground(new java.awt.Color(255, 255, 255));
        Panelregitro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inicio de Sesión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N

        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre de usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clave", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N

        botoninicio.setBackground(new java.awt.Color(204, 204, 255));
        botoninicio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botoninicio.setText("Iniciar Sesión");
        botoninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoninicioActionPerformed(evt);
            }
        });

        botonregistro.setBackground(new java.awt.Color(204, 204, 255));
        botonregistro.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonregistro.setText("Crear una cuenta");
        botonregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelregitroLayout = new javax.swing.GroupLayout(Panelregitro);
        Panelregitro.setLayout(PanelregitroLayout);
        PanelregitroLayout.setHorizontalGroup(
            PanelregitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelregitroLayout.createSequentialGroup()
                .addGroup(PanelregitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelregitroLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(PanelregitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelregitroLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(botonregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelregitroLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(botoninicio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        PanelregitroLayout.setVerticalGroup(
            PanelregitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelregitroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botoninicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        login.add(Panelregitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 350, 320));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setText("Bienvenido a JustFeel");
        login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void botonregistroActionPerformed(java.awt.event.ActionEvent evt) {                                              
       
        
        fr = new login1(null, true);
        fr.setVisible(true);
// TODO add your handling code here:
    }                                             

    private void botoninicioActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try{
            
        String nombreusuario= txtnombre.getText();
        String clave= String.valueOf(txtpassword.getPassword());
        String query =  "SELECT * FROM registropds WHERE nombreusuario= '"+nombreusuario+"'  AND clave='"+clave+"'  ";
        
        Statement st= (Statement) con.conectar().createStatement();
            java.sql.ResultSet rs= st.executeQuery(query);
        
        if(rs.next()) {
        /*JOptionPane.showMessageDialog(null, "El usuario se encontró");*/
        
        homeJustf newframe = new homeJustf (); 
        newframe.setVisible (true); 
        
        
        } 
        
        else{
        JOptionPane.showMessageDialog(null, "Usuario NO encontrado");
        }
     
        }
        
        catch (Exception e) {
        
        }
         
        
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Panelregitro;
    private javax.swing.JButton botoninicio;
    private javax.swing.JButton botonregistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l;
    private javax.swing.JPanel login;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration                   

    private static class ResultSet {

        public ResultSet() {
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
