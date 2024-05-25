package visao;


public class FrmMenuPrincipal extends javax.swing.JFrame {

    public FrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuNovo = new javax.swing.JMenu();
        jMenuItemCadastrarAluno = new javax.swing.JMenuItem();
        jMenuItemGerenciarAlunos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));

        jMenuNovo.setText("NOVO");

        jMenuItemCadastrarAluno.setText("Cadastrar Aluno");
        jMenuItemCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarAlunoActionPerformed(evt);
            }
        });
        jMenuNovo.add(jMenuItemCadastrarAluno);

        jMenuItemGerenciarAlunos.setText("Gerenciar Aluno");
        jMenuItemGerenciarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerenciarAlunosActionPerformed(evt);
            }
        });
        jMenuNovo.add(jMenuItemGerenciarAlunos);

        jMenuBar1.add(jMenuNovo);

        jMenu2.setText("SAIR");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemSair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarAlunoActionPerformed
       FrmCadastroAluno objeto = new FrmCadastroAluno();
       objeto.setVisible(true);
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadastrarAlunoActionPerformed

    private void jMenuItemGerenciarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenciarAlunosActionPerformed
        FrmGerenciaAluno objeto = new FrmGerenciaAluno();
        objeto.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemGerenciarAlunosActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCadastrarAluno;
    private javax.swing.JMenuItem jMenuItemGerenciarAlunos;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuNovo;
    // End of variables declaration//GEN-END:variables
}
