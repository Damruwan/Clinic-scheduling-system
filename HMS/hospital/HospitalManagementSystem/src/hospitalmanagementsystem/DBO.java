 package hospitalmanagementsystem;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;


 
 
public class DBO {
    String url ="jdbc:mysql://localhost:3306/hospital_management_system";
    String username = "root";
    String password = "";
    Connection C = null;
    PreparedStatement PS = null;
    ResultSet RS = null;
    
    
   
    public String getDate(){
         try{
           String d=new String();
           System.out.println("get Date 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT CURRENT_DATE()";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get Date 2"); 
           RS=PS.executeQuery(); // execute the sql query and get selected details
           System.out.println("get Date 3");
           while(RS.next()){
               DateTime dat1 =new DateTime();   //create new object of DateTime class
               dat1.setDate(RS.getString(1));
               d=dat1.getDate();
           }
           
           return d;
           
         } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
    }
    
   
    public boolean addPatient(Patient P) {
        try{
           System.out.println("Add Patient 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "INSERT INTO patient VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("Add Patient 2");
           PS.setString(1, P.getRegID());
           PS.setString(2, P.getConformDoctorID());
           PS.setString(3, P.getLeadingConsultorID());
           PS.setString(4, P.getWardID());
           PS.setString(5, P.getFirstName());
           PS.setString(6, P.getLastName());
           PS.setString(7, P.getAddress());
           PS.setInt(8, P.getContactNumber());
           PS.setString(9, P.getGender());
           PS.setInt(10, P.getDOBYear());
           PS.setString(11, P.getDOBMonth());
           PS.setInt(12, P.getDOBDate());
           PS.setInt(13, P.getAge());
           System.out.println("Add Patient 3");
           PS.executeUpdate(); // execute the sql query and insert the value to thr database
           System.out.println("Add Patient 4");
           return true;
           
        } catch(Exception e){
           System.out.print("exe---->" + e);
           return false;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    } 
    
    ArrayList<Patient> getPatient(){
        try{
           ArrayList<Patient> datlist=new ArrayList<Patient>();
           
           System.out.println("get Patient 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT * FROM patient CROSS JOIN ward USING(WardID) ORDER BY `RegID` ASC";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get Patient 2");
           
           RS = PS.executeQuery();  // execute the sql query and get selected details
           
           while(RS.next()){
               Patient pt=new Patient();
               pt.setRegID(RS.getString(2));
               pt.setConformDoctorID(RS.getString(3));
               pt.setLeadingConsultorID(RS.getString(4));
               pt.setWardID(RS.getString(1));
               pt.setFirstName(RS.getString(5));
               pt.setLastName(RS.getString(6));
               pt.setAddress(RS.getString(7));
               pt.setContactNumber(RS.getInt(8));
               pt.setGender(RS.getString(9));
               pt.setDOBYear(RS.getInt(10));
               pt.setDOBMonth(RS.getString(11));
               pt.setDOBDate(RS.getInt(12));
               pt.setAge(RS.getInt(13));
               pt.setWardName(RS.getString(14));
               datlist.add(pt);
           }
           return datlist;

        } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
        
        
    }
    
     
    public boolean updatePatient(Patient P){
         try{
           System.out.println("Update Patient 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "UPDATE patient SET FirstName='"+P.getFirstName()+"' ,LastName='"+P.getLastName()+"' ,Address='"+P.getAddress()+"' ,ContactNumber="+P.getContactNumber()+" ,ConformDoctorID='"+P.getConformDoctorID()+"' ,LeadingConsultorID='"+P.getLeadingConsultorID()+"' ,WardID='"+P.getWardID()+"' ,Gender='"+P.getGender()+"' ,DOBYear="+P.getDOBYear()+" ,DOBMonth='"+P.getDOBMonth()+"' ,DOBDate="+P.getDOBDate()+" ,Age="+P.getAge()+" WHERE RegID='"+P.getRegID()+"'";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("Update Patient 2");
           
           PS.executeUpdate();  // execute the sql query and update selected details
           System.out.println("Update Patient 3");
           return true;
           
         } catch(Exception e){
           System.out.print("exe---->" + e);
           return false;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
    }
    
    public boolean deletePatient(Patient P){
         try{
           System.out.println("Delete Patient 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "DELETE FROM patient  WHERE RegID='"+P.getRegID()+"'";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("Delete Patient 2");
           
           PS.executeUpdate(); // execute the sql query and delete selected details
           System.out.println("Delete Patient 3");
           return true;
           
         } catch(Exception e){
           System.out.print("exe---->" + e);
           return false;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
    }


    public boolean addEmployee(Employee E) {
        try{
           System.out.println("Add Emp 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "INSERT INTO employee VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("Add Emp 2");
           PS.setString(1, E.getEmpID());
           PS.setString(2, E.getWardID());
           PS.setString(3, E.getPost());
           PS.setString(4, E.getFirstName()); 
           PS.setString(5, E.getLastName());
           PS.setString(6, E.getAddress());
           PS.setInt(7, E.getContactNumber());
           PS.setString(8, E.getGender());
           PS.setInt(9, E.getDOBYear());
           PS.setString(10, E.getDOBMonth());
           PS.setInt(11, E.getDOBDate());
           PS.setInt(12, E.getAge());
           
           System.out.println("Add Emp 3");
           PS.executeUpdate(); // execute the sql query and insert the value to the database
           System.out.println("Add Emp 4");
           return true;
           
        } catch(Exception e){
           System.out.print("exe---->" + e);
           return false;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    }
    
    ArrayList<Employee> getEmployee(){
        try{
           ArrayList<Employee> list=new ArrayList<Employee>();
           
           System.out.println("get Emp 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT * FROM employee";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get Emp 2");
           
           RS = PS.executeQuery();  // execute the sql query and get selected details
           
           while(RS.next()){
               Employee em=new Employee();
               em.setEmpID(RS.getString(1));
               em.setWardID(RS.getString(2));
               em.setPost(RS.getString(3));
               em.setFirstName(RS.getString(4));
               em.setLastName(RS.getString(5)); 
               em.setAddress(RS.getString(6));
               em.setContactNumber(RS.getInt(7));
               em.setGender(RS.getString(8));
               em.setDOBYear(RS.getInt(9));
               em.setDOBMonth(RS.getString(10));
               em.setDOBDate(RS.getInt(11));
               em.setAge(RS.getInt(12));
               
               
               list.add(em);
           }
           return list;

        } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    } 
 
    
    public boolean updateEmployee(Employee E){
         try{
           System.out.println("Update Emp 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "UPDATE employee SET WardID='"+E.getWardID()+"' ,Post='"+E.getPost()+"' ,FirstName='"+E.getFirstName()+"' ,LastName='"+E.getLastName()+"' ,Address='"+E.getAddress()+"' ,ContactNumber="+E.getContactNumber()+" ,Gender='"+E.getGender()+"' ,DOBYear="+E.getDOBYear()+" ,DOBMonth='"+E.getDOBMonth()+"' ,DOBDate="+E.getDOBDate()+" ,Age="+E.getAge()+" WHERE EmpID='"+E.getEmpID()+"'";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("Update Doctor 2");
           
           PS.executeUpdate(); // execute the sql query and update selected details
           System.out.println("Update Doctor 3");
           return true;
           
         } catch(Exception e){
           System.out.print("exe---->" + e);
           return false;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
    }
  
      public boolean deleteEmployee(Employee E){
         try{
           System.out.println("Delete Emp 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "DELETE FROM employee  WHERE EmpID='"+E.getEmpID()+"'";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("Delete Emp 2");
           
           PS.executeUpdate();  // execute the sql query and delete selected details
           System.out.println("Delete Emp 3");
           return true;
           
         } catch(Exception e){
           System.out.print("exe---->" + e);
           return false;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
    }

   
    ArrayList<Employee> getDoctor(){
        try{
           ArrayList<Employee> list=new ArrayList<Employee>();
           
           System.out.println("get Doctor 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT * FROM doctor ORDER BY `DocID` ASC";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get Doctor 2");
           
           RS = PS.executeQuery();   // execute the sql query and get selected details
           
           while(RS.next()){
               Employee dt=new Employee();
               dt.setEmpID(RS.getString(1));
               dt.setFirstName(RS.getString(2));
               dt.setLastName(RS.getString(3));
               dt.setWardName(RS.getString(4));
               dt.setAddress(RS.getString(5));
               dt.setContactNumber(RS.getInt(6));
               dt.setGender(RS.getString(7));
               dt.setDOBYear(RS.getInt(8));
               dt.setDOBMonth(RS.getString(9));
               dt.setDOBDate(RS.getInt(10));
               dt.setAge(RS.getInt(11));
               
               
               list.add(dt);
           }
           return list;

        } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    } 
 
    ArrayList<Employee> getNurse(){
        try{
           ArrayList<Employee> list=new ArrayList<Employee>();
           
           System.out.println("get Nurse 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT * FROM nurse ORDER BY `NurseID` ASC";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get Nurse 2");
           
           RS = PS.executeQuery();    // execute the sql query and get selected details
           
           while(RS.next()){
               Employee nr=new Employee();
               nr.setEmpID(RS.getString(1));
               nr.setFirstName(RS.getString(2));
               nr.setLastName(RS.getString(3));
               nr.setWardName(RS.getString(4));
               nr.setAddress(RS.getString(5));
               nr.setContactNumber(RS.getInt(6));
               nr.setGender(RS.getString(7));
               nr.setDOBYear(RS.getInt(8));
               nr.setDOBMonth(RS.getString(9));
               nr.setDOBDate(RS.getInt(10));
               nr.setAge(RS.getInt(11));
               
               
               list.add(nr);
           }
           return list;

        } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    } 
 
    ArrayList<Employee> getMember(){
        try{
           ArrayList<Employee> list=new ArrayList<Employee>();
           
           System.out.println("get MS 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT * FROM maintenance_staff ORDER BY `MemberID` ASC";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get MS 2");
           
           RS = PS.executeQuery();   // execute the sql query and get selected details
           
           while(RS.next()){
               Employee ms=new Employee();
               ms.setEmpID(RS.getString(1));
               ms.setFirstName(RS.getString(2));
               ms.setLastName(RS.getString(3));
               ms.setWardName(RS.getString(4));
               ms.setAddress(RS.getString(5));
               ms.setContactNumber(RS.getInt(6));
               ms.setGender(RS.getString(7));
               ms.setDOBYear(RS.getInt(8));
               ms.setDOBMonth(RS.getString(9));
               ms.setDOBDate(RS.getInt(10));
               ms.setAge(RS.getInt(11));
               
               
               list.add(ms);
           }
           return list;

        } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    } 
 
   
   
    public boolean addWard(Ward W) {
        try{
           System.out.println("Add Ward 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "INSERT INTO ward VALUES (?,?)";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("Add Ward 2");
           PS.setString(1, W.getWardID());
           PS.setString(2, W.getWardName()); 
           System.out.println("Add Ward 3");
           PS.executeUpdate(); // execute the sql query and insert the value to thr database
           System.out.println("Add Ward 4");
           return true;
           
        } catch(Exception e){
           System.out.print("exe---->" + e);
           return false;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    }
      
    ArrayList<Ward> getWard(){
        try{
           ArrayList<Ward> list = new ArrayList<Ward>();
           
           System.out.println("get Ward 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT * FROM ward";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get ward 2");
           
           RS = PS.executeQuery();   // execute the sql query and get selected details
           
           while(RS.next()){
               Ward wr=new Ward();
               wr.setWardID(RS.getString(1));
               wr.setWardName(RS.getString(2));
               
               list.add(wr);
           }
           return list;

        } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    }
    
    ArrayList<NOP> getNOPWard(){
        try{
           ArrayList<NOP> list = new ArrayList<NOP>();
           
           System.out.println("get NOP 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT WardName,COUNT(RegID) AS 'NumberOfPatient' FROM ward CROSS JOIN patient USING(WardID) GROUP BY(WardName) ORDER BY NumberOfPatient DESC";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get NOP 2");
           
           RS = PS.executeQuery();   // execute the sql query and get selected details
           
           while(RS.next()){
               NOP nop=new NOP();
               nop.setWardName(RS.getString(1));
               nop.setNumberOfPatient(RS.getInt(2));
               
               list.add(nop);
           }
           return list;

        } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    }
    
    public boolean addTest(Test T)  {
        try{
           System.out.println("Add Test 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "INSERT INTO test VALUES (?,?,?,?,?,?,?,?)";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("Add Test 2");
           PS.setString(1, T.getTestID());
           PS.setString(2, T.getRegID());
           PS.setString(3, T.getTestName()); 
           PS.setInt(4, T.getTestYear());
           PS.setString(5, T.getTestMonth());
           PS.setInt(6, T.getTestDate());
           PS.setString(7, T.getTestInformation());
           PS.setInt(8,T.getTestAmount());
           
           System.out.println("Add Test 3");
           PS.executeUpdate(); // execute the sql query and insert the value to thr database
           System.out.println("Add Test 4");
           return true;
           
        } catch(Exception e){
           System.out.print("exe---->" + e);
           return false;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    }
    
    ArrayList<Test> getTest(){
        try{
           ArrayList<Test> list=new ArrayList<Test>();
           
           System.out.println("get Test 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT * FROM test CROSS JOIN patient USING(RegID) ORDER BY `TestID` ASC";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get Test 2");
           
           RS = PS.executeQuery();   // execute the sql query and get selected details
           
           while(RS.next()){
               Test tt=new Test();
               tt.setRegID(RS.getString(1));
               tt.setTestID(RS.getString(2));
               tt.setTestName(RS.getString(3));
               tt.setTestYear(RS.getInt(4));
               tt.setTestMonth(RS.getString(5));
               tt.setTestDate(RS.getInt(6));
               tt.setTestInformation(RS.getString(7));
               tt.setTestAmount(RS.getInt(8));
               tt.setFirstName(RS.getString(12));
               tt.setLastName(RS.getString(13));
               
               
               list.add(tt);
           }
           return list;

        } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    } 
    
    ArrayList<Test> getAllTest(Test AT) {
        try{
           ArrayList<Test> list=new ArrayList<Test>();
           System.out.println("get All Test 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String Q = "SELECT * FROM test CROSS JOIN patient USING(RegID) WHERE RegID=(?) ORDER BY `TestID` ASC";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(Q);
           System.out.println("get All Test 2");
           PS.setString(1, AT.getRegID()); 
           System.out.println("get All Test 3");   
           RS = PS.executeQuery(); // execute the sql query and get selected details
           System.out.println("get All Test 4");
           
           while(RS.next()){
               Test at=new Test();
               at.setRegID(RS.getString(1));
               at.setTestID(RS.getString(2));
               at.setTestName(RS.getString(3));
               at.setTestYear(RS.getInt(4));
               at.setTestMonth(RS.getString(5));
               at.setTestDate(RS.getInt(6));
               at.setTestInformation(RS.getString(7));
               at.setTestAmount(RS.getInt(8));
               at.setFirstName(RS.getString(12));
               at.setLastName(RS.getString(13));
               at.setAge(RS.getInt(20));
               at.setWardID(RS.getString(11));
              
               list.add(at);
               
               String n1=at.getFirstName();
               String n2=at.getLastName();
               int n3=at.getAge();
               String n4=at.getWardID();
               AT.setFirstName(n1);
               AT.setLastName(n2);
               AT.setAge(n3);
               AT.setWardID(n4);
           }
           
           return list;
      
           
      } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    }
    
     public boolean addTreatment(Treatment Tr)  {
        try{
           System.out.println("Add Treatment 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "INSERT INTO treatment VALUES (?,?,?,?,?,?,?,?)";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("Add Treatment 2");
           PS.setString(1, Tr.getTreatmentID());
           PS.setString(2, Tr.getRegID());
           PS.setString(3, Tr.getTreatment()); 
           PS.setInt(4, Tr.getPrescribeYear());
           PS.setString(5, Tr.getPrescribeMonth());
           PS.setInt(6, Tr.getPrescribeDate());
           PS.setString(7, Tr.getResult());
           PS.setInt(8,Tr.getTreatmentAmount());
           
           System.out.println("Add Treatment 3");
           PS.executeUpdate(); // execute the sql query and insert the value to thr database
           System.out.println("Add Treatment 4");
           return true;
           
        } catch(Exception e){
           System.out.print("exe---->" + e);
           return false;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    }
   
    ArrayList<Treatment> getTreatment(){
        try{
           ArrayList<Treatment> list=new ArrayList<Treatment>();
           
           System.out.println("get Treatment 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT * FROM treatment CROSS JOIN patient USING(RegID) ORDER BY `TreatmentID` ASC";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get Treatment 2");
           
           RS = PS.executeQuery();  // execute the sql query and get selected details
           
           while(RS.next()){
               Treatment tr=new Treatment();
               tr.setRegID(RS.getString(1));
               tr.setTreatmentID(RS.getString(2));
               tr.setTreatment(RS.getString(3));
               tr.setPrescribeYear(RS.getInt(4));
               tr.setPrescribeMonth(RS.getString(5));
               tr.setPrescribeDate(RS.getInt(6));
               tr.setResult(RS.getString(7));
               tr.setTreatmentAmount(RS.getInt(8));
               tr.setFirstName(RS.getString(12));
               tr.setLastName(RS.getString(13));
               
               
               list.add(tr);
           }
           return list;

        } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    } 
    
    ArrayList<Treatment> getAllTreatment(Treatment ATr) {
        try{
           ArrayList<Treatment> list=new ArrayList<Treatment>();
           System.out.println("get All Treatment 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String Q = "SELECT * FROM treatment CROSS JOIN patient USING(RegID) WHERE RegID=(?) ORDER BY `TreatmentID` ASC";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(Q);
           System.out.println("get All Treatment 2");
           PS.setString(1, ATr.getRegID()); 
           System.out.println("get All Treatment 3");   
           RS = PS.executeQuery();  // execute the sql query and get selected details
           System.out.println("get All Treatment 4");
           
           while(RS.next()){
               Treatment atr=new Treatment();
               atr.setRegID(RS.getString(1));
               atr.setTreatmentID(RS.getString(2));
               atr.setTreatment(RS.getString(3));
               atr.setPrescribeYear(RS.getInt(4));
               atr.setPrescribeMonth(RS.getString(5));
               atr.setPrescribeDate(RS.getInt(6));
               atr.setResult(RS.getString(7));
               atr.setTreatmentAmount(RS.getInt(8));
               atr.setFirstName(RS.getString(12));
               atr.setLastName(RS.getString(13));
               atr.setAge(RS.getInt(20));
               atr.setWardID(RS.getString(11));
              
               list.add(atr);
               
               String n1=atr.getFirstName();
               String n2=atr.getLastName();
               int n3=atr.getAge();
               String n4=atr.getWardID();
               ATr.setFirstName(n1);
               ATr.setLastName(n2);
               ATr.setAge(n3);
               ATr.setWardID(n4);
           }
           
           return list;
      
           
      } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    }
   
    
    public boolean addPayment(Payment PAY) {
        try{
           System.out.println("add PAY 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "INSERT INTO payment VALUES (?,?,?,?,?,?,?,?,?)";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("add PAY 2");
           PS.setString(1, PAY.getPaymentID());
           PS.setString(2, PAY.getRegID());
           PS.setString(3, PAY.getFullName());
           PS.setInt(4, PAY.getRegistrationFee());
           PS.setInt(5, PAY.getFacilitiesFee());
           PS.setInt(6, PAY.getLeadingConsultantFee());
           PS.setInt(7, PAY.getExaminAnotherDoctorFee());
           PS.setInt(8, PAY.getTotalTestFee());
           PS.setInt(9, PAY.getTotalTreatmentFee());
          
           System.out.println("add PAY 3");
           PS.executeUpdate(); // execute the sql query and insert the value to thr database
           System.out.println("add PAY 4");
           return true;
           
        } catch(Exception e){
           System.out.print("exe---->" + e);
           return false;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
        
    }  
    public int getAllTestAmount(Payment PAY){
         try{
            
           int ata=0;
           System.out.println("get TA 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT SUM(TestAmount) FROM patient CROSS JOIN test USING(RegID) WHERE RegID=(?)";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get TA 2");
           PS.setString(1, PAY.getRegID());
           System.out.println("get TA 3");
           RS=PS.executeQuery();  // execute the sql query and get selected details
           System.out.println("get TA 4");
           while(RS.next()){
               ata=(RS.getInt(1));   
           }
           
           return ata;
           
         } catch(Exception e){
           System.out.print("exe---->" + e);
           return 0;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
    }
    
   
   
    public int getAllTreatmentAmount(Payment PAY){
         try{
           
           int atra=0;
           System.out.println("get TRA 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT SUM(TreatmentAmount) FROM patient CROSS JOIN treatment USING(RegID) WHERE RegID=(?)";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get TRA 2");
           PS.setString(1, PAY.getRegID());
           System.out.println("get TRA 3");
           RS=PS.executeQuery();  // execute the sql query and get selected details
           System.out.println("get TRA 4");
           
           while(RS.next()){
               atra=(RS.getInt(1));
           }
           
           return atra;
           
         } catch(Exception e){
           System.out.print("exe---->" + e);
           return 0;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
    }

   
    public String getName(Payment PAY){
         try{
           String fn=new String();
           String ln=new String();
           String n=new String();
          
           System.out.println("get Name 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT FirstName,LastName FROM patient  WHERE RegID=(?)";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get Name 2");
           PS.setString(1, PAY.getRegID());
           System.out.println("get Name 3");
           RS=PS.executeQuery();  // execute the sql query and get selected details
           System.out.println("get Name 4");
           
           while(RS.next()){
               PAY.setFirstName(RS.getString(1));
               fn=PAY.getFirstName();
               PAY.setLastName(RS.getString(2));
               ln=PAY.getLastName();
               n=fn+ln;
               PAY.setFullName(n);
               
           }
           
           return PAY.getFullName();
           
           
         } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
    }
 
     
    ArrayList<Payment> getPayment(){
        try{
           ArrayList<Payment> list=new ArrayList<Payment>();
           
           System.out.println("get Payment 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT * FROM payment ORDER BY `PaymentID` ASC";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get Payment 2");
           RS = PS.executeQuery();   // execute the sql query and get selected details
           System.out.println("get Payment 3");
           
           while(RS.next()){
               Payment pay=new Payment();
               pay.setPaymentID(RS.getString(1));
               pay.setRegID(RS.getString(2));
               pay.setFullName(RS.getString(3));
               pay.setRegistrationFee(RS.getInt(4));
               pay.setFacilitiesFee(RS.getInt(5));
               pay.setLeadingConsultantFee(RS.getInt(6));
               pay.setExaminAnotherDoctorFee(RS.getInt(7));
               pay.setTotalTestFee(RS.getInt(8));
               pay.setTotalTreatmentFee(RS.getInt(9));
               pay.setSum(RS.getInt(4)+RS.getInt(5)+RS.getInt(6)+RS.getInt(7)+RS.getInt(8)+RS.getInt(9));
              
               list.add(pay);
           }
           return list;

        } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    } 
  
    public boolean updatePayment(Payment PAY) {
        try{
           System.out.println("update PAY 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "UPDATE payment SET RegistrationFee="+PAY.getRegistrationFee()+" ,FacilitiesFee="+PAY.getFacilitiesFee()+" ,LeadingConsultantFee="+PAY.getLeadingConsultantFee()+" ,ExaminAnotherDoctorFee="+PAY.getExaminAnotherDoctorFee()+" ,TotalTestFee="+PAY.getTotalTestFee()+" ,TotalTreatmentFee="+PAY.getTotalTreatmentFee()+" WHERE RegID='"+PAY.getRegID()+"'";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("update PAY 2");
           PS.executeUpdate();  // execute the sql query and update selected details
           System.out.println("update PAY 3");
           return true;
           
        } catch(Exception e){
           System.out.print("exe---->" + e);
           return false;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
        
    }  
   
    public boolean addSalary(Salary S) {
        try{
           System.out.println("Add Salary 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "INSERT INTO salary VALUES (?,?,?,?,?,?,?,?,?,?)";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("Add Salary 2");
           PS.setString(1, S.getSalaryID());
           PS.setString(2, S.getEmpID());
           PS.setString(3, S.getPost());
           PS.setInt(4, S.getYear());
           PS.setString(5, S.getMonth());
           PS.setInt(6, S.getNumberOfAttendance());
           PS.setInt(7, S.getSalaryRatePerDay());
           PS.setInt(8, S.getNumberOfOTHours());
           PS.setInt(9, S.getOTRatePerHour());
           PS.setInt(10, S.getTotal());
           
           System.out.println("Add Salary 3");
           PS.executeUpdate(); // execute the sql query and insert the value to thr database
           System.out.println("Add Salary 4");
           return true;
           
        } catch(Exception e){
           System.out.print("exe---->" + e);
           return false;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        } 
    }
    
      ArrayList<Salary> getSalary(){
        try{
           ArrayList<Salary> slist=new ArrayList<Salary>();
           
           System.out.println("get SalaryDetails 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT * FROM salary CROSS JOIN employee USING(EmpID) ORDER BY `SalaryID` ASC"; 
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get SalaryDetails 2");
           
           RS = PS.executeQuery();   // execute the sql query and get selected details
           
           while(RS.next()){
              
               Salary s=new Salary();
               s.setEmpID(RS.getString(1));
               s.setSalaryID(RS.getString(2)); 
               s.setPost(RS.getString(3));
               s.setYear(RS.getInt(4));
               s.setMonth(RS.getString(5));
               s.setNumberOfAttendance(RS.getInt(6));
               s.setSalaryRatePerDay(RS.getInt(7));
               s.setNumberOfOTHours(RS.getInt(8));
               s.setOTRatePerHour(RS.getInt(9));
               s.setTotal(RS.getInt(10));
               s.setFirstName(RS.getString(13));
               s.setLastName(RS.getString(14));
               slist.add(s);
           }
           return slist;

        } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
        
        
    }
  
    
   
    ArrayList<Salary> getAllSalary(Salary SA){
        try{
           ArrayList<Salary> srylist=new ArrayList<Salary>();
           
           System.out.println("get All Salary 1");
           C=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "SELECT * FROM salary CROSS JOIN employee USING(EmpID) WHERE EmpID=(?) ORDER BY SalaryID";
           PS = (com.mysql.jdbc.PreparedStatement) C.prepareStatement(query);
           System.out.println("get All Salary 2");
           PS.setString(1, SA.getEmpID()); 
           System.out.println("get All Salary 3");   
           RS = PS.executeQuery();   // execute the sql query and get selected details
           System.out.println("get All Salary 4");
           
           while(RS.next()){
               
               Salary S =new Salary();
               S.setEmpID(RS.getString(1));
               S.setSalaryID(RS.getString(2));
               S.setPost(RS.getString(3));
               S.setYear(RS.getInt(4));
               S.setMonth(RS.getString(5));
               S.setNumberOfAttendance(RS.getInt(6));
               S.setSalaryRatePerDay(RS.getInt(7));
               S.setNumberOfOTHours(RS.getInt(8));
               S.setOTRatePerHour(RS.getInt(9));
               S.setTotal(RS.getInt(10));
               S.setFirstName(RS.getString(13));
               S.setLastName(RS.getString(14));
               
               srylist.add(S);
               
               String n1=S.getFirstName();
               String n2=S.getLastName();
               String n3=S.getPost();
               SA.setFirstName(n1);
               SA.setLastName(n2);
               SA.setPost(n3);
                 
           }
           return srylist;

        } catch(Exception e){
           System.out.print("exe---->" + e);
           return null;
           
        } finally {
            try {
                if (PS != null) {
                    PS.close();
                }
                
                if (C != null) {
                    C.close();   
                }
            } catch (Exception e) {
            }  
        }
        
        
    }
    
    
}
           
       
   
           
 
         
           
          

        