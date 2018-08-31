package view;

import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Recursividade;
/**
 *
 * @author Arley Bebe
 */
public class TesteRecursividade extends javax.swing.JFrame {

    public TesteRecursividade() {
        initComponents();
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        tfTamanho2 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelLeft = new javax.swing.JPanel();
        btRemover = new javax.swing.JButton();
        sp2 = new javax.swing.JSeparator();
        btFactorial = new javax.swing.JButton();
        btBusca = new javax.swing.JButton();
        sp3 = new javax.swing.JSeparator();
        sp5 = new javax.swing.JSeparator();
        btFibonacci = new javax.swing.JButton();
        sp4 = new javax.swing.JSeparator();
        panel1 = new java.awt.Panel();
        pnlFactorial = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfResultado = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btCancelar = new javax.swing.JButton();
        pnlBusca = new java.awt.Panel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfTamanho = new javax.swing.JTextField();
        btPrencher = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        tfArrayOrdenado = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        pnlMdc = new java.awt.Panel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfNumero2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        tfNumero1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        tfMdc = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        pnlFibonacci = new java.awt.Panel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tfElemento = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        tfFibonacci = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        btCalFibonacci = new javax.swing.JButton();
        btCancelar1 = new javax.swing.JButton();

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Criar Conta:");

        tfTamanho2.setBackground(new java.awt.Color(0, 153, 153));
        tfTamanho2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfTamanho2.setForeground(new java.awt.Color(255, 255, 255));
        tfTamanho2.setBorder(null);
        tfTamanho2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTamanho2ActionPerformed(evt);
            }
        });

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplos de Recursividade");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Javanese Text", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Recursividade");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 297));

        panelLeft.setBackground(new java.awt.Color(255, 255, 255));
        panelLeft.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        panelLeft.setPreferredSize(new java.awt.Dimension(160, 297));
        panelLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelLeftMouseExited(evt);
            }
        });

        btRemover.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btRemover.setForeground(new java.awt.Color(0, 153, 153));
        btRemover.setText("M.D.C.");
        btRemover.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btRemover.setBorderPainted(false);
        btRemover.setContentAreaFilled(false);
        btRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRemoverMouseExited(evt);
            }
        });
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        sp2.setBackground(new java.awt.Color(102, 152, 255));
        sp2.setForeground(new java.awt.Color(0, 153, 153));

        btFactorial.setBackground(new java.awt.Color(0, 153, 153));
        btFactorial.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btFactorial.setForeground(new java.awt.Color(0, 153, 153));
        btFactorial.setText("Factorial");
        btFactorial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btFactorial.setBorderPainted(false);
        btFactorial.setContentAreaFilled(false);
        btFactorial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btFactorialFocusGained(evt);
            }
        });
        btFactorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btFactorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btFactorialMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btFactorialMouseReleased(evt);
            }
        });
        btFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFactorialActionPerformed(evt);
            }
        });

        btBusca.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btBusca.setForeground(new java.awt.Color(0, 153, 153));
        btBusca.setText("Busca");
        btBusca.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btBusca.setBorderPainted(false);
        btBusca.setContentAreaFilled(false);
        btBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btBuscaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btBuscaMouseExited(evt);
            }
        });
        btBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaActionPerformed(evt);
            }
        });

        sp3.setBackground(new java.awt.Color(102, 153, 255));
        sp3.setForeground(new java.awt.Color(0, 153, 153));

        sp5.setBackground(new java.awt.Color(102, 152, 255));
        sp5.setForeground(new java.awt.Color(0, 153, 153));

        btFibonacci.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btFibonacci.setForeground(new java.awt.Color(0, 153, 153));
        btFibonacci.setText("Fibonacci");
        btFibonacci.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btFibonacci.setBorderPainted(false);
        btFibonacci.setContentAreaFilled(false);
        btFibonacci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btFibonacciMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btFibonacciMouseExited(evt);
            }
        });
        btFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFibonacciActionPerformed(evt);
            }
        });

        sp4.setBackground(new java.awt.Color(102, 153, 255));
        sp4.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panelLeftLayout = new javax.swing.GroupLayout(panelLeft);
        panelLeft.setLayout(panelLeftLayout);
        panelLeftLayout.setHorizontalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLeftLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLeftLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(sp5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLeftLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btBusca))
                    .addGroup(panelLeftLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btFactorial))
                    .addGroup(panelLeftLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btFibonacci))
                    .addGroup(panelLeftLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btRemover)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelLeftLayout.setVerticalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sp5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(sp3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(sp4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        panel1.setLayout(new java.awt.CardLayout());

        pnlFactorial.setBackground(new java.awt.Color(0, 153, 153));
        pnlFactorial.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Calculo Factorial:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numero");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Resultado");

        tfResultado.setEditable(false);
        tfResultado.setBackground(new java.awt.Color(0, 153, 153));
        tfResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfResultado.setForeground(new java.awt.Color(255, 255, 255));
        tfResultado.setBorder(null);

        tfNumero.setBackground(new java.awt.Color(0, 153, 153));
        tfNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNumero.setForeground(new java.awt.Color(255, 255, 255));
        tfNumero.setBorder(null);

        btCalcular.setBackground(new java.awt.Color(0, 102, 102));
        btCalcular.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btCalcular.setText("Factorial");
        btCalcular.setBorderPainted(false);
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btCancelar.setBackground(new java.awt.Color(0, 102, 102));
        btCancelar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.setBorderPainted(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFactorialLayout = new javax.swing.GroupLayout(pnlFactorial);
        pnlFactorial.setLayout(pnlFactorialLayout);
        pnlFactorialLayout.setHorizontalGroup(
            pnlFactorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFactorialLayout.createSequentialGroup()
                .addGroup(pnlFactorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 250, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFactorialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFactorialLayout.setVerticalGroup(
            pnlFactorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFactorialLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(pnlFactorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btCalcular))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panel1.add(pnlFactorial, "card3");

        pnlBusca.setBackground(new java.awt.Color(0, 153, 153));
        pnlBusca.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Busca Sequencial:");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tamanho do Array");

        tfTamanho.setBackground(new java.awt.Color(0, 153, 153));
        tfTamanho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfTamanho.setForeground(new java.awt.Color(255, 255, 255));
        tfTamanho.setBorder(null);
        tfTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTamanhoActionPerformed(evt);
            }
        });

        btPrencher.setBackground(new java.awt.Color(0, 102, 102));
        btPrencher.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btPrencher.setForeground(new java.awt.Color(255, 255, 255));
        btPrencher.setText("Prencher");
        btPrencher.setActionCommand("Preencher");
        btPrencher.setBorderPainted(false);
        btPrencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrencherActionPerformed(evt);
            }
        });

        btPesquisar.setBackground(new java.awt.Color(0, 102, 102));
        btPesquisar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btPesquisar.setText("Pesquisar");
        btPesquisar.setBorderPainted(false);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfArrayOrdenado.setEditable(false);
        tfArrayOrdenado.setBackground(new java.awt.Color(0, 153, 153));
        tfArrayOrdenado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfArrayOrdenado.setForeground(new java.awt.Color(255, 255, 255));
        tfArrayOrdenado.setBorder(null);
        tfArrayOrdenado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfArrayOrdenadoActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Array Ordenado");

        javax.swing.GroupLayout pnlBuscaLayout = new javax.swing.GroupLayout(pnlBusca);
        pnlBusca.setLayout(pnlBuscaLayout);
        pnlBuscaLayout.setHorizontalGroup(
            pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaLayout.createSequentialGroup()
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                        .addComponent(jSeparator4)
                        .addComponent(tfArrayOrdenado, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                        .addComponent(jSeparator6))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscaLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(btPrencher, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar)
                .addGap(20, 20, 20))
        );
        pnlBuscaLayout.setVerticalGroup(
            pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfArrayOrdenado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPrencher)
                    .addComponent(btPesquisar))
                .addContainerGap())
        );

        panel1.add(pnlBusca, "card2");

        pnlMdc.setBackground(new java.awt.Color(0, 153, 153));
        pnlMdc.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Calculo do MDC:");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Numero2");

        tfNumero2.setBackground(new java.awt.Color(0, 153, 153));
        tfNumero2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNumero2.setForeground(new java.awt.Color(255, 255, 255));
        tfNumero2.setBorder(null);

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("MDC");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cancelar");
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jSeparator5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Numero1");

        tfNumero1.setBackground(new java.awt.Color(0, 153, 153));
        tfNumero1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNumero1.setForeground(new java.awt.Color(255, 255, 255));
        tfNumero1.setBorder(null);

        jSeparator7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Resultado");

        tfMdc.setEditable(false);
        tfMdc.setBackground(new java.awt.Color(0, 153, 153));
        tfMdc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfMdc.setForeground(new java.awt.Color(255, 255, 255));
        tfMdc.setBorder(null);
        tfMdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMdcActionPerformed(evt);
            }
        });

        jSeparator8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlMdcLayout = new javax.swing.GroupLayout(pnlMdc);
        pnlMdc.setLayout(pnlMdcLayout);
        pnlMdcLayout.setHorizontalGroup(
            pnlMdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMdcLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addGroup(pnlMdcLayout.createSequentialGroup()
                .addGroup(pnlMdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfMdc, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlMdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumero2)
                            .addComponent(jSeparator5)
                            .addComponent(tfNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(jSeparator7))
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMdcLayout.setVerticalGroup(
            pnlMdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMdcLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(pnlMdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)))
        );

        panel1.add(pnlMdc, "card4");

        pnlFibonacci.setBackground(new java.awt.Color(0, 153, 153));
        pnlFibonacci.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Fibonacci");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Elemento");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Indice");

        tfElemento.setBackground(new java.awt.Color(0, 153, 153));
        tfElemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfElemento.setForeground(new java.awt.Color(255, 255, 255));
        tfElemento.setBorder(null);
        tfElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfElementoActionPerformed(evt);
            }
        });

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfFibonacci.setBackground(new java.awt.Color(0, 153, 153));
        tfFibonacci.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfFibonacci.setForeground(new java.awt.Color(255, 255, 255));
        tfFibonacci.setBorder(null);
        tfFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFibonacciActionPerformed(evt);
            }
        });

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btCalFibonacci.setBackground(new java.awt.Color(0, 102, 102));
        btCalFibonacci.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btCalFibonacci.setForeground(new java.awt.Color(255, 255, 255));
        btCalFibonacci.setText("Fibonacci");
        btCalFibonacci.setBorderPainted(false);
        btCalFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalFibonacciActionPerformed(evt);
            }
        });

        btCancelar1.setBackground(new java.awt.Color(0, 102, 102));
        btCancelar1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar1.setText("Cancelar");
        btCancelar1.setBorderPainted(false);
        btCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFibonacciLayout = new javax.swing.GroupLayout(pnlFibonacci);
        pnlFibonacci.setLayout(pnlFibonacciLayout);
        pnlFibonacciLayout.setHorizontalGroup(
            pnlFibonacciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFibonacciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFibonacciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(tfFibonacci)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElemento, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(254, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFibonacciLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCalFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFibonacciLayout.setVerticalGroup(
            pnlFibonacciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFibonacciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(pnlFibonacciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCalFibonacci)
                    .addComponent(btCancelar1))
                .addContainerGap())
        );

        panel1.add(pnlFibonacci, "card6");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(panelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(521, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(207, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        panel1.removeAll();
        panel1.add(pnlMdc);
        panel1.repaint();
        panel1.revalidate();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaActionPerformed
        panel1.removeAll();
        panel1.add(pnlBusca);
        panel1.repaint();
        panel1.revalidate();
    }//GEN-LAST:event_btBuscaActionPerformed

    private void panelLeftMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLeftMouseExited
    }//GEN-LAST:event_panelLeftMouseExited

    private void btFactorialMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFactorialMouseReleased
    }//GEN-LAST:event_btFactorialMouseReleased

    private void btFactorialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btFactorialFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btFactorialFocusGained

    private void btFactorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFactorialMouseEntered
        this.btFactorial.setForeground(new Color(0,102,102));
        this.btFactorial.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
    }//GEN-LAST:event_btFactorialMouseEntered

    private void btFactorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFactorialMouseExited
        this.btFactorial.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        this.btFactorial.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_btFactorialMouseExited

    private void btBuscaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscaMouseEntered
        this.btBusca.setForeground(new Color(0,102,102));
        this.btBusca.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
    }//GEN-LAST:event_btBuscaMouseEntered

    private void btRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRemoverMouseEntered
        this.btRemover.setForeground(new Color(0,102,102));
        this.btRemover.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
    }//GEN-LAST:event_btRemoverMouseEntered

    private void btBuscaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscaMouseExited
        this.btBusca.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        this.btBusca.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_btBuscaMouseExited

    private void btRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRemoverMouseExited
        this.btRemover.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        this.btRemover.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_btRemoverMouseExited

    private void btFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFactorialActionPerformed
        panel1.removeAll();
        panel1.add(pnlFactorial);
        panel1.repaint();
        panel1.revalidate();
    }//GEN-LAST:event_btFactorialActionPerformed

    
    private void btPrencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrencherActionPerformed
        
        int tamanho=Integer.parseInt(tfTamanho.getText());
        
        if(tamanho<=10){
            
            array=new int[tamanho];
            int elemento;
            
            for(int i=0;i<array.length;i++){
                elemento=Integer.parseInt(JOptionPane.showInputDialog("Introduza o elemento "+i+":"));
                array[i]=elemento;
            }
            Arrays.sort(array);
            
            String ordenado="";
            
            for(int a:array){
                ordenado+=a+" ";
            }
            tfArrayOrdenado.setText(ordenado);
        
        }else{
            JOptionPane.showMessageDialog(this, "Numero de elementos nao pode exceder 10.","Erro",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btPrencherActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        int num1=Integer.parseInt(tfNumero1.getText());
        int num2=Integer.parseInt(tfNumero2.getText());
        int resultado;
        
        resultado=Recursividade.mdc(num1, num2);
        tfMdc.setText(resultado+"");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tfTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTamanhoActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed

        int numero=Integer.parseInt(tfNumero.getText());
        int resultado;
        
        resultado=Recursividade.factorial(numero);
        tfResultado.setText(resultado+"");
        
        

    }//GEN-LAST:event_btCalcularActionPerformed

    private void tfArrayOrdenadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfArrayOrdenadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfArrayOrdenadoActionPerformed

    private void tfMdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMdcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMdcActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        tfNumero.setText("");
        tfResultado.setText("");
    }//GEN-LAST:event_btCancelarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tfNumero1.setText("");
        tfNumero2.setText("");
        tfMdc.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btFibonacciMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFibonacciMouseEntered
        this.btFibonacci.setForeground(new Color(0,102,102));
        this.btFibonacci.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
    }//GEN-LAST:event_btFibonacciMouseEntered

    private void btFibonacciMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFibonacciMouseExited
        this.btFibonacci.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        this.btFibonacci.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_btFibonacciMouseExited

    private void btFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFibonacciActionPerformed
        panel1.removeAll();
        panel1.add(pnlFibonacci);
        panel1.repaint();
        panel1.revalidate();
    }//GEN-LAST:event_btFibonacciActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        
        if(array!=null){
            int numero=Integer.parseInt(JOptionPane.showInputDialog("Que valor deseja pesquisar no array?"));
            int resposta=Recursividade.buscar(numero, array.length, array);

            if(resposta!=-1){
                JOptionPane.showMessageDialog(this, "Elemento : "+numero+", localizado."+"\n"+"Indice : "+resposta);

            }else{

                JOptionPane.showMessageDialog(this, "Elemento : "+numero+" não localizado.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Deve preencher o Array.","Erro",JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tfElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoActionPerformed

    private void tfTamanho2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTamanho2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTamanho2ActionPerformed

    private void tfFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFibonacciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFibonacciActionPerformed

    private void btCalFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalFibonacciActionPerformed
        
        int n=Integer.parseInt(tfFibonacci.getText());
        int resultado=Recursividade.fibo(n);
        
        tfElemento.setText(resultado+"");
    }//GEN-LAST:event_btCalFibonacciActionPerformed

    private void btCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar1ActionPerformed
        tfElemento.setText("");
        tfFibonacci.setText("");
    }//GEN-LAST:event_btCancelar1ActionPerformed

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
            java.util.logging.Logger.getLogger(TesteRecursividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesteRecursividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesteRecursividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesteRecursividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesteRecursividade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBusca;
    private javax.swing.JButton btCalFibonacci;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar1;
    private javax.swing.JButton btFactorial;
    private javax.swing.JButton btFibonacci;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btPrencher;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private java.awt.Panel panel1;
    private javax.swing.JPanel panelLeft;
    private java.awt.Panel pnlBusca;
    private java.awt.Panel pnlFactorial;
    private java.awt.Panel pnlFibonacci;
    private java.awt.Panel pnlMdc;
    private javax.swing.JSeparator sp2;
    private javax.swing.JSeparator sp3;
    private javax.swing.JSeparator sp4;
    private javax.swing.JSeparator sp5;
    private javax.swing.JTextField tfArrayOrdenado;
    private javax.swing.JTextField tfElemento;
    private javax.swing.JTextField tfFibonacci;
    private javax.swing.JTextField tfMdc;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfNumero1;
    private javax.swing.JTextField tfNumero2;
    private javax.swing.JTextField tfResultado;
    private javax.swing.JTextField tfTamanho;
    private javax.swing.JTextField tfTamanho2;
    // End of variables declaration//GEN-END:variables
    int array[];
    

}
