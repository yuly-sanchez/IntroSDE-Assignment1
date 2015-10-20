package assignment.src;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

import assignment.dao.PeopleStore;
import assignment.model.HealthProfile;
import assignment.model.Person;
import assignment.utils.RandomNumberHelper;

public class JAXBMarshallerJson {

	private static String jsonDocument = "people_new.json";
	private static PeopleStore people = new PeopleStore();

	private static List<Person> listPerson;
	private static String[] listFirstname = { "Carmen", "Anthony", "Guido",
			"Stefania", "Joel", "Andrea", "Simonetta" };
	private static String[] listLastname = { "Quispe", "Garcia", "Pugliese",
			"Officioso", "Gonzalez", "Bonte", "Perez" };

	public static void inizializedDB() {

		listPerson = new ArrayList<Person>();
		for (int i = 0; i < listFirstname.length && i < listLastname.length; i++) {
			Person person = new Person();
			person.setIdPerson();
			person.setFirstname(listFirstname[i]);
			person.setLastname(listLastname[i]);
			person.setBirthdate();
			HealthProfile hprofile = createNewHealthProfile();
			person.sethProfile(hprofile);
			listPerson.add(person);
			people.getData().add(person);
		}
	}

	public static HealthProfile createNewHealthProfile() {
		HealthProfile hprofile = new HealthProfile();
		hprofile.setLastUpdate();
		hprofile.setWeight(getRandomWeight());
		hprofile.setHeight(getRandomHeight());
		hprofile.getBMI();
		return hprofile;
	}

	public static double getRandomWeight() {
		double result = RandomNumberHelper.getRandomDoubleNumber(30.5, 150);
		return result;
	}

	public static double getRandomHeight() {
		double result = RandomNumberHelper.getRandomDoubleNumber(1.45, 2.90);
		return result;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		inizializedDB();

		// Jackson Object Mapper
		ObjectMapper mapper = new ObjectMapper();

		// Adding the Jackson Module to process JAXB annotations
		JaxbAnnotationModule module = new JaxbAnnotationModule();

		// configure as necessary
		mapper.registerModule(module);
		// mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		mapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);

		
		/*
		 * ========================================================================================== 
		 * 			runs instruction 3 based on Lab 4 marshalling using classes model 
		 * 	==========================================================================================
		 */
		System.out.println();
		System.out.println("------------------ Marshalling to JSON ----------------");
		
		System.out.println("File " + jsonDocument + " created in the home folder.....");
		mapper.writeValue(new File(jsonDocument), people);
		
		System.out.println("Output: ");
		String result = mapper.writeValueAsString(people);
		System.out.println(result);
		
		

	}

}
