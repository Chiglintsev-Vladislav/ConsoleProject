package com.main.forms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactApps extends JFrame {
    private JTextField nameField, emailField, phoneField;
    private JCheckBox male, female, checkBox;

    public ContactApps() {
        super("Contact Apps");
        super.setBounds(600, 300, 500, 200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout( 5, 2,10,4));

        JLabel nameLabel = new JLabel("Имя:");
        nameField = new JTextField(1);
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(1);
        JLabel phoneLabel = new JLabel("Телефон:");
        phoneField = new JTextField(1);

        container.add(nameLabel);
        container.add(nameField);
        container.add(emailLabel);
        container.add(emailField);
        container.add(phoneLabel);
        container.add(phoneField);

        male = new JCheckBox("Мужской");
        female = new JCheckBox("Женский");
        checkBox = new JCheckBox("Сосал?", false);
        JButton send_button = new JButton("Отправить");
        male.setSelected(true);
        container.add(male);
        container.add(female);
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        container.add(checkBox);
        container.add(send_button);

        send_button.addActionListener(new ButtonEventManager());
    }
    class ButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String gender = "Мужской";
            if (!male.isSelected()) gender = "Женский";
            boolean checked = checkBox.isSelected();
            String checkedStatus;
            if (checked) { checkedStatus = "Да"; } else { checkedStatus = "Нет";  }
            JOptionPane.showMessageDialog(null,"Email: " + email +
                            "\nТелефон: " + phone + "\nПол: " + gender +
                            "\nСосал?: " + checkedStatus,"Ваше имя: " + name,
                     JOptionPane.PLAIN_MESSAGE);
            dispose(); // закрываем окно после отправки
        }
    }
}
