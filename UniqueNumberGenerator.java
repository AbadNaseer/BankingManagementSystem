package i201815_Abad_Naseer_Q_Assignment_1_First_SDAFinancials_Ltd_A_Banking_System_for_SDA_Students;

import java.util.UUID;

public class UniqueNumberGenerator {

  public static String generateUniqueNumber() 
  {
    return UUID.randomUUID().toString();
  }
}