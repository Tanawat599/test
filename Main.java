import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // สร้าง JFrame
        JFrame frame = new JFrame("Professional Experience");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null); // ใช้ layout แบบไม่มีการจัดเรียง

        // สร้าง JLabel สำหรับหัวข้อ
        JLabel titleLabel = new JLabel("Professional Experience");
        titleLabel.setBounds(10, 10, 200, 25);
        frame.add(titleLabel);

        // สร้าง JTextArea สำหรับข้อมูล
        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 40, 360, 150);
        textArea.setEditable(false);
        textArea.setText("1. Indonesia Inventors Day 2024\n   May 2022 - August 2022\n   - Developed and maintained code for websites.\n   - Optimized existing functionalities.\n\n"
                        + "2. Freelance Web Developer\n   September 2022 - Present\n   - Designed user-friendly websites for local businesses.\n   - Implemented responsive web design.");
        frame.add(textArea);

        // สร้างปุ่ม "อ่านเพิ่มเติม"
        JButton readMoreButton = new JButton("อ่านเพิ่มเติม");
        readMoreButton.setBounds(150, 210, 100, 30);
        frame.add(readMoreButton);

        // สร้าง JTextArea สำหรับข้อมูลเพิ่มเติม (ซ่อนไว้ก่อน)
        JTextArea additionalInfo = new JTextArea();
        additionalInfo.setBounds(10, 250, 360, 100);
        additionalInfo.setEditable(false);
        additionalInfo.setText("Additional Experience:\n- Participated in hackathons.\n- Contributed to open-source projects.\n- Engaged in community service.");
        additionalInfo.setVisible(false); // ซ่อนข้อมูลเพิ่มเติม
        frame.add(additionalInfo);

        // เพิ่ม ActionListener ให้กับปุ่ม
        readMoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                additionalInfo.setVisible(!additionalInfo.isVisible()); // สลับการแสดงข้อมูลเพิ่มเติม
            }
        });

        // ทำให้ JFrame แสดงผล
        frame.setVisible(true);
    }
}
