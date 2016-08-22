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
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ViewDetailsForm extends JFrame {

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
	private JTextField phoneNoTxt;
	private JTextField collegeNameTxt;
	private JTextField facultyTxt;
	private JTextField semesterTxt;
	private JTextField rollNoTxt;
	private JComboBox dayCmb;
	private JComboBox monthCmb;
	private JComboBox yearCmb;
	private JLabel dobCmb;

	/**
	 * Create the frame.
	 */
	public ViewDetailsForm() {
		setTitle("View Detail Form");
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 526);
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
		contentPane.add(getPhoneNoTxt());
		contentPane.add(getCollegeNameTxt());
		contentPane.add(getFacultyTxt());
		contentPane.add(getSemesterTxt());
		contentPane.add(getRollNoTxt());
		contentPane.add(getDayCmb());
		contentPane.add(getMonthCmb());
		contentPane.add(getYearCmb());
		contentPane.add(getDobCmb());
		setVisible(true);
	}

	public void displayData(int id) {

		StudentService ss = new StudentServiceImpl();
		Student s = ss.getById(id);

		nameTxt.setText(s.getName());
		addressTxt.setText(s.getAddress());
		genderTxt.setText(s.getGender());
		dobTxt.setText(s.getDob());
		phoneNoTxt.setText(new Long(s.getPhoneNo()).toString());
		collegeNameTxt.setText(s.getCollegeName());
		facultyTxt.setText(s.getFaculty());
		semesterTxt.setText(s.getSemester());
		rollNoTxt.setText(s.getRollno());

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
			nameTxt.setEditable(false);
			nameTxt.setBounds(158, 27, 132, 20);
			nameTxt.setColumns(10);
		}
		return nameTxt;
	}

	private JTextField getAddressTxt() {
		if (addressTxt == null) {
			addressTxt = new JTextField();
			addressTxt.setEditable(false);
			addressTxt.setColumns(10);
			addressTxt.setBounds(158, 64, 132, 20);
		}
		return addressTxt;
	}

	private JTextField getGenderTxt() {
		if (genderTxt == null) {
			genderTxt = new JTextField();
			genderTxt.setEditable(false);
			genderTxt.setColumns(10);
			genderTxt.setBounds(158, 101, 132, 20);
		}
		return genderTxt;
	}

	private JTextField getDobTxt() {
		if (dobTxt == null) {
			dobTxt = new JTextField();
			dobTxt.setEditable(false);
			dobTxt.setColumns(10);
			dobTxt.setBounds(158, 138, 132, 20);
		}
		return dobTxt;
	}

	private JTextField getPhoneNoTxt() {
		if (phoneNoTxt == null) {
			phoneNoTxt = new JTextField();
			phoneNoTxt.setEditable(false);
			phoneNoTxt.setColumns(10);
			phoneNoTxt.setBounds(158, 175, 132, 20);
		}
		return phoneNoTxt;
	}

	private JTextField getCollegeNameTxt() {
		if (collegeNameTxt == null) {
			collegeNameTxt = new JTextField();
			collegeNameTxt.setEditable(false);
			collegeNameTxt.setColumns(10);
			collegeNameTxt.setBounds(158, 212, 132, 20);
		}
		return collegeNameTxt;
	}

	private JTextField getFacultyTxt() {
		if (facultyTxt == null) {
			facultyTxt = new JTextField();
			facultyTxt.setEditable(false);
			facultyTxt.setColumns(10);
			facultyTxt.setBounds(158, 249, 132, 20);
		}
		return facultyTxt;
	}

	private JTextField getSemesterTxt() {
		if (semesterTxt == null) {
			semesterTxt = new JTextField();
			semesterTxt.setEditable(false);
			semesterTxt.setColumns(10);
			semesterTxt.setBounds(158, 286, 132, 20);
		}
		return semesterTxt;
	}

	private JTextField getRollNoTxt() {
		if (rollNoTxt == null) {
			rollNoTxt = new JTextField();
			rollNoTxt.setEditable(false);
			rollNoTxt.setColumns(10);
			rollNoTxt.setBounds(158, 323, 132, 20);
		}
		return rollNoTxt;
	}

	private JComboBox getDayCmb() {
		if (dayCmb == null) {
			dayCmb = new JComboBox();
			dayCmb.setEnabled(false);
			dayCmb.setEditable(true);

			for (int i = 1; i <= 32; i++) {
				dayCmb.addItem(i);
			}

			dayCmb.setBounds(158, 360, 46, 20);
		}
		return dayCmb;
	}

	private JComboBox getMonthCmb() {
		if (monthCmb == null) {
			monthCmb = new JComboBox();
			monthCmb.setEnabled(false);
			monthCmb.setEditable(true);

			for (int i = 1; i <= 32; i++) {
				dayCmb.addItem(i);
			}

			monthCmb.setBounds(203, 360, 46, 20);
		}
		return monthCmb;
	}

	private JComboBox getYearCmb() {
		if (yearCmb == null) {
			yearCmb = new JComboBox();
			yearCmb.setEnabled(false);
			yearCmb.setEditable(true);

			for (int i = 1918; i <= 2016; i++) {
				yearCmb.addItem(i);
			}

			yearCmb.setBounds(247, 360, 62, 20);
		}
		return yearCmb;
	}

	private JLabel getDobCmb() {
		if (dobCmb == null) {
			dobCmb = new JLabel("Birth date");
			dobCmb.setBounds(32, 360, 80, 14);
		}
		return dobCmb;
	}
}
