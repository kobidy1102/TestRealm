package ef.com.testrealm1;

import io.realm.RealmObject;

public class Dictionary extends RealmObject {
    Long id;
    String word;
    String mean;
    String shortMean;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String getShortMean() {
        return shortMean;
    }

    public void setShortMean(String shortMean) {
        this.shortMean = shortMean;
    }
}
