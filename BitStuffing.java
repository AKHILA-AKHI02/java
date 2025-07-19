public class BitStuffing {
 public static String bitStuffing(String originalData) 
{
 int counter = 0;
 StringBuilder stuffedData = new StringBuilder();
 for (char bit : originalData.toCharArray()) 
{
 if (bit == '1') 
{
 counter++;
 stuffedData.append(bit);
 } else
{ // bit == '0'
 if (counter == 5) 
{
 stuffedData.append('0'); // Stuffing
 counter = 0;
 }
 stuffedData.append(bit);
 }
 }
 // Check if the last five bits were '11111' and add an extra '0' bit for stuffing
 if (counter == 5)
 {
 stuffedData.append('0');
 }
 return stuffedData.toString();
 }
 public static String bitUnstuffing(String stuffedData) 
{
 StringBuilder originalData = new StringBuilder();
 // Counter to keep track of consecutive '1' bits
 int counter = 0;
 for (char bit : stuffedData.toCharArray()) 
{
 if (bit == '1') 
{
 counter++;
 // Append '1' bit to the original data stream
 originalData.append(bit);
 // Reset counter if more than five consecutive '1' bits encountered
 if (counter >= 5) 
{
 counter = 0;
 }
 } else { // bit == '0'
 if (counter < 5) {
 // Append '0' bit to the original data stream
 originalData.append(bit);
 }
 // Reset counter
 counter = 0;
 }
 }
 return originalData.toString();
 }
 public static void main(String[] args) 
{
 String originalData = "011111110";
 System.out.println("Original Data: " + originalData);
 String stuffedData = bitStuffing(originalData);
 System.out.println("Stuffed Data: " + stuffedData);
 String unstuffedData = bitUnstuffing(stuffedData);
 System.out.println("Unstuffed Data: " + unstuffedData);
 }
}