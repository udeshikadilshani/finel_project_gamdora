package common;



public class SystemData {
    private static String currentUser;
    private static String userType;
    private static String employee;
     private static String accId;

    public static void setAccId(String accId) {
        SystemData.accId = accId;
    }

    public static String getAccId() {
        return accId;
    }
    
    
     public static String getCurrentUser(){
          return currentUser;
      }
      public  static void setCurrentUser(String aCurrentUser){
      currentUser=aCurrentUser;
      }

  
    
    
    public static String getUserType(){
          return userType;
      } 
    
    public static void setUserType(String aUserType) {
        userType=aUserType;
    }
    
    
     public static String getEmployee(){
          return employee;
      } 
    
    public static void setEmployee(String aEmployee) {
        employee=aEmployee;
    }
    
}
