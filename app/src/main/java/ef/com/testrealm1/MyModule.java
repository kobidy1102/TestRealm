package ef.com.testrealm1;

import ef.com.testrealm1.Modal.anhanh;
import ef.com.testrealm1.Modal.dongnghia;
import ef.com.testrealm1.Modal.vietanh;
import io.realm.annotations.RealmModule;

@RealmModule(library = true, classes = { dongnghia.class})
public class MyModule {
}
