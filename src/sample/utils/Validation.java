package sample.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static final String USERNAME_REGEX_PATTERN = "^[A-Za-z0-9]{5,13}$";

    public static boolean isValidUsername(String username){

        //sukuriamos validacijos taisykles pagal auksciau pasirasyta sablona
        Pattern pattern = Pattern.compile(USERNAME_REGEX_PATTERN);
        //Validacijos atitikmens sukurimas palyginant vartotojo ivestus duomenis su validacijos taisyklemis
        Matcher matcher = pattern.matcher(username);
        //grazins true jeigu atitiks vartotojas duomenis validacija, false priesingu atveju
        return matcher.find();

    }
}
