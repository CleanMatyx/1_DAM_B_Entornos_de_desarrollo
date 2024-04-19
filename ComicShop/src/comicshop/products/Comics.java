package comicshop.products;

import java.util.Comparator;

public class Comics extends Products implements Comparable<Comics> {
    private int issueNumber;
    private languageEnum language;
    private int year;

    public enum languageEnum {ENGLISH, SPANISH, FRENCH, JAPANESE}

    public Comics(String name, int issueNumber, String language, int year, float price, int stockQuantity) {
        super(name, price, stockQuantity);
        this.issueNumber = issueNumber;
        if(language.toUpperCase().equals("ENGLISH"))
            this.language = languageEnum.ENGLISH;
        else if(language.toUpperCase().equals("SPANISH"))
            this.language = languageEnum.SPANISH;
        else if(language.toUpperCase().equals("FRENCH"))
            this.language = languageEnum.FRENCH;
        else if(language.toUpperCase().equals("JAPANESE"))
            this.language = languageEnum.JAPANESE;
        else
            throw new IllegalArgumentException("Language not valid");
        this.year = year;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public languageEnum getLanguage() {
        return language;
    }

    public void setLanguage(languageEnum language) {
        this.language = language;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Comics c) {
        int value = this.getName().compareTo(c.getName());
        if(value == 0) {
            value = Integer.compare(this.issueNumber, c.issueNumber);
        }
        return value;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " - Issue Number: " + issueNumber + " - Language: " + language + " - Year: "
                + year + "\n";
    }
}
