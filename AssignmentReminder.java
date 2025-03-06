/*import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

class Assignment{
private LocalDate dueDate;
private int elevtid;

public Assignment(LocalDate dueDate, int elevtid) {
    this.dueDate = dueDate;
    this.elevtid = elevtid;
}
public LocalDate getDueDate() {
    return dueDate;
}

public int getElevtid() {
    return elevtid;
}
}
public class AssignmentReminder {
    private JFrame frame;
    private JTextField assignmentField, dateField, elevtidField;
    private JButton submitButton;
    private Map<String, LocalDate> assignments = new HashMap<>();
    private Timer timer = new Timer();
    

    public AssignmentReminder() {
        frame = new JFrame("Assignment Reminder");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        frame.add(new JLabel("Opgavenavn:"));
        assignmentField = new JTextField();
        frame.add(assignmentField);

        frame.add(new JLabel("Afleveringsfrist:"));
        dateField = new JTextField();
        frame.add(dateField);
       
        frame.add(new JLabel("Elevtid:"));
        elevtidField = new JTextField();
        frame.add(elevtidField);

        submitButton = new JButton("Add Assignment");
        frame.add(submitButton);

        frame.setVisible(true);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addAssignment();
            }
        });

        startReminderChecker();
    }

    private void addAssignment() {
        String assignment = assignmentField.getText();
        String dateText = dateField.getText();
        String elevtid = elevtidField.getText();

        try {
            LocalDate dueDate = LocalDate.parse(dateText, DateTimeFormatter.ISO_LOCAL_DATE);
            int elevtid = Integer.parseInt(elevtidText);
            assignments.put(assignment, new Assignment(dueDate, elevtid));
            JOptionPane.showMessageDialog(frame, "Assignment added successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Invalid date format! Use YYYY-MM-DD.");
        }
    }

    private void startReminderChecker() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                LocalDate today = LocalDate.now();
                for (Map.Entry<String, LocalDate> entry : assignments.entrySet()) {
                    if (entry.getValue().isEqual(today)) {
                        showReminder(entry.getKey());
                    }
                }
            }
        }, 0, 60000); // Check every 60 seconds
    }

    private void showReminder(String assignment) {
        ImageIcon icon = new ImageIcon("reminder.png"); // Change to a valid image path
        JOptionPane.showMessageDialog(frame, "Reminder: " + assignment + " is due today!", 
                                      "Assignment Due", JOptionPane.INFORMATION_MESSAGE, icon);
    }


}

import org.json.JSONObject;
import java.util.ArrayList;
import java.io.*;

public class JavaApplication1 {



    public static void main(String[] args) {
        ArrayList<Employee> array = new ArrayList<Employee>();
        for(int i = 0 ; i < 100; i++){
            array.add(new Employee(i+"", i+"", i+""));
        }

        JSONArray jsonArray = new JSONArray();
        for (int i = 0;i < array.size() ; i++) {
            JSONObject obj = new JSONObject();
            JSONObject objItem =  new JSONObject();
            objItem.put("id", array.get(i).getId());
            objItem.put("name",  array.get(i).getName());
            objItem.put("address",  array.get(i).getAddress());
            obj.put("employee", objItem);
            jsonArray.put(obj);
        }

        try (FileWriter file = new FileWriter("your path")) {
            file.write(jsonArray.toString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + jsonArray);
        } catch(Exception e){
            System.out.println(e);

        }
}
public class Employee {
    private String employee;
    public String id, name, address;

    public Employee(String id, String name, String address) {
        this.employee = "employee";
        this.id = id;
        this.name = name;
        this.address = address;
    }

    Employee(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEmployee() {
        return employee;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}*/