import javax.swing.*;
import java.awt.*;

public class CustUI {
    public JFrame view;

    public JButton btnMakePurchase = new JButton("Make a Purchase");
    public JButton btnCancelPurchase = new JButton("Cancel a Purchase");
    public JButton btnViewPurchases = new JButton("View Purchase History");


    public CustUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Customer View");
        view.setSize(400, 300);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnMakePurchase);
        panelButtons.add(btnCancelPurchase);
        panelButtons.add(btnViewPurchases);

        view.getContentPane().add(panelButtons);


    }

    public static void main(String[] args) {
        int port = 1000;
        CustUI ui = new CustUI();
        ui.view.setVisible(true);

    }
}
