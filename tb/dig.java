package tb;

import android.util.Log;
import com.ali.alidatabasees.CallableStatement;
import com.ali.alidatabasees.DBConfig;
import com.ali.alidatabasees.Database;
import com.ali.alidatabasees.PreparedStatement;
import com.ali.alidatabasees.Result;
import com.ali.alidatabasees.ResultSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfsadapter.c;
import com.taobao.alivfsadapter.e;
import com.taobao.android.ab.api.ABGlobal;

/* loaded from: classes.dex */
public class dig extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Database f26784a;

    @Override // com.taobao.alivfsadapter.e
    public /* synthetic */ c a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("89555128", new Object[]{this, str}) : c(str);
    }

    @Override // com.taobao.alivfsadapter.e
    public /* synthetic */ c a(String str, Object[] objArr) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("d7b9ef7b", new Object[]{this, str, objArr}) : c(str, objArr);
    }

    public dig(String str, int i) {
        super(str, i);
        DBConfig dBConfig = new DBConfig(str);
        if (ABGlobal.isFeatureOpened(null, "journal_mode_truncate")) {
            dBConfig.setJournalMode("TRUNCATE");
        }
        this.f26784a = Database.a(dBConfig);
    }

    public dig(String str, String str2, int i) {
        super(str, str2, i);
        DBConfig dBConfig = new DBConfig(str);
        dBConfig.setKey(str2);
        if (ABGlobal.isFeatureOpened(null, "journal_mode_truncate")) {
            dBConfig.setJournalMode("TRUNCATE");
        }
        this.f26784a = Database.a(dBConfig);
    }

    public dif c(String str) throws Exception {
        ResultSet b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dif) ipChange.ipc$dispatch("7dc7b0f1", new Object[]{this, str});
        }
        Database database = this.f26784a;
        if (database == null) {
            Log.e("AliDatabaseES", "database is null, this may not happen");
            return null;
        }
        CallableStatement b2 = database.b(str);
        if (b2 != null && (b = b2.b()) != null) {
            return new dif(b2, b);
        }
        return null;
    }

    public dif c(String str, Object[] objArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dif) ipChange.ipc$dispatch("e1e85388", new Object[]{this, str, objArr});
        }
        Database database = this.f26784a;
        if (database == null) {
            Log.e("AliDatabaseES", "database is null, this may not happen");
            return null;
        }
        PreparedStatement a2 = database.a(str);
        if (a2 != null) {
            if (objArr != null && objArr.length != a2.d()) {
                throw new RuntimeException("arguments count does not match");
            }
            if (objArr != null) {
                int i = 0;
                for (Object obj : objArr) {
                    i++;
                    if (obj instanceof Integer) {
                        a2.a(i, ((Integer) obj).intValue());
                    } else if ((obj instanceof Float) || (obj instanceof Double)) {
                        a2.a(i, ((Double) obj).doubleValue());
                    } else if (obj instanceof String) {
                        a2.a(i, (String) obj);
                    } else if (obj instanceof byte[]) {
                        a2.a(i, (byte[]) obj);
                    }
                }
                return new dif(a2, a2.b());
            }
        }
        return null;
    }

    @Override // com.taobao.alivfsadapter.e
    public boolean b(String str) throws Exception {
        Result a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        Database database = this.f26784a;
        if (database == null) {
            Log.e("AliDatabaseES", "database is null, this may not happen");
            return false;
        }
        CallableStatement b = database.b(str);
        if (b == null || (a2 = b.a()) == null) {
            return false;
        }
        a2.a();
        b.e();
        return true;
    }

    @Override // com.taobao.alivfsadapter.e
    public boolean b(String str, Object[] objArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a2d52e2", new Object[]{this, str, objArr})).booleanValue();
        }
        Database database = this.f26784a;
        if (database == null) {
            Log.e("AliDatabaseES", "database is null, this may not happen");
            return false;
        }
        PreparedStatement a2 = database.a(str);
        if (a2 != null) {
            if (objArr != null && objArr.length != a2.d()) {
                throw new RuntimeException("arguments count does not match");
            }
            if (objArr != null) {
                int i = 0;
                for (Object obj : objArr) {
                    i++;
                    if (obj instanceof Integer) {
                        a2.a(i, ((Integer) obj).intValue());
                    } else if ((obj instanceof Float) || (obj instanceof Double)) {
                        a2.a(i, ((Double) obj).doubleValue());
                    } else if (obj instanceof String) {
                        a2.a(i, (String) obj);
                    } else if (obj instanceof byte[]) {
                        a2.a(i, (byte[]) obj);
                    }
                }
                Result a3 = a2.a();
                if (a3 != null) {
                    a3.a();
                    a2.e();
                }
                if (a3 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
