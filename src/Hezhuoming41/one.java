package Hezhuoming41;

public class one {
    String[] names = new String[5];


    public void addName(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                names[i] = name;
                break;
            }
        }

    }

    public boolean editName(String oldName, String newName) {
        boolean find = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(oldName)) {
                names[i] = newName;
                find = true;
                break;
            }
        }
        return find;
    }

    public void show() {
        System.out.println("*************");
        System.out.println("\t客户列表");
        System.out.println("*************");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i] + "\t");

            }
        }
    }

}



