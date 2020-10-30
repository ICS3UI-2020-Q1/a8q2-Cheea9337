import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;
  
  JLabel firstLabel;
  JLabel secondLabel;
  JLabel thirdLabel;

  JTextField firstInput;
  JTextField secondInput;
  JLabel thirdInput;

  JButton addButton;
  JButton subtractButton;
  JButton multiplyButton;
  JButton divideButton;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
 
    // initialize the main panel
    mainPanel = new JPanel();
    // disbale layout helpers
    mainPanel.setLayout(null);

    // create the panels
    firstLabel = new JLabel("First Number");
    secondLabel = new JLabel("Second Number");
    thirdLabel = new JLabel("Result");

    // layout the labels by setting coordinate and Size
    firstLabel.setBounds(100,200,200,20);
    secondLabel.setBounds(100,270,200,20);
    thirdLabel.setBounds(100,340,200,20);

    // initialize the input text fields
    firstInput = new JTextField();
    secondInput = new JTextField();
    thirdInput = new JLabel();

    // set the location and size
    firstInput.setBounds(300,200,200,20);
    secondInput.setBounds(300,270,200,20);
    thirdInput.setBounds(300,340,200,20);

    // initialize the buttons
    addButton = new JButton("Add");
    subtractButton = new JButton("Subtract");
    multiplyButton = new JButton("Multiply");
    divideButton = new JButton("Divide");

    // add an action listener to the buttons
    addButton.addActionListener(this);
    subtractButton.addActionListener(this);
    multiplyButton.addActionListener(this);
    divideButton.addActionListener(this);

    // add an action command to the buttons
    addButton.setActionCommand("add");
    subtractButton.setActionCommand("subtract");
    multiplyButton.setActionCommand("multiply");
    divideButton.setActionCommand("divide");

    // set the size and location of the buttons
    addButton.setBounds(100,460,100,20);
    subtractButton.setBounds(220,460,100,20);
    multiplyButton.setBounds(340,460,100,20);
    divideButton.setBounds(460,460,100,20);

    // add to the main panel 
    mainPanel.add(addButton);
    mainPanel.add(subtractButton);
    mainPanel.add(multiplyButton);
    mainPanel.add(divideButton);
    mainPanel.add(firstInput);
    mainPanel.add(secondInput);
    mainPanel.add(thirdInput);
    mainPanel.add(firstLabel);
    mainPanel.add(secondLabel);
    mainPanel.add(thirdLabel);

    // add the main panel to the frame
    frame.add(mainPanel);

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if(command.equals("add")){
      // get the numbers from the text boxes
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();

      // change the string into an integer
      int firstNumber = Integer.parseInt(firstText);
      int secondNumber = Integer.parseInt(secondText);

      // add the numbers together
      int result = firstNumber + secondNumber;

      // tell the user the answer
      thirdInput.setText("" + result);
    }

    if(command.equals("subtract")){
      // get the numbers from the text boxes
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();

      // change the string into an integer
      int firstNumber2 = Integer.parseInt(firstText);
      int secondNumber2 = Integer.parseInt(secondText);

      // subtract the numbers
      int result2 = firstNumber2 - secondNumber2;

      // tell the user the answer
      thirdInput.setText("" + result2);
    }

    if(command.equals("multiply")){
      // get the numbers from the text boxes
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();

      // change the string into an integer
      int firstNumber3 = Integer.parseInt(firstText);
      int secondNumber3 = Integer.parseInt(secondText);

      // multiply the numbers
      int result3 = firstNumber3 * secondNumber3;

      // tell the user the answer
      thirdInput.setText("" + result3);
    }

    if(command.equals("divide")){
      // get the numbers from the text boxes
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();

      // change the number into a string
      int firstNumber4 = Integer.parseInt(firstText);
      int secondNumber4 = Integer.parseInt(secondText);

      // divide the numbers
      int result4 = firstNumber4 / secondNumber4;

      // tell the user the answer
      thirdInput.setText("" + result4);

    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
