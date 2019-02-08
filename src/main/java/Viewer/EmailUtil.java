package Viewer;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;


@Service
public class EmailUtil {


    String senderEmail = "send.message.alarm@yandex.ru";
    String senderPass = "send.message.alarm123";

    Set<Recipient> recipients = new HashSet<Recipient>() {{
        add(new Recipient("zero14244@yandex.ru"));//"snajper.ro@yandex.ru"
    }};

    public void sendMessageAlarm(String messageText) {
        System.out.println(messageText);
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.yandex.ru");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(senderEmail, senderPass);
                    }
                });

        try {

            for (Recipient r : recipients) {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(senderEmail));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(r.getEmail()));
                message.setSubject("Alert");
                message.setText(messageText);
                Transport.send(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Data
    @AllArgsConstructor
    private class Recipient {
        String email;
    }
}

