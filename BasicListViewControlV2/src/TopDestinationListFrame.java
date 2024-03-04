import javax.swing.ListCellRenderer;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.JList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

class TopDestinationListFrame extends JFrame
{
    private DefaultListModel listModel;
    
    public TopDestinationListFrame() {
        super("Top Five Destination List");
        this.setDefaultCloseOperation(3);
        this.setSize(900, 750);
        this.listModel = new DefaultListModel();
        this.addDestinationNameAndPicture("1. Paris, France: A city with rich history and beautiful art.", new ImageIcon(this.getClass().getResource("/resources/paris.jpeg")));
        this.addDestinationNameAndPicture("2. Rome, Italy: A city with marveoulous archetecture.", new ImageIcon(this.getClass().getResource("/resources/rome.jpg")));
        this.addDestinationNameAndPicture("3. Tokyo, Japan: A city full of Japanese culture.", new ImageIcon(this.getClass().getResource("/resources/tokyojapan.jpg")));
        this.addDestinationNameAndPicture("4. New York City, New York: A bustling city of business.", new ImageIcon(this.getClass().getResource("/resources/newyorkcity.jpg")));
        this.addDestinationNameAndPicture("5. Los Angeles, California: A city of film and the famous.", new ImageIcon(this.getClass().getResource("/resources/losangeles.jpg")));
        final JList list = new JList(this.listModel);
        final JScrollPane scrollPane = new JScrollPane(list);
        final TextAndIconListCellRenderer renderer = new TextAndIconListCellRenderer(2);
        list.setCellRenderer(renderer);
        this.getContentPane().add(scrollPane, "Center");
    }
    
    private void addDestinationNameAndPicture(final String text, final Icon icon) {
        final TextAndIcon tai = new TextAndIcon(text, icon);
        this.listModel.addElement(tai);
    }
}