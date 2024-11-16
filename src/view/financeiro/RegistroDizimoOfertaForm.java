
package view.financeiro;

import dao.ContaCaixaDao;
import dao.FormaPagtoDao;
import dao.IgrejaDao;
import dao.MovimentoCaixaDao;
import dao.PessoaDao;
import dao.RegistroOfertaDao;
import dao.SubContaResultadoDao;
import dao.TipoOfertaDao;
import ferramentas.Utilitarios;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ContaCaixa;
import model.FormaPagto;
import model.Igreja;
import model.Pessoa;
import model.RegistroDizimoOferta;
import model.SubContaResultado;
import model.TipoOferta;


public class RegistroDizimoOfertaForm extends javax.swing.JInternalFrame {

    private final TipoOfertaDao tipoOfertaDao = new TipoOfertaDao();
    private final FormaPagtoDao formaPagtoDao = new FormaPagtoDao();
    private final ContaCaixaDao contaCaixaDao = new ContaCaixaDao();
    private final SubContaResultadoDao subContResultDao = new SubContaResultadoDao();
    private final RegistroOfertaDao rgOfertaDao = new RegistroOfertaDao();
    private final PessoaDao pessoaDao = new PessoaDao();
    private final IgrejaDao igrejaDao = new IgrejaDao();
    private final MovimentoCaixaDao mvCaixaDao = new MovimentoCaixaDao();
    private final Utilitarios conversor = new Utilitarios();
    private List<RegistroDizimoOferta> listaRgOferta;
    private Pessoa ofertanteSelec;
    private RegistroDizimoOferta rgOfertaSelec;
    
    public RegistroDizimoOfertaForm() {
        initComponents();
        formInicial();     
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        codOfertante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomeOfertante = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        dataOferta = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        formaPagto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tipoOferta = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        igrejaCampo = new javax.swing.JComboBox<>();
        btnAdicionar = new javax.swing.JButton();
        contaCaixa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        valorOferta = new javax.swing.JFormattedTextField();
        subContaResultado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaOfertas = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        iconLimpar = new javax.swing.JButton();
        iconDeletar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar D�zimo e Ofertas");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Registro", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        codOfertante.setEditable(false);
        codOfertante.setBackground(new java.awt.Color(204, 204, 204));
        codOfertante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codOfertanteKeyPressed(evt);
            }
        });

        jLabel2.setText("Ofertante");

        nomeOfertante.setBackground(new java.awt.Color(255, 255, 255));

        btnOk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        try {
            dataOferta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Data Oferta*");

        jLabel4.setText("Valor (R$)");

        jLabel5.setText("Forma Pagto*");

        jLabel6.setText("Tipo Oferta*");

        jLabel7.setText("Igreja/Campo*");

        btnAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel1.setText("Conta Caixa");

        valorOferta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel8.setText("Conta Resultado*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(formaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tipoOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(igrejaCampo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(90, 90, 90)
                        .addComponent(btnAdicionar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(codOfertante, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeOfertante, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(subContaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codOfertante, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeOfertante, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOk)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subContaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataOferta)
                            .addComponent(valorOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(igrejaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar))))
                .addContainerGap())
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tabelaOfertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ofertante", "Valor", "Tipo Oferta", "Forma Pagto", "Conta Caixa", "Conta de Resultado", "Data Oferta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaOfertas);
        if (tabelaOfertas.getColumnModel().getColumnCount() > 0) {
            tabelaOfertas.getColumnModel().getColumn(0).setResizable(false);
            tabelaOfertas.getColumnModel().getColumn(0).setPreferredWidth(150);
            tabelaOfertas.getColumnModel().getColumn(1).setResizable(false);
            tabelaOfertas.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabelaOfertas.getColumnModel().getColumn(2).setResizable(false);
            tabelaOfertas.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabelaOfertas.getColumnModel().getColumn(3).setResizable(false);
            tabelaOfertas.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabelaOfertas.getColumnModel().getColumn(4).setResizable(false);
            tabelaOfertas.getColumnModel().getColumn(5).setResizable(false);
            tabelaOfertas.getColumnModel().getColumn(5).setPreferredWidth(200);
            tabelaOfertas.getColumnModel().getColumn(6).setResizable(false);
        }

        btnSalvar.setBackground(new java.awt.Color(51, 204, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        iconLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iconLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-atualizar-16.png"))); // NOI18N
        iconLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconLimparActionPerformed(evt);
            }
        });

        iconDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-lixeira-16.png"))); // NOI18N
        iconDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(iconDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        buscarOfertante();
    }//GEN-LAST:event_btnOkActionPerformed

    private void codOfertanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codOfertanteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscarOfertante();
        } 
    }//GEN-LAST:event_codOfertanteKeyPressed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        inserirRegistroTabela();
        codOfertante.setText("");
        nomeOfertante.setText("");
        valorOferta.setText("");
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvarRegistrosBanco();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void iconDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconDeletarActionPerformed
        removerRegistroTabela();
    }//GEN-LAST:event_iconDeletarActionPerformed

    private void iconLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconLimparActionPerformed
        limparFormulario();
    }//GEN-LAST:event_iconLimparActionPerformed

    private void limparFormulario(){
        codOfertante.setText("");
        nomeOfertante.setText("");
        dataOferta.setText(conversor.dataAtualString());
        valorOferta.setText("");
        carregarTipoOferta();
        carregarFormaPagto();
        carregarIgrejas();      
        carregarContaCaixa();
    }

    private void limparTabela(){
        //Primeiro a condi��o testa se a quantidade de linhas � maior que 0, depois, limpa os dados
        if(tabelaOfertas.getRowCount() > 0){
            DefaultTableModel model = (DefaultTableModel) tabelaOfertas.getModel();
            model.setRowCount(0);
        }
    }

    private void carregarIgrejas(){
        List<Igreja> listaIgrejas = igrejaDao.consultarTodasIgrejas();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)igrejaCampo.getModel();
        modelo.removeAllElements();
        for(Igreja igreja : listaIgrejas){
            modelo.addElement(igreja);
        }
    }
    
    private void carregarFormaPagto(){
        List<FormaPagto> listaFormaPagto = formaPagtoDao.consultarFormaPagto();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)formaPagto.getModel();
        modelo.removeAllElements();
        for(FormaPagto pagto : listaFormaPagto){
            modelo.addElement(pagto);
        }
    }
    
    private void carregarTipoOferta(){
        List<TipoOferta> listaTpOferta = tipoOfertaDao.consultarTipoOferta();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)tipoOferta.getModel();
        modelo.removeAllElements();
        for(TipoOferta tpOferta : listaTpOferta){
            modelo.addElement(tpOferta);
        }
    }
    
    private void carregarContaCaixa(){
        List<ContaCaixa> listaContaCaixa = contaCaixaDao.consultarCaixa();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)contaCaixa.getModel();
        modelo.removeAllElements();
        for(ContaCaixa cx : listaContaCaixa){
            modelo.addElement(cx);
        }
        
    }
    
    private void carregarSubContaResultado(){
        List<SubContaResultado> listaSubContResult = subContResultDao.consultarSubContaResultado();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)subContaResultado.getModel();
        modelo.removeAllElements();
        for(SubContaResultado subCont : listaSubContResult){
            modelo.addElement(subCont);
        }
    }
    
    private void buscarOfertante(){
        String textoBusca = this.nomeOfertante.getText(); // Texto digitado na busca    
        List<Pessoa> listaPessoa = this.pessoaDao.consultarCadastroAtivoPessoa(textoBusca); //Lista recebe a busca retornada do banco
        
        //Adicionando os dados encontrados, no formul�rio
        for(Pessoa pessoa : listaPessoa){
            this.codOfertante.setText(Integer.toString(pessoa.getCodigo()));
            this.nomeOfertante.setText(pessoa.getNome());
            //ofertanteSelec = pessoa; //O ofertante selecionada recebe os dados buscado, para ser utilizado posteriormente
        } 
    }
    
    //Fun��o utilizada para inserir os registros na tabela que fica na tela de registros
    private void inserirRegistroTabela(){
        Integer codigo = null;
        DecimalFormat df = new DecimalFormat("#.00");
        if(!this.codOfertante.getText().isEmpty()){
            codigo = Integer.valueOf(this.codOfertante.getText());       
        }else{
            JOptionPane.showMessageDialog(null, "Informe o nome do ofertante", "Aten��o", JOptionPane.WARNING_MESSAGE);
        }    
        String nome = this.nomeOfertante.getText();
        String dataOferta = this.dataOferta.getText();
        double valorOferta = Double.parseDouble(this.valorOferta.getText().replace(",", "."));
        FormaPagto formaPagto = (FormaPagto) this.formaPagto.getSelectedItem();
        TipoOferta tpOferta = (TipoOferta) this.tipoOferta.getSelectedItem();
        ContaCaixa contaCaixa = (ContaCaixa) this.contaCaixa.getSelectedItem();
        SubContaResultado subContResult = (SubContaResultado) this.subContaResultado.getSelectedItem();
        Pessoa ofertante = new Pessoa();
        ofertante.setCodigo(codigo);
        ofertante.setNome(nome);
        
        if(codigo == 0 || dataOferta.isEmpty() || valorOferta <= 0){
            JOptionPane.showMessageDialog(null, "Para cadastrar uma oferta/d�zimo, informe os campos necess�rios", "Aten��o", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) this.tabelaOfertas.getModel();
        model.addRow(new Object[]{ofertante,valorOferta,tpOferta,formaPagto,contaCaixa,subContResult,dataOferta});         
    } 
    
    // Remove o registro adicionado na tabela, antes dele ser enviado para o banco de dados
    private void removerRegistroTabela(){
        int numLinhaSelec = tabelaOfertas.getSelectedRow();

        //Verifica se foi selecionado algum registro da lista
        if(numLinhaSelec < 0){
            JOptionPane.showMessageDialog(null, "Selecione um registro para ser exclu�do", "Aten��o", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null,"Remover o registro selecionado ?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            DefaultTableModel model = (DefaultTableModel) tabelaOfertas.getModel();
            model.removeRow(numLinhaSelec);
        }else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Opera��o cancelada!");
        }
    } 
    
    //Salva todos os registros da tabela, dentro de uma lista e adiciona no banco de dados
    private void salvarRegistrosBanco(){
 
        int qtdLinhasTabela = tabelaOfertas.getRowCount();
        List<RegistroDizimoOferta> listaRegistro = new ArrayList<>();

        for(int i = 0; i < qtdLinhasTabela; i++){           
            Pessoa ofertante = (Pessoa)tabelaOfertas.getModel().getValueAt(i, 0);
            double valOferta = (double) tabelaOfertas.getModel().getValueAt(i, 1);  
            TipoOferta tpOferta = (TipoOferta) tabelaOfertas.getModel().getValueAt(i, 2);
            FormaPagto formaPagto = (FormaPagto) tabelaOfertas.getModel().getValueAt(i, 3);
            ContaCaixa contaCx = (ContaCaixa) tabelaOfertas.getModel().getValueAt(i, 4);
            SubContaResultado subContResult = (SubContaResultado) tabelaOfertas.getModel().getValueAt(i, 5);
            String dataOferta = (String)tabelaOfertas.getModel().getValueAt(i, 6);
            Igreja igreja = (Igreja) igrejaCampo.getSelectedItem();
                       
            RegistroDizimoOferta registro = new RegistroDizimoOferta(tpOferta, valOferta, formaPagto, ofertante, dataOferta, igreja, contaCx, subContResult);
            listaRegistro.add(registro);          
            
            
        }  
        
        rgOfertaDao.adicionarRegistroOfertaDizimo(listaRegistro);
        limparTabela();
    } 
    
    private void formInicial(){
        carregarFormaPagto();
        carregarIgrejas();
        carregarTipoOferta();
        limparTabela();
        carregarContaCaixa();
        dataOferta.setText(conversor.dataAtualString());
        carregarSubContaResultado();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField codOfertante;
    private javax.swing.JComboBox<String> contaCaixa;
    private javax.swing.JFormattedTextField dataOferta;
    private javax.swing.JComboBox<String> formaPagto;
    private javax.swing.JButton iconDeletar;
    private javax.swing.JButton iconLimpar;
    private javax.swing.JComboBox<String> igrejaCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeOfertante;
    private javax.swing.JComboBox<String> subContaResultado;
    private javax.swing.JTable tabelaOfertas;
    private javax.swing.JComboBox<String> tipoOferta;
    private javax.swing.JFormattedTextField valorOferta;
    // End of variables declaration//GEN-END:variables
}
