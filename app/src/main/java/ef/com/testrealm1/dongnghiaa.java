// Please note : @LinkingObjects and default values are not represented in the schema and thus will not be part of the generated models
package ef.com.testrealm1;
import io.realm.RealmObject;
import io.realm.annotations.RealmModule;

public class dongnghiaa extends RealmObject {
    private Long id;
    private String en;
    private String mean;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getEn() { return en; }

    public void setEn(String en) { this.en = en; }

    public String getMean() { return mean; }

    public void setMean(String mean) { this.mean = mean; }


}
