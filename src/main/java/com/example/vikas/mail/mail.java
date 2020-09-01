package com.example.vikas.mail;

import java.util.Date;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
public class mail 
{

	@Autowired
	JavaMailSender mailSender;
	
	public void sendmail() 
	{
		// TODO Auto-generated method stub
		MimeMessagePreparator preparator = new MimeMessagePreparator() 
	    {
	        public void prepare(MimeMessage mimeMessage) throws Exception 
	        {
	            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress("<XXXXXXXSEND MAIL IDXXXXXXXX>"));
	            mimeMessage.setSubject("ENTER YOUR SUBJECT");
	             
	            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
	             
	            helper.setText("<html><body>"
	            		+ "ENYER HTML CODE HEAR</body></html>", true);
	        }
	    };
	     
	    try {
	        mailSender.send(preparator);
	    }
	    catch (MailException ex) {
	        // simply log it and go on...
	        System.err.println(ex.getMessage());
	    }

	}
	
}
