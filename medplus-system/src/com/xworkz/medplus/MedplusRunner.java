import com.xworkz.medplus.medplusapp.Medplus;

public class MedplusRunner {
    public static void main(String[] args) {
        com.xworkz.apollo.apollodto.MedplusDto dto = new com.xworkz.apollo.apollodto.MedplusDto();
        dto.setFullName("Shashank");
        dto.setMobileNumber("6362419707");
        dto.setEmail("shashankBS@gmail.com");
        dto.setPassword("medplus@555");
        dto.setDateOfBirth("2003-07-12");
        dto.setHealthInsuranceNumber("89844649846849");

        Medplus app = new Medplus();
        app.registerUser(dto);
        app.showDetails();
    }
}
