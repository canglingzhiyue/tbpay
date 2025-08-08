package com.taobao.accs.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.l;
import com.taobao.android.external.UCPManager;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String f;

    /* renamed from: a  reason: collision with root package name */
    private Context f8208a;
    private ConcurrentMap<String, Integer> b = new ConcurrentHashMap();
    private ConcurrentMap<String, Integer> c = new ConcurrentHashMap();
    private ConcurrentMap<String, Set<String>> d = new ConcurrentHashMap();
    private long e;
    private final String g;

    static {
        kge.a(908765448);
        f = "ClientManager_";
    }

    public b(Context context, String str) {
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        }
        f += str;
        this.g = str;
        this.f8208a = context.getApplicationContext();
        d();
    }

    private Map<String, Integer> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : l.s(this.f8208a) ? this.c : this.b;
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l.s(this.f8208a) ? "ACCS_BIND_V2" : "ACCS_BIND");
        sb.append("_");
        sb.append(this.g);
        return sb.toString();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Integer num = b().get(str);
        if (num != null && num.intValue() == 2) {
            return;
        }
        b().put(str, 2);
        a(this.f8208a, c(), this.e, b());
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Integer num = b().get(str);
        if (num != null && num.intValue() == 4) {
            return;
        }
        b().put(str, 4);
        a(this.f8208a, c(), this.e, b());
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (b().isEmpty()) {
            d();
        }
        Integer num = b().get(str);
        ALog.i(f, "isAppBinded", UCPManager.APP_STATUS, num, "mBindStatus", b());
        return num != null && num.intValue() == 2;
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        Integer num = b().get(str);
        return num != null && num.intValue() == 4;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                Set<String> set = this.d.get(str);
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(str2);
                this.d.put(str, set);
            }
        } catch (Exception e) {
            String str3 = f;
            ALog.e(str3, f + e.toString(), new Object[0]);
            e.printStackTrace();
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            this.d.remove(str);
        } catch (Exception e) {
            String str3 = f;
            ALog.e(str3, f + e.toString(), new Object[0]);
            e.printStackTrace();
        }
    }

    public boolean c(String str, String str2) {
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            if (!StringUtils.isEmpty(str) && (set = this.d.get(str)) != null) {
                if (set.contains(str2)) {
                    return true;
                }
            }
        } catch (Exception e) {
            String str3 = f;
            ALog.e(str3, f + e.toString(), new Object[0]);
            e.printStackTrace();
        }
        return false;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            SharedPreferences sharedPreferences = APreferencesManager.getSharedPreferences(this.f8208a, "ACCS_BIND", 0);
            String string = sharedPreferences.getString("bind_status", null);
            if (StringUtils.isEmpty(string)) {
                Context context = this.f8208a;
                string = APreferencesManager.getSharedPreferences(context, "ACCS_BIND_" + this.g, 0).getString("bind_status", null);
            } else {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.clear();
                edit.apply();
            }
            if (StringUtils.isEmpty(string)) {
                ALog.w(f, "restoreClients break as packages null", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.e = jSONArray.getLong(0);
            if (System.currentTimeMillis() < this.e + 86400000) {
                for (int i = 1; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject.has(Repeat.D)) {
                        String string2 = jSONObject.getString(Repeat.D);
                        if ((Build.MODEL + "-" + Build.BRAND).equals(string2)) {
                            this.b.put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt("s")));
                        }
                    } else {
                        this.b.put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt("s")));
                    }
                }
                ALog.i(f, "restoreClients success", "mBindStatus", this.b);
            } else {
                ALog.i(f, "restoreClients expired", "lastFlushTime", Long.valueOf(this.e));
                this.e = 0L;
            }
            SharedPreferences sharedPreferences2 = APreferencesManager.getSharedPreferences(this.f8208a, "ACCS_BIND_V2", 0);
            String string3 = sharedPreferences2.getString("bind_status", null);
            if (StringUtils.isEmpty(string3)) {
                Context context2 = this.f8208a;
                string3 = APreferencesManager.getSharedPreferences(context2, "ACCS_BIND_V2_" + this.g, 0).getString("bind_status", null);
            } else {
                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                edit2.clear();
                edit2.apply();
            }
            if (StringUtils.isEmpty(string3)) {
                ALog.w(f, "restoreClients V2 break as packages null", new Object[0]);
                return;
            }
            JSONArray jSONArray2 = new JSONArray(string3);
            this.e = jSONArray2.getLong(0);
            if (System.currentTimeMillis() < this.e + 86400000) {
                for (int i2 = 1; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (jSONObject2.has(Repeat.D)) {
                        String string4 = jSONObject2.getString(Repeat.D);
                        if ((Build.MODEL + "-" + Build.BRAND).equals(string4)) {
                            this.c.put(jSONObject2.getString("p"), Integer.valueOf(jSONObject2.getInt("s")));
                        }
                    } else {
                        this.c.put(jSONObject2.getString("p"), Integer.valueOf(jSONObject2.getInt("s")));
                    }
                }
                ALog.i(f, "restoreClients V2 success", "mBindStatus", this.c);
                return;
            }
            ALog.i(f, "restoreClients V2 expired", "lastFlushTime", Long.valueOf(this.e));
            this.e = 0L;
        } catch (Exception e) {
            ALog.w(f, "restoreClients V2", e, new Object[0]);
        }
    }

    public static void a(Context context, String str, long j, Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ead266b", new Object[]{context, str, new Long(j), map});
            return;
        }
        try {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            JSONArray jSONArray = new JSONArray();
            if (j > 0 && j < System.currentTimeMillis()) {
                jSONArray.put(j);
            } else {
                jSONArray.put(System.currentTimeMillis() - (Math.random() * 8.64E7d));
            }
            for (String str2 : strArr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("p", str2);
                jSONObject.put("s", map.get(str2).intValue());
                jSONObject.put(Repeat.D, Build.MODEL + "-" + Build.BRAND);
                jSONArray.put(jSONObject);
            }
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, str, 0).edit();
            edit.putString("bind_status", jSONArray.toString());
            edit.apply();
            ALog.i(f, "saveClients", "f", str, "value", map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(this.f8208a, c(), 0).edit();
            edit.clear();
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
