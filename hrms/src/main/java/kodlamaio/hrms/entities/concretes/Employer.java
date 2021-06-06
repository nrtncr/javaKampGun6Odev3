package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer {
	private int employerId;
	private String companyName;
	private String website;
	private String email;
	private String phone;
	private String password;
	private String repeatOfPassword;

}
