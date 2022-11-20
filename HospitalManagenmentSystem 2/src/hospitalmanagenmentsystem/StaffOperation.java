/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagenmentsystem;

/**
 *
 * @author Asus
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class StaffOperation {

    private ArrayList<Staff> staffs = new ArrayList<Staff>();

    public StaffOperation() {

    }

    public void addStaff(Staff staff) {

        staffs.add(staff);
        try {
            File outFile = new File("StaffTextFile.txt");
            FileWriter outFileStream = new FileWriter(outFile, true);
            PrintWriter outStream = new PrintWriter(outFileStream);

            outStream.println(staff.getName());
            outStream.println(staff.getIc());
            outStream.println(staff.getAddress());
            outStream.println(staff.getPhone());
            outStream.println(staff.getBlood());
            outStream.println(staff.getGender());
            outStream.println(staff.getState());
            outStream.println(staff.getAge());
            outStream.println(staff.getGuardian());
            outStream.println(staff.getContact());
            outStream.println();
            outStream.close();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    public String readAllStaffs() {
        System.out.println("");
        String name = null, ic = null, gender = null, address = null, state = null, phone = null, blood = null, guardian = null, contact = null;
        int age = 0;
        StringBuilder stringBuilder = new StringBuilder();
        String output = null;
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i) != null) {
                name = staffs.get(i).getName();
                ic = staffs.get(i).getIc();
                address = staffs.get(i).getAddress();
                phone = staffs.get(i).getPhone();
                blood = staffs.get(i).getBlood();
                gender = staffs.get(i).getGender();
                state = staffs.get(i).getState();
                age = staffs.get(i).getAge();
                guardian = staffs.get(i).getGuardian();
                contact = staffs.get(i).getContact();

                System.out.println("Name : " + name);
                System.out.println("Identity Card : " + ic);
                System.out.println("Age : " + age);
                System.out.println("Address : " + address);
                System.out.println("State : " + state);
                System.out.println("Mobile Number : " + phone);
                System.out.println("Blood Group : " + blood);
                System.out.println("Gender : " + gender);
                System.out.println("Guardian Name : " + guardian);
                System.out.println("Guardian Contact : " + contact);

                output = "Name: " + name + "\nIdentity Card Number: " + ic + "\nAge: " + age + "\nAddress: " + address + "\nMobile Number: " + phone + "\nBlood Group: " + blood + "\nGender: " + gender + "\nGuardian Name: " + guardian + "\nGuardian Number: " + contact + "\n";
                stringBuilder.append(output);
            }
            System.out.println("");

        }
        String outputFinal = stringBuilder.toString();
        return outputFinal;

    }

    public String searchStaff(String searchIC) {
        String searchOutput = null;
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i) != null) {

                if (staffs.get(i).getIc().equalsIgnoreCase(searchIC)) {
                    String name = staffs.get(i).getName();
                    String ic = staffs.get(i).getIc();
                    String address = staffs.get(i).getAddress();
                    String phone = staffs.get(i).getPhone();
                    String blood = staffs.get(i).getBlood();
                    String gender = staffs.get(i).getGender();
                    String state = staffs.get(i).getState();
                    int age = staffs.get(i).getAge();
                    String guardian = staffs.get(i).getGuardian();
                    String contact = staffs.get(i).getContact();

                    searchOutput = "Name: " + name + "\nIdentity Card Number: " + ic + "\nAge: " + age + "\nAddress: " + address + "\nMobile Number: " + phone + "\nBlood Group: " + blood + "\nGender: " + gender + "\nGuardian Name: " + guardian + "\nGuardian Number: " + contact + " \n";

                }
            }

        }
        return searchOutput;

    }

    public void updateStaff(Staff staff) {
        String searchIC = staff.getIc();
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i).getIc().equalsIgnoreCase(searchIC)) {
                staffs.set(i, staff);
            }
        }

    }

    public String deleteStaff(String searchIC) {
        String searchOutput = null;
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i).getIc().equalsIgnoreCase(searchIC)) {
                String name = staffs.get(i).getName();
                String ic = staffs.get(i).getIc();
                String address = staffs.get(i).getAddress();
                String phone = staffs.get(i).getPhone();
                String blood = staffs.get(i).getBlood();
                String gender = staffs.get(i).getGender();
                String state = staffs.get(i).getState();
                int age = staffs.get(i).getAge();
                String guardian = staffs.get(i).getGuardian();
                String contact = staffs.get(i).getContact();

                searchOutput = "\nName: " + name + "\nIdentity Card Number: " + ic + "\nAge: " + age + "\nAddress: " + address + "\nMobile Number: " + phone + "\nBlood Group: " + blood + "\nGender: " + gender + "\nGuardian Name: " + guardian + "\nGuardian Number: " + contact + "\n";
                staffs.remove(i);
            }

        }
        return searchOutput;

    }
}
