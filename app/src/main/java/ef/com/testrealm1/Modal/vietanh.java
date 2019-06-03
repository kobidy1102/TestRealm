// Please note : @LinkingObjects and default values are not represented in the schema and thus will not be part of the generated models
package ef.com.testrealm1.Modal;

import io.realm.RealmObject;

public class vietanh extends RealmObject {
    private long id;
    private String word;
    private String wordSearch;
    private String mean;
    private String shortMean;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getWord() { return word; }

    public void setWord(String word) { this.word = word; }

    public String getWordSearch() { return wordSearch; }

    public void setWordSearch(String wordSearch) { this.wordSearch = wordSearch; }

    public String getMean() { return mean; }

    public void setMean(String mean) { this.mean = mean; }

    public String getShortMean() { return shortMean; }

    public void setShortMean(String shortMean) { this.shortMean = shortMean; }


}
