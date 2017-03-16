import java.io.*;
import java.util.Scanner;


public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }
public void addContact (Contact c) {
	friends[numFriends]= c;
	numfriends++;

public void printContacts  () {
	for (int i=0; i<numfriends; i++)
		friends[i].printContact90;
}

public int numContacts()

		return numfriends;

private int haveCOntact(String s) {
	for (int i=0;i<numfriends;i++)
	if (friends[i[.getName().equals(s)); {
			return i;}
	else {
	return -1;
