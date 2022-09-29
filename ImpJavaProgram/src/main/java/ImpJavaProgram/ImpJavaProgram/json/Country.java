package ImpJavaProgram.ImpJavaProgram.json;

import java.util.List;

public class Country {

	public Integer id;
	public String firstName;
	public String lastName;
	public String dateBirth;
	public String placeBirth;
	public String country;
	public String sector;
	public String job;
	public String language;
	public Integer population;
	public List<String> states;
	
	public Country() {
		
	}

	public Country(Integer id, String firstName, String lastName, String dateBirth, String placeBirth, String country,
			String sector, String job, String language, Integer population, List<String> states) {
		//super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateBirth = dateBirth;
		this.placeBirth = placeBirth;
		this.country = country;
		this.sector = sector;
		this.job = job;
		this.language = language;
		this.population = population;
		this.states = states;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getPlaceBirth() {
		return placeBirth;
	}

	public void setPlaceBirth(String placeBirth) {
		this.placeBirth = placeBirth;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public List<String> getStates() {
		return states;
	}

	public void setStates(List<String> states) {
		this.states = states;
	}
	
	
	

}
