package ef.com.testrealm1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import io.realm.Case;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        getData(initRealm());
    }

    public List<dongnghiaa> getData(Realm passedInRealm) {
        RealmResults<dongnghiaa> result = passedInRealm.where(dongnghiaa.class).like("en","sea",Case.INSENSITIVE).findAll();
        Log.e("abc","result:"+result.size());
        return result;
    }

    private Realm initRealm(){
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder()
                .assetFile("default.realm")
                .readOnly()
                .modules(new MyModule())
                .build();
        Realm.setDefaultConfiguration(config);
        Realm realm= Realm.getDefaultInstance();
        return realm;
    }
}
