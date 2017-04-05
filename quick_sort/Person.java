/**
 *
 * Quicksort Exercise
 * @author Ryan Bond / drbond@gmail.com
 *
 */
package quicksort;

public class Person {
	// Create Strings for First/Last Name & Age
    private String firstName;
    private String lastName;
    private String age;

    // Create the Person Object
    public Person(String firstName, String lastName, String age){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    // Sorting mechanics for Last Name & Age
    public int compareLastName(Person in){
        return this.lastName.toLowerCase().compareTo(in.getLastName().toLowerCase());
    }

    public int compareAge(Person in){
        return this.age.toLowerCase().compareTo(in.getAge().toLowerCase());
    }

    // Getters for the First Name, Last Name, & Age
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    // Setters for First Name, Last Name, & Age
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
