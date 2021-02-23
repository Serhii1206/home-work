import java.util.*;

public class Information {

    private List<String> aliases;
    private Set<String> mails;
    private Map<String, String> mailAliasMap;

    public Information() {
        this.aliases = new ArrayList<>();
        this.mails = new HashSet<>();
        this.mailAliasMap = new HashMap<>();
    }

    public List<String> getAliases() {
        if (aliases.size() != mailAliasMap.size()) {
           aliases = new ArrayList<>(mailAliasMap.values());
        }
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public Set<String> getMails() {
        return mails;
    }

    public void setMails(Set<String> mails) {
        this.mails = mails;
    }

    public Map<String, String> getMailAliasMap() {
        return mailAliasMap;
    }

    public void setMailAliasMap(Map<String, String> mailAliasMap) {
        this.mailAliasMap = mailAliasMap;
    }

    @Override
    public String toString() {
        return "Information{" +
                "aliases=" + aliases +
                ", mails=" + mails +
                ", mailAliasMap=" + mailAliasMap +
                '}';
    }

    public boolean add(String alias, String mail) {
        boolean result = false;
        if (mails.add(mail)) {
            aliases.add(alias);
            mailAliasMap.put(mail, alias);
            result = true;
        }
        return result;
    }
}
