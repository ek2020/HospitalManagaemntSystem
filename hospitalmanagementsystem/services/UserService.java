package global.coda.hospitalmanagementsystem.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import global.coda.hospitalmanagementsystem.dao.PatientDaoImp;
import global.coda.hospitalmanagementsystem.models.Patient;
import global.coda.hospitalmanagementsystem.models.User;

public class UserService {
	
	PatientDaoImp jdbcObj=new PatientDaoImp();
	Patient patient;
	public boolean insert(User user) throws SQLException
	{
		patient.setPassword(user.getPassword());
		patient.setUserName(user.getUserName());
		patient.setPhoneNumber(user.getPhoneNumber());
		boolean result=false;
		result=jdbcObj.insert(patient);
		return result;
		
	}
	public  List<Patient> readAll() throws SQLException
	{
		List<Patient> patientInfo=new ArrayList<>();
		patientInfo=jdbcObj.readAll();
		return patientInfo;
		
	}
	public  int read(String userName) throws SQLException
	{
		patient=new Patient();
		patient=jdbcObj.read(userName);
		return 0;
		
	}
	public  boolean update(String userName,Patient patient) throws SQLException
	{
		boolean result;
		
		result=jdbcObj.insert(patient);
		return result;
		
		
	}
	public  boolean delete(String userName) throws SQLException
	{
		boolean result;
		result=jdbcObj.delete(userName);
		return result;
	}
	

	
	

}
