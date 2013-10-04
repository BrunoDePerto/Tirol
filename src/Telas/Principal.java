package Telas;

import RegraNegocio.CarregamentoRN;

public class Principal extends javax.swing.JFrame {

    private CarregamentoRN carregamentoRN;
    

    public Principal() {
        initComponents();
        carregamentoRN = new CarregamentoRN();
        jTcarregado.setModel(carregamentoRN.getCarregadoModel());
        jTcarregar.setModel(carregamentoRN.getCarregarModel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTcarregar = new javax.swing.JTable();
        jBAlterarCarregamento = new javax.swing.JButton();
        jBAtualizar = new javax.swing.JButton();
        jBExcluirCarregamento = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTcarregado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTFplaca = new javax.swing.JFormattedTextField();
        jCBveiculo = new javax.swing.JComboBox();
        jTFmotorista = new javax.swing.JTextField();
        jCBhorario = new javax.swing.JComboBox();
        jTFdata = new javax.swing.JFormattedTextField();
        jTFtransportadora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBIncluirCarregamento = new javax.swing.JButton();
        jBSalvarAlteracoes = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jBVolta1 = new javax.swing.JButton();
        jTCarregado = new javax.swing.JTextField();
        jBAvanca1 = new javax.swing.JButton();
        jPTotCarregado = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTCarregamentoHora = new javax.swing.JTable();
        jTTotalCarregado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lacticínios Tirol :: Carregamento ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Pristina", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Bruno Alves dos Santos");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 630, 150, 15));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel5.setOpaque(false);

        jTcarregar.setAutoCreateRowSorter(true);
        jTcarregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTcarregar.setDoubleBuffered(true);
        jTcarregar.setDragEnabled(true);
        jScrollPane1.setViewportView(jTcarregar);

        jBAlterarCarregamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jBAlterarCarregamento.setText("Alterar Carregamento");
        jBAlterarCarregamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAlterarCarregamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarCarregamentoActionPerformed(evt);
            }
        });

        jBAtualizar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jBAtualizar.setText("Atualizar");
        jBAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jBExcluirCarregamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jBExcluirCarregamento.setText("Excluir Carregamento");
        jBExcluirCarregamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBExcluirCarregamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirCarregamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 372, Short.MAX_VALUE)
                .addComponent(jBAlterarCarregamento, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBExcluirCarregamento)
                .addGap(235, 235, 235))
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAlterarCarregamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBExcluirCarregamento)))
        );

        jTabbedPane1.addTab("Carregar", jPanel5);

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel6.setOpaque(false);

        jScrollPane4.setViewportView(jTcarregado);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Carregado", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1110, 240));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel1.setToolTipText("");
        jPanel1.setName("oi"); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        try {
            jTFplaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jTFplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, 20));

        jCBveiculo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jCBveiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBveiculo.setSelectedIndex(-1);
        jCBveiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBveiculoActionPerformed(evt);
            }
        });
        jPanel1.add(jCBveiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, -1));

        jTFmotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFmotoristaActionPerformed(evt);
            }
        });
        jPanel1.add(jTFmotorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 435, -1));

        jCBhorario.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jCBhorario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "00:00 - 01:00", "01:00 - 02:00", "02:00 - 03:00", "03:00 - 04:00", "04:00 - 05:00", "05:00 - 06:00", "06:00 - 07:00", "07:00 - 08:00", "08:00 - 09:00", "09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00", "20:00 - 21:00", "21:00 - 22:00", "22:00 - 23:00", "23:00 - 00:00" }));
        jCBhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBhorarioActionPerformed(evt);
            }
        });
        jPanel1.add(jCBhorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 135, -1));

        jTFdata.setEditable(false);
        jTFdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jPanel1.add(jTFdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 20));
        jPanel1.add(jTFtransportadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 60, 315, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel6.setText("Data");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel7.setText("Horário");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel8.setText("Transportadora");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel9.setText("Veículo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel10.setText("Motorista");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel11.setText("Placa do Veículo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setOpaque(false);

        jBIncluirCarregamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jBIncluirCarregamento.setText("Incluir Carregamento");
        jBIncluirCarregamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBIncluirCarregamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIncluirCarregamentoActionPerformed(evt);
            }
        });

        jBSalvarAlteracoes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jBSalvarAlteracoes.setText("Salvar Alterações");
        jBSalvarAlteracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalvarAlteracoes.setEnabled(false);
        jBSalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarAlteracoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBIncluirCarregamento, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jBSalvarAlteracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBIncluirCarregamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jBSalvarAlteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 210, -1));

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel7.setOpaque(false);

        jBVolta1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jBVolta1.setText("Dia anterior");
        jBVolta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBVolta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolta1ActionPerformed(evt);
            }
        });

        jTCarregado.setEditable(false);

        jBAvanca1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jBAvanca1.setText("Próximo dia");
        jBAvanca1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAvanca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAvanca1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBVolta1)
                .addGap(18, 18, 18)
                .addComponent(jTCarregado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAvanca1)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVolta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTCarregado)
                    .addComponent(jBAvanca1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 240, 360, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 615, 300));

        jPTotCarregado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        jPTotCarregado.setOpaque(false);

        jTCarregamentoHora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTCarregamentoHora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTCarregamentoHora);

        jTTotalCarregado.setEditable(false);
        jTTotalCarregado.setText(":D");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel2.setText("Peso total carregado do dia:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel3.setText("Carregamento por hora");

        javax.swing.GroupLayout jPTotCarregadoLayout = new javax.swing.GroupLayout(jPTotCarregado);
        jPTotCarregado.setLayout(jPTotCarregadoLayout);
        jPTotCarregadoLayout.setHorizontalGroup(
            jPTotCarregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTotCarregadoLayout.createSequentialGroup()
                .addGroup(jPTotCarregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTotCarregadoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTTotalCarregado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPTotCarregadoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPTotCarregadoLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel3)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPTotCarregadoLayout.setVerticalGroup(
            jPTotCarregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTotCarregadoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPTotCarregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTotalCarregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        getContentPane().add(jPTotCarregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 60, 405, 300));

        jLabel13.setFont(new java.awt.Font("Pristina", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Desenvolvido por:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 615, -1, 15));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lacticínios Tirol");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 15, 300, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Lacticínios Tirol");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 15, 315, -1));

        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/planoFundo.png"))); // NOI18N
        jLabel1.setText("hdsauiahdsuiasdh");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 645));

        jMenu1.setText("Relatórios");

        jMenu2.setText("Carregado");

        jMenuItem1.setText("Por Mês");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Por Dia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1125, 702));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCBveiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBveiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBveiculoActionPerformed

    private void jTFmotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFmotoristaActionPerformed
    }//GEN-LAST:event_jTFmotoristaActionPerformed

    private void jCBhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBhorarioActionPerformed
    }//GEN-LAST:event_jCBhorarioActionPerformed

    private void jBIncluirCarregamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncluirCarregamentoActionPerformed
                
    }//GEN-LAST:event_jBIncluirCarregamentoActionPerformed

    private void jBSalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarAlteracoesActionPerformed
        
    }//GEN-LAST:event_jBSalvarAlteracoesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jBVolta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolta1ActionPerformed
        
    }//GEN-LAST:event_jBVolta1ActionPerformed

    private void jBAvanca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAvanca1ActionPerformed
       
    }//GEN-LAST:event_jBAvanca1ActionPerformed

    private void jBExcluirCarregamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirCarregamentoActionPerformed
        
    }//GEN-LAST:event_jBExcluirCarregamentoActionPerformed

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void jBAlterarCarregamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarCarregamentoActionPerformed
        
    }//GEN-LAST:event_jBAlterarCarregamentoActionPerformed

        public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterarCarregamento;
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBAvanca1;
    private javax.swing.JButton jBExcluirCarregamento;
    private javax.swing.JButton jBIncluirCarregamento;
    private javax.swing.JButton jBSalvarAlteracoes;
    private javax.swing.JButton jBVolta1;
    private javax.swing.JComboBox jCBhorario;
    private javax.swing.JComboBox jCBveiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPTotCarregado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTCarregado;
    private javax.swing.JTable jTCarregamentoHora;
    private javax.swing.JFormattedTextField jTFdata;
    private javax.swing.JTextField jTFmotorista;
    private javax.swing.JFormattedTextField jTFplaca;
    private javax.swing.JTextField jTFtransportadora;
    private javax.swing.JTextField jTTotalCarregado;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTcarregado;
    private javax.swing.JTable jTcarregar;
    // End of variables declaration//GEN-END:variables

    
}
