import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;


public class AdminUI {
    public JFrame view;

    public JButton btnSetConfig = new JButton("Set Configuration");
    public JButton btnAddUser = new JButton("Add User");
    public JButton btnDeleteUser = new JButton("Delete User");



    public AdminUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Admin View");
        view.setSize(400, 300);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnSetConfig);
        panelButtons.add(btnAddUser);
        panelButtons.add(btnDeleteUser);

        view.getContentPane().add(panelButtons);


    }

    public static void main(String[] args) {
        int port = 1000;
        AdminUI ui = new AdminUI();
        ui.view.setVisible(true);

    }

}
