import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class AssignmentReminder {
    private JFrame frame;
    private JTextField assignmentField, dateField;
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
        frame.add(dateField);

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

        try {
            LocalDate dueDate = LocalDate.parse(dateText, DateTimeFormatter.ISO_LOCAL_DATE);
            assignments.put(assignment, dueDate);
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

