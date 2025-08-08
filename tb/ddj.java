package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.client.b;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.android.external.UCPManager;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.android.agoo.common.Config;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ddj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_AGOO_BIND_FILE_NAME = "AGOO_BIND";

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentMap<String, Integer> f26706a = new ConcurrentHashMap();
    private String b;
    private long c;
    private Context d;

    static {
        kge.a(-808606281);
    }

    public ddj(Context context) {
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        }
        this.d = context.getApplicationContext();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Integer num = this.f26706a.get(str);
        if (num != null && num.intValue() == 2) {
            return;
        }
        this.f26706a.put(str, 2);
        b.a(this.d, "AGOO_BIND", this.c, this.f26706a);
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (this.f26706a.isEmpty()) {
            b();
        }
        Integer num = this.f26706a.get(str);
        ALog.i("AgooBindCache", "isAgooRegistered", "packageName", str, UCPManager.APP_STATUS, num, "agooBindStatus", this.f26706a);
        return !UtilityImpl.utdidChanged(Config.PREFERENCES, this.d) && num != null && num.intValue() == 2;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.b = str;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.b;
        return str2 != null && str2.equals(str);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            String string = APreferencesManager.getSharedPreferences(this.d, "AGOO_BIND", 0).getString("bind_status", null);
            if (StringUtils.isEmpty(string)) {
                ALog.w("AgooBindCache", "restoreAgooClients packs null return", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.c = jSONArray.getLong(0);
            if (System.currentTimeMillis() < this.c + 86400000) {
                for (int i = 1; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    this.f26706a.put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt("s")));
                }
                ALog.i("AgooBindCache", "restoreAgooClients", "mAgooBindStatus", this.f26706a);
                return;
            }
            ALog.i("AgooBindCache", "restoreAgooClients expired", "agooLastFlushTime", Long.valueOf(this.c));
            this.c = 0L;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
