package kodlamaio.hrms.entities.concretes;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobSeeker {
	
	private int seekerId;
	private String firstName;
	private String lastName;
	private String identificationNumber;
	private String yearOfBirth;
	private String password;
	private String repeatOfPassword;

	
}
