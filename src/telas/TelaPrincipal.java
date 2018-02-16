
package telas;

import java.awt.Color;

public class TelaPrincipal extends javax.swing.JFrame {

    //int[] coluna = new int[3]; //primeira coluna 0
    //int[] linha = new int[3]; //menor 0, medio 1, grande 2
    
    int menor = 1;
    int medio = 2;
    int maior = 3;
    
    int cabecaT1 = 1; //comeca com o menor na torre 1
    int cabecaT2 = 0;
    int cabecaT3 = 0;
   
    int torre1 = 1;
    int torre2 = 0;
    int torre3 = 0;
    jogadas j = new jogadas();
    
    public TelaPrincipal() {
        initComponents();
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        maior1.setBackground(Color.red);
        maior2.setBackground(Color.white);
        maior3.setBackground(Color.white);
        medio1.setBackground(Color.blue);
        medio2.setBackground(Color.white);
        medio3.setBackground(Color.white);
        menor1.setBackground(Color.green);
        menor2.setBackground(Color.white);
        menor3.setBackground(Color.white);
        j.start();
    }
    
    public class jogadas extends Thread{        
        @Override
        public void run (){
            while(true){
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
                this.logica();
                //this.desenhos(); 
            } //final while
            
        } //final run
        
        public void logica(){
            
            if(cabecaT2 == 0 && cabecaT3 == 0){
                cabecaT1 = 2;
                menor = 0;
                cabecaT3 = 1;
                this.desenhos();
                torre1 = 0;
                torre3 = 1;
                menor = 1;
                medio = 0 ;
                maior = 0;
                this.desenhos();
                this.resetD();
                this.resetT();
            }else if(cabecaT1 == 2){
                if(cabecaT2 > cabecaT1 || cabecaT2 == 0){
                    cabecaT2 = 2;
                    cabecaT1 = 3;
                    menor = 0;
                    medio = 0;
                    torre1 = 1;
                    //System.out.println("Entrei");
                    this.desenhos();
                    torre1 = 0;
                    torre2 = 1;
                    medio = 2;
                    maior = 0;
                    this.desenhos();
                }
                
            }else if(cabecaT2 == 2){
                
            }
            
            
       
        }
        
        public void desenhos(){
            //System.out.println("Entrei nos desenhos");
            
            //possibilidades de desenhos torre 1
            if(torre1 == 1){
                if(menor == 1 && medio == 2 && maior == 3){
                    maior1.setBackground(Color.red);
                    medio1.setBackground(Color.blue);
                    menor1.setBackground(Color.green);
                    //System.out.println("Entrei no if dos desenhos");
                    //menor = 0;
                }else if(menor == 0 && medio == 2 && maior == 3){
                    maior1.setBackground(Color.red);
                    medio1.setBackground(Color.blue);
                    menor1.setBackground(Color.white);
                    //medio = 0;
                }else if(menor == 0 && medio == 0 && maior == 3){
                    maior1.setBackground(Color.red);
                    medio1.setBackground(Color.white);
                    menor1.setBackground(Color.white);
                    //maior = 0;
                    //System.out.println("Entrei no 3 sozinho");
                }else if(menor == 0 && medio == 0 && maior == 0){
                    maior1.setBackground(Color.white);
                    medio1.setBackground(Color.white);
                    menor1.setBackground(Color.white);
                    //menor = 1;
                    //maior = 3;
                    //System.out.println("Entrei no vazio");
                }else if(menor == 1 && medio == 0 && maior == 3){
                    maior1.setBackground(Color.red);
                    medio1.setBackground(Color.white);
                    menor1.setBackground(Color.green);
                    //maior = 0;
                    //medio = 2;
                }else if(menor == 1 && medio == 2 && maior == 0){
                    maior1.setBackground(Color.white);
                    medio1.setBackground(Color.blue);
                    menor1.setBackground(Color.green);
                    //menor = 0;
                }else if(menor == 0 && medio == 2 && maior == 0){
                    maior1.setBackground(Color.white);
                    medio1.setBackground(Color.blue);
                    menor1.setBackground(Color.white);
                    medio = 0;
                    //menor = 1;
                }else if(menor == 1 && medio == 0 && maior == 0){
                    maior1.setBackground(Color.white);
                    medio1.setBackground(Color.white);
                    menor1.setBackground(Color.green);
                    
                    /*teste
                    torre2 = 1;
                    torre1 = 0;
                    menor = 1;
                    medio = 2;
                    maior = 3;
                    teste */
                    
                }
            }//fim torre 1
            
            //possibilidades de desenhos torre 2
            else if(torre2 == 1){
                if(menor == 1 && medio == 2 && maior == 3){
                    maior2.setBackground(Color.red);
                    medio2.setBackground(Color.blue);
                    menor2.setBackground(Color.green);
                    //System.out.println("Entrei no if dos desenhos");
                    //menor = 0;
                }else if(menor == 0 && medio == 2 && maior == 3){
                    maior2.setBackground(Color.red);
                    medio2.setBackground(Color.blue);
                    menor2.setBackground(Color.white);
                    //medio = 0;
                }else if(menor == 0 && medio == 0 && maior == 3){
                    maior2.setBackground(Color.red);
                    medio2.setBackground(Color.white);
                    menor2.setBackground(Color.white);
                    //maior = 0;
                    //System.out.println("Entrei no 3 sozinho");
                }else if(menor == 0 && medio == 0 && maior == 0){
                    maior2.setBackground(Color.white);
                    medio2.setBackground(Color.white);
                    menor2.setBackground(Color.white);
                    //menor = 1;
                    //maior = 3;
                    //System.out.println("Entrei no vazio");
                }else if(menor == 1 && medio == 0 && maior == 3){
                    maior2.setBackground(Color.red);
                    medio2.setBackground(Color.white);
                    menor2.setBackground(Color.green);
                    //maior = 0;
                    //medio = 2;
                }else if(menor == 1 && medio == 2 && maior == 0){
                    maior2.setBackground(Color.white);
                    medio2.setBackground(Color.blue);
                    menor2.setBackground(Color.green);
                    //menor = 0;
                }else if(menor == 0 && medio == 2 && maior == 0){
                    maior2.setBackground(Color.white);
                    medio2.setBackground(Color.blue);
                    menor2.setBackground(Color.white);
                    //medio = 0;
                    //menor = 1;
                }else if(menor == 1 && medio == 0 && maior == 0){
                    maior2.setBackground(Color.white);
                    medio2.setBackground(Color.white);
                    menor2.setBackground(Color.green);
                    
                    /*teste
                    torre2 = 0;
                    torre3 = 1;
                    menor = 1;
                    medio = 2;
                    maior = 3;
                    teste*/
                }
            }//fim torre 2
            
            //possibilidades de desenhos torre 3
            else if(torre3 == 1){
                if(menor == 1 && medio == 2 && maior == 3){
                    maior3.setBackground(Color.red);
                    medio3.setBackground(Color.blue);
                    menor3.setBackground(Color.green);
                    //System.out.println("Entrei no if dos desenhos");
                    //menor = 0;
                }else if(menor == 0 && medio == 2 && maior == 3){
                    maior3.setBackground(Color.red);
                    medio3.setBackground(Color.blue);
                    menor3.setBackground(Color.white);
                    //medio = 0;
                }else if(menor == 0 && medio == 0 && maior == 3){
                    maior3.setBackground(Color.red);
                    medio3.setBackground(Color.white);
                    menor3.setBackground(Color.white);
                    //maior = 0;
                    //System.out.println("Entrei no 3 sozinho");
                }else if(menor == 0 && medio == 0 && maior == 0){
                    maior3.setBackground(Color.white);
                    medio3.setBackground(Color.white);
                    menor3.setBackground(Color.white);
                    //menor = 1;
                    //maior = 3;
                    //System.out.println("Entrei no vazio");
                }else if(menor == 1 && medio == 0 && maior == 3){
                    maior3.setBackground(Color.red);
                    medio3.setBackground(Color.white);
                    menor3.setBackground(Color.green);
                    //maior = 0;
                    //medio = 2;
                }else if(menor == 1 && medio == 2 && maior == 0){
                    maior3.setBackground(Color.white);
                    medio3.setBackground(Color.blue);
                    menor3.setBackground(Color.green);
                    //menor = 0;
                }else if(menor == 0 && medio == 2 && maior == 0){
                    maior3.setBackground(Color.white);
                    medio3.setBackground(Color.blue);
                    menor3.setBackground(Color.white);
                    //medio = 0;
                    //menor = 1;
                }else if(menor == 1 && medio == 0 && maior == 0){
                    maior3.setBackground(Color.white);
                    medio3.setBackground(Color.white);
                    menor3.setBackground(Color.green);
                }
            }//fim torre 3  
        }//final método desenhos
        
        public void resetD(){
            menor = 1;
            medio = 2;
            maior = 3;
        }
        
        public void resetT(){
            torre1 = 0;
            torre2 = 0;
            torre3 = 0;
        }
        
    } //final casse jogadas

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maior1 = new javax.swing.JPanel();
        maior2 = new javax.swing.JPanel();
        maior3 = new javax.swing.JPanel();
        medio1 = new javax.swing.JPanel();
        medio2 = new javax.swing.JPanel();
        medio3 = new javax.swing.JPanel();
        menor1 = new javax.swing.JPanel();
        menor2 = new javax.swing.JPanel();
        menor3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        javax.swing.GroupLayout maior1Layout = new javax.swing.GroupLayout(maior1);
        maior1.setLayout(maior1Layout);
        maior1Layout.setHorizontalGroup(
            maior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        maior1Layout.setVerticalGroup(
            maior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(maior1);
        maior1.setBounds(40, 120, 80, 15);

        javax.swing.GroupLayout maior2Layout = new javax.swing.GroupLayout(maior2);
        maior2.setLayout(maior2Layout);
        maior2Layout.setHorizontalGroup(
            maior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        maior2Layout.setVerticalGroup(
            maior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(maior2);
        maior2.setBounds(160, 120, 80, 15);

        javax.swing.GroupLayout maior3Layout = new javax.swing.GroupLayout(maior3);
        maior3.setLayout(maior3Layout);
        maior3Layout.setHorizontalGroup(
            maior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        maior3Layout.setVerticalGroup(
            maior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(maior3);
        maior3.setBounds(280, 120, 80, 15);

        javax.swing.GroupLayout medio1Layout = new javax.swing.GroupLayout(medio1);
        medio1.setLayout(medio1Layout);
        medio1Layout.setHorizontalGroup(
            medio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        medio1Layout.setVerticalGroup(
            medio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(medio1);
        medio1.setBounds(50, 100, 60, 15);

        javax.swing.GroupLayout medio2Layout = new javax.swing.GroupLayout(medio2);
        medio2.setLayout(medio2Layout);
        medio2Layout.setHorizontalGroup(
            medio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        medio2Layout.setVerticalGroup(
            medio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(medio2);
        medio2.setBounds(170, 100, 60, 15);

        javax.swing.GroupLayout medio3Layout = new javax.swing.GroupLayout(medio3);
        medio3.setLayout(medio3Layout);
        medio3Layout.setHorizontalGroup(
            medio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        medio3Layout.setVerticalGroup(
            medio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(medio3);
        medio3.setBounds(290, 100, 60, 15);

        javax.swing.GroupLayout menor1Layout = new javax.swing.GroupLayout(menor1);
        menor1.setLayout(menor1Layout);
        menor1Layout.setHorizontalGroup(
            menor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        menor1Layout.setVerticalGroup(
            menor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(menor1);
        menor1.setBounds(60, 80, 30, 15);

        javax.swing.GroupLayout menor2Layout = new javax.swing.GroupLayout(menor2);
        menor2.setLayout(menor2Layout);
        menor2Layout.setHorizontalGroup(
            menor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        menor2Layout.setVerticalGroup(
            menor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(menor2);
        menor2.setBounds(180, 80, 30, 15);

        javax.swing.GroupLayout menor3Layout = new javax.swing.GroupLayout(menor3);
        menor3.setLayout(menor3Layout);
        menor3Layout.setHorizontalGroup(
            menor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        menor3Layout.setVerticalGroup(
            menor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(menor3);
        menor3.setBounds(300, 80, 30, 15);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arthur\\Desktop\\Sem título.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 356, 123);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel maior1;
    private javax.swing.JPanel maior2;
    private javax.swing.JPanel maior3;
    private javax.swing.JPanel medio1;
    private javax.swing.JPanel medio2;
    private javax.swing.JPanel medio3;
    private javax.swing.JPanel menor1;
    private javax.swing.JPanel menor2;
    private javax.swing.JPanel menor3;
    // End of variables declaration//GEN-END:variables
}
