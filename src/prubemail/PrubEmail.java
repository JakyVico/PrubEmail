/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prubemail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author VS1XFI7
 */
public class PrubEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Set up the SMTP server.
        java.util.Properties props = new java.util.Properties();
        props.put("mail.smtp.host", "smtp.telcel.com");
        Session session = Session.getDefaultInstance(props, null);

// Construct the message
        String to = "jaqueline.villar@mail.telcel.com";
        String from = "jaqueline.villar@mail.telcel.com";
        String subject = "lalalala";
        Message msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress(from));
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            msg.setSubject(subject);
            msg.setText("Hi,\n\nHow are you?");

            // Send the message.
            Transport.send(msg);
        } catch (MessagingException e) {
            // Error.
            e.printStackTrace();
        }
    }

}
