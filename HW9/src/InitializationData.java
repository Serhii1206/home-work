public class InitializationData {

    public  Information create(Information information) {
        for (int i = 1; i <= 30; i++) {
            String alias = "alias" + "\n" + i;
            String mail = "User" + i + "\n" + "@mail.com";
            information.add(alias, mail);
        }
        for (int i = 1; i <= 10; i++) {
            String alias = "alias" + "\n" + i;
            String mail = "User" + i + "@mail.com";
            information.getAliases().add(alias);
            information.getMails().add(mail);
            information.getMailAliasMap().put(mail, alias);
        }
        return information;
    }
}
