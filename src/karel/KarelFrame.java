package karel;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.Timer;



/**
 *
 * @author Allen
 */
public class KarelFrame extends javax.swing.JFrame {
    
    private final int OFFSET = 10;

    /**
     * Creates new form KarelFrame
     */
    public KarelFrame() {
        initComponents();
        editInitUI();
        
 
    }


    private void editInitUI(){
        
     /*   ImageIcon img = new ImageIcon(getClass().getResource("/karel/Grid.gif"));
       
        Image image = img.getImage();
        image = image.getScaledInstance(GridLabel.getWidth(), GridLabel.getHeight(), java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(image);
        GridLabel.setIcon(img);
     */ 
        
        currentLevelName = "level.txt";
        
        BoardPanel = new Board(currentLevelName);
        
        BoardPanel.setSize((BoardPanel.getBoardWidth() + OFFSET), (BoardPanel.getBoardHeight() + OFFSET));
        
        //add(BoardPanel, -1);
        
        ActionPanel.add(BoardPanel, -1);
        PlayerInfoTextArea.setText(BoardPanel.PlayerInfo());
        
        ProgrammingTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ProgrammingTabbedPaneStateChanged(evt);
            }
        });
        
        
        setLocationRelativeTo(null);
        setTitle("Karel the Robot");
        
    }
    
    private void createNewPanel(){
        int index = ProgrammingTabbedPane.getSelectedIndex();
        
        if(index == 0){
            ExecuteButton.setEnabled(false);
            ActionPanel.remove(BoardPanel);
            ActionPanel.repaint();
            BoardPanel = new Board(currentLevelName);
            BoardPanel.setSize((BoardPanel.getBoardWidth() + OFFSET), (BoardPanel.getBoardHeight() + OFFSET));
            BoardPanel.setManualMode(true);
            ActionPanel.add(BoardPanel, -1);
            PlayerInfoTextArea.setText(BoardPanel.PlayerInfo());    
        }
       
        if(index == 1){
            ExecuteButton.setEnabled(true);
            ActionPanel.remove(BoardPanel);
            ActionPanel.repaint();
            BoardPanel = new Board(currentLevelName);;
            BoardPanel.setSize((BoardPanel.getBoardWidth() + OFFSET), (BoardPanel.getBoardHeight() + OFFSET));
            BoardPanel.setManualMode(false);
            ActionPanel.add(BoardPanel, -1);
            PlayerInfoTextArea.setText(BoardPanel.PlayerInfo());    
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        EditPopupMenu = new javax.swing.JPopupMenu();
        CopyPopout = new javax.swing.JMenuItem();
        CutPopout = new javax.swing.JMenuItem();
        DeletePopout = new javax.swing.JMenuItem();
        PastePopout = new javax.swing.JMenuItem();
        ActionPanel = new javax.swing.JPanel();
        ProgramPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PlayerInfoTextArea = new javax.swing.JTextArea();
        ProgrammingTabbedPane = new javax.swing.JTabbedPane();
        ManualPanel = new javax.swing.JPanel();
        GoButton = new javax.swing.JButton();
        LeftButton = new javax.swing.JButton();
        RightButton = new javax.swing.JButton();
        PutButton = new javax.swing.JButton();
        GetButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CodeTextArea = new javax.swing.JTextArea();
        ExecuteButton = new javax.swing.JButton();
        StatusBarPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        NewMenuItem = new javax.swing.JMenuItem();
        OpenMenuItem = new javax.swing.JMenuItem();
        SaveMenuItem = new javax.swing.JMenuItem();
        SaveAsMenuItem = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        CutMenuItem = new javax.swing.JMenuItem();
        CopyMenuItem = new javax.swing.JMenuItem();
        PasteMenuItem = new javax.swing.JMenuItem();
        DeleteMenuItem = new javax.swing.JMenuItem();
        LevelMenu = new javax.swing.JMenu();
        LoadLevelMenuItem = new javax.swing.JMenuItem();
        RestartLevelMenuItem = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        CopyPopout.setText("Copy");
        CopyPopout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyPopoutActionPerformed(evt);
            }
        });
        EditPopupMenu.add(CopyPopout);

        CutPopout.setText("Cut");
        CutPopout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutPopoutActionPerformed(evt);
            }
        });
        EditPopupMenu.add(CutPopout);

        DeletePopout.setText("Delete");
        DeletePopout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePopoutActionPerformed(evt);
            }
        });
        EditPopupMenu.add(DeletePopout);

        PastePopout.setText("Paste");
        PastePopout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastePopoutActionPerformed(evt);
            }
        });
        EditPopupMenu.add(PastePopout);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ActionPanel.setAutoscrolls(true);
        ActionPanel.setName(""); // NOI18N

        javax.swing.GroupLayout ActionPanelLayout = new javax.swing.GroupLayout(ActionPanel);
        ActionPanel.setLayout(ActionPanelLayout);
        ActionPanelLayout.setHorizontalGroup(
            ActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ActionPanelLayout.setVerticalGroup(
            ActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PlayerInfoTextArea.setColumns(20);
        PlayerInfoTextArea.setRows(5);
        PlayerInfoTextArea.setFocusable(false);
        jScrollPane2.setViewportView(PlayerInfoTextArea);

        GoButton.setText("GO");
        GoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoButtonActionPerformed(evt);
            }
        });

        LeftButton.setText("LEFT");
        LeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftButtonActionPerformed(evt);
            }
        });

        RightButton.setText("Right");
        RightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightButtonActionPerformed(evt);
            }
        });

        PutButton.setText("PUT");
        PutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PutButtonActionPerformed(evt);
            }
        });

        GetButton.setText("GET");
        GetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManualPanelLayout = new javax.swing.GroupLayout(ManualPanel);
        ManualPanel.setLayout(ManualPanelLayout);
        ManualPanelLayout.setHorizontalGroup(
            ManualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManualPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(LeftButton, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(ManualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManualPanelLayout.createSequentialGroup()
                        .addComponent(GetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(RightButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addGroup(ManualPanelLayout.createSequentialGroup()
                        .addGroup(ManualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(75, 75, 75)))
                .addGap(43, 43, 43))
        );
        ManualPanelLayout.setVerticalGroup(
            ManualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManualPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(GoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(ManualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(RightButton, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(GetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeftButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(112, 112, 112))
        );

        ProgrammingTabbedPane.addTab("Manual", ManualPanel);

        CodeTextArea.setColumns(20);
        CodeTextArea.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        CodeTextArea.setRows(5);
        CodeTextArea.setTabSize(4);
        CodeTextArea.setDragEnabled(true);
        CodeTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CodeTextAreaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(CodeTextArea);

        ProgrammingTabbedPane.addTab("Programming", jScrollPane1);

        ExecuteButton.setText("Execute");
        ExecuteButton.setEnabled(false);
        ExecuteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProgramPanelLayout = new javax.swing.GroupLayout(ProgramPanel);
        ProgramPanel.setLayout(ProgramPanelLayout);
        ProgramPanelLayout.setHorizontalGroup(
            ProgramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProgramPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProgramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProgrammingTabbedPane)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(ProgramPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(ExecuteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProgramPanelLayout.setVerticalGroup(
            ProgramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProgramPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProgrammingTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExecuteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout StatusBarPanelLayout = new javax.swing.GroupLayout(StatusBarPanel);
        StatusBarPanel.setLayout(StatusBarPanelLayout);
        StatusBarPanelLayout.setHorizontalGroup(
            StatusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(674, Short.MAX_VALUE))
        );
        StatusBarPanelLayout.setVerticalGroup(
            StatusBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StatusBarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        FileMenu.setText("File");

        NewMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        NewMenuItem.setText("New");
        NewMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(NewMenuItem);

        OpenMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        OpenMenuItem.setText("Open");
        OpenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(OpenMenuItem);

        SaveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SaveMenuItem.setText("Save");
        SaveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(SaveMenuItem);

        SaveAsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        SaveAsMenuItem.setText("Save As");
        SaveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(SaveAsMenuItem);

        jMenuBar1.add(FileMenu);

        EditMenu.setText("Edit");

        CutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        CutMenuItem.setText("Cut");
        CutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(CutMenuItem);

        CopyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        CopyMenuItem.setText("Copy");
        CopyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(CopyMenuItem);

        PasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        PasteMenuItem.setText("Paste");
        PasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(PasteMenuItem);

        DeleteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        DeleteMenuItem.setText("Delete");
        DeleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(DeleteMenuItem);

        jMenuBar1.add(EditMenu);

        LevelMenu.setText("Level");

        LoadLevelMenuItem.setText("Load");
        LoadLevelMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadLevelMenuItemActionPerformed(evt);
            }
        });
        LevelMenu.add(LoadLevelMenuItem);

        RestartLevelMenuItem.setText("Restart");
        RestartLevelMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartLevelMenuItemActionPerformed(evt);
            }
        });
        LevelMenu.add(RestartLevelMenuItem);

        jMenuItem3.setText("jMenuItem3");
        LevelMenu.add(jMenuItem3);

        jMenuBar1.add(LevelMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProgramPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ActionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(StatusBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProgramPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(StatusBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMenuItemActionPerformed
        int ans = JOptionPane.showConfirmDialog(ActionPanel, "Save First?",
                        "Create new file", JOptionPane.YES_NO_OPTION);
        if(ans == JOptionPane.YES_OPTION){
            FileOperations fo = new FileOperations(CodeTextArea.getText(), currentFileName);
            if(currentFileName.isEmpty()){
                JFileChooser chooser = new JFileChooser();
                int returnVal = chooser.showSaveDialog(this);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    currentFileName = file.getAbsolutePath();
                    fo.setFileName(file.getAbsolutePath());
                    fo.save();   
                }
            }
            
        }
        else if(ans == JOptionPane.NO_OPTION){
            currentFileName = "";
            CodeTextArea.setText("");
        }
        else{
            
        }
        
    }//GEN-LAST:event_NewMenuItemActionPerformed

    private void SaveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMenuItemActionPerformed
        FileOperations fo = new FileOperations(CodeTextArea.getText(), currentFileName);
        
        if(currentFileName.isEmpty()){
            JFileChooser chooser = new JFileChooser();
            int returnVal = chooser.showSaveDialog(this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                currentFileName = file.getAbsolutePath();
                fo.setFileName(file.getAbsolutePath());
                fo.save();   
            }
        }          
    }//GEN-LAST:event_SaveMenuItemActionPerformed

    private void SaveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsMenuItemActionPerformed
        
        FileOperations fo = new FileOperations(CodeTextArea.getText(), currentFileName);
        
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showSaveDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            currentFileName = file.getAbsolutePath();
            fo.setFileName(file.getAbsolutePath());
            fo.save();   
        }
                                                   
    }//GEN-LAST:event_SaveAsMenuItemActionPerformed

    private void OpenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuItemActionPerformed
        ProgrammingTabbedPane.setSelectedIndex(1);
        FileOperations fo = new FileOperations(CodeTextArea.getText(), currentFileName);
        
        //Create a file chooser
        final JFileChooser chooser = new JFileChooser();
        
        //In response to a button click:
        int returnVal = chooser.showOpenDialog(this);
        
        
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                currentFileName = file.getAbsolutePath();
                fo.setFileName(file.getAbsolutePath());
                CodeTextArea.setText(fo.open());
            } 
    }//GEN-LAST:event_OpenMenuItemActionPerformed

    private void CopyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyMenuItemActionPerformed
        EditOperations eo = new EditOperations();
        eo.copy(CodeTextArea.getSelectedText());
    }//GEN-LAST:event_CopyMenuItemActionPerformed

    private void DeleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMenuItemActionPerformed
        CodeTextArea.replaceSelection("");
    }//GEN-LAST:event_DeleteMenuItemActionPerformed

    private void PasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteMenuItemActionPerformed
         EditOperations eo = new EditOperations();
         CodeTextArea.replaceSelection(eo.paste());
    }//GEN-LAST:event_PasteMenuItemActionPerformed

    private void CutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutMenuItemActionPerformed

        EditOperations eo = new EditOperations();
        eo.copy(CodeTextArea.getSelectedText());
        CodeTextArea.replaceSelection("");
    }//GEN-LAST:event_CutMenuItemActionPerformed

    private void CodeTextAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodeTextAreaMousePressed
        if(SwingUtilities.isRightMouseButton(evt)){
            EditPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_CodeTextAreaMousePressed

    private void CopyPopoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyPopoutActionPerformed
        EditOperations eo = new EditOperations();
        eo.copy(CodeTextArea.getSelectedText());
    }//GEN-LAST:event_CopyPopoutActionPerformed

    private void CutPopoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutPopoutActionPerformed
        EditOperations eo = new EditOperations();
        eo.copy(CodeTextArea.getSelectedText());
        CodeTextArea.replaceSelection("");
    }//GEN-LAST:event_CutPopoutActionPerformed

    private void DeletePopoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePopoutActionPerformed
        CodeTextArea.replaceSelection("");
    }//GEN-LAST:event_DeletePopoutActionPerformed

    private void PastePopoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastePopoutActionPerformed
        EditOperations eo = new EditOperations();
        CodeTextArea.replaceSelection(eo.paste());
    }//GEN-LAST:event_PastePopoutActionPerformed

    private void LoadLevelMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadLevelMenuItemActionPerformed
        //Create a file chooser
        final JFileChooser chooser = new JFileChooser();
        
        //In response to a button click:
        int returnVal = chooser.showOpenDialog(this);
        
        
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                currentLevelName = file.getAbsolutePath();
                createNewPanel();
                
            } 
    }//GEN-LAST:event_LoadLevelMenuItemActionPerformed

    private void RestartLevelMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartLevelMenuItemActionPerformed
        createNewPanel();
    }//GEN-LAST:event_RestartLevelMenuItemActionPerformed

    private void GoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoButtonActionPerformed
        BoardPanel.keyPressed('w');
        PlayerInfoTextArea.setText(BoardPanel.PlayerInfo());
    }//GEN-LAST:event_GoButtonActionPerformed

    private void LeftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftButtonActionPerformed
        BoardPanel.keyPressed('a');
        PlayerInfoTextArea.setText(BoardPanel.PlayerInfo());
    }//GEN-LAST:event_LeftButtonActionPerformed

    private void RightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightButtonActionPerformed
        BoardPanel.keyPressed('d');
        PlayerInfoTextArea.setText(BoardPanel.PlayerInfo());
    }//GEN-LAST:event_RightButtonActionPerformed

    private void GetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetButtonActionPerformed
        BoardPanel.keyPressed('e');
        PlayerInfoTextArea.setText(BoardPanel.PlayerInfo());
    }//GEN-LAST:event_GetButtonActionPerformed

    private void PutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PutButtonActionPerformed
        BoardPanel.keyPressed('s');
        PlayerInfoTextArea.setText(BoardPanel.PlayerInfo());
    }//GEN-LAST:event_PutButtonActionPerformed

    private void ExecuteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteButtonActionPerformed
        ProgrammerMode pm = new ProgrammerMode(CodeTextArea.getText(), BoardPanel);
       // ArrayList<Character> keyChars = new ArrayList();
        pm.Start();
        keyChars = pm.getKeyInstructions();
        
        ActionListener taskPerformer = new ActionListener() {
             int i;
            public void actionPerformed(ActionEvent evt) {
              
              BoardPanel.keyPressed(keyChars.get(i));
              PlayerInfoTextArea.setText(BoardPanel.PlayerInfo());
              i++;
            }
        };
      new Timer(500, taskPerformer).start();
        
      /*  for(int i=0; i<keyChars.size(); i++){
            System.out.println(keyChars.get(i));
            BoardPanel.keyPressed(keyChars.get(i));
            PlayerInfoTextArea.setText(BoardPanel.PlayerInfo());
        }*/
        
         
    }//GEN-LAST:event_ExecuteButtonActionPerformed

    private void ProgrammingTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt){
        createNewPanel();
    }
    
    public JTextArea getInfoArea(){
        return PlayerInfoTextArea;
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
            java.util.logging.Logger.getLogger(KarelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KarelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KarelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KarelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KarelFrame().setVisible(true);
            }
        });
    }
    
    private String currentFileName = new String();
    final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    private String currentLevelName = new String();
    ArrayList<Character> keyChars = new ArrayList();
    
    
    
    
    private Board BoardPanel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActionPanel;
    private javax.swing.JTextArea CodeTextArea;
    private javax.swing.JMenuItem CopyMenuItem;
    private javax.swing.JMenuItem CopyPopout;
    private javax.swing.JMenuItem CutMenuItem;
    private javax.swing.JMenuItem CutPopout;
    private javax.swing.JMenuItem DeleteMenuItem;
    private javax.swing.JMenuItem DeletePopout;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JPopupMenu EditPopupMenu;
    private javax.swing.JButton ExecuteButton;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JButton GetButton;
    private javax.swing.JButton GoButton;
    private javax.swing.JButton LeftButton;
    private javax.swing.JMenu LevelMenu;
    private javax.swing.JMenuItem LoadLevelMenuItem;
    private javax.swing.JPanel ManualPanel;
    private javax.swing.JMenuItem NewMenuItem;
    private javax.swing.JMenuItem OpenMenuItem;
    private javax.swing.JMenuItem PasteMenuItem;
    private javax.swing.JMenuItem PastePopout;
    private javax.swing.JTextArea PlayerInfoTextArea;
    private javax.swing.JPanel ProgramPanel;
    private javax.swing.JTabbedPane ProgrammingTabbedPane;
    private javax.swing.JButton PutButton;
    private javax.swing.JMenuItem RestartLevelMenuItem;
    private javax.swing.JButton RightButton;
    private javax.swing.JMenuItem SaveAsMenuItem;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JPanel StatusBarPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
