package com.matsibora.mockquizapp.v0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MockQuizApp extends JFrame {

    // Declaration and initialization object
    private JLabel questionLabel;
    private JRadioButton radioButtons[] = new JRadioButton[4];
    private JButton nextButton = new JButton("Next");
    private baseQuestAnswer base = new baseQuestAnswer();
    private int numberQuest = 0;

    MockQuizApp() {
        super("Mock Quize Application");
        this.setBounds(100, 100, 500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(7, 2, 2, 2));

        questionLabel = new JLabel(base.dataQA.get(0).get(0));
        container.add(questionLabel);

        ButtonGroup group = new ButtonGroup();

        // Initialization RadioButton
        for (int i = 0; i < radioButtons.length; i++) {
            radioButtons[i] = new JRadioButton(base.dataQA.get(0).get(i + 1));
            container.add(radioButtons[i]);
            group.add(radioButtons[i]);
        }

        container.add(nextButton);
        nextButton.addActionListener(new ButtonNext());
    }

    public static void main(String[] args) {
        MockQuizApp newQuize = new MockQuizApp();
        newQuize.setVisible(true);

    }

    //
    private class ButtonNext implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (numberQuest < 10) {
                numberQuest++;
            } else {
                String message = "";
                message += "You finished quize";
                JOptionPane.showMessageDialog(null, message, "Info", JOptionPane.PLAIN_MESSAGE);
                return;
            }

            questionLabel.setText(base.dataQA.get(numberQuest).get(0));
            for (int i = 0; i < radioButtons.length; i++) {
                radioButtons[i].setText(base.dataQA.get(numberQuest).get(i + 1));
            }
        }
    }

    // DataBase questions and answers
    private class baseQuestAnswer {
        private ArrayList<ArrayList<String>> dataQA = new ArrayList<ArrayList<String>>();

        public baseQuestAnswer() {
            for (int i = 0; i < 10; i++) {
                dataQA.add(new ArrayList<String>());
            }

            dataQA.get(0).add("Que1 : Which one among these is not a datatype");
            dataQA.get(0).add("int");
            dataQA.get(0).add("Float");
            dataQA.get(0).add("boolean");
            dataQA.get(0).add("char");
            dataQA.get(0).add("Float");

            dataQA.get(1).add("Que2: Which class is available to all the class automatically");
            dataQA.get(1).add("Swing");
            dataQA.get(1).add("Applet");
            dataQA.get(1).add("Object");
            dataQA.get(1).add("ActionEvent");
            dataQA.get(1).add("Object");

            dataQA.get(2).add("Que3: Which package is directly available to our class without importing it");
            dataQA.get(2).add("swing");
            dataQA.get(2).add("applet");
            dataQA.get(2).add("net");
            dataQA.get(2).add("lang");
            dataQA.get(2).add("lang");

            dataQA.get(3).add("Que4: String class is defined in which package");
            dataQA.get(3).add("lang");
            dataQA.get(3).add("Swing");
            dataQA.get(3).add("Applet");
            dataQA.get(3).add("awt");
            dataQA.get(3).add("lang");

            dataQA.get(4).add("Que5: Which institute is best for java coaching");
            dataQA.get(4).add("Guru99");
            dataQA.get(4).add("ABC");
            dataQA.get(4).add("XYZ");
            dataQA.get(4).add("123");
            dataQA.get(4).add("Guru99");

            dataQA.get(5).add("Que6: Which one among these is not a keyword");
            dataQA.get(5).add("class");
            dataQA.get(5).add("int");
            dataQA.get(5).add("get");
            dataQA.get(5).add("if");
            dataQA.get(5).add("get");

            dataQA.get(6).add("Que7: Which one among these is not a class");
            dataQA.get(6).add("Swing");
            dataQA.get(6).add("Actionperformed");
            dataQA.get(6).add("ActionEvent");
            dataQA.get(6).add("Button");
            dataQA.get(6).add("Actionperformed");

            dataQA.get(7).add("Que8: which one among these is not a function of Object class");
            dataQA.get(7).add("toString");
            dataQA.get(7).add("finalize");
            dataQA.get(7).add("equals");
            dataQA.get(7).add("getDocumentBase");
            dataQA.get(7).add("getDocumentBase");

            dataQA.get(8).add("Que9: which function is not present in Applet class");
            dataQA.get(8).add("init");
            dataQA.get(8).add("main");
            dataQA.get(8).add("start");
            dataQA.get(8).add("destroy");
            dataQA.get(8).add("main");

            dataQA.get(9).add("Que10: Which one among these is not a valid component");
            dataQA.get(9).add("JButton");
            dataQA.get(9).add("JList");
            dataQA.get(9).add("JButtonGroup");
            dataQA.get(9).add("JTextArea");
            dataQA.get(9).add("JButtonGroup");
        }
    }
}