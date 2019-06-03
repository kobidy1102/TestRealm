package ef.com.testrealm1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.github.tntkhang.realmencryptionhelper.RealmEncryptionHelper;

import java.io.File;
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



      //  getData(initRealm());
        initRealm2();
    }

//    public List<dongnghiaa> getData(Realm passedInRealm) {
//        Log.e("getdb"," bat dau get: ");
//        RealmResults<dongnghiaa> result = passedInRealm.where(dongnghiaa.class).contains("en","sea",Case.INSENSITIVE).findAll();
//        Log.e("getdb"," get xong: "+result.size());
//
//
//        return result;
//    }

    private Realm initRealm(){
        RealmEncryptionHelper realmEncryptionHelper = RealmEncryptionHelper.initHelper(this, getString(R.string.app_name));

        Realm.init(this);

        RealmConfiguration config = new RealmConfiguration.Builder()
                .assetFile("default.realm")
                .name("db.realm")
//                .readOnly()
//                .encryptionKey(realmEncryptionHelper.getEncryptKey())
                .modules(new MyModule())

                .build();
        Realm.setDefaultConfiguration(config);
        Realm realm= Realm.getInstance(config);
        return realm;
    }

    private void initRealm2(){
        String key= NDM.gena("gionghanh1102");
        Realm.init(this);
//
//        RealmConfiguration config = new RealmConfiguration.Builder()
//                .assetFile("dongnghia.realm")
//                .name("dongnghia.realm")
//                .modules(new MyModule())
//                .build();
//        Realm.setDefaultConfiguration(config);
//        Log.e("RealmEncryptionKey", NDM.bytesToHex(key.getBytes()));
//       Realm realm= Realm.getInstance(config);
//        File file= new File(MainActivity.this.getFilesDir(),"dongnghia_lock.realm");
//       realm.writeEncryptedCopyTo(file,key.getBytes());


    }


}
