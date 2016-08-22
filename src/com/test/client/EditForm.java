package com.test.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.test.models.Student;
import com.test.service.StudentService;
import com.test.serviceimpl.StudentServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class EditForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblName;
	private JLabel addressLbl;
	private JLabel genderLbl;
	private JLabel dobLbl;
	private JLabel phoneNoLbl;
	private JLabel collegeNameLbl;
	private JLabel facultyLbl;
	private JLabel semesterLbl;
	private JLabel rollNoLbl;
	private JTextField nameTxt;
	private JTextField addressTxt;
	private JTextField genderTxt;
	private JTextField dobTxt;
	private JTextField phoneTxt;
	private JTextField collegeNameTxt;
	private JTextField facultyTxt;
	private JTextField semesterTxt;
	private JTextField rollTxt;
	private JButton updateBtn;
	private int uid = 0;
	private JLabel dobCmb;
	private JComboBox dayCmb;
	private JComboBox monthCmb;
	private JComboBox yearCmb;

	/**
	 * Create the frame.
	 */
	public EditForm() {
		setTitle("Edit Form");
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblName());
		contentPane.add(getAddressLbl());
		contentPane.add(getGenderLbl());
		contentPane.add(getDobLbl());
		contentPane.add(getPhoneNoLbl());
		contentPane.add(getCollegeNameLbl());
		contentPane.add(getFacultyLbl());
		contentPane.add(getSemesterLbl());
		contentPane.add(getRollNoLbl());
		contentPane.add(getNameTxt());
		contentPane.add(getAddressTxt());
		contentPane.add(getGenderTxt());
		contentPane.add(getDobTxt());
		contentPane.add(getPhoneTxt());
		contentPane.add(getCollegeNameTxt());
		contentPane.add(getFacultyTxt());
		contentPane.add(getSemesterTxt());
		contentPane.add(getRollTxt());
		contentPane.add(getUpdateBtn());
		contentPane.add(getDobCmb());
		contentPane.add(getDayCmb());
		contentPane.add(getMonthCmb());
		contentPane.add(getYearCmb());
		setVisible(true);
	}

	public void displayData(int id) {
		uid = id;
		StudentService ss = new StudentServiceImpl();
		Student s = ss.getById(id);

		nameTxt.setText(s.getName());
		addressTxt.setText(s.getAddress());
		genderTxt.setText(s.getGender());

		phoneTxt.setText(new Long(s.getPhoneNo()).toString());
		collegeNameTxt.setText(s.getCollegeName());
		facultyTxt.setText(s.getFaculty());
		semesterTxt.setText(s.getSemester());
		rollTxt.setText(s.getRollno());

		dobTxt.setText(s.getDob());

		String dob = s.getDob();

		String[] sp = dob.split("-");

		dayCmb.setSelectedItem(sp[0]);
		monthCmb.setSelectedItem(sp[1]);
		yearCmb.setSelectedItem(sp[2]);

	}

	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblName.setBounds(32, 27, 80, 14);
		}
		return lblName;
	}

	private JLabel getAddressLbl() {
		if (addressLbl == null) {
			addressLbl = new JLabel("Address");
			addressLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			addressLbl.setBounds(32, 64, 80, 14);
		}
		return addressLbl;
	}

	private JLabel getGenderLbl() {
		if (genderLbl == null) {
			genderLbl = new JLabel("Gender");
			genderLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			genderLbl.setBounds(32, 101, 80, 14);
		}
		return genderLbl;
	}

	private JLabel getDobLbl() {
		if (dobLbl == null) {
			dobLbl = new JLabel("DOB");
			dobLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			dobLbl.setBounds(32, 138, 80, 14);
		}
		return dobLbl;
	}

	private JLabel getPhoneNoLbl() {
		if (phoneNoLbl == null) {
			phoneNoLbl = new JLabel("Phone No");
			phoneNoLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			phoneNoLbl.setBounds(32, 175, 80, 14);
		}
		return phoneNoLbl;
	}

	private JLabel getCollegeNameLbl() {
		if (collegeNameLbl == null) {
			collegeNameLbl = new JLabel("College Name");
			collegeNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			collegeNameLbl.setBounds(32, 212, 80, 14);
		}
		return collegeNameLbl;
	}

	private JLabel getFacultyLbl() {
		if (facultyLbl == null) {
			facultyLbl = new JLabel("Faculty");
			facultyLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			facultyLbl.setBounds(32, 249, 80, 14);
		}
		return facultyLbl;
	}

	private JLabel getSemesterLbl() {
		if (semesterLbl == null) {
			semesterLbl = new JLabel("Semester");
			semesterLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			semesterLbl.setBounds(32, 286, 80, 14);
		}
		return semesterLbl;
	}

	private JLabel getRollNoLbl() {
		if (rollNoLbl == null) {
			rollNoLbl = new JLabel("Roll No");
			rollNoLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			rollNoLbl.setBounds(32, 323, 80, 14);
		}
		return rollNoLbl;
	}

	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setBounds(158, 27, 151, 20);
			nameTxt.setColumns(10);
		}
		return nameTxt;
	}

	private JTextField getAddressTxt() {
		if (addressTxt == null) {
			addressTxt = new JTextField();
			addressTxt.setColumns(10);
			addressTxt.setBounds(158, 62, 151, 20);
		}
		return addressTxt;
	}

	private JTextField getGenderTxt() {
		if (genderTxt == null) {
			genderTxt = new JTextField();
			genderTxt.setColumns(10);
			genderTxt.setBounds(158, 99, 151, 20);
		}
		return genderTxt;
	}

	private JTextField getDobTxt() {
		if (dobTxt == null) {
			dobTxt = new JTextField();
			dobTxt.setColumns(10);
			dobTxt.setBounds(158, 136, 151, 20);
		}
		return dobTxt;
	}

	private JTextField getPhoneTxt() {
		if (phoneTxt == null) {
			phoneTxt = new JTextField();
			phoneTxt.setColumns(10);
			phoneTxt.setBounds(158, 173, 151, 20);
		}
		return phoneTxt;
	}

	private JTextField getCollegeNameTxt() {
		if (collegeNameTxt == null) {
			collegeNameTxt = new JTextField();
			collegeNameTxt.setColumns(10);
			collegeNameTxt.setBounds(158, 210, 151, 20);
		}
		return collegeNameTxt;
	}

	private JTextField getFacultyTxt() {
		if (facultyTxt == null) {
			facultyTxt = new JTextField();
			facultyTxt.setColumns(10);
			facultyTxt.setBounds(158, 247, 151, 20);
		}
		return facultyTxt;
	}

	private JTextField getSemesterTxt() {
		if (semesterTxt == null) {
			semesterTxt = new JTextField();
			semesterTxt.setColumns(10);
			semesterTxt.setBounds(158, 284, 151, 20);
		}
		return semesterTxt;
	}

	private JTextField getRollTxt() {
		if (rollTxt == null) {
			rollTxt = new JTextField();
			rollTxt.setColumns(10);
			rollTxt.setBounds(158, 321, 151, 20);
		}
		return rollTxt;
	}

	private JButton getUpdateBtn() {
		if (updateBtn == null) {
			updateBtn = new JButton("Update");
			updateBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Student s = new Student();

					s.setName(nameTxt.getText());
					s.setAddress(addressTxt.getText());
					s.setCollegeName(collegeNameTxt.getText());
					s.setFaculty(facultyTxt.getText());
					s.setRollno(rollTxt.getText());
					s.setSemester(semesterTxt.getText());
					s.setPhoneNo(Long.parseLong(phoneTxt.getText()));
					s.setGender(genderTxt.getText());

					String day = dayCmb.getSelectedItem().toString();
					String month = monthCmb.getSelectedItem().toString();
					String year = yearCmb.getSelectedItem().toString();

					String dob = day.concat("-").concat(month).concat("-").concat(year);

					s.setDob(dob);
					s.setId(uid);

					// s.setProfilePic(profilePic);

					StudentService ss = new StudentServiceImpl();
					boolean result = ss.updateStudent(s);

					if (result == true) {
						JOptionPane.showMessageDialog(null, "Updated Successfully : ");
						new StudentMgmtForm();
						dispose();

					}

				}
			});
			updateBtn.setBounds(188, 397, 89, 23);
		}
		return updateBtn;
	}

	private JLabel getDobCmb() {
		if (dobCmb == null) {
			dobCmb = new JLabel("Birth date");
			dobCmb.setBounds(32, 360, 80, 14);
		}
		return dobCmb;
	}

	private JComboBox getDayCmb() {
		if (dayCmb == null) {
			dayCmb = new JComboBox();
			dayCmb.setEditable(true);
			// dayCmb.setModel(new DefaultComboBoxModel(new String[] { "32" }));
			for (int i = 1; i <= 32; i++) {
				dayCmb.addItem(i);
			}
			dayCmb.setBounds(158, 357, 46, 20);
		}
		return dayCmb;
	}

	private JComboBox getMonthCmb() {
		if (monthCmb == null) {
			monthCmb = new JComboBox();
			monthCmb.setEditable(true);
			// monthCmb.setModel(new DefaultComboBoxModel(new String[] { "12"
			// }));

			for (int i = 1; i <= 12; i++) {
				monthCmb.addItem(i);
			}
			monthCmb.setBounds(203, 357, 46, 20);
		}
		return monthCmb;
	}

	private JComboBox getYearCmb() {
		if (yearCmb == null) {
			yearCmb = new JComboBox();
			yearCmb.setEditable(true);
			// yearCmb.setModel(new DefaultComboBoxModel(new String[] { "1989"
			// }));

			for (int i = 1918; i <= 2016; i++) {
				yearCmb.addItem(i);
			}

			yearCmb.setBounds(247, 357, 62, 20);
		}
		return yearCmb;
	}
}
