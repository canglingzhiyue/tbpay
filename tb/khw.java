package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class khw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile khw b;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f30090a;

    public static khw a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khw) ipChange.ipc$dispatch("34c57eac", new Object[]{context});
        }
        if (b == null) {
            synchronized (khw.class) {
                if (b == null) {
                    b = new khw(context);
                }
            }
        }
        return b;
    }

    private khw(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        if (khp.b() && khv.a()) {
            this.f30090a = context.getSharedPreferences("widget_process_sp", 0);
        } else {
            this.f30090a = context.getSharedPreferences("link_in_sp", 0);
        }
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : map.keySet()) {
                jSONObject.put(str2, map.get(str2));
            }
            jSONArray.put(jSONObject);
            khu.a("putMapData" + jSONArray);
        } catch (JSONException e) {
            khu.a("putMapData error" + e.getMessage());
        }
        SharedPreferences.Editor edit = this.f30090a.edit();
        edit.putString(str, jSONArray.toString());
        edit.apply();
    }

    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap(16);
        String string = this.f30090a.getString(str, "");
        if (StringUtils.isEmpty(string)) {
            khu.a("sp getMapData " + str + "+ isEmpty");
            return hashMap;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONArray names = jSONObject.names();
                if (names != null) {
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String string2 = names.getString(i2);
                        hashMap.put(string2, jSONObject.getString(string2));
                    }
                }
            }
        } catch (Exception e) {
            khu.a("SharedPreferencesUtil == getMapData === 异常了：" + e.getMessage());
        }
        return hashMap;
    }

    public boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, obj})).booleanValue();
        }
        try {
            SharedPreferences.Editor edit = this.f30090a.edit();
            String simpleName = obj.getClass().getSimpleName();
            char c = 65535;
            switch (simpleName.hashCode()) {
                case -1808118735:
                    if (simpleName.equals(a.ATOM_String)) {
                        c = 3;
                        break;
                    }
                    break;
                case -672261858:
                    if (simpleName.equals("Integer")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2374300:
                    if (simpleName.equals("Long")) {
                        c = 1;
                        break;
                    }
                    break;
                case 67973692:
                    if (simpleName.equals("Float")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1729365000:
                    if (simpleName.equals(a.ATOM_Boolean)) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                edit.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (c == 1) {
                edit.putLong(str, ((Long) obj).longValue());
            } else if (c == 2) {
                edit.putFloat(str, ((Float) obj).floatValue());
            } else if (c == 3) {
                edit.putString(str, (String) obj);
            } else if (c == 4) {
                edit.putInt(str, ((Integer) obj).intValue());
            } else {
                edit.putString(str, JSON.toJSONString(obj));
            }
            edit.apply();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public Object b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cfa9a883", new Object[]{this, str, obj});
        }
        String simpleName = obj.getClass().getSimpleName();
        char c = 65535;
        try {
            switch (simpleName.hashCode()) {
                case -1808118735:
                    if (simpleName.equals(a.ATOM_String)) {
                        c = 3;
                        break;
                    }
                    break;
                case -672261858:
                    if (simpleName.equals("Integer")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2374300:
                    if (simpleName.equals("Long")) {
                        c = 1;
                        break;
                    }
                    break;
                case 67973692:
                    if (simpleName.equals("Float")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1729365000:
                    if (simpleName.equals(a.ATOM_Boolean)) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                return Boolean.valueOf(this.f30090a.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if (c == 1) {
                return Long.valueOf(this.f30090a.getLong(str, ((Long) obj).longValue()));
            }
            if (c == 2) {
                return Float.valueOf(this.f30090a.getFloat(str, ((Float) obj).floatValue()));
            }
            if (c == 3) {
                return this.f30090a.getString(str, (String) obj);
            }
            if (c == 4) {
                return Integer.valueOf(this.f30090a.getInt(str, ((Integer) obj).intValue()));
            }
            String string = this.f30090a.getString(str, "");
            return (string == null || string.length() <= 0) ? obj : JSON.parseObject(string, obj.getClass());
        } catch (Throwable unused) {
            return obj;
        }
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str}) : context.getSharedPreferences("link_in_sp", 0).getString(str, "");
    }
}
