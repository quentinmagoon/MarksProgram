
import java.util.ArrayList;
import java.util.Collections;

/*
 * Quentin Magoon
 * MarksProgra.java
 * This program requires the user to enter in any amount of grades
 * When the user hits sort the program then sorts the grades for least to greatest then displays it
 * After the user can hit analyze which displays the average, minimum mark, maximum mark, range, and the number of grades at level

 */

/**
 *
 * @author qumag7758
 */
public class MarksProgram extends javax.swing.JFrame {
    
    
    //creates array list
    ArrayList <Integer> marks = new ArrayList();
    
    int []level= {0,0,0,0,0};
    
    public MarksProgram() {
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

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        studentsMarksLabel = new javax.swing.JLabel();
        marksInput = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        sortButton = new javax.swing.JButton();
        analyzeButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        marksTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Swis721 Blk BT", 0, 18)); // NOI18N
        titleLabel.setText("Marks Program");

        studentsMarksLabel.setText("Students Mark");

        marksInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marksInputActionPerformed(evt);
            }
        });

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBar(null);

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        jScrollPane2.setViewportView(outputTextArea);

        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        analyzeButton.setText("Analyze");
        analyzeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeButtonActionPerformed(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBar(null);

        marksTextArea.setColumns(20);
        marksTextArea.setRows(5);
        jScrollPane3.setViewportView(marksTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(110, 110, 110))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(sortButton)
                        .addGap(68, 68, 68)
                        .addComponent(analyzeButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(studentsMarksLabel)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(marksInput, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(enterButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentsMarksLabel)
                    .addComponent(marksInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortButton)
                    .addComponent(analyzeButton))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marksInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marksInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marksInputActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        
        //sorts array from least to greates then displays it
        Collections.sort(marks);
        System.out.println(marks);
        
        for(int i = 0; i < marks.size(); i++)  {
            marksTextArea.setText(marksTextArea.getText()+marks.get(i)+"\n");
        }
        
    }//GEN-LAST:event_sortButtonActionPerformed

    private void analyzeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeButtonActionPerformed
        
        //finds average
        int sum = 0;
        double avg = 0;
    
        for(int i=0; i < marks.size(); i++) {
            
            sum += marks.get(i);
            avg = sum/marks.size();
        }
        
        //finds max and min
        int minimum = Collections.min(marks);
        int maximum = Collections.max(marks);
        
        //finds range
        int range = maximum - minimum;
       
        //finds marks at level        
        for(int i=0; i < marks.size(); i++) {
            
            if ((marks.get(i) >= 50)||(marks.get(i) < 60)) {
                level[0] ++;
            }
            else if((marks.get(i) >=60) || (marks.get(i) < 70)) {
                level[1] ++;
            }
            else if ((marks.get(i) >=70) || (marks.get(i) < 80)) {
                level[2] ++;
            }
            else if ((marks.get(i) >=80)) {
                level[3] ++;
            }
            else if ((marks.get(i) <50)) {
                level[4] ++;
            }
        }
        
        //displays all gathered data
        outputTextArea.setText(outputTextArea.getText() + "Class Average: " + (avg) + "%" );
        outputTextArea.setText(outputTextArea.getText() + "\n" + "Minimum Mark: " + (minimum));
        outputTextArea.setText(outputTextArea.getText() + "\n" + "Maximum Mark: " + (maximum));
        outputTextArea.setText(outputTextArea.getText() + "\n" + "Range: " + (range));
        outputTextArea.setText(outputTextArea.getText() + "\n" + "Number at Level: 1:" + (level[0]));
        outputTextArea.setText(outputTextArea.getText() + "\n" + "Number at Level: 2:" + (level[1]));
        outputTextArea.setText(outputTextArea.getText() + "\n" + "Number at Level: 3:" + (level[2]));
        outputTextArea.setText(outputTextArea.getText() + "\n" + "Number at Level: 4:" + (level[3]));
        outputTextArea.setText(outputTextArea.getText() + "\n" + "Number at Level: R:" + (level[4]));
    }//GEN-LAST:event_analyzeButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        
        //adds marks to array list
        Collections.addAll(marks,Integer.parseInt(marksInput.getText()));
        System.out.println(marks);
        marksInput.setText(null);

    }//GEN-LAST:event_enterButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarksProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyzeButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField marksInput;
    private javax.swing.JTextArea marksTextArea;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JButton sortButton;
    private javax.swing.JLabel studentsMarksLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
