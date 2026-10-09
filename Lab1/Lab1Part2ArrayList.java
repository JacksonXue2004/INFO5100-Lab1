package Lab1;

import java.util.ArrayList;

public class Lab1Part2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        ArrayList<String> switchedNames = new ArrayList<String>();

        for (String name : names){
            char firstLetter = name.charAt(0);
            char lastLetter = name.charAt(name.length() - 1);
            String middle = name.substring(1, name.length() - 1);
            String switchedName = Character.toUpperCase(lastLetter) + middle + Character.toLowerCase(firstLetter);

            switchedNames.add(switchedName);
        }

        System.out.print("Names = {");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i));
            if (i < names.size() - 1){
                System.out.print(",");
            }
        }
        System.out.println("}");




        System.out.print("Names (switched) = {");
        for (int i = 0; i < switchedNames.size(); i++) {
            System.out.print(switchedNames.get(i));
            if (i < switchedNames.size() - 1){
                System.out.print(",");
            }
        }
        System.out.println("}"); 
    }

}
 

