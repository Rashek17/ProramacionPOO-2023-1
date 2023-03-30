/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

/**
 *
 * @author casta
 */
public class Gradebook {
    
	/***
	 * 
	 * ***/
	private String courseName;
	
	
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}


	/**
	 * 
	 * @return name of the course
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public void displayMessage() {
		System.out.println("Bienvenido a la planilla de notas " + getCourseName());
	}
}
