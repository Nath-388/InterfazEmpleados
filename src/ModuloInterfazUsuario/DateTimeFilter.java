/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloInterfazUsuario;
import javax.swing.text.*;
import java.util.regex.Pattern;

public class DateTimeFilter extends DocumentFilter {
    private static final Pattern PATTERN = Pattern.compile(
        "^([0-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/\\d{4} ([0-1][0-9]|2[0-3]):[0-5][0-9]$"
    );

    @Override
    public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr)
            throws BadLocationException {
        StringBuilder sb = new StringBuilder();
        sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
        sb.insert(offset, text);
        if (isValid(sb.toString())) {
            super.insertString(fb, offset, text, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
            throws BadLocationException {
        StringBuilder sb = new StringBuilder();
        sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
        sb.replace(offset, offset + length, text);
        if (isValid(sb.toString())) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    private boolean isValid(String text) {
        return PATTERN.matcher(text).matches();
    }
}