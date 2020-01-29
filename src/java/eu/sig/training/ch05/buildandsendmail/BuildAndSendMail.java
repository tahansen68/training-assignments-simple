package eu.sig.training.ch05.buildandsendmail;

public class Person{
  public String firstName;
  public String lastName;
  public String division;
  public Person(String firstName, String lastName, String division ){
    this.lastName = lastName;
    this.firstName = firstName;
    this.division = division;
  }
}

public class MailMessageForm {
    public String subject;
    public MailFont mailFont;
    public String message1;
    public String message2;
    public String message3;

    public MailMessageForm(MailFont mailFont, String subject, String message1, String message2, String message3){
      this.mailFont = mailFont;
      this.subject = subject;
      this.message1 = message1;
      this.message2 = message2;
      this.message3 = message3;
	}
}

public class BuildAndSendMail {
    public void buildAndSendMail(MailMan m, Person person, MailMessageForm form
    ) {
        // Format the email address
        String mId = person.firstName.charAt(0) + "." + person.lastName.substring(0, 7) + "@"
            + person.division.substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(form.mailFont,
            form.message1 + form.message2 + form.message3);
        // Send message
        m.send(mId, from.subject, mMessage);
    }

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}