import java.awt.Rectangle;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import javax.swing.border.Border;
import javax.swing.ListCellRenderer;
import javax.swing.JLabel;

// 
// Decompiled by Procyon v0.5.36
// 

class TextAndIconListCellRenderer extends JLabel implements ListCellRenderer
{
    private static final Border NO_FOCUS_BORDER;
    private Border insideBorder;
    
    static {
        NO_FOCUS_BORDER = new EmptyBorder(1, 1, 1, 1);
    }
    
    public TextAndIconListCellRenderer() {
        this(0, 0, 0, 0);
    }
    
    public TextAndIconListCellRenderer(final int padding) {
        this(padding, padding, padding, padding);
    }
    
    public TextAndIconListCellRenderer(final int topPadding, final int rightPadding, final int bottomPadding, final int leftPadding) {
        this.insideBorder = BorderFactory.createEmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding);
        this.setOpaque(true);
    }
    
    @Override
    public Component getListCellRendererComponent(final JList list, final Object value, final int index, final boolean isSelected, final boolean hasFocus) {
        final TextAndIcon tai = (TextAndIcon)value;
        this.setText(tai.getText());
        this.setIcon(tai.getIcon());
        if (isSelected) {
            this.setBackground(list.getSelectionBackground());
            this.setForeground(list.getSelectionForeground());
        }
        else {
            this.setBackground(list.getBackground());
            this.setForeground(list.getForeground());
        }
        Border outsideBorder;
        if (hasFocus) {
            outsideBorder = UIManager.getBorder("List.focusCellHighlightBorder");
        }
        else {
            outsideBorder = TextAndIconListCellRenderer.NO_FOCUS_BORDER;
        }
        this.setBorder(BorderFactory.createCompoundBorder(outsideBorder, this.insideBorder));
        this.setComponentOrientation(list.getComponentOrientation());
        this.setEnabled(list.isEnabled());
        this.setFont(list.getFont());
        return this;
    }
    
    @Override
    public void validate() {
    }
    
    @Override
    public void invalidate() {
    }
    
    @Override
    public void repaint() {
    }
    
    @Override
    public void revalidate() {
    }
    
    @Override
    public void repaint(final long tm, final int x, final int y, final int width, final int height) {
    }
    
    @Override
    public void repaint(final Rectangle r) {
    }
}