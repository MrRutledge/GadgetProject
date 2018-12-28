import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

/**
* Used Labels,Text fields and Buttons in the GUI 
* @author (Student ID: 12058822 Student Name: Rahim RUTLEDGE)
* @version (12/04/13)
*/
public class GadgetShop implements ActionListener
{
    private JFrame frame;
    private ArrayList<Gadget> gadgets;

    private JLabel modelLabel;
    private JLabel priceLabel;
    private JLabel weigthLabel;
    private JLabel sizeLabel;
    private JLabel creditLabel;
    private JLabel memoryLabel;
    private JLabel phoneNoLabel;
    private JLabel durationLabel;
    private JLabel downloadLabel;
    private JLabel displayNumberLabel;
    private JLabel spaceLabelOne;
    private JLabel spaceLabelTwo;


    private JTextField ModelTextField;
    private JTextField PriceTextField;
    private JTextField WeightTextField;
    private JTextField SizeTextField;
    private JTextField CreditTextField;
    private JTextField MemoryTextField;
    private JTextField PhoneNoTextField;
    private JTextField DurationTextField;
    private JTextField DownloadTextField;
    private JTextField DisplayNumberTextField;

    private JButton mobileButton;
    private JButton mp3Button;
    private JButton clearButton;
    private JButton displayAllButton;
    private JButton makeACallButton;
    private JButton downloadMusicButton;

    /**
     * Converting the variables 
     */

    public static void main(String[] args)
    {
        GadgetShop converter = new GadgetShop();
    }

    public GadgetShop()
    {
        frame = new JFrame("GadgetShop");

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(7,4));

        JLabel modelLabel = new JLabel("Model:");
        contentPane.add(modelLabel);
        JLabel priceLabel = new JLabel("Price:");
        contentPane.add(priceLabel);
        JLabel weightLabel = new JLabel("Weight:");
        contentPane.add(weightLabel);
        JLabel sizeLabel = new JLabel("Size:");
        contentPane.add(sizeLabel);

        ModelTextField = new JTextField(15);
        contentPane.add(ModelTextField);
        PriceTextField = new JTextField(15);
        contentPane.add(PriceTextField);
        WeightTextField = new JTextField(15);
        contentPane.add(WeightTextField);
        SizeTextField = new JTextField(15);
        contentPane.add(SizeTextField);

        JLabel creditLabel = new JLabel("Credit:");
        contentPane.add(creditLabel);
        JLabel memoryLabel = new JLabel("Memory:");
        contentPane.add(memoryLabel);
        mobileButton = new JButton("Add Mobile");
        contentPane.add(mobileButton);
        mobileButton.addActionListener(this);
        mp3Button = new JButton("Add MP3");
        contentPane.add(mp3Button);
        mp3Button.addActionListener(this);

        CreditTextField = new JTextField(15);
        contentPane.add(CreditTextField);
        MemoryTextField = new JTextField(15);
        contentPane.add(MemoryTextField);


        clearButton = new JButton("Clear");
        contentPane.add(clearButton);
        clearButton.addActionListener(this);
        displayAllButton = new JButton("Display All");
        contentPane.add(displayAllButton);
        displayAllButton.addActionListener(this);

        JLabel phoneNoLabel = new JLabel("Phone No:");
        contentPane.add(phoneNoLabel);
        JLabel durationLabel = new JLabel("Duration:");
        contentPane.add(durationLabel);
        JLabel downloadLabel = new JLabel("Download:");
        contentPane.add(downloadLabel);
        JLabel displayNumberLabel = new JLabel("Display Number:");
        contentPane.add(displayNumberLabel);

        PhoneNoTextField = new JTextField(15);
        contentPane.add(PhoneNoTextField);
        DurationTextField = new JTextField(15);
        contentPane.add(DurationTextField);
        DownloadTextField = new JTextField(15);
        contentPane.add(DownloadTextField);
        DisplayNumberTextField = new JTextField(15);
        contentPane.add(DisplayNumberTextField);

        makeACallButton = new JButton("Make A Call");
        contentPane.add(makeACallButton);
        makeACallButton.addActionListener(this);
        downloadMusicButton = new JButton("Download Music");
        contentPane.add(downloadMusicButton);
        downloadMusicButton.addActionListener(this);

        JLabel spaceLabelOne = new JLabel("");
        contentPane.add(spaceLabelOne);
        JLabel spaceLabelTwo = new JLabel("");
        contentPane.add(spaceLabelTwo);

        gadgets = new ArrayList<Gadget>();
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * This is the action performed method for the buttons that would be prsented for the user of the GUI

     */
    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();
        if (command.equals("Add Mobile"))
        {
            addMobile();
        }

        if (command.equals("Add MP3"))
        {
            addMP3(); 
        }

        if (command.equals("Display All"))
        {
            addDisplayAll();

        }

        if (command.equals("Make A Call"))
        {
            addMakeACall(); 
        }

        if (command.equals("Download Music"))
        {
            downloadMusic();
        }

        if (command.equals("Clear"))
        {
            clear();
        }
    }

    public String getModelTextField()
    {
        String model = ModelTextField.getText();
        return model;
    }

    /**
     * Converting price text field string in the GUI to double
     */
    public double getPriceTextField()
    {
        double price = Double.parseDouble(PriceTextField.getText());
        return price;
    }

    /**
     * Converting weight text field string in the GUI to integer
     */
    public int getWeightTextField()
    {
        int weight = Integer.parseInt(WeightTextField.getText());
        return weight;
    }

    public String getSizeTextField()
    {
        String size = SizeTextField.getText();
        return size;
    }

    /**
     *Converting the text field credit string to integer
     */
    public int getCreditTextField()
    {
        int credit = Integer.parseInt(CreditTextField.getText());
        return credit;
    }

    /**
     * Converting the text field memory string to integer 
     */
    public int getMemoryTextField()
    {
        int memory = Integer.parseInt(MemoryTextField.getText());
        return memory;
    }

    public String getPhoneNoTextField()
    {
        String phoneNo = PhoneNoTextField.getText();
        return phoneNo;
    }

    /**
     * Converting the string duration text field to integer 
     */
    public int getDurationTextField()
    {
        int duration = Integer.parseInt(DurationTextField.getText());
        return duration;
    }

    /**
     * Converting the string duration text field to integer 
     */
    public int getDownloadTextField()
    {
        int download = Integer.parseInt(DownloadTextField.getText());
        return download;
    }

    public int getDisplayNumberTextField()
    {
        int displayNumber = Integer.parseInt(DisplayNumberTextField.getText());
        return displayNumber;

    }

    /**
     *Clearing the text fields of the GUI  
     */
    public void clear()
    {
        ModelTextField.setText("");
        PriceTextField.setText("");
        WeightTextField.setText("");
        SizeTextField.setText("");
        CreditTextField.setText("");
        MemoryTextField.setText("");
        PhoneNoTextField.setText("");
        DurationTextField.setText("");
        DownloadTextField.setText("");
        DisplayNumberTextField.setText("");
    }

    /**
     *  The input values of the model, price, weight, size, and credit from the next are used to create a new mobile object.
     *  Added to the array list
     */
    public void addMobile()
    {
        String TheModel = getModelTextField();
        double ThePrice = getPriceTextField();
        int TheWeight = getWeightTextField();
        String TheSize = getSizeTextField();
        int Credit = getCreditTextField();
        Mobile mobile = new Mobile(TheModel,ThePrice,TheWeight,TheSize,Credit);
        gadgets.add(Mobile);
    }

    /**
     *  The input values of the model, price, weight, size, and memory from the next are used to create a new MP3 object.
     *  Added to the array list
     */
    public void addMP3()
    {
        String TheModel = getModelTextField();
        double ThePrice = getPriceTextField();
        int TheWeight = getWeightTextField();
        String TheSize = getSizeTextField();
        int memory = getMemoryTextField();
        MP3 mp3 = new MP3(TheModel,ThePrice,TheWeight,TheSize,memory);

        gadgets.add(MP3);
    }

    /**
     * Displaying a message for the users, if a unsuitable value is used for dislay number text field.
     * Stoping the user from coming out of the range.
     */
    public int addDisplayNumber()
    {
        int displayNumberTextField = -1;
        try{
            displayNumberTextField = Integer.parseInt(DisplayNumberTextField.getText());
            if(displayNumberTextField < 0 || displayNumberTextField >= gadgets.size())
            {
                JOptionPane.showMessageDialog(frame, " Please enter a valid" + " gadget number", " Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException exception)
        {
            JOptionPane.showMessageDialog(frame, " Please enter a gadget number", " Error Message", JOptionPane.ERROR_MESSAGE);

        }
        return displayNumberTextField;
    }

    /**
     *Giving a unique gadget number every time a new gadget is added. 
     */
    public void addDisplayAll()
    {
        // 
        int index = 0;
        for(Gadget gadget : gadgets)
        {
            System.out.println("Gadget Number " + index);
            gadget.print();
            System.out.println();
            index++;
        }

    }

    /**
     * If a suitable value has been entered for the display number.
     * The display number will be used to get the gadget(mobile), from the array list.
     * The method is done by making a call in the mobile class called with the phone and duration entered.
     */
    public void addMakeACall()
    {
        int displayNumber = addDisplayNumber();
        String phoneNumber = getPhoneNoTextField();
        int minutes = getDurationTextField();
        Mobile mobile = (Mobile) gadgets.get(displayNumber);
        mobile.call(phoneNumber, minutes);

    }

    /**
     * If a suitable value has been entered for the display number.
     * The display number is used to get the gadget (MP3), from the array list.
     * The method to download a music is called with the download size entered.
     */
    public void downloadMusic()
    {

        {
            int displayNumber = addDisplayNumber();

            MP3 mp3 = (MP3) gadgets.get(getDisplayNumberTextField());
            mp3.insertDownload(getDownloadTextField());
        }


    }

}
 
