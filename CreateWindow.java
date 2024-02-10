import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Пример JFrame");

        // Панель, на которую будут добавлены компоненты
        JPanel panel = new JPanel();

        JTextArea outputArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Создание кнопок
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");
        JButton button3 = new JButton("Кнопка 3");
        JButton button4 = new JButton("Кнопка 4");

        // Добавление обработчика событий для каждой кнопки
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Код для кнопки 1
                outputArea.append("Нажата кнопка 1\n");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputArea.append("Нажата кнопка 2\n");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Код для кнопки 3
                outputArea.append("Нажата кнопка 3\n");
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputArea.append("Exiting...");
                return;
            }
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(scrollPane);
        frame.getContentPane().add(panel);
        frame.setSize(1080, 720);
        outputArea.append("1. Check Balance\n");
        outputArea.append("2. Withdraw Funds\n");
        outputArea.append("3. Deposit Funds\n");
        outputArea.append("4. Exit\n");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
