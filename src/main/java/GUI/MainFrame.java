package GUI;

import API.ClientAPI;
import Data.AllContinents.ContinentItem;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField q1;
    private JTextField q2;
    private JTextField q3;
    private JTextField q4;
    private JTextField ans1;
    private JTextField cans1;
    private JTextField ans2;
    private JTextField cans2;
    private JTextField ans3;
    private JTextField cans3;
    private JTextField ans4;
    private JTextField cans4;
    private JTextField textField_3;
    private JTextField corr1;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField corr3;
    private JTextField textField_18;
    private JTextField corr2;
    private JTextField textField_21;
    private JTextField userAns1;
    private JTextField userAns2;
    private JTextField userAns3;
    private JTextField textField_22;
    private JButton submitButton;
    private JTextField have1;
    private JTextField txtHowManyFirstlevel;
    private JTextField countryTxt;
    private JTextField have2;
    private JTextField txtHowManyResidents;
    private JTextField cityTxt;
    private JTextField have3;
    private JTextField txtHowManyCountries;
    private ClientAPI clientAPI;
    private JComboBox comboBox;
    private Properties properties = new Properties();

    private boolean[] answers = new boolean[3];

    private Locale locale;
    private ResourceBundle bundle;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame frame = new MainFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MainFrame() {

        clientAPI = new ClientAPI();

        try {
            properties = loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 940, 479);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 926, 569);
        contentPane.add(panel);
        panel.setLayout(null);

        q1 = new JTextField();

        q1.setFont(new Font("Candara Light", Font.BOLD, 14));
        q1.setEditable(false);
        q1.setBounds(10, 10, 185, 19);
        panel.add(q1);
        q1.setColumns(10);

        q2 = new JTextField();
        q2.setFont(new Font("Candara Light", Font.BOLD, 14));
        q2.setEditable(false);
        q2.setColumns(10);
        q2.setBounds(10, 116, 185, 19);
        panel.add(q2);

        q3 = new JTextField();
        q3.setFont(new Font("Candara Light", Font.BOLD, 14));
        q3.setEditable(false);
        q3.setColumns(10);
        q3.setBounds(10, 222, 185, 19);
        panel.add(q3);

        ans1 = new JTextField();
        ans1.setFont(new Font("Candara Light", Font.BOLD, 14));
        ans1.setEditable(false);
        ans1.setColumns(10);
        ans1.setBounds(10, 39, 185, 19);
        panel.add(ans1);

        cans1 = new JTextField();
        cans1.setFont(new Font("Candara Light", Font.BOLD, 14));
        cans1.setEditable(false);
        cans1.setColumns(10);
        cans1.setBounds(10, 68, 185, 19);
        panel.add(cans1);

        ans2 = new JTextField();
        ans2.setFont(new Font("Candara Light", Font.BOLD, 14));
        ans2.setEditable(false);
        ans2.setColumns(10);
        ans2.setBounds(10, 145, 185, 19);
        panel.add(ans2);

        cans2 = new JTextField();
        cans2.setFont(new Font("Candara Light", Font.BOLD, 14));
        cans2.setEditable(false);
        cans2.setColumns(10);
        cans2.setBounds(10, 174, 185, 19);
        panel.add(cans2);

        ans3 = new JTextField();
        ans3.setFont(new Font("Candara Light", Font.BOLD, 14));
        ans3.setEditable(false);
        ans3.setColumns(10);
        ans3.setBounds(10, 251, 185, 19);
        panel.add(ans3);

        cans3 = new JTextField();
        cans3.setFont(new Font("Candara Light", Font.BOLD, 14));
        cans3.setEditable(false);
        cans3.setColumns(10);
        cans3.setBounds(10, 280, 185, 19);
        panel.add(cans3);

        submitButton = new JButton();
        submitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                submitAnswers();
                panel.repaint();
            }
        });
        submitButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        submitButton.setBounds(239, 335, 418, 76);
        panel.add(submitButton);

        txtHowManyCountries = new JTextField();
        txtHowManyCountries.setText("How many countries does");
        txtHowManyCountries.setFont(new Font("Candara Light", Font.BOLD, 14));
        txtHowManyCountries.setEditable(false);
        txtHowManyCountries.setColumns(10);
        txtHowManyCountries.setBounds(239, 10, 236, 19);
        panel.add(txtHowManyCountries);

        corr1 = new JTextField();
        corr1.setFont(new Font("Candara Light", Font.BOLD, 14));
        corr1.setEditable(false);
        corr1.setColumns(10);
        corr1.setBounds(239, 68, 597, 19);
        panel.add(corr1);

        corr3 = new JTextField();
        corr3.setFont(new Font("Candara Light", Font.BOLD, 14));
        corr3.setEditable(false);
        corr3.setColumns(10);
        corr3.setBounds(239, 280, 597, 19);
        panel.add(corr3);

        corr2 = new JTextField();
        corr2.setFont(new Font("Candara Light", Font.BOLD, 14));
        corr2.setEditable(false);
        corr2.setColumns(10);
        corr2.setBounds(239, 174, 418, 19);
        panel.add(corr2);

        userAns1 = new JTextField();
        userAns1.setFont(new Font("Candara Light", Font.BOLD, 14));
        userAns1.setColumns(10);
        userAns1.setBounds(239, 39, 597, 19);
        panel.add(userAns1);

        userAns2 = new JTextField();
        userAns2.setFont(new Font("Candara Light", Font.BOLD, 14));
        userAns2.setColumns(10);
        userAns2.setBounds(239, 145, 418, 19);
        panel.add(userAns2);

        userAns3 = new JTextField();
        userAns3.setFont(new Font("Candara Light", Font.BOLD, 14));
        userAns3.setColumns(10);
        userAns3.setBounds(239, 251, 597, 19);
        panel.add(userAns3);

        have1 = new JTextField();
        have1.setText("have?");
        have1.setFont(new Font("Candara Light", Font.BOLD, 14));
        have1.setEditable(false);
        have1.setColumns(10);
        have1.setBounds(846, 10, 49, 19);
        panel.add(have1);

        txtHowManyFirstlevel = new JTextField();
        txtHowManyFirstlevel.setText("How many first-level administrative divisions does");
        txtHowManyFirstlevel.setFont(new Font("Candara Light", Font.BOLD, 14));
        txtHowManyFirstlevel.setEditable(false);
        txtHowManyFirstlevel.setColumns(10);
        txtHowManyFirstlevel.setBounds(239, 115, 387, 19);
        panel.add(txtHowManyFirstlevel);

        countryTxt = new JTextField();
        countryTxt.setFont(new Font("Candara Light", Font.BOLD, 14));
        countryTxt.setColumns(10);
        countryTxt.setBounds(636, 116, 200, 19);
        panel.add(countryTxt);

        have2 = new JTextField();
        have2.setText("have?");
        have2.setFont(new Font("Candara Light", Font.BOLD, 14));
        have2.setEditable(false);
        have2.setColumns(10);
        have2.setBounds(846, 116, 49, 19);
        panel.add(have2);

        txtHowManyResidents = new JTextField();
        txtHowManyResidents.setText("How many residents does");
        txtHowManyResidents.setFont(new Font("Candara Light", Font.BOLD, 14));
        txtHowManyResidents.setEditable(false);
        txtHowManyResidents.setColumns(10);
        txtHowManyResidents.setBounds(239, 221, 185, 19);
        panel.add(txtHowManyResidents);

        cityTxt = new JTextField();
        cityTxt.setFont(new Font("Candara Light", Font.BOLD, 14));
        cityTxt.setColumns(10);
        cityTxt.setBounds(441, 221, 395, 19);
        panel.add(cityTxt);

        have3 = new JTextField();
        have3.setText("have?");
        have3.setFont(new Font("Candara Light", Font.BOLD, 14));
        have3.setEditable(false);
        have3.setColumns(10);
        have3.setBounds(846, 222, 49, 19);
        panel.add(have3);

        ButtonGroup bgroup = new ButtonGroup();

        JRadioButton plButton = new JRadioButton("Polski");
        plButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                locale = new Locale("pl");
                bundle = ResourceBundle.getBundle("GUI.quizBundle_Pl", locale);

                try {
                    saveProperties();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                changeLanguage(bundle);
                panel.repaint();
            }
        });
        plButton.setBounds(10, 362, 103, 49);
        panel.add(plButton);

        JRadioButton engButton = new JRadioButton("English");
        engButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                locale = new Locale("en");
                bundle = ResourceBundle.getBundle("GUI.quizBundle_En", locale);

                try {
                    saveProperties();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                changeLanguage(bundle);
                panel.repaint();

            }
        });
        engButton.setBounds(10, 305, 103, 49);
        panel.add(engButton);

        bgroup.add(engButton);
        bgroup.add(plButton);

        comboBox = new JComboBox();
        comboBox.setFont(new Font("Candara Light", Font.BOLD, 14));
        comboBox.setToolTipText("");
        comboBox.setBounds(499, 10, 337, 21);
        panel.add(comboBox);

        locale = new Locale("en");
        bundle = ResourceBundle.getBundle("GUI.quizBundle_En", locale);
        changeLanguage(bundle);

        if (properties.getProperty("Language").equals("polski")) {
            locale = new Locale("pl");
            bundle = ResourceBundle.getBundle("GUI.quizBundle_Pl", locale);
            changeLanguage(bundle);
            plButton.setSelected(true);

        } else {
            locale = new Locale("en");
            bundle = ResourceBundle.getBundle("GUI.quizBundle_En", locale);
            changeLanguage(bundle);
            engButton.setSelected(true);
        }
    }

    private void changeLanguage(ResourceBundle b) {
        q1.setText(b.getString("question"));
        q2.setText(b.getString("question"));
        q3.setText(b.getString("question"));
        ans1.setText(b.getString("answer"));
        ans2.setText(b.getString("answer"));
        ans3.setText(b.getString("answer"));
        cans1.setText(b.getString("correct"));
        cans2.setText(b.getString("correct"));
        cans3.setText(b.getString("correct"));
        submitButton.setText(b.getString("submit"));

        txtHowManyCountries.setText(b.getString("contQuestion"));
        txtHowManyFirstlevel.setText(b.getString("countryQuestion"));
        txtHowManyResidents.setText(b.getString("cityQuestion"));

        cityTxt.setText(b.getString("<city>"));
        countryTxt.setText(b.getString("<country>"));

        comboBox.removeAllItems();
        for (ContinentItem c : clientAPI.getContinents()) {
            comboBox.addItem(b.getString(c.getName()));
        }

        if(locale.getDisplayLanguage().equals("polski")){
            have1.setText("?");
            have2.setText("?");
            have3.setText("?");
        }

        else{
            have1.setText("have?");
            have2.setText("have?");
            have3.setText("have?");
        }
    }

    private void submitAnswers() {
        String chosenContinent = "";

        for (String s : bundle.keySet()) {
            if (comboBox.getSelectedItem().toString().equals(bundle.getString(s))) {
                chosenContinent = s;
                break;
            }
        }

        int number1 = clientAPI.getContinentNumberOfCountries(chosenContinent);

        if (Integer.parseInt(userAns1.getText()) == number1) {
            userAns1.setBackground(Color.GREEN);
            answers[0] = true;
            if (locale.getDisplayLanguage().equals("polski"))
                corr1.setText("Tak, " + comboBox.getSelectedItem().toString() + " ma " + number1 + " " + MyChoiceFormat.getCountriesPl(number1));
            else
                corr1.setText("Yes, " + comboBox.getSelectedItem().toString() + " has " + number1 + " " + MyChoiceFormat.getCountriesEn(number1));
        } else {
            userAns1.setBackground(Color.RED);
            answers[0] = false;
            if (locale.getDisplayLanguage().equals("polski"))
                corr1.setText("Nie, " + comboBox.getSelectedItem().toString() + " ma " + number1 + " " + MyChoiceFormat.getCountriesPl(number1));
            else
                corr1.setText("No, " + comboBox.getSelectedItem().toString() + " has " + number1 + " " + MyChoiceFormat.getCountriesEn(number1));
        }


        int number2 = clientAPI.getCountryNumberOfA1(countryTxt.getText());
        if (!countryTxt.getText().equals(bundle.getString("<country>"))) {
            if (Integer.parseInt(userAns2.getText()) == number2) {
                userAns2.setBackground(Color.GREEN);
                answers[1] = true;
                if (locale.getDisplayLanguage().equals("polski"))
                    corr2.setText("Tak, " + countryTxt.getText() + " ma " + number2 + " " + MyChoiceFormat.getDivisionsPl(number2));
                else
                    corr2.setText("Yes, " + countryTxt.getText() + " has " + number2 + " " + MyChoiceFormat.getDivisionsEn(number2));
            } else {
                userAns2.setBackground(Color.RED);
                answers[1] = false;
                if (locale.getDisplayLanguage().equals("polski"))
                    corr2.setText("Nie, " + countryTxt.getText() + " ma " + number2 + " " + MyChoiceFormat.getDivisionsPl(number2));
                else
                    corr2.setText("No, " + countryTxt.getText() + " has " + number2 + " " + MyChoiceFormat.getDivisionsEn(number2));
            }
        }

        int number3 = clientAPI.getCityPopulation(cityTxt.getText());
        if (!cityTxt.getText().equals(bundle.getString("<city>"))) {
            if (Integer.parseInt(userAns3.getText()) == number3) {
                userAns3.setBackground(Color.GREEN);
                answers[2] = true;
                if (locale.getDisplayLanguage().equals("polski"))
                    corr3.setText("Tak, " + cityTxt.getText() + " ma " + number3 + " mieszkańców");
                else
                    corr3.setText("Yes, " + cityTxt.getText() + " has " + number3 + " residents");
            } else {
                userAns3.setBackground(Color.RED);
                answers[2] = false;
                if (locale.getDisplayLanguage().equals("polski"))
                    corr3.setText("Nie, " + cityTxt.getText() + " ma " + number3 + " mieszkańców");
                else
                    corr3.setText("No, " + cityTxt.getText() + " has " + number3 + " residents");
            }
        }
    }

    public static Properties loadProperties() throws IOException {
        File file = new File("property.dat");
        Properties p = new Properties();
        if (file.exists()) {
            FileInputStream fi = new FileInputStream(file);
            p.load(fi);
            fi.close();
            return p;
        }
        return null;
    }

    private void saveProperties() throws IOException {
        properties.setProperty("Language", locale.getDisplayLanguage());
        File file = new File("property.dat");
        FileOutputStream fr = new FileOutputStream(file);
        properties.store(fr, "Properties");
        fr.close();
    }
}

