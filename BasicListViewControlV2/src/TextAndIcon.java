import javax.swing.Icon;

// 
// Decompiled by Procyon v0.5.36
// 

class TextAndIcon
{
    private String text;
    private Icon icon;
    
    public TextAndIcon(final String text, final Icon icon) {
        this.text = text;
        this.icon = icon;
    }
    
    public String getText() {
        return this.text;
    }
    
    public Icon getIcon() {
        return this.icon;
    }
    
    public void setText(final String text) {
        this.text = text;
    }
    
    public void setIcon(final Icon icon) {
        this.icon = icon;
    }
}