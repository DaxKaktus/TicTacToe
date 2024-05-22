import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class AyoMainTicTacToe extends javax.swing.JFrame {
    int nilai, nilai1,nilai2;
    private int nilaiX = 0;
    private int nilaiO = 0;
    public AyoMainTicTacToe() {
        initComponents();
        nilai = 1;
        nilai1 = 0;
        nilai2 = 0;  
    }
    private void scorGame(){
        ScorX.setText(String.valueOf(nilaiX));
        ScorO.setText(String.valueOf(nilaiO));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ScorX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        ScorO = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        Play_again = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jumlahX = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jumlahO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(102, 0, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn1.setBackground(new java.awt.Color(51, 0, 102));
        btn1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(51, 0, 102));
        btn2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(51, 0, 102));
        btn3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(51, 0, 102));
        btn4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(51, 0, 102));
        btn5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(51, 0, 102));
        btn6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(51, 0, 102));
        btn7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(51, 0, 102));
        btn8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(51, 0, 102));
        btn9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("SCORE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("X");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(102, 102, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("O");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ScorX.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ScorX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ScorX.setText("0");
        ScorX.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScorX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScorX, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        ScorO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ScorO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ScorO.setText("0");
        ScorO.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScorO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScorO, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Reset.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Reset.setText("Udahan Ahh");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Play_again.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Play_again.setText("Mau Lagi");
        Play_again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play_againActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIC TAC TOE");

        jPanel9.setBackground(new java.awt.Color(102, 102, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel10.setBackground(new java.awt.Color(102, 102, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("KLIK");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jumlahX.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jumlahX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jumlahX.setText("0 kali");
        jumlahX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jumlahX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jumlahX, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jumlahO.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jumlahO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jumlahO.setText("0 kali");
        jumlahO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jumlahO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jumlahO, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Play_again, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Play_again)
                            .addComponent(Exit)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(197, 197, 197))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pemenang(){
        if(btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah X, X Mendapatkan 1 Poin","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiX++;
            scorGame();  
        }else if(btn4.getText() == "X" && btn5.getText() == "X" && btn6.getText() == "X"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah X, X mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiX++;
            scorGame();   
        }else if(btn7.getText() == "X" && btn8.getText() == "X" && btn9.getText() == "X"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah X, X mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiX++;
            scorGame();  
        }else if(btn1.getText() == "X" && btn4.getText() == "X" && btn7.getText() == "X"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah X, X mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiX++;
            scorGame();
        }else if(btn2.getText() == "X" && btn5.getText() == "X" && btn8.getText() == "X"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah X, X mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiX++;
            scorGame(); 
        }else if(btn3.getText() == "X" && btn6.getText() == "X" && btn9.getText() == "X"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah X, X mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiX++;
            scorGame(); 
        }else if(btn1.getText() == "X" && btn5.getText() == "X" && btn9.getText() == "X"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah X, X mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiX++;
            scorGame();
        }else if(btn3.getText() == "X" && btn5.getText() == "X" && btn7.getText() == "X"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah X, X mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiX++;
            scorGame();  
        }
        if(btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah O, O mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiO++;
            scorGame();  
        }else if(btn4.getText() == "O" && btn5.getText() == "O" && btn6.getText() == "O"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah O, O mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiO++;
            scorGame();  
        }else if(btn7.getText() == "O" && btn8.getText() == "O" && btn9.getText() == "O"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah O, O mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiO++;
            scorGame();   
        }else if(btn1.getText() == "O" && btn4.getText() == "O" && btn7.getText() == "O"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah O, O mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiO++;
            scorGame();
        }else if(btn2.getText() == "O" && btn5.getText() == "O" && btn8.getText() == "O"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah O, O mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiO++;
            scorGame();            
        }else if(btn3.getText() == "O" && btn6.getText() == "O" && btn9.getText() == "O"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah O, O mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiO++;
            scorGame();
        }else if(btn1.getText() == "O" && btn5.getText() == "O" && btn9.getText() == "O"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah O, O mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiO++;
            scorGame();
        }else if(btn3.getText() == "O" && btn5.getText() == "O" && btn7.getText() == "O"){
            JOptionPane.showMessageDialog(this,"Pemenangnya adalah O, O mendapatkan 1 Poin!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            nilaiO++;
            scorGame();
        }
    }
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (nilai ==1){
            btn1.setText("X");
            btn1.setForeground(Color.RED);
            btn1.setEnabled(false);
            nilai -= 1;
            nilai1 += 1;
            jumlahX.setText(String.valueOf(nilai1 + "klik"));
            pemenang();
        } else{
            btn1.setText("O");
            btn1.setForeground(Color.MAGENTA);
            btn1.setEnabled(false);
            nilai += 1;
            nilai2 += 1;
            jumlahO.setText(String.valueOf(nilai2 + "klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (nilai ==1){
            btn2.setText("X");
            btn2.setForeground(Color.RED);
            btn2.setEnabled(false);
            nilai -= 1;
            nilai1 += 1;
            jumlahX.setText(String.valueOf(nilai1 + "klik"));
            pemenang();
        } else{
            btn2.setText("O");
            btn2.setForeground(Color.MAGENTA);
            btn2.setEnabled(false);
            nilai += 1;
            nilai2 += 1;
            jumlahO.setText(String.valueOf(nilai2 + "klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (nilai == 1){
            btn3.setText("X");
            btn3.setForeground(Color.RED);
            btn3.setEnabled(false);
            nilai -= 1;
            nilai1 += 1;
            jumlahX.setText(String.valueOf(nilai1 + "klik"));
            pemenang();
        } else{
            btn3.setText("O");
            btn3.setForeground(Color.MAGENTA);
            btn3.setEnabled(false);
            nilai += 1;
            nilai2 += 1;
            jumlahO.setText(String.valueOf(nilai2 + "klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (nilai ==1){
            btn4.setText("X");
            btn4.setForeground(Color.RED);
            btn4.setEnabled(false);
            nilai -= 1;
            nilai1 += 1;
            jumlahX.setText(String.valueOf(nilai1 + "klik"));
            pemenang();
        } else{
            btn4.setText("O");
            btn4.setForeground(Color.MAGENTA);
            btn4.setEnabled(false);
            nilai += 1;
            nilai2 += 1;
            jumlahO.setText(String.valueOf(nilai2 + "klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (nilai ==1){
            btn5.setText("X");
            btn5.setForeground(Color.RED);
            btn5.setEnabled(false);
            nilai -= 1;
            nilai1 += 1;
            jumlahX.setText(String.valueOf(nilai1 + "klik"));
            pemenang();
        } else{
            btn5.setText("O");
            btn5.setForeground(Color.MAGENTA);
            btn5.setEnabled(false);
            nilai += 1;
            nilai2 += 1;
            jumlahO.setText(String.valueOf(nilai2 + "klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (nilai ==1){
            btn6.setText("X");
            btn6.setForeground(Color.RED);
            btn6.setEnabled(false);
            nilai -= 1;
            nilai1 += 1;
            jumlahX.setText(String.valueOf(nilai1 + "klik"));
            pemenang();
        } else{
            btn6.setText("O");
            btn6.setForeground(Color.MAGENTA);
            btn6.setEnabled(false);
            nilai += 1;
            nilai2 += 1;
            jumlahO.setText(String.valueOf(nilai2 + "klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (nilai ==1){
            btn7.setText("X");
            btn7.setForeground(Color.RED);
            btn7.setEnabled(false);
            nilai -= 1;
            nilai1 += 1;
            jumlahX.setText(String.valueOf(nilai1 + "klik"));
            pemenang();
        } else{
            btn7.setText("O");
            btn7.setForeground(Color.MAGENTA);
            btn7.setEnabled(false);
            nilai += 1;
            nilai2 += 1;
            jumlahO.setText(String.valueOf(nilai2 + "klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (nilai == 1){
            btn8.setText("X");
            btn8.setForeground(Color.RED);
            btn8.setEnabled(false);
            nilai -= 1;
            nilai1 += 1;
            jumlahX.setText(String.valueOf(nilai1 + "klik"));
            pemenang();
        } else{
            btn8.setText("O");
            btn8.setForeground(Color.MAGENTA);
            btn8.setEnabled(false);
            nilai += 1;
            nilai2 += 1;
            jumlahO.setText(String.valueOf(nilai2 + "klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (nilai ==1){
            btn9.setText("X");
            btn9.setForeground(Color.RED);
            btn9.setEnabled(false);
            nilai -=1;
            nilai1 += 1;
            jumlahX.setText(String.valueOf(nilai1 + "klik"));
            pemenang();
        } else{
            btn9.setText("O");
            btn9.setForeground(Color.MAGENTA);
            btn9.setEnabled(false);
            nilai += 1;
            nilai2 += 1;
            jumlahO.setText(String.valueOf(nilai2 + "klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn9ActionPerformed
private JFrame frame;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Apakah kamu ingin keluar?", "Tic Tac Toe",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void Play_againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play_againActionPerformed
        nilai = 1;
        nilai1 = 0;
        nilai2 = 0;
        
        jumlahX.setText("0");
        jumlahO.setText("0");
        jumlahX.setText("");
        jumlahO.setText("");
        
        btn1.setEnabled(true);
        btn1.setText("");
        btn2.setEnabled(true);
        btn2.setText("");
        btn3.setEnabled(true);
        btn3.setText("");
        btn4.setEnabled(true);
        btn4.setText("");
        btn5.setEnabled(true);
        btn5.setText("");
        btn6.setEnabled(true);
        btn6.setText("");
        btn7.setEnabled(true);
        btn7.setText("");
        btn8.setEnabled(true);
        btn8.setText("");
        btn9.setEnabled(true);
        btn9.setText("");   
    }//GEN-LAST:event_Play_againActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        if(JOptionPane.showConfirmDialog(frame, "Yakin Nih Udahan?", "Tic Tac Toe",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
        nilai = 1;
        nilai1 = 0;
        nilai2 = 0;
        ScorX.setText("0");
        ScorO.setText("0");
        jumlahX.setText("0");
        jumlahO.setText("0");
        
        btn1.setEnabled(true);
        btn1.setText("");
        btn2.setEnabled(true);
        btn2.setText("");
        btn3.setEnabled(true);
        btn3.setText("");
        btn4.setEnabled(true);
        btn4.setText("");
        btn5.setEnabled(true);
        btn5.setText("");
        btn6.setEnabled(true);
        btn6.setText("");
        btn7.setEnabled(true);
        btn7.setText("");
        btn8.setEnabled(true);
        btn8.setText("");
        btn9.setEnabled(true);
        btn9.setText(""); 
            if(nilaiX > nilaiO){
                JOptionPane.showMessageDialog(this,"SELAMAT X MEMENANGKAN PERMAINAN!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            }else if(nilaiX < nilaiO){
                JOptionPane.showMessageDialog(this,"SELAMAT O MEMENANGKAN PERMAINAN!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            }else if(nilaiX == nilaiO){
                JOptionPane.showMessageDialog(this,"HASIL PERMAINAN SERI!!!","TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            }
        }   
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(AyoMainTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyoMainTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyoMainTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyoMainTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyoMainTicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Play_again;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel ScorO;
    private javax.swing.JLabel ScorX;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jumlahO;
    private javax.swing.JLabel jumlahX;
    // End of variables declaration//GEN-END:variables
}
