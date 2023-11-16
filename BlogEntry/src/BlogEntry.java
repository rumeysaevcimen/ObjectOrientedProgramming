import java.util.Date;

public class BlogEntry {
    private String username;
    private String text;
    private Date entryDate;

    // Yapılandirici (Constructor)
    public BlogEntry(String username, String text, Date entryDate) {
        setUsername(username);
        setText(text);
        setEntryDate(entryDate);
    }

    // Kullanıcı Adı (username) icin set ve get metotları
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    // Giris Metni (text) icin set ve get metotları
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Giris Tarihi (entryDate) icin set ve get metotları
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    // DisplayEntry metodu
    public void displayEntry() {
        System.out.println("Kullanıcı Adı: " + getUsername());
        System.out.println("Giriş Metni: " + getText());
        System.out.println("Giriş Tarihi: " + getEntryDate());
    }

    // getSummary metodu
    public String getSummary() {
        String[] words = getText().split("\\s+"); // Bosluklara gore metni boler
        int summaryLength = Math.min(10, words.length);
        StringBuilder summary = new StringBuilder();

        for (int i = 0; i < summaryLength; i++) {
            summary.append(words[i]).append(" ");
        }

        return summary.toString().trim(); // Metnin basindaki ve sonundaki bosluklari kaldirir
    }

    public static void main(String[] args) {
        // BlogEntry sınıfı için test kısmı
        String sampleUsername = "Rümeysa Evcimen";
        String sampleText = "This is my first blog post. I hope you like it and enjoy reading it. Thanks.";
        Date sampleDate = new Date(); // Girdinin girildigi tarihi alir.

        BlogEntry entry = new BlogEntry(sampleUsername, sampleText, sampleDate);
        entry.displayEntry();

        String summary = entry.getSummary();
        System.out.println("Summary: " + summary);
    }
}
