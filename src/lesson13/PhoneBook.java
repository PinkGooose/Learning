package lesson13;

import java.util.*;

public class PhoneBook {
    private HashMap<String, List<String>> abonents = new HashMap<String, List<String>>();

    public void addAbonent(String name, String phoneNumber) {
        if(!abonents.containsKey(name)) {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phoneNumber);
            abonents.put(name, phones);
        } else {
            List<String> phones = abonents.get(name); // достаю все телефоны этого абонента
            phones.add(phoneNumber);
            abonents.put(name,phones);
        }
    }

    public void printAllAbonents() {
        for(String name:abonents.keySet()) {
            System.out.println(name + " - " + abonents.get(name));
        }
    }

    public void printAbonentBegginningWith(String beginNumber) {
        Set<String> nameHaveThisBegginning = new HashSet<>();
        for(String name:abonents.keySet()) {
            List<String> phones = abonents.get(name);
            for(String number : phones) {
                if(number.startsWith(beginNumber)) {
                    nameHaveThisBegginning.add(name);
                }
            }
        }
        System.out.println(nameHaveThisBegginning);
    }

    public void printUsersNumbers(String name) {
        if(!abonents.containsKey(name)) {
            System.out.println("Такого абонента нет в вашей записной книжке - " + name);
            return;
        }

        System.out.println(name + " - " + abonents.get(name));
    }
}
