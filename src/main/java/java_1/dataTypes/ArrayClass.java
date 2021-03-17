package main.java.java_1.dataTypes;

import java.util.Arrays;

class ArrayClass {
    int[] nums = new int[]{10,23,3,4,5,2,1};
    String[] greetings = new String[]{"Hello","Howdy","Hallo","Hola","Bonjour","Ciao","أهلا و سهلا"};
    int[] bits = new int[]{0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
    String[] colors = new String[]{"bluebird","yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","Matterhorn","Great White Lakes","torah","white bible","green quran", "red herring", "Black Sea"};

    public static void main(String[] args) {
        ArrayClass arrayClass = new ArrayClass();

        arrayClass.printNums();
        arrayClass.greet("Brandon");

        System.out.println(Arrays.toString(arrayClass.bitsToBinaries()));

        System.out.println(Arrays.toString(arrayClass.keepColors()));
    }

    void printNums() {
//        Programmatically print the nums array to the console.  Print each number on a new line.  The nums array is defined on this class.
        System.out.println("Printing nums array in printNums()");
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    };

    void greet(String name) {
//        Randomly greet the person with a random greeting found in the greetings array.
//        For every greeting in the greetings array :
/*        ex : craig => greet() => "Hello Craig"
               "ABRAM" => greet() => "Hola Abram"
               "maTT => greet() => "أهلا و سهلا Matt"
 */
        // Using Math.random() to get a random number between 0 and 6. Random numbers should be either 0-6
        int max = greetings.length - 1;
        int min = 0;
        int random_num = (int)(Math.random() * (max - min + 1) + min);

        System.out.println(greetings[random_num] + " " + name);
    };

    boolean[] bitsToBinaries() {
//        Programmatically convert the bit array of 1's and 0's into a binary array of true and false. return the 'converted' array.
//        ex : bitsToBinaries() => [false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false]
        boolean[] binary = new boolean[bits.length];
        int j = 0;
        for(int i : bits)
        {
            if (i == 1)
            {
                binary[j] = true;
            }
            else
            {
                binary[j] = false;
            }
            j++;
        }
            return binary;
    };

    String[] keepColors() {
//        In this class is an array called "colors".  Programmatically remove the elements that do NOT have a color associated with it.  Return the filtered color array of elements that have a color associated with it.
//        ex : keepColors() => ["bluebird","yellow bumblebee","black spider", "green monkey","pink","black bird","Great White Lakes","white bible","green quran", "red herring", "Black Sea"]
        // Dynamically create array that will hold the colors that have been filtered
        String[] filterColors = new String[colors.length];
        // String array that holds colors in them. I just put the colors that appear in the colors array since we are only checking that one array
        String[] colorCheck = {"red", "blue", "yellow", "black", "white", "green", "pink"};

        // Go through 2 for loops. First for loop goes though each index of colors array. Second array goes through each color in the colorCheck array
        // Make string values in colors array lowercase and check if it is contained in the colorCheck array. This will make it so that
        // colors that have color values in them (even if it contain capital letters) will be added to filterColors array
        int index = 0;
        int numberOfFilteredColors = 0;
        for(String i : colors)
        {
            for(String j : colorCheck)
            {
                if(i.toLowerCase().contains(j))
                {
                    filterColors[index] = i;
                    numberOfFilteredColors++;
                }
            }
            index++;
        }
        // Dynamically create array filteredColors that will get filtered colors. Doing this since filterColors array has null values in it
        String[] filteredColors = new String[numberOfFilteredColors];
        index = 0;
        for(String i : filterColors)
        {
            if (i != null)
            {
                filteredColors[index] = i;
                index++;
            }
        }
        return filteredColors;
    }

}







