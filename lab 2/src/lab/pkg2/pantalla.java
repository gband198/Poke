package lab.pkg2;

import javax.swing.DefaultListModel;

public class pantalla extends javax.swing.JFrame {

    /**
     * Creates new form pantalla
     */
    public pantalla() {
        initComponents();
        DefaultListModel model = new DefaultListModel();
        DefaultListModel model1 = new DefaultListModel();
        lista.setModel(model);
        lista2.setModel(model1);
        ptr = null;
        ptr1 = null;
    }

    class Nodo {

        int numero;
        Nodo link;
    }
    Nodo ptr;
    Nodo ptr1;

    /**
     *
     * @param ptr
     */
    Nodo crear(Nodo ptr, int num) {

        Nodo q = new Nodo();
        q.numero = num;
        q.link = ptr;
        ptr = q;
        return ptr;
    }

    Nodo crear2(Nodo ptr1, int num) {

        Nodo q = new Nodo();
        q.numero = num;
        q.link = ptr1;
        ptr1 = q;
        return ptr1;
    }

    void mostrar2(Nodo ptr1) {
        DefaultListModel model = (DefaultListModel) lista2.getModel();
        model.clear();

        Nodo p = ptr1;
        while (p != null) {
            model.addElement(p.numero);
            p = p.link;
        }
    }

    void mostrar(Nodo ptr) {
        DefaultListModel model = (DefaultListModel) lista.getModel();
        model.clear();

        Nodo p = ptr;
        while (p != null) {
            model.addElement(p.numero);
            p = p.link;
        }
    }

    void comparar(Nodo ptr, Nodo ptr1) {
        Nodo p = ptr;     
        Nodo antp = null;
        int sw=0;
        while (p != null) {
            Nodo q = ptr1;
            Nodo antq = null;
            while (q != null) {
                if (p.numero == q.numero) {
                    if (antp==null) {
                        ptr=p.link;
                    }else{
                      antp.link = p.link;
                    }
                    if (antq==null) {
                        ptr1=q.link;
                    }else{
                     antq.link=q.link;
                    }
                    sw=1;
                }
                if (sw==0 && p!=null) {
                    q.link = p;
                }else{
                    if (sw==0 && p==null) {
                        ptr1 = p;
                    }
                }
                antq = q;
                q = q.link;
            }
            p = p.link;
        }
       mostrar(ptr);
       mostrar2(ptr1);
    }
    void agregar (Nodo ptr,Nodo ptr1){
    
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertar1 = new javax.swing.JButton();
        insertar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        text = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista2 = new javax.swing.JList<>();
        text2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insertar1.setText("insertar1");
        insertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertar1ActionPerformed(evt);
            }
        });

        insertar2.setText("insertar2");
        insertar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertar2ActionPerformed(evt);
            }
        });

        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        lista2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lista2);

        jButton1.setText("borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertar1))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertar2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertar1)
                            .addComponent(insertar2))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertar1ActionPerformed
        String numeroString = text.getText();
        if (!numeroString.isEmpty()) {
            int numero = Integer.parseInt(numeroString);
            ptr = crear(ptr, numero);
            mostrar(ptr);
        }
    }//GEN-LAST:event_insertar1ActionPerformed

    private void insertar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertar2ActionPerformed
        String numeroString = text2.getText();
        if (!numeroString.isEmpty()) {
            int numero = Integer.parseInt(numeroString);
            ptr1 = crear2(ptr1, numero);
            mostrar2(ptr1);
        }
    }//GEN-LAST:event_insertar2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        comparar(ptr, ptr1);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertar1;
    private javax.swing.JButton insertar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista;
    private javax.swing.JList<String> lista2;
    private javax.swing.JTextField text;
    private javax.swing.JTextField text2;
    // End of variables declaration//GEN-END:variables
}
