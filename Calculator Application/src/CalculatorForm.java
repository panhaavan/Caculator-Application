

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorForm extends javax.swing.JFrame {
    public CalculatorForm() {
        initComponents();
        txtResult.setEditable(false);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("+");
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("-");
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("*");
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("/");
            }
        });
        
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("%");
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        txtFirstNum = new javax.swing.JTextField();
        txtSecondNum = new javax.swing.JTextField();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Result: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel2.setText("First Number: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setText("Second Number: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel1.add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 190, 40));
        jPanel1.add(txtFirstNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 190, 40));
        jPanel1.add(txtSecondNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 190, 40));

        btn2.setText("-");
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 190, 50));

        btn1.setText("+");
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 50));

        btn3.setText("*");
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 50));

        btn4.setText("\\");
            jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 190, 50));

            btn5.setText("%");
            jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, 50));

            btn6.setText("Clear");
            jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 190, 50));

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

            pack();
        }// </editor-fold>//GEN-END:initComponents
    private void clearFields() {
        txtFirstNum.setText("");
        txtSecondNum.setText("");
        txtResult.setText("");
    }
    
    private void performOperation(String operator) {
        try {
            double num1 = Double.parseDouble(txtFirstNum.getText());
            double num2 = Double.parseDouble(txtSecondNum.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(this, "Error: Division by zero");
                        return;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                
            }

            txtResult.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Invalid input");
        }
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFirstNum;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtSecondNum;
    // End of variables declaration//GEN-END:variables
}
