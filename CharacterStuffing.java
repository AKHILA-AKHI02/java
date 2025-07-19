import java.util.HashSet;
import java.util.Set;
public class CharacterStuffing 
{
 public static String characterStuffing(String originalData, char escapeChar, Set<Character> 
specialCharacters) 
{
 StringBuilder stuffedData = new StringBuilder();
 // Iterate through each character in the original data stream
 for (char character : originalData.toCharArray())
{
 // Check if the character is a special character
 if (specialCharacters.contains(character))
{
 // Append escape character followed by the special character to the stuffed data stream
 stuffedData.append(escapeChar).append(character);
 } else 
{
 // Append the character directly to the stuffed data stream
 stuffedData.append(character);
 }
 }
 // Return the stuffed data stream
 return stuffedData.toString();
 }
 public static String characterUnstuffing(String stuffedData, char escapeChar)
{
 StringBuilder originalData = new StringBuilder();
 // Iterate through each character in the stuffed data stream
 for (int i = 0; i < stuffedData.length(); i++) 
{
 char character = stuffedData.charAt(i);
 // Check if the character is an escape character
 if (character == escapeChar)
{
 // Skip the escape character and append the next character to the original data stream
 originalData.append(stuffedData.charAt(++i));
 } else
 {
 // Append the character directly to the original data stream
 originalData.append(character);
 }
 }
 // Return the original data stream
 return originalData.toString();
 }
 public static void main(String[] args)
{
 String originalData = "This is a test $data$ stream";
 System.out.println("Original Data: " + originalData);
 // Define special characters and escape character
 char escapeChar = '$';
 Set<Character> specialCharacters = new HashSet<>();
 specialCharacters.add('$');
 // Perform character stuffing
 String stuffedData = characterStuffing(originalData, escapeChar, specialCharacters);
 System.out.println("Stuffed Data: " + stuffedData);
 // Perform character unstuffing
 String unstuffedData = characterUnstuffing(stuffedData, escapeChar);
 System.out.println("Unstuffed Data: " + unstuffedData);
 }
}