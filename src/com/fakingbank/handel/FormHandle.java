/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fakingbank.handel;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Lan
 */
public class FormHandle {

    private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String PHONE_REGEX = "^0(1\\d{9}|9\\d{8})$";

    public boolean vaildateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean vaildatePhone(String phone) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public boolean validateIdentifyCard(String identifyCard) {
        if (identifyCard.length() > 10) {
            return false;
        } else {
            return true;
        }

    }

    public HashMap<String, String> validateLogin(String account, String password) {
        HashMap<String, String> errors = new HashMap<>();

        if (account.isEmpty()) {
            errors.put("txtAccount", "*Enter Account");
        } else if (account.length() < 6) {
            errors.put("txtAccount", "*Account too short");
        }
        if (password.isEmpty()) {
            errors.put("txtPassword", "*Enter Password");
        } else if (password.length() < 6) {
            errors.put("txtPassword", "*Password too short");
        }
        return errors;

    }
    //                if ((lAccount >= 6) == false) {
//                    lblAccountlMessage.setForeground(Color.red);
//                    lblAccountlMessage.setText("Account too short");
//                }
//                if ((lPassword >= 6) == false) {
//                    lblPassWordMessage.setForeground(Color.red);
//                    lblPassWordMessage.setText("Password too short");
//                }

    public HashMap<String, String> validatePassword(String password1, String password2, String password3) {
        HashMap<String, String> errors = new HashMap<>();

        if (password1.isEmpty()) {
            errors.put("txtpass1", "*Enter Password");
        } else if (password1.length() < 6) {
            errors.put("txtpass1", "*Password too short");
        }
        if (password2.isEmpty()) {
            errors.put("txtpass2", "*Enter Password");
        } else if (password2.length() < 6) {
            errors.put("txtpass2", "**Password too short");
        }
        if (password3.isEmpty()) {
            errors.put("txtpass3", "*Enter Password");
        } else if (password2.length() < 6) {
            errors.put("txtpass3", "**Password too short");
        } else if (password2.equals(password3) == false) {
            errors.put("txtpass3", "*Passwords do not overlap");
        }

        return errors;

    }

    public HashMap<String, String> validateCreate(String account, String password, String password1, String name, String email, String phone, String address, String identifyCard) {
        HashMap<String, String> errors = new HashMap<>();

        if (account.isEmpty()) {
            errors.put("txtAccount", "*Enter Account");
        } else if (account.length() < 6) {
            errors.put("txtAccount", "*Account too short");
        }
        if (password.isEmpty()) {
            errors.put("txtPassword", "*Enter Password");
        } else if (password.length() < 6) {
            errors.put("txtPassword", "*Password too short");
        }
        if (password1.isEmpty()) {
            errors.put("txtPassword1", "*Enter Password");
        } else if (password1.length() < 6) {
            errors.put("txtPassword1", "*Password too short");
        }
        if (name.isEmpty()) {
            errors.put("txtName", "*Enter Name");
        } else if (name.length() < 6) {
            errors.put("txtName", "*Enter the full name");
        }
        if (email.isEmpty()) {
            errors.put("txtEmail", "*Enter Email");
        } else if (vaildateEmail(email) == false) {
            errors.put("txtEmail", "*Invalid email");
        }
        if (phone.isEmpty()) {
            errors.put("txtPhone", "*Enter Phone");
        } else if (vaildateEmail(email) == false) {
            errors.put("txtPhone", "*Phonenumber not valid");
        }
        if (address.isEmpty()) {
            errors.put("txtAddress", "*Enter Address");
        } else if (address.length() < 4) {
            errors.put("txtAddress", "*Enter a specific address");
        }
        if (identifyCard.isEmpty()) {
            errors.put("txtIdentifyCard", "*Enter IdentifyCard");
        } else if (identifyCard.length() < 10) {
            errors.put("txtIdentifyCard", "*The number identifies incorrectly");

        }

        return errors;

    }

    public HashMap<String, String> validateUpdate(String name, String email, String phone, String birthday, String address) {
        HashMap<String, String> errors = new HashMap<>();

        if (name.isEmpty()) {
            errors.put("txtName", "*Enter Name");
        }
        if (email.isEmpty()) {
            errors.put("txtEmail", "*Enter Email");
        } else if (vaildateEmail(email) == false) {
            errors.put("txtEmail", "*Invalid email");
        }
        if (phone.isEmpty()) {
            errors.put("txtPhone", "*Enter Phone");
        } else if (vaildatePhone(phone) == false) {
            errors.put("txtPhone", "*Phonenumber not valid");
        }

        if (address.isEmpty()) {
            errors.put("txtAddress", "*Enter Address");
        } else if (address.length() < 4) {
            errors.put("txtAddress", "*Enter a specific address");
        }
      

        return errors;

    }

//    
//    
//    public static void main(String[] args){
//		String date="12/10/2017";
//		String pt="dd/MM/yyyy-";
//		SimpleDateFormat format=new SimpleDateFormat(pt);
//		Calendar calendar=Calendar.getInstance();
//		try {
////			format.parse(date);
//			calendar.setTime(format.parse(date));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		
//		
//		String pt2="dd-MM-yyyy";
//		SimpleDateFormat format2=new SimpleDateFormat(pt2);
//		System.out.println(format2.format(calendar.getTime()));
//		
//		Random rn = new Random();
//		int i = rn.nextInt();
//		System.out.println(i);
//		
//	}
}
