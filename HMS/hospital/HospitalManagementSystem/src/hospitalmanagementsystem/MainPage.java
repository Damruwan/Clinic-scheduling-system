package hospitalmanagementsystem;



import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMSA Damruwan
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form classes
     */
    ArrayList<Patient> ptList;
    ArrayList<Employee> dtList;
    ArrayList<Ward> wrList;
    ArrayList<Test> ttList;
    ArrayList<NOP> nopList;
    ArrayList<Test> atList;
    ArrayList<Treatment> trList;
    ArrayList<Treatment> atrList;
    ArrayList<Employee> nrList;
    ArrayList<Employee> msList;
    ArrayList<Payment> payList;
    ArrayList<Salary> sList;
    ArrayList<Salary> sryList;
    ArrayList<Employee> eList;
    String date;
    int timeRun=0;
    
    
    
   
    
    DBO dbo=new DBO();
    
    
    public MainPage() {   
        initComponents();
        new Thread(){
           public void run(){
               while(timeRun==0){
                   Calendar cal=new GregorianCalendar();   //for getting the system time
                   int hour=cal.get(Calendar.HOUR);
                   int min=cal.get(Calendar.MINUTE);
                   int sec=cal.get(Calendar.SECOND);
                   int am_pm=cal.get(Calendar.AM_PM);
                   String day_night="";
                   if(am_pm==1){
                      day_night="PM";
                   }
                   else{
                      day_night="AM";
                   }
                   String time=hour+":"+min+":"+sec+" "+day_night;
                   clock.setText(time);
               }
           }
           
        }
        .start();        
        loadPatient();
        loadDoctor();
        loadWard();
        loadTest();
        loadNOP();
        loadDate();
        loadTreatment();
        loadNurse();
        loadMember();
        loadPayment();
        loadSalary();
        loadEmployee();
       
             
    }
    
    void loadPatient(){
        ptList = dbo.getPatient();    //get  patient details from database as a list
        PatientDetails ptDetails=new PatientDetails(ptList);  //the basis details we are chosen from the list, create as a table
        tblPatient.setModel(ptDetails);     //the table what we created is view as a table  
        
    }
    
    
    void loadDoctor(){
        dtList = dbo.getDoctor();   //get  doctor details from database as a list
        DoctorDetails dtDetails=new DoctorDetails(dtList);   //the basis details we are chosen from the list, create as a table
        tblDoctor.setModel(dtDetails);  //the table what we created is view as a table   
    }
    
    void loadWard(){
        wrList = dbo.getWard();   //get  ward details from database as a list
        WardDetails wrDetails=new WardDetails(wrList);    //the basis details we are chosen from the list, create as a table
        tblWard.setModel(wrDetails);   //the table what we created is view as a table  
    }
    
    void loadTest(){
        ttList = dbo.getTest();  //get  test details from database as a list
        TestDetails ttDetails=new TestDetails(ttList);    //the basis details we are chosen from the list, create as a table
        tblTest.setModel(ttDetails);    //the table what we created is view as a table 
    }
    
    void loadNOP(){
        nopList = dbo.getNOPWard();  //get number of patient  in the ward from database as a list
        NOPDetails nopDetails=new NOPDetails(nopList);   //the basis details we are chosen from the list, create as a table
        tblNOP.setModel(nopDetails);   //the table what we created is view as a table 
    }
    
    void loadDate(){
        date = dbo.getDate();  //get current date from database 
        Date.setText(date);  //set the date view as a text  
    }
    
    void loadTreatment(){
        trList = dbo.getTreatment();   //get treatment details from database as a list
        TreatmentDetails trDetails=new TreatmentDetails(trList);   //the basis details we are chosen from the list, create as a table
        tblTreatment.setModel(trDetails);    //the table what we created is view as a table 
    }
    void loadNurse(){
        nrList = dbo.getNurse();   //get nurse details from database as a list
        NurseDetails nrDetails=new NurseDetails(nrList);   //the basis details we are chosen from the list, create as a table
        tblNurse.setModel(nrDetails);    //the table what we created is view as a table 
    }
    
    void loadMember(){
        msList = dbo.getMember();   //get maintenance staff details from database as a list
        MaintStaffDetails msDetails=new MaintStaffDetails(msList);    //the basis details we are chosen from the list, create as a table
        tblMember.setModel(msDetails);    //the table what we created is view as a table 
    }
    
    void loadPayment(){
       
        payList = dbo.getPayment();   //get payment details from database as a list
        PaymentDetails payDetails=new PaymentDetails(payList);   //the basis details we are chosen from the list, create as a table
        tblPayment.setModel(payDetails);    //the table what we created is view as a table 
    }
    
    void loadSalary(){
       
        sList = dbo.getSalary();   //get salary details from database as a list
        SalaryDetails sDetails=new SalaryDetails(sList);   //the basis details we are chosen from the list, create as a table
        tblS.setModel(sDetails);    //the table what we created is view as a table 
    }
    
     void loadEmployee(){
       
        eList = dbo.getEmployee();    //get employee details from database as a list
        EmployeeDetails eDetails=new EmployeeDetails(eList);   //the basis details we are chosen from the list, create as a table 
        tblEmp.setModel(eDetails);    //the table what we created is view as a table 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        NewPatient = new javax.swing.JButton();
        ViewPatientDetails = new javax.swing.JButton();
        UpdatePatient = new javax.swing.JButton();
        DeletePatient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWard = new javax.swing.JTable();
        NewWard = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNOP = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        NewTest = new javax.swing.JButton();
        ViewTestDetails = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTest = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAllTest = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ftd = new javax.swing.JTextField();
        FindTestsOfThePatient = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ftn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ftw = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        NewPayment = new javax.swing.JButton();
        ViewPayment = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblPayment = new javax.swing.JTable();
        UpdatePayment = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        NewSalary = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblS = new javax.swing.JTable();
        ViewSalary = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        post = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        enterID = new javax.swing.JTextField();
        FindSalary = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblSalary = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        NewTreatment = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblTreatment = new javax.swing.JTable();
        ViewTreatmentdetails = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAllTreatment = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pwid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        FindTreatmentsOfThePatient1 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        ViewDoctorDetails = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        ViewNurse = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblNurse = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        ViewMember = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblMember = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        NewEmployee = new javax.swing.JButton();
        UpdateEmployee = new javax.swing.JButton();
        DeleteEmployee = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NewPatient.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        NewPatient.setText("New Patient");
        NewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPatientActionPerformed(evt);
            }
        });

        ViewPatientDetails.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ViewPatientDetails.setText("View Patient");
        ViewPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPatientDetailsActionPerformed(evt);
            }
        });

        UpdatePatient.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        UpdatePatient.setText("Update Patient");
        UpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePatientActionPerformed(evt);
            }
        });

        DeletePatient.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DeletePatient.setText("Delete Patient");
        DeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePatientActionPerformed(evt);
            }
        });

        tblPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPatient);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/patient.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(ViewPatientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(UpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(DeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewPatientDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeletePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("PATIENT", jPanel1);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("jLabel1");

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblWard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblWard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblWard);

        NewWard.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        NewWard.setText("Add Ward");
        NewWard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewWardActionPerformed(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/hospital_bed_icon.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewWard, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(NewWard, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("TYPE OF WARDS", jPanel2);

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblNOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblNOP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblNOP);

        jLabel21.setBackground(new java.awt.Color(204, 204, 255));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/165743500.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("VIEW NUMBER OF PATIENTS IN THE WARDS", jPanel12);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("WARD", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NewTest.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        NewTest.setText("New Test");
        NewTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTestActionPerformed(evt);
            }
        });

        ViewTestDetails.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ViewTestDetails.setText("View Test");
        ViewTestDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTestDetailsActionPerformed(evt);
            }
        });

        tblTest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblTest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblTest);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/patient-treatment-003-512.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(NewTest, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(ViewTestDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewTest, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewTestDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("ADD TESTS", jPanel10);

        jPanel13.setBackground(new java.awt.Color(204, 204, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblAllTest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblAllTest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblAllTest);

        jLabel2.setText("Enter Patient ID");

        ftd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftdActionPerformed(evt);
            }
        });

        FindTestsOfThePatient.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        FindTestsOfThePatient.setText("SEARCH");
        FindTestsOfThePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindTestsOfThePatientActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        ftn.setEditable(false);
        ftn.setBackground(new java.awt.Color(255, 255, 255));
        ftn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftnActionPerformed(evt);
            }
        });

        jLabel4.setText("Age");

        fta.setEditable(false);
        fta.setBackground(new java.awt.Color(255, 255, 255));
        fta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftaActionPerformed(evt);
            }
        });

        jLabel5.setText("Ward ID");

        ftw.setEditable(false);
        ftw.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FindTestsOfThePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftw, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ftn)
                            .addComponent(fta, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FindTestsOfThePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("ALL TESTS OF PATIENTS", jPanel13);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TEST", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NewPayment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        NewPayment.setText("New Payment");
        NewPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPaymentActionPerformed(evt);
            }
        });

        ViewPayment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ViewPayment.setText("View Payment");
        ViewPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPaymentActionPerformed(evt);
            }
        });

        tblPayment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(tblPayment);

        UpdatePayment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        UpdatePayment.setText("Update Payment");
        UpdatePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePaymentActionPerformed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/673ff960ac09ef1f15d6c3dd05f8f73d.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(NewPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(ViewPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(UpdatePayment))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("PAYMENT", jPanel5);

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel14.setBackground(new java.awt.Color(204, 204, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NewSalary.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        NewSalary.setText("New Salary");
        NewSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSalaryActionPerformed(evt);
            }
        });

        tblS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(tblS);

        ViewSalary.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ViewSalary.setText("View Salary");
        ViewSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSalaryActionPerformed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/money.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel17))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NewSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ViewSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(NewSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("ADD SALARYS", jPanel14);

        jPanel15.setBackground(new java.awt.Color(204, 204, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setText("Name");

        jLabel15.setText("Post");

        name.setEditable(false);
        name.setBackground(new java.awt.Color(255, 255, 255));

        post.setEditable(false);
        post.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setText("Enter EmpID");

        FindSalary.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        FindSalary.setText("SEARCH");
        FindSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindSalaryActionPerformed(evt);
            }
        });

        tblSalary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane13.setViewportView(tblSalary);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/office.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(40, 40, 40)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(enterID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FindSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FindSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("VIEW ALL SALARYS", jPanel15);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SALARY", jPanel11);

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTabbedPane5.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel16.setBackground(new java.awt.Color(204, 204, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NewTreatment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NewTreatment.setText("New Treatment");
        NewTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTreatmentActionPerformed(evt);
            }
        });

        tblTreatment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblTreatment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(tblTreatment);

        ViewTreatmentdetails.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ViewTreatmentdetails.setText("View Treatment");
        ViewTreatmentdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTreatmentdetailsActionPerformed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/syringe.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(NewTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(ViewTreatmentdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NewTreatment, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(ViewTreatmentdetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("ADD TREATMENTS", jPanel16);

        jPanel17.setBackground(new java.awt.Color(204, 204, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblAllTreatment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblAllTreatment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tblAllTreatment);

        jLabel8.setText("Name");

        pn.setEditable(false);
        pn.setBackground(new java.awt.Color(255, 255, 255));
        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });

        jLabel9.setText("Age");

        pa.setEditable(false);
        pa.setBackground(new java.awt.Color(255, 255, 255));
        pa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paActionPerformed(evt);
            }
        });

        jLabel10.setText("Ward ID");

        pwid.setEditable(false);
        pwid.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Enter Patient ID");

        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });

        FindTreatmentsOfThePatient1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        FindTreatmentsOfThePatient1.setText("SEARCH");
        FindTreatmentsOfThePatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindTreatmentsOfThePatient1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(FindTreatmentsOfThePatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pwid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(pwid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FindTreatmentsOfThePatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("ALL TREATMENTS", jPanel17);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TREATMENT", jPanel9);

        jPanel18.setBackground(new java.awt.Color(204, 204, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTabbedPane6.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel19.setBackground(new java.awt.Color(204, 204, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblDoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tblDoctor);

        ViewDoctorDetails.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ViewDoctorDetails.setText("View Doctor");
        ViewDoctorDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDoctorDetailsActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/medicos-03.png"))); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewDoctorDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(ViewDoctorDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        jTabbedPane6.addTab("DOCTOR", jPanel19);

        jPanel20.setBackground(new java.awt.Color(204, 204, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ViewNurse.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ViewNurse.setText("View Nurse");
        ViewNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewNurseActionPerformed(evt);
            }
        });

        tblNurse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblNurse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tblNurse);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/nurse-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewNurse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(ViewNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("NURSE", jPanel20);

        jPanel21.setBackground(new java.awt.Color(204, 204, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ViewMember.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ViewMember.setText("View Member");
        ViewMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMemberActionPerformed(evt);
            }
        });

        tblMember.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(tblMember);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/paciente.png"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(ViewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        jTabbedPane6.addTab("MAINTENANCE STAFF", jPanel21);

        NewEmployee.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        NewEmployee.setText("New Employee");
        NewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewEmployeeActionPerformed(evt);
            }
        });

        UpdateEmployee.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        UpdateEmployee.setText("Update Employee");
        UpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEmployeeActionPerformed(evt);
            }
        });

        DeleteEmployee.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DeleteEmployee.setText("Delete Employee");
        DeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEmployeeActionPerformed(evt);
            }
        });

        tblEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane14.setViewportView(tblEmp);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/yonetici-ekrani.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NewEmployee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteEmployee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateEmployee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(NewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(UpdateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EMPLOYEE", jPanel18);

        Date.setFont(new java.awt.Font("Digital-7 Mono", 0, 24)); // NOI18N
        Date.setText("0000-00-00");

        clock.setFont(new java.awt.Font("Digital-7 Mono", 0, 36)); // NOI18N
        clock.setText("00:00:00 00");

        Refresh.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Refresh.setText("REFRESH");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Refresh, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clock, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clock, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePatientActionPerformed
        int a=tblPatient.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select A Patient");
        }
        else{
           DeletePatient dp=new DeletePatient();  //create new object the interface
           dp.setVisible(true);
           dp.setFields(ptList.get(tblPatient.getSelectedRow()));  //after selecting a row as the object from the table we created, the details of that object set to the set textfields 
           dp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    //close the interface
        }
    }//GEN-LAST:event_DeletePatientActionPerformed

    private void UpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePatientActionPerformed
        int a=tblPatient.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select A Patient");
        }
        else{
           UpdatePatient up=new UpdatePatient();   //create new object the interface
           up.setVisible(true);
           up.setFields(ptList.get(tblPatient.getSelectedRow()));  //after selecting a row as the object from the table we created, the details of that object set to the set textfields
           up.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    //close the interface
        }
    }//GEN-LAST:event_UpdatePatientActionPerformed

    private void ViewPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPatientDetailsActionPerformed
        int a=tblPatient.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select A Patient");
        }
        else{
           ViewPatient vp=new ViewPatient();   //create new object the interface
           vp.setVisible(true); 
           vp.setFields(ptList.get(tblPatient.getSelectedRow()));   //after selecting a row as the object from the table we created, the details of that object set to the set textfields
           vp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //close the interface
           
        }
    }//GEN-LAST:event_ViewPatientDetailsActionPerformed

    private void NewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPatientActionPerformed
        NewPatient np=new NewPatient();    //create new object the interface
        np.setVisible(true);
        np.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //close the interface
    }//GEN-LAST:event_NewPatientActionPerformed

    private void ViewDoctorDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDoctorDetailsActionPerformed
        int a=tblDoctor.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select A Doctor");
        }
        else{
           ViewDoctor vd=new ViewDoctor();   //create new object the interface
           vd.setVisible(true);
           vd.setFields(dtList.get(tblDoctor.getSelectedRow()));  //after selecting a row as the object from the table we created, the details of that object set to the set textfields
           vd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //close the interface
        }
    }//GEN-LAST:event_ViewDoctorDetailsActionPerformed

    private void NewTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTestActionPerformed
        NewTest nt=new NewTest();   //create new object the interface
        nt.setVisible(true);
        nt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //close the interface
    }//GEN-LAST:event_NewTestActionPerformed

    private void ViewTestDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTestDetailsActionPerformed
        int a=tblTest.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select A Test");
        }
        else{
           ViewTest vt=new ViewTest();   //create new object the interface
           vt.setVisible(true);
           vt.setFields(ttList.get(tblTest.getSelectedRow()));   //after selecting a row as the object from the table we created, the details of that object  set to the set textfields
           vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //close the interface
        }
    }//GEN-LAST:event_ViewTestDetailsActionPerformed

    private void NewWardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewWardActionPerformed
        NewWard nw=new NewWard();   //create new object the interface
        nw.setVisible(true);
        nw.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //close the interface
    }//GEN-LAST:event_NewWardActionPerformed

    private void ftdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftdActionPerformed

    private void FindTestsOfThePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindTestsOfThePatientActionPerformed

        String s=ftd.getText();
        if(s.isEmpty()){   
           JOptionPane.showMessageDialog(this, "Please Enter Patient ID");
        }
        else {
           Test AT=new Test();   //create new object the interface
           AT.setRegID(ftd.getText());  //after entering patien register id,it get as a text and set it to the setters function of patien class
           atList = dbo.getAllTest(AT);  //get all test details of findding patient  from test table and set to the list   
           ftn.setText(AT.getFirstName()+ AT.getLastName() );   //set name of patient
           fta.setText(new Integer(AT.getAge()).toString());   //set age of patient
           ftw.setText(AT.getWardID());    //set ward id of patient
           AllTestDetails atDetails=new AllTestDetails(atList);  //the basis details we are chosen from the list, create as a table
           tblAllTest.setModel(atDetails); //the table what we created is view as a table 
           
        }
    }//GEN-LAST:event_FindTestsOfThePatientActionPerformed

   
    private void ftnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftnActionPerformed

    private void ftaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftaActionPerformed

    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnActionPerformed

    private void paActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void FindTreatmentsOfThePatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindTreatmentsOfThePatient1ActionPerformed
        String s=pid.getText();
        if(s.isEmpty()){   
           JOptionPane.showMessageDialog(this, "Please Enter Patient ID");
        }
        else {
           Treatment ATr=new Treatment();   //create new object the interface
           ATr.setRegID(pid.getText());  //after entering patien register id,it get as a text and set it to the setters function of patien class
           atrList = dbo.getAllTreatment(ATr);  //get all treatment details of findding patient  from test table and set to the list 
           pn.setText(ATr.getFirstName()+ ATr.getLastName() );   //set name of patient
           pa.setText(new Integer(ATr.getAge()).toString());    //set age of patient
           pwid.setText(ATr.getWardID());   //set ward id of patient
           AllTreatmentDetails atrDetails=new AllTreatmentDetails(atrList);  //the basis details we are chosen from the list, create as a table
           tblAllTreatment.setModel(atrDetails);   //the table what we created is view as a table
        }
    }//GEN-LAST:event_FindTreatmentsOfThePatient1ActionPerformed

    private void ViewTreatmentdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTreatmentdetailsActionPerformed
        int a=tblTreatment.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select A Treatment");
        }
        else{
           ViewTreatment vtr=new ViewTreatment();   //create new object the interface
           vtr.setVisible(true);
           vtr.setFields(trList.get(tblTreatment.getSelectedRow()));  //after selecting a row as the object from the table we created, the details of that object  set to the set textfields
           vtr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //close the interface
        }
    }//GEN-LAST:event_ViewTreatmentdetailsActionPerformed

    private void NewTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTreatmentActionPerformed
        NewTreatment ntr=new NewTreatment();   //create new object the interface 
        ntr.setVisible(true);
        ntr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //close the interface
                          
    }//GEN-LAST:event_NewTreatmentActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        MainPage MPR=new MainPage();   //create new object the interface
        MPR.setVisible(true);
        MPR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //close current interface and run main method again
        this.dispose();
    }//GEN-LAST:event_RefreshActionPerformed

    private void ViewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMemberActionPerformed
        int a=tblMember.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select A Member");
        }
        else{
           ViewMS vms=new ViewMS();   //create new object the interface
           vms.setVisible(true);
           vms.setFields(msList.get(tblMember.getSelectedRow()));  //after selecting a row as the object from the table we created, the details of that object  set to the set textfields
           vms.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //close the interface
        }
    }//GEN-LAST:event_ViewMemberActionPerformed

    private void ViewNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewNurseActionPerformed
        int a=tblNurse.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select A Nurse");
        }
        else{
           ViewNurse vn=new ViewNurse();   //create new object the interface
           vn.setVisible(true);
           vn.setFields(nrList.get(tblNurse.getSelectedRow()));  //after selecting a row as the object from the table we created, the details of that object  set to the set textfields
           vn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //close the interface
        }
    }//GEN-LAST:event_ViewNurseActionPerformed

    private void NewPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPaymentActionPerformed
        NewPayment np=new NewPayment();   //create new object the interface
        np.setVisible(true);
        np.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //close the interface 
    }//GEN-LAST:event_NewPaymentActionPerformed

    private void ViewPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPaymentActionPerformed
        int a=tblPayment.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select A Patient");
        }
        else{
           ViewPayment vp=new ViewPayment();   //create new object the interface
           vp.setVisible(true);
           vp.setFields(payList.get(tblPayment.getSelectedRow()));  //after selecting a row as the object from the table we created, the details of that object  set to the set textfields
           vp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //close the interface
        }
    }//GEN-LAST:event_ViewPaymentActionPerformed

    private void UpdatePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePaymentActionPerformed
        int a=tblPayment.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select A Payment");
        }
        else{
           UpdatePayment upay=new UpdatePayment();   //create new object the interface
           upay.setVisible(true);
           upay.setFields(payList.get(tblPayment.getSelectedRow()));  //after selecting a row as the object from the table we created, the details of that object  set to the set textfields
           upay.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //close the interface
        }
    }//GEN-LAST:event_UpdatePaymentActionPerformed

    private void NewSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSalaryActionPerformed
        NewSalary ns=new NewSalary();   //create new object the interface
        ns.setVisible(true);
        ns.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //close the interface
    }//GEN-LAST:event_NewSalaryActionPerformed

    private void FindSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindSalaryActionPerformed
        String s=enterID.getText();
        if(s.isEmpty()){   
           JOptionPane.showMessageDialog(this, "Please Enter Employee ID");
        }
        else {
           Salary SA=new Salary();   //create new object the interface
           SA.setEmpID(enterID.getText());  //after entering employee register id,it get as a text and set it to the setters function of employee class
           sryList = dbo.getAllSalary(SA);  //get all treatment details of findding patient  from test table and set to the list 
           name.setText(SA.getFirstName()+ SA.getLastName() );  //set name of employee
           post.setText(SA.getPost());  //set post of employee
           AllSalaryDetails asDetails=new AllSalaryDetails(sryList);   //the basis details we are chosen from the list, create as a table
           tblSalary.setModel(asDetails);    //the table what we created is view as a table
        }
        
    }//GEN-LAST:event_FindSalaryActionPerformed

    private void NewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewEmployeeActionPerformed
        NewEmployee ne=new NewEmployee();   //create new object the interface
        ne.setVisible(true);
        ne.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //close the interface
    }//GEN-LAST:event_NewEmployeeActionPerformed

    private void UpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEmployeeActionPerformed
        int a=tblEmp.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select An Employee");
        }
        else{
           UpdateEmployee ue=new UpdateEmployee();   //create new object the interface
           ue.setVisible(true);
           ue.setFields(eList.get(tblEmp.getSelectedRow()));  //after selecting a row as the object from the table we created, the details of that object  set to the set textfields
           ue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //close the interface
        }
    }//GEN-LAST:event_UpdateEmployeeActionPerformed

    private void DeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEmployeeActionPerformed
        int a=tblEmp.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select An Employee");
        }
        else{
           DeleteEmployee de=new DeleteEmployee();   //create new object the interface
           de.setVisible(true);
           de.setFields(eList.get(tblEmp.getSelectedRow()));   //after selecting a row as the object from the table we created, the details of that object  set to the set textfields
           de.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //close the interface
        }
    }//GEN-LAST:event_DeleteEmployeeActionPerformed

    private void ViewSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSalaryActionPerformed
        int a=tblS.getSelectedRowCount();
        if(a==0){
           JOptionPane.showMessageDialog(this, "Please Select An Employee");
        }
        else{
           ViewSalary vs=new ViewSalary();   //create new object the interface
           vs.setVisible(true);
           vs.setFields(sList.get(tblS.getSelectedRow()));    //after selecting a row as the object from the table we created, the details of that object  set to the set textfields
           vs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //close the interface
        }
    }//GEN-LAST:event_ViewSalaryActionPerformed
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JButton DeleteEmployee;
    private javax.swing.JButton DeletePatient;
    private javax.swing.JButton FindSalary;
    private javax.swing.JButton FindTestsOfThePatient;
    private javax.swing.JButton FindTreatmentsOfThePatient1;
    private javax.swing.JButton NewEmployee;
    private javax.swing.JButton NewPatient;
    private javax.swing.JButton NewPayment;
    private javax.swing.JButton NewSalary;
    private javax.swing.JButton NewTest;
    private javax.swing.JButton NewTreatment;
    private javax.swing.JButton NewWard;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton UpdateEmployee;
    private javax.swing.JButton UpdatePatient;
    private javax.swing.JButton UpdatePayment;
    private javax.swing.JButton ViewDoctorDetails;
    private javax.swing.JButton ViewMember;
    private javax.swing.JButton ViewNurse;
    private javax.swing.JButton ViewPatientDetails;
    private javax.swing.JButton ViewPayment;
    private javax.swing.JButton ViewSalary;
    private javax.swing.JButton ViewTestDetails;
    private javax.swing.JButton ViewTreatmentdetails;
    private javax.swing.JLabel clock;
    private javax.swing.JTextField enterID;
    private javax.swing.JTextField fta;
    private javax.swing.JTextField ftd;
    private javax.swing.JTextField ftn;
    private javax.swing.JTextField ftw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pa;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField post;
    private javax.swing.JTextField pwid;
    private javax.swing.JTable tblAllTest;
    private javax.swing.JTable tblAllTreatment;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTable tblMember;
    private javax.swing.JTable tblNOP;
    private javax.swing.JTable tblNurse;
    public javax.swing.JTable tblPatient;
    private javax.swing.JTable tblPayment;
    private javax.swing.JTable tblS;
    private javax.swing.JTable tblSalary;
    private javax.swing.JTable tblTest;
    private javax.swing.JTable tblTreatment;
    private javax.swing.JTable tblWard;
    // End of variables declaration//GEN-END:variables
}
