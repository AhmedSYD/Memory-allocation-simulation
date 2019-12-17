
package Memory_allocation;

import java.awt.Color;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class MemoryAllocationGui extends javax.swing.JFrame {
private Memory mem=new Memory();

private int cntProcess=0;//no of process that user add
    /**
     * Creates new form AssignmentGui
     */
    public MemoryAllocationGui() {
        initComponents();
         deallocateField.setEnabled(false);
       BaseAddressHole.setEnabled(false);  sizeHole.setEnabled(false);
       nameProcess.setEnabled(false);      sizeProcess.setEnabled(false);
       addHole.setEnabled(false);      addProcess.setEnabled(false);   drawButton.setEnabled(false);
         deallocateButton.setEnabled(false);  compactButton.setEnabled(false);
          
    }

        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataPanel = new javax.swing.JPanel();
        processPanel = new javax.swing.JPanel();
        nameProcess = new javax.swing.JTextField();
        sizeProcess = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addProcess = new javax.swing.JButton();
        drawButton = new javax.swing.JButton();
        holePanel = new javax.swing.JPanel();
        BaseAddressHole = new javax.swing.JTextField();
        sizeHole = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addHole = new javax.swing.JButton();
        TypeAllocatePanel = new javax.swing.JPanel();
        comboAllocation = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        noProcessField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        memoryPanel = new javax.swing.JPanel();
        deallocateField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        deallocateButton = new javax.swing.JButton();
        viewMemoryPanel = new javax.swing.JPanel();
        compactButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contingous Alocation");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(40, 10));

        dataPanel.setBackground(new java.awt.Color(153, 153, 153));
        dataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hole and Processs Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        processPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Process Data"));

        jLabel3.setText("Size of Process");

        jLabel4.setText("Name of Process");

        addProcess.setText("Add");
        addProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout processPanelLayout = new javax.swing.GroupLayout(processPanel);
        processPanel.setLayout(processPanelLayout);
        processPanelLayout.setHorizontalGroup(
            processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, processPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameProcess, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(sizeProcess))
                .addGap(36, 36, 36))
            .addGroup(processPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(addProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        processPanelLayout.setVerticalGroup(
            processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameProcess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeProcess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addProcess)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        drawButton.setText("Draw Memory");
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonActionPerformed(evt);
            }
        });

        holePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Hole Data"));

        BaseAddressHole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaseAddressHoleActionPerformed(evt);
            }
        });

        sizeHole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeHoleActionPerformed(evt);
            }
        });

        jLabel1.setText("Base Adress");

        jLabel2.setText("Size");

        addHole.setText("Add");
        addHole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHoleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout holePanelLayout = new javax.swing.GroupLayout(holePanel);
        holePanel.setLayout(holePanelLayout);
        holePanelLayout.setHorizontalGroup(
            holePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, holePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(holePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(holePanelLayout.createSequentialGroup()
                        .addGap(0, 72, Short.MAX_VALUE)
                        .addComponent(addHole, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(holePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sizeHole, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(BaseAddressHole))
                .addGap(37, 37, 37))
        );
        holePanelLayout.setVerticalGroup(
            holePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holePanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(holePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaseAddressHole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(holePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeHole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addHole)
                .addContainerGap())
        );

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(drawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dataPanelLayout.createSequentialGroup()
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(holePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        dataPanelLayout.setVerticalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addComponent(holePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(processPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawButton))
        );

        TypeAllocatePanel.setBackground(new java.awt.Color(153, 153, 153));
        TypeAllocatePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type Allocation & no Process", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        comboAllocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Best Fit", "First Fit", "Worst Fit", " " }));
        comboAllocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAllocationActionPerformed(evt);
            }
        });

        jLabel5.setText("Choose type of Allocation:");

        noProcessField.setName("noProcessField"); // NOI18N
        noProcessField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noProcessFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Enter no of Process:");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TypeAllocatePanelLayout = new javax.swing.GroupLayout(TypeAllocatePanel);
        TypeAllocatePanel.setLayout(TypeAllocatePanelLayout);
        TypeAllocatePanelLayout.setHorizontalGroup(
            TypeAllocatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypeAllocatePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(TypeAllocatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboAllocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noProcessField)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        TypeAllocatePanelLayout.setVerticalGroup(
            TypeAllocatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypeAllocatePanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(comboAllocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TypeAllocatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(okButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noProcessField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        memoryPanel.setBackground(new java.awt.Color(153, 153, 153));
        memoryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Memory", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel7.setText("Name of Process ");

        deallocateButton.setText(" Deallocate & Draw");
        deallocateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deallocateButtonActionPerformed(evt);
            }
        });

        viewMemoryPanel.setBackground(new java.awt.Color(204, 204, 204));
        viewMemoryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("View Memory"));

        javax.swing.GroupLayout viewMemoryPanelLayout = new javax.swing.GroupLayout(viewMemoryPanel);
        viewMemoryPanel.setLayout(viewMemoryPanelLayout);
        viewMemoryPanelLayout.setHorizontalGroup(
            viewMemoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        viewMemoryPanelLayout.setVerticalGroup(
            viewMemoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        compactButton.setText("Deallocate&Draw compaction");
        compactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compactButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout memoryPanelLayout = new javax.swing.GroupLayout(memoryPanel);
        memoryPanel.setLayout(memoryPanelLayout);
        memoryPanelLayout.setHorizontalGroup(
            memoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deallocateField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(deallocateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(compactButton)
                .addContainerGap(41, Short.MAX_VALUE))
            .addComponent(viewMemoryPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        memoryPanelLayout.setVerticalGroup(
            memoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memoryPanelLayout.createSequentialGroup()
                .addGroup(memoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deallocateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(deallocateButton)
                    .addComponent(compactButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewMemoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TypeAllocatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(memoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TypeAllocatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(dataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(memoryPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BaseAddressHoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaseAddressHoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BaseAddressHoleActionPerformed

    private void sizeHoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeHoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeHoleActionPerformed

    private void addHoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHoleActionPerformed
        // TODO add your handling code here:
        int sz; int bs;
        try{
        sz=Integer.parseInt(sizeHole.getText()); bs=Integer.parseInt(BaseAddressHole.getText());
        mem.AllocateHoles(new Hole(sz,bs));
        sizeHole.setText("");   BaseAddressHole.setText("");
        }catch(NumberFormatException e){
           errorFrame err=new errorFrame();
            err.setVisible(true);
            err.setLabelText("<html>Enter nunmber not string or empty value</html>");
        }
    }//GEN-LAST:event_addHoleActionPerformed

    private void comboAllocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAllocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAllocationActionPerformed

    private void noProcessFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noProcessFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noProcessFieldActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        try{
        mem.setNoProcess(Integer.parseInt(noProcessField.getText()));
        int type;
        type=comboAllocation.getSelectedIndex();
        mem.setAllocationMethod(type);

              BaseAddressHole.setEnabled(true);  sizeHole.setEnabled(true);
       nameProcess.setEnabled(true);      sizeProcess.setEnabled(true);
       noProcessField.setEnabled(false);
       okButton.setEnabled(false);
       comboAllocation.setEnabled(false);
       addHole.setEnabled(true);      addProcess.setEnabled(true);   drawButton.setEnabled(true);
        }catch(NumberFormatException e){
           errorFrame err=new errorFrame();
            err.setVisible(true);
            err.setLabelText("<html>Enter nunmber not string or empty value</html>");
        }
       //System.out.println( viewMemoryPanel.getHeight());
       
    }//GEN-LAST:event_okButtonActionPerformed

    private void addProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProcessActionPerformed
        // TODO add your handling code here:
         String name; int siz;
        try{
            cntProcess++;
        if(cntProcess<=mem.getNoProcess()){
            name=nameProcess.getText();   siz=Integer.parseInt(sizeProcess.getText());
            mem.AllocateProcess(new Process(name,siz));
            nameProcess.setText("");  sizeProcess.setText("");
        }
        else{
            errorFrame err=new errorFrame();
            err.setVisible(true);
            err.setLabelText("sorry you enter no of process exceed you select before");
            cntProcess--;//as cntProcess is golbal variable and if increst it affect on other function so, return again to size of process
        }
        }catch(NumberFormatException e){
           errorFrame err=new errorFrame();
            err.setVisible(true);
            err.setLabelText("<html>Enter nunmber not string or empty value</html>");
            cntProcess--;//as you don't add this value to vector
        }
    }//GEN-LAST:event_addProcessActionPerformed

    private void drawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonActionPerformed
        // TODO add your handling code here:
        deallocateField.setEnabled(true);
        deallocateButton.setEnabled(true);  compactButton.setEnabled(true);
        addHole.setEnabled(false);      addProcess.setEnabled(false);   drawButton.setEnabled(false);
       BaseAddressHole.setEnabled(false);  sizeHole.setEnabled(false);
       nameProcess.setEnabled(false);      sizeProcess.setEnabled(false);        
         mem.allocationMemory();
        Draw();   
        
    }//GEN-LAST:event_drawButtonActionPerformed

    private void deallocateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deallocateButtonActionPerformed
        // TODO add your handling code here:
        deallocacteGui(0);
    }//GEN-LAST:event_deallocateButtonActionPerformed

    private void compactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compactButtonActionPerformed
        // TODO add your handling code here:
        deallocacteGui(1);
    }//GEN-LAST:event_compactButtonActionPerformed
     public void deallocacteGui(int compFlag){
         cntProcess--;
        if(cntProcess<0){
            errorFrame err=new errorFrame();
            err.setVisible(true);
             err.setLabelText("<html>Sorry,no process in memory</html>");
             cntProcess++;
             return;
        }
        Vector<Process> temp=new Vector<>(100,2);
        String ser=deallocateField.getText();
        int flag=0;
        temp=mem.getArrProcess();
        
        for(int i=0;i<temp.size();i++){
            if(temp.get(i).getName().equals(ser)){
                mem.setCompactionFlag(compFlag);
                mem.deAllocationMemory(temp.get(i));
                 viewMemoryPanel.removeAll();
                 viewMemoryPanel.repaint();
                 viewMemoryPanel.revalidate();
                  Draw(); 
                  flag=1;//mean that he found process 
                  break;
            }
        }
        if(flag==0){//he not found process
           errorFrame err=new errorFrame();
            err.setVisible(true);
            err.setLabelText("<html>Sorry name of process is not in memory.<br>Enter name of process again</html>");
            cntProcess++;//as we decrement cntProcess in first function and name of process is not found so we increament again to indicate that no process doesn't change
        }
     }
    public void Draw(){
       Vector<Process> processDraw=new Vector<>(100,2);
       Vector<Hole> HolesDraw=new Vector<>(100,2);
       HolesDraw=mem.getSortedBaseHoles();
       processDraw=mem.getSortedBaseProcess();
         int h=viewMemoryPanel.getY()+4;
         int x=viewMemoryPanel.getX()+35;
         int hl=viewMemoryPanel.getY()+4;
         int xl=viewMemoryPanel.getX()+2;
      
        for(int i=0;i<HolesDraw.size();i++){//draw holes
            //if(HolesDraw.get(i).getSize()>0){
            JTextField newField=new JTextField("");
            JLabel newLabel1=new JLabel(String.valueOf(HolesDraw.get(i).getBaseAddress()));
            JLabel newLabel2=new JLabel(String.valueOf(HolesDraw.get(i).getSize()+HolesDraw.get(i).getBaseAddress()));
            newField.setBounds(x,h+HolesDraw.get(i).getBaseAddress(),50,HolesDraw.get(i).getSize());
            newLabel1.setBounds(xl,hl+HolesDraw.get(i).getBaseAddress(),30,10);
            newLabel2.setBounds(xl,hl+HolesDraw.get(i).getBaseAddress()+HolesDraw.get(i).getSize(),30,10);
            //newField.setBackground(Color.red);
            newField.setVisible(true);  newLabel1.setVisible(true);  newLabel2.setVisible(true);
            viewMemoryPanel.add(newField);   viewMemoryPanel.add(newLabel1);    viewMemoryPanel.add(newLabel2); 
            //}
        }
        for(int i=0;i<processDraw.size();i++){
            if(processDraw.get(i).getIsAllocated()){
              JTextField newField=new JTextField(processDraw.get(i).getName());
              JLabel newLabel1=new JLabel(String.valueOf(processDraw.get(i).getBaseAddress()));
              JLabel newLabel2=new JLabel(String.valueOf(processDraw.get(i).getSize()+processDraw.get(i).getBaseAddress()));
              newField.setBounds(x,h+processDraw.get(i).getBaseAddress(),50,processDraw.get(i).getSize()); 
              newLabel1.setBounds(xl,hl+processDraw.get(i).getBaseAddress(),30,10);
              newLabel2.setBounds(xl,hl+processDraw.get(i).getBaseAddress()+processDraw.get(i).getSize(),30,10);
              newField.setVisible(true);   newLabel1.setVisible(true);  newLabel2.setVisible(true);
              viewMemoryPanel.add(newField);   viewMemoryPanel.add(newLabel1);    viewMemoryPanel.add(newLabel2);
            }
        }
         
     }
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
            java.util.logging.Logger.getLogger(MemoryAllocationGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoryAllocationGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoryAllocationGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoryAllocationGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemoryAllocationGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BaseAddressHole;
    private javax.swing.JPanel TypeAllocatePanel;
    private javax.swing.JButton addHole;
    private javax.swing.JButton addProcess;
    private javax.swing.JComboBox<String> comboAllocation;
    private javax.swing.JButton compactButton;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JButton deallocateButton;
    private javax.swing.JTextField deallocateField;
    private javax.swing.JButton drawButton;
    private javax.swing.JPanel holePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel memoryPanel;
    private javax.swing.JTextField nameProcess;
    private javax.swing.JTextField noProcessField;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel processPanel;
    private javax.swing.JTextField sizeHole;
    private javax.swing.JTextField sizeProcess;
    private javax.swing.JPanel viewMemoryPanel;
    // End of variables declaration//GEN-END:variables


}