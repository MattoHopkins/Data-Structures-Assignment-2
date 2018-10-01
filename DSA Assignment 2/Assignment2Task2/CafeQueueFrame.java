/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2Task2;

import java.util.Random;

/**
 *
 * @author matto
 */
public class CafeQueueFrame extends javax.swing.JFrame {

    public CafeQueue line1 = new CafeQueue();
    public CafeQueue line2 = new CafeQueue();
    public CafeQueue line3 = new CafeQueue();
    public CafeQueue line4 = new CafeQueue();

    /**
     * Creates new form CafeQueue
     */
    public CafeQueueFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jLabel5.setText("Press space to add a new customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addGap(98, 98, 98)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Allows a user to add another customer into the queue with the press of the space bar. Also has a 1/5 chance to remove a person from the queue when a new customer enters
     */
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        Random rand = new Random();

        if (evt.getKeyChar() == ' ') {
            System.out.println("Test");
            int n = rand.nextInt(20) + 1;
            System.out.println("Random number: " + n);

            if ((line1.size() <= line2.size()) && (line1.size() <= line3.size()) && (line1.size() <= line4.size())) {
                line1.enqueue(new Customer());
                jProgressBar1.setValue((line1.size() + 1) * 4);
                jLabel1.setText("" + line1.size());

            } else if ((line2.size() <= line1.size()) && (line2.size() <= line3.size()) && (line2.size() <= line4.size())) {
                line2.enqueue(new Customer());
                jProgressBar2.setValue((line2.size() + 1) * 4);
                jLabel2.setText("" + line1.size());

            } else if (line3.size() <= line1.size() && line3.size() <= line2.size() && line3.size() <= line4.size()) {
                line3.enqueue(new Customer());
                jProgressBar3.setValue((line3.size() + 1) * 4);
                jLabel3.setText("" + line3.size());

            } else if (line4.size() <= line1.size() && line4.size() <= line2.size() && line4.size() <= line3.size()) {
                line4.enqueue(new Customer());
                jProgressBar4.setValue((line4.size() + 1) * 4);
                jLabel4.setText("" + line4.size());

            }

            if (n == 1) {
                line1.dequeue();
                jProgressBar1.setValue((line1.size()) * 5);
                jLabel1.setText("" + line1.size());

            } else if (n == 2) {
                line2.dequeue();
                jProgressBar2.setValue((line2.size()) * 5);
                jLabel2.setText("" + line2.size());

            } else if (n == 3) {
                line3.dequeue();
                jProgressBar3.setValue((line3.size()) * 5);
                jLabel3.setText("" + line3.size());

            } else if (n == 4) {
                line4.dequeue();
                jProgressBar4.setValue((line4.size()) * 5);
                jLabel4.setText("" + line4.size());

            }
            System.out.println(line1.size());
            System.out.println(line2.size());
            System.out.println(line3.size());
            System.out.println(line4.size());

        }
    }//GEN-LAST:event_formKeyPressed

    /*
    Another way to 'randomly' remove people in the queue
     */
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:

        Random rand = new Random();

        int n = rand.nextInt(100) + 1;

        System.out.println("Mouse dragged");

        if (n == 1) {
            line1.dequeue();
            jProgressBar1.setValue((line1.size()) * 5);
            jLabel1.setText("" + line1.size());

        } else if (n == 2) {
            line2.dequeue();
            jProgressBar2.setValue((line2.size()) * 5);
            jLabel2.setText("" + line2.size());

        } else if (n == 3) {
            line3.dequeue();
            jProgressBar3.setValue((line3.size()) * 5);
            jLabel3.setText("" + line3.size());

        } else if (n == 4) {
            line4.dequeue();
            jProgressBar4.setValue((line4.size()) * 5);
            jLabel4.setText("" + line4.size());

        }
    }//GEN-LAST:event_formMouseDragged

    /*
    Another way to 'randomly' remove people in the queue
     */
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        Random rand = new Random();

        int n = rand.nextInt(1000) + 1;

        System.out.println("Mouse moved");
        if (n == 1) {
            line1.dequeue();
            jProgressBar1.setValue((line1.size()) * 5);
            jLabel1.setText("" + line1.size());

        } else if (n == 2) {
            line2.dequeue();
            jProgressBar2.setValue((line2.size()) * 5);
            jLabel2.setText("" + line2.size());

        } else if (n == 3) {
            line3.dequeue();
            jProgressBar3.setValue((line3.size()) * 5);
            jLabel3.setText("" + line3.size());

        } else if (n == 4) {
            line4.dequeue();
            jProgressBar4.setValue((line4.size()) * 5);
            jLabel4.setText("" + line4.size());

        }
    }//GEN-LAST:event_formMouseMoved

    /*
    Another way to 'randomly' remove people in the queue
     */
    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
        Random rand = new Random();

        int n = rand.nextInt(100) + 1;

        System.out.println("Mouse moved");
        if (n == 1) {
            line1.dequeue();
            jProgressBar1.setValue((line1.size()) * 5);
            jLabel1.setText("" + line1.size());

        } else if (n == 2) {
            line2.dequeue();
            jProgressBar2.setValue((line2.size()) * 5);
            jLabel2.setText("" + line2.size());

        } else if (n == 3) {
            line3.dequeue();
            jProgressBar3.setValue((line3.size()) * 5);
            jLabel3.setText("" + line3.size());

        } else if (n == 4) {
            line4.dequeue();
            jProgressBar4.setValue((line4.size()) * 5);
            jLabel4.setText("" + line4.size());

        }
    }//GEN-LAST:event_formKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    // End of variables declaration//GEN-END:variables
}
