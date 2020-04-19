import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuUI extends JFrame {
    private JButton addBookButton;
    private JButton viewCollectionButton;
    private JLabel introLabel;
    private JPanel viewPanel;
    private JButton searchCollectionAuthorButton;
    private JButton searchCollectionGenreButton;
    private JButton searchCollectionPublisherButton;
    private JButton searchCollectionTitleButton;

    public menuUI(){
        add(viewPanel);
        setTitle("Lil Library");
        setLocationRelativeTo(null);
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showInputDialog("Enter the ISBN:");
            }
        });
    }
}
