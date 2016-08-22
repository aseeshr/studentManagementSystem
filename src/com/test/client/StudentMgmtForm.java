package com.test.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.event.PopupMenuListener;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import com.test.models.Student;
import com.test.service.StudentService;
import com.test.serviceimpl.StudentServiceImpl;

public class StudentMgmtForm extends JFrame {

	protected static final String Student = null;
	private JPanel contentPane;
	private JPanel studentFormPanel;
	private JLabel nameLbl;
	private JTextField nameTxt;
	private JLabel birthDateLbl;
	private JComboBox dayCmb;
	private JComboBox monthCmb;
	private JComboBox yearCmb;
	private JTextField rollTxt;
	private JLabel rollLbl;
	private JTextField facultyTxt;
	private JTextField semesterTxt;
	private JLabel facultyLbl;
	private JLabel lblSemester;
	private JLabel collegeNameLbl;
	private JTextField collegeNameTxt;
	private JPanel genderPanel;
	private JRadioButton maleRb;
	private JRadioButton femaleRb;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel addressLbl;
	private JTextField addressTxt;
	private JLabel phoneLbl;
	private JTextField phoneTxt;
	private JButton btnSave;
	private JLabel photoLbl;
	private JLabel searchByLbl;
	private JTextField searchByNameTxt;
	private JButton btnSearch;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton backBtn;
	private JButton viewDetailsBtn;
	private JButton editBtn;
	private JButton deleteBtn;
	private JButton exitBtn;
	private String profilePic;
	private JButton refressBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMgmtForm frame = new StudentMgmtForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentMgmtForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getStudentFormPanel());
		contentPane.add(getSearchByLbl());
		contentPane.add(getSearchByNameTxt());
		contentPane.add(getBtnSearch());
		contentPane.add(getScrollPane());
		contentPane.add(getBackBtn());
		contentPane.add(getViewDetailsBtn());
		contentPane.add(getEditBtn());
		contentPane.add(getDeleteBtn());
		contentPane.add(getExitBtn());
		contentPane.add(getRefressBtn());
		populateData(0);
		setVisible(true);
	}

	private JPanel getStudentFormPanel() {
		if (studentFormPanel == null) {
			studentFormPanel = new JPanel();
			studentFormPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Form",
					TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			studentFormPanel.setBounds(10, 11, 813, 188);
			studentFormPanel.setLayout(null);
			studentFormPanel.add(getNameLbl());
			studentFormPanel.add(getNameTxt());
			studentFormPanel.add(getBirthDateLbl());
			studentFormPanel.add(getDayCmb());
			studentFormPanel.add(getMonthCmb());
			studentFormPanel.add(getYearCmb());
			studentFormPanel.add(getRollTxt());
			studentFormPanel.add(getRollLbl());
			studentFormPanel.add(getFacultyTxt());
			studentFormPanel.add(getSemesterTxt());
			studentFormPanel.add(getFacultyLbl());
			studentFormPanel.add(getLblSemester());
			studentFormPanel.add(getCollegeNameLbl());
			studentFormPanel.add(getCollegeNameTxt());
			studentFormPanel.add(getGenderPanel());
			studentFormPanel.add(getAddressLbl());
			studentFormPanel.add(getAddressTxt());
			studentFormPanel.add(getPhoneLbl());
			studentFormPanel.add(getPhoneTxt());
			studentFormPanel.add(getBtnSave());
			studentFormPanel.add(getPhotoLbl());
		}
		return studentFormPanel;
	}

	private JLabel getNameLbl() {
		if (nameLbl == null) {
			nameLbl = new JLabel("Name");
			nameLbl.setBounds(21, 22, 60, 23);
		}
		return nameLbl;
	}

	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setBounds(91, 23, 86, 20);
			nameTxt.setColumns(10);
		}
		return nameTxt;
	}

	private JLabel getBirthDateLbl() {
		if (birthDateLbl == null) {
			birthDateLbl = new JLabel("BirthDate");
			birthDateLbl.setBounds(197, 22, 66, 14);
		}
		return birthDateLbl;
	}

	private JComboBox getDayCmb() {
		if (dayCmb == null) {
			dayCmb = new JComboBox();

			for (int i = 1; i <= 32; i++) {
				dayCmb.addItem(i);
			}
			dayCmb.setBounds(281, 23, 46, 20);
		}
		return dayCmb;
	}

	private JComboBox getMonthCmb() {
		if (monthCmb == null) {
			monthCmb = new JComboBox();
			for (int i = 1; i <= 12; i++) {
				monthCmb.addItem(i);
			}

			monthCmb.setBounds(328, 23, 46, 20);
		}
		return monthCmb;
	}

	private JComboBox getYearCmb() {
		if (yearCmb == null) {
			yearCmb = new JComboBox();

			for (int i = 1918; i <= 2016; i++) {
				yearCmb.addItem(i);
			}

			yearCmb.setBounds(374, 23, 62, 20);
		}
		return yearCmb;
	}

	private JTextField getRollTxt() {
		if (rollTxt == null) {
			rollTxt = new JTextField();
			rollTxt.setBounds(547, 23, 104, 20);
			rollTxt.setColumns(10);
		}
		return rollTxt;
	}

	private JLabel getRollLbl() {
		if (rollLbl == null) {
			rollLbl = new JLabel("Roll No.");
			rollLbl.setBounds(451, 26, 46, 14);
		}
		return rollLbl;
	}

	private JTextField getFacultyTxt() {
		if (facultyTxt == null) {
			facultyTxt = new JTextField();
			facultyTxt.setText("Faculty");
			facultyTxt.setBounds(91, 81, 86, 20);
			facultyTxt.setColumns(10);
		}
		return facultyTxt;
	}

	private JTextField getSemesterTxt() {
		if (semesterTxt == null) {
			semesterTxt = new JTextField();
			semesterTxt.setBounds(281, 81, 111, 20);
			semesterTxt.setColumns(10);
		}
		return semesterTxt;
	}

	private JLabel getFacultyLbl() {
		if (facultyLbl == null) {
			facultyLbl = new JLabel("Faculty");
			facultyLbl.setBounds(21, 80, 60, 21);
		}
		return facultyLbl;
	}

	private JLabel getLblSemester() {
		if (lblSemester == null) {
			lblSemester = new JLabel("Semester");
			lblSemester.setBounds(197, 80, 73, 14);
		}
		return lblSemester;
	}

	private JLabel getCollegeNameLbl() {
		if (collegeNameLbl == null) {
			collegeNameLbl = new JLabel("College Name");
			collegeNameLbl.setBounds(451, 81, 86, 14);
		}
		return collegeNameLbl;
	}

	private JTextField getCollegeNameTxt() {
		if (collegeNameTxt == null) {
			collegeNameTxt = new JTextField();
			collegeNameTxt.setBounds(547, 80, 104, 20);
			collegeNameTxt.setColumns(10);
		}
		return collegeNameTxt;
	}

	private JPanel getGenderPanel() {
		if (genderPanel == null) {
			genderPanel = new JPanel();
			genderPanel.setBorder(new TitledBorder(null, "Gender", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			genderPanel.setBounds(18, 124, 159, 53);
			genderPanel.setLayout(null);
			genderPanel.add(getMaleRb());
			genderPanel.add(getFemaleRb());
		}
		return genderPanel;
	}

	private JRadioButton getMaleRb() {
		if (maleRb == null) {
			maleRb = new JRadioButton("Male");
			buttonGroup.add(maleRb);
			maleRb.setBounds(19, 24, 60, 23);
		}
		return maleRb;
	}

	private JRadioButton getFemaleRb() {
		if (femaleRb == null) {
			femaleRb = new JRadioButton("Female");
			buttonGroup.add(femaleRb);
			femaleRb.setBounds(81, 24, 72, 23);
		}
		return femaleRb;
	}

	private JLabel getAddressLbl() {
		if (addressLbl == null) {
			addressLbl = new JLabel("Address");
			addressLbl.setBounds(197, 135, 73, 14);
		}
		return addressLbl;
	}

	private JTextField getAddressTxt() {
		if (addressTxt == null) {
			addressTxt = new JTextField();
			addressTxt.setBounds(281, 136, 111, 20);
			addressTxt.setColumns(10);
		}
		return addressTxt;
	}

	private JLabel getPhoneLbl() {
		if (phoneLbl == null) {
			phoneLbl = new JLabel("Phone No.");
			phoneLbl.setBounds(451, 136, 61, 14);
		}
		return phoneLbl;
	}

	private JTextField getPhoneTxt() {
		if (phoneTxt == null) {
			phoneTxt = new JTextField();
			phoneTxt.setBounds(547, 135, 104, 20);
			phoneTxt.setColumns(10);
		}
		return phoneTxt;
	}

	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					Student s = new Student();

					s.setName(nameTxt.getText());
					s.setAddress(addressTxt.getText());
					s.setCollegeName(collegeNameTxt.getText());
					s.setFaculty(facultyTxt.getText());
					s.setRollno(rollTxt.getText());
					s.setSemester(semesterTxt.getText());
					s.setPhoneNo(Long.parseLong(phoneTxt.getText()));

					// s.setGender();

					if (maleRb.isSelected()) {
						s.setGender("Male");
					} else {
						s.setGender("Female");
					}

					String day = dayCmb.getSelectedItem().toString();
					String month = monthCmb.getSelectedItem().toString();
					String year = yearCmb.getSelectedItem().toString();
					String dob = day.concat("-").concat(month).concat("-").concat(year);
					s.setDob(dob);

//					s.setProfilePic(profilePic);

					StudentService ss = new StudentServiceImpl();
					boolean result = ss.addStudent(s);

					if (result == true) {
						JOptionPane.showMessageDialog(null, "inserted successfully !!");
						populateData(0);
					}

				}

			});
			btnSave.setBounds(678, 135, 89, 23);
		}
		return btnSave;
	}

	private void populateData(int sFlag) {

		StudentService ss = new StudentServiceImpl();
		List<Student> sList = ss.getStudents();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);

		for (Student s : sList) {
			model.addRow(new Object[] { s.getId(), s.getName(), s.getFaculty(), s.getCollegeName() });

		}

	}

	private JLabel getPhotoLbl() {
		if (photoLbl == null) {
			photoLbl = new JLabel("Photo");
			photoLbl.setBackground(Color.BLUE);
			photoLbl.setForeground(Color.BLACK);
			photoLbl.setBounds(705, 26, 86, 75);
		}
		return photoLbl;
	}

	private JLabel getSearchByLbl() {
		if (searchByLbl == null) {
			searchByLbl = new JLabel("Search By Name");
			searchByLbl.setBounds(451, 213, 94, 14);
		}
		return searchByLbl;
	}

	private JTextField getSearchByNameTxt() {
		if (searchByNameTxt == null) {
			searchByNameTxt = new JTextField();
			searchByNameTxt.setBounds(560, 210, 104, 20);
			searchByNameTxt.setColumns(10);
		}
		return searchByNameTxt;
	}

	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					StudentService ss = new StudentServiceImpl();
					List<Student> sList = ss.searchByName(searchByNameTxt.getText());
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.setRowCount(0);

					for (Student s : sList) {
						model.addRow(new Object[] { s.getId(), s.getName(), s.getFaculty(), s.getCollegeName() });

					}

				}
			});
			btnSearch.setBounds(691, 210, 89, 23);
		}
		return btnSearch;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 286, 813, 143);
			scrollPane.setViewportView(getTable_1());
		}
		return scrollPane;
	}

	private JTable getTable_1() {
		if (table == null) {
			table = new JTable();
			table.setBackground(Color.LIGHT_GRAY);
			table.setForeground(Color.BLACK);
			table.setModel(
					new DefaultTableModel(new Object[][] {}, new String[] { "Id", "Name", "Faculty", "College Name" }));
		}
		return table;
	}

	private JButton getBackBtn() {
		if (backBtn == null) {
			backBtn = new JButton("Back");
			backBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			backBtn.setBounds(124, 446, 89, 23);
		}
		return backBtn;
	}

	private JButton getViewDetailsBtn() {
		if (viewDetailsBtn == null) {
			viewDetailsBtn = new JButton("View Details");
			viewDetailsBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					if (table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null, "Please select row to view detailed information");
						return;
					}

					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);

					new ViewDetailsForm().displayData(id);

				}
			});
			viewDetailsBtn.setBounds(234, 446, 119, 23);
		}
		return viewDetailsBtn;
	}

	private JButton getEditBtn() {
		if (editBtn == null) {
			editBtn = new JButton("Edit");
			editBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					if (table.getSelectedRow() < 0) {

						JOptionPane.showMessageDialog(null, "Please select row to Update student Information");
						return;

					}

					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);

					new EditForm().displayData(id);
					dispose();
				}
			});
			editBtn.setBounds(379, 446, 89, 23);
		}
		return editBtn;
	}

	private JButton getDeleteBtn() {
		if (deleteBtn == null) {
			deleteBtn = new JButton("Delete");
			deleteBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null, "Please select row to delete student Information");

						return;
					}
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);

					StudentService ss = new StudentServiceImpl();
					boolean result = ss.deleteStudent(id);
					if (result == true) {
						JOptionPane.showMessageDialog(null, "id  = " + id + "Deleted Successfully");

						populateData(0);
					}

				}
			});
			deleteBtn.setBounds(494, 446, 89, 23);
		}
		return deleteBtn;
	}

	private JButton getExitBtn() {
		if (exitBtn == null) {
			exitBtn = new JButton("Exit");
			exitBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					System.exit(0);

				}
			});
			exitBtn.setToolTipText("exit");
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
			exitBtn.setBounds(607, 446, 89, 23);
		}
		return exitBtn;
	}

	private JButton getRefressBtn() {
		if (refressBtn == null) {
			refressBtn = new JButton("Refresh");
			refressBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					populateData(0);
				}
			});
			refressBtn.setBounds(691, 252, 89, 23);
		}
		return refressBtn;
	}
}
