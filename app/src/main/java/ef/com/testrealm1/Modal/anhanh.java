// Please note : @LinkingObjects and default values are not represented in the schema and thus will not be part of the generated models
package ef.com.testrealm1.Modal;

import io.realm.RealmObject;

public class anhanh extends RealmObject {
    private Long id;
    private String word;
    private String mean;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getWord() { return word; }

    public void setWord(String word) { this.word = word; }

    public String getMean() { return mean; }

    public void setMean(String mean) { this.mean = mean; }


}
