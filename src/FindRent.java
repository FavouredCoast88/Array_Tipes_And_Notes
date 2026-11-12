import javax.swing.*;
public class FindRent {
    public static void main(String[] args)
    {                   //00   01   02 bedroom
      int[][] rents =  { {400, 450, 510},//row 0/floor 0
                         {500, 560, 630},//row 1/floor 1
                         {625, 676, 740},//row 2/floor 2
                         {1000, 1250, 1600} };//row 3/floor 3
      String entry;
      int floor;
      int bedrooms;
       entry = JOptionPane.showInputDialog(null, "Enter a floor number ");
       floor = Integer.parseInt(entry);
       entry = JOptionPane.showInputDialog(null, "Enter number of bedrooms ");
       bedrooms = Integer.parseInt(entry);
        JOptionPane.showMessageDialog(null, "The rent for a " + bedrooms +
                                            " bedroom apartment on floor " + floor +
                                            " is $" + rents[floor][bedrooms]);
    }
 
}
